#!/usr/bin/env python3
"""
Generate analogue-questions/Java/*.java from analogue-questions/Python/*.py under Blind75-Practice/easy.

- Preserves problem description as block comment.
- Emits Solution methods: Python source as // comments + Java translation where possible,
  otherwise leave the method unfinished after the commented reference block.
- Builds main() from the if __name__ == "__main__" block using AST (valid Java asserts).

This script only writes .java sources. It does not emit or rely on compiled .class files;
those are local artifacts from `javac` when you run exercises in the terminal and are
gitignored—no need to keep them in the repo.

Run: python Blind75-Practice/easy/tools/generate_java_similar_tests.py
"""

from __future__ import annotations

import ast
import re
import sys
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1]


def kebab_to_class_name(stem: str) -> str:
    parts = re.split(r"[-_]", stem)
    pascal = "".join(p[:1].upper() + p[1:] for p in parts if p)
    return pascal + "Java"


def escape_java_block_comment(s: str) -> str:
    return s.replace("*/", "* /")


def py_ann_to_java(ann: ast.expr | None) -> str:
    if ann is None:
        return "Object"
    if isinstance(ann, ast.Name):
        m = {"str": "String", "int": "int", "bool": "boolean", "float": "double"}
        return m.get(ann.id, ann.id)
    if isinstance(ann, ast.Constant) and ann.value is None:
        return "void"
    if isinstance(ann, ast.Subscript):
        base = py_ann_to_java(ann.value)
        if base == "List":
            inner = py_ann_to_java(ann.slice)
            if inner == "int":
                return "List<Integer>"
            if inner == "str":
                return "List<String>"
            if inner == "List":
                return "List<List<Integer>>"
            return f"List<{inner}>"
        if base == "Optional":
            return py_ann_to_java(ann.slice)
    if isinstance(ann, ast.Attribute):
        return ann.attr
    return "Object"


def method_signature_java(fn: ast.FunctionDef) -> str:
    args = fn.args
    params: list[str] = []
    for a in getattr(args, "posonlyargs", []) or []:
        params.append(f"{py_ann_to_java(a.annotation)} {a.arg}")
    for a in args.args:
        if a.arg == "self":
            continue
        params.append(f"{py_ann_to_java(a.annotation)} {a.arg}")
    ret = py_ann_to_java(fn.returns)
    return f"public {ret} {fn.name}({', '.join(params)})"


def emit_tree_node_java() -> str:
    return """
    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode() {}

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
""".strip(
        "\n"
    )


def emit_list_node_java() -> str:
    return """
    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode() {}

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
""".strip(
        "\n"
    )


def has_class_named(classes: list[ast.ClassDef], name: str) -> bool:
    return any(c.name == name for c in classes)


def collect_classes(tree: ast.Module) -> list[ast.ClassDef]:
    return [n for n in tree.body if isinstance(n, ast.ClassDef)]


def is_main_guard(node: ast.If) -> bool:
    t = node.test
    if not isinstance(t, ast.Compare):
        return False
    if len(t.ops) != 1 or not isinstance(t.ops[0], ast.Eq):
        return False
    a, b = t.left, t.comparators[0]
    for x, y in ((a, b), (b, a)):
        if isinstance(x, ast.Name) and x.id == "__name__":
            if isinstance(y, ast.Constant) and y.value == "__main__":
                return True
    return False


def python_expr_to_java_expr(expr_str: str) -> str:
    """Convert a Python expression string (from ast.unparse) to Java-ish syntax."""
    s = expr_str.strip()
    s = s.replace("solution.", "sol.")
    s = s.replace("Solution()", "new Solution()")
    s = re.sub(r"\bTrue\b", "true", s)
    s = re.sub(r"\bFalse\b", "false", s)
    s = re.sub(r"\bNone\b", "null", s)
    s = re.sub(r"^\[\s*\]$", "java.util.List.of()", s)
    s = re.sub(
        r"\[\s*((?:\d+\s*,\s*)*\d+)\s*\]",
        lambda m: "java.util.List.of(" + m.group(1).replace(" ", "") + ")",
        s,
    )
    s = re.sub(
        r"'([^'\\]*(?:\\.[^'\\]*)*)'",
        lambda m: '"' + m.group(1).replace('"', '\\"') + '"',
        s,
    )
    return s


def ast_expr_to_java(node: ast.AST) -> str:
    """Translate a Python expression AST node to a Java expression string."""
    if isinstance(node, ast.Constant):
        v = node.value
        if v is None:
            return "null"
        if isinstance(v, bool):
            return "true" if v else "false"
        if isinstance(v, int):
            if v > 2147483647 or v < -2147483648:
                return f"(int) ({v}L)"
            return str(v)
        if isinstance(v, float):
            return str(v)
        if isinstance(v, str):
            esc = v.replace("\\", "\\\\").replace('"', '\\"')
            return f'"{esc}"'
    if isinstance(node, ast.Name):
        if node.id == "True":
            return "true"
        if node.id == "False":
            return "false"
        if node.id == "None":
            return "null"
        if node.id == "solution":
            return "sol"
        return node.id
    if isinstance(node, ast.List):
        if not node.elts:
            return "java.util.List.of()"
        els = [ast_expr_to_java(e) for e in node.elts]
        return "java.util.List.of(" + ", ".join(els) + ")"
    if isinstance(node, ast.Tuple):
        els = [ast_expr_to_java(e) for e in node.elts]
        return "java.util.List.of(" + ", ".join(els) + ")"
    if isinstance(node, ast.Set):
        els = [ast_expr_to_java(e) for e in node.elts]
        return "new java.util.HashSet<>(java.util.List.of(" + ", ".join(els) + "))"
    if isinstance(node, ast.UnaryOp) and isinstance(node.op, ast.Not):
        return "!(" + ast_expr_to_java(node.operand) + ")"
    if isinstance(node, ast.BoolOp):
        if isinstance(node.op, ast.And):
            parts = []
            for v in node.values:
                if isinstance(v, ast.Name):
                    parts.append(f"({v.id} != null)")
                else:
                    parts.append(ast_expr_to_java(v))
            return "(" + " && ".join(parts) + ")"
        if isinstance(node.op, ast.Or):
            parts = [ast_expr_to_java(v) for v in node.values]
            return "(" + " || ".join(parts) + ")"
    if isinstance(node, ast.BinOp):
        left = ast_expr_to_java(node.left)
        right = ast_expr_to_java(node.right)
        if isinstance(node.op, ast.Add):
            return f"({left} + {right})"
        if isinstance(node.op, ast.Sub):
            return f"({left} - {right})"
        if isinstance(node.op, ast.Mult):
            return f"({left} * {right})"
        if isinstance(node.op, ast.Div):
            return f"({left} / {right})"
        if isinstance(node.op, ast.Mod):
            return f"({left} % {right})"
    if isinstance(node, ast.Compare):
        if len(node.ops) == 1 and isinstance(node.ops[0], ast.Is):
            c0 = node.comparators[0]
            if isinstance(c0, ast.Constant) and c0.value is None:
                return "(" + ast_expr_to_java(node.left) + " == null)"
        if len(node.ops) == 1 and isinstance(node.ops[0], ast.IsNot):
            c0 = node.comparators[0]
            if isinstance(c0, ast.Constant) and c0.value is None:
                return "(" + ast_expr_to_java(node.left) + " != null)"
        if len(node.ops) == 1 and isinstance(node.ops[0], ast.Eq):
            L, R = node.left, node.comparators[0]
            if isinstance(L, (ast.List, ast.Set)) or isinstance(R, (ast.List, ast.Set)):
                return (
                    "java.util.Objects.equals("
                    + ast_expr_to_java(L)
                    + ", "
                    + ast_expr_to_java(R)
                    + ")"
                )
            if isinstance(L, ast.Call) or isinstance(R, ast.Call):
                lf = L.func if isinstance(L, ast.Call) else None
                rf = R.func if isinstance(R, ast.Call) else None
                if (isinstance(lf, ast.Name) and lf.id == "set") or (
                    isinstance(rf, ast.Name) and rf.id == "set"
                ):
                    return (
                        "java.util.Objects.equals("
                        + ast_expr_to_java(L)
                        + ", "
                        + ast_expr_to_java(R)
                        + ")"
                    )
            return "(" + ast_expr_to_java(L) + " == " + ast_expr_to_java(R) + ")"
        if len(node.ops) == 1:
            op0 = node.ops[0]
            if isinstance(
                op0, (ast.Lt, ast.LtE, ast.Gt, ast.GtE, ast.NotEq)
            ) and len(node.comparators) == 1:
                L = ast_expr_to_java(node.left)
                R = ast_expr_to_java(node.comparators[0])
                if isinstance(op0, ast.Lt):
                    return f"({L} < {R})"
                if isinstance(op0, ast.LtE):
                    return f"({L} <= {R})"
                if isinstance(op0, ast.Gt):
                    return f"({L} > {R})"
                if isinstance(op0, ast.GtE):
                    return f"({L} >= {R})"
                if isinstance(op0, ast.NotEq):
                    return f"({L} != {R})"
    if isinstance(node, ast.Call):
        if (
            isinstance(node.func, ast.Name)
            and node.func.id == "set"
            and len(node.args) == 1
        ):
            return "new java.util.HashSet<>(" + ast_expr_to_java(node.args[0]) + ")"
        if (
            isinstance(node.func, ast.Name)
            and node.func.id == "len"
            and len(node.args) == 1
        ):
            a0 = node.args[0]
            if isinstance(a0, ast.Constant) and isinstance(a0.value, str):
                return str(len(a0.value))
            if isinstance(a0, ast.List):
                return str(len(a0.elts))
            inner = ast_expr_to_java(a0)
            return f"({inner}).size()"
        if (
            isinstance(node.func, ast.Name)
            and node.func.id == "abs"
            and len(node.args) == 1
        ):
            return "Math.abs(" + ast_expr_to_java(node.args[0]) + ")"
        args = [ast_expr_to_java(a) for a in node.args]
        if isinstance(node.func, ast.Attribute):
            fn = ast_expr_to_java(node.func)
            return f"{fn}({', '.join(args)})"
        if isinstance(node.func, ast.Name):
            return f"{node.func.id}({', '.join(args)})"
    if isinstance(node, ast.Attribute):
        v = ast_expr_to_java(node.value)
        if v == "solution":
            v = "sol"
        return f"{v}.{node.attr}"
    if isinstance(node, ast.Subscript):
        val = ast_expr_to_java(node.value)
        sl = node.slice
        if isinstance(sl, ast.Constant) and isinstance(sl.value, int):
            return f"{val}.charAt({sl.value})"  # often wrong; tweak analogue by hand
        if isinstance(sl, ast.Slice):
            return ast.unparse(node)
    try:
        return python_expr_to_java_expr(ast.unparse(node))
    except Exception:
        return "/* unsupported expr */ null"


def assert_test_to_java(test: ast.expr) -> str:
    """Emit one Java statement from assert's test expression."""
    if isinstance(test, ast.UnaryOp) and isinstance(test.op, ast.Not):
        ij = ast_expr_to_java(test.operand)
        return f"        assert !({ij});"

    if isinstance(test, ast.Compare) and len(test.ops) == 1:
        if isinstance(test.ops[0], ast.In):
            lj = ast_expr_to_java(test.left)
            seq = test.comparators[0]
            if isinstance(seq, (ast.List, ast.Tuple)):
                els = [ast_expr_to_java(e) for e in seq.elts]
                return f"        assert java.util.List.of({', '.join(els)}).contains({lj});"
            sj = ast_expr_to_java(seq)
            return f"        assert {sj}.contains({lj});"

    try:
        uj = ast_expr_to_java(test)
        return f"        assert {uj};"
    except Exception:
        u = ast.unparse(test)
        return f"        // assert {u}"


BUILTIN_NAMES = frozenset(
    {
        "True",
        "False",
        "None",
        "len",
        "range",
        "print",
        "min",
        "max",
        "abs",
        "sum",
        "str",
        "int",
        "list",
        "set",
        "dict",
        "sorted",
        "enumerate",
        "zip",
        "Counter",
        "deque",
        "ord",
        "chr",
        "any",
        "all",
        "reversed",
        "float",
        "bool",
        "tuple",
        "isinstance",
        "type",
    }
)


def names_used_in_expr(node: ast.AST) -> set[str]:
    out: set[str] = set()
    for n in ast.walk(node):
        if isinstance(n, ast.Name) and isinstance(n.ctx, ast.Load):
            if n.id not in BUILTIN_NAMES:
                out.add(n.id)
    return out


def emit_main_block_body(tree: ast.Module, outer_class: str) -> str:
    mb = find_main_block(tree)
    lines: list[str] = ["    public static void main(String[] args) {"]
    defined: set[str] = set()
    sol_declared = False

    for st in mb or []:
        if isinstance(st, ast.Assign) and len(st.targets) == 1:
            tgt = st.targets[0]
            val = st.value
            if (
                isinstance(tgt, ast.Name)
                and tgt.id == "solution"
                and isinstance(val, ast.Call)
                and isinstance(val.func, ast.Name)
                and val.func.id == "Solution"
            ):
                if not sol_declared:
                    lines.append("        Solution sol = new Solution();")
                    sol_declared = True
                else:
                    lines.append("        sol = new Solution();")
                defined.add("sol")
                continue
            if isinstance(tgt, ast.Name):
                rhs = ast.unparse(val)
                rhs_j = python_expr_to_java_expr(rhs)
                if tgt.id.isupper() and tgt.id.replace("_", "").isalnum():
                    lines.append(f"        {outer_class}.{tgt.id} = {rhs_j};")
                    defined.add(tgt.id)
                else:
                    lines.append(f"        // {tgt.id} = {rhs_j};")
                continue

        if isinstance(st, ast.AugAssign):
            try:
                u = ast.unparse(st)
            except Exception:
                u = repr(st)
            lines.append(f"        // {u}")
            continue

        if isinstance(st, ast.Assert):
            need = names_used_in_expr(st.test)
            if "sol" in defined and "solution" in need:
                need = need - {"solution"}
            if need <= defined:
                lines.append(assert_test_to_java(st.test))
            else:
                missing = need - defined
                try:
                    pu = ast.unparse(st.test)
                except Exception:
                    pu = repr(st.test)
                lines.append(
                    f"        // assert {pu}  // needs locals (port helpers): {sorted(missing)}"
                )
            continue

        if isinstance(st, ast.Expr):
            v = st.value
            if (
                isinstance(v, ast.Call)
                and isinstance(v.func, ast.Name)
                and v.func.id == "print"
            ):
                args = [ast.unparse(a) for a in v.args]
                if len(args) == 1:
                    aj = python_expr_to_java_expr(args[0])
                    lines.append(f"        System.out.println({aj});")
                else:
                    lines.append(
                        f"        System.out.println({', '.join(python_expr_to_java_expr(a) for a in args)});"
                    )
                continue

        if isinstance(st, ast.FunctionDef):
            lines.append(f"        // nested def {st.name} — see Python file")
            continue
        if isinstance(st, (ast.Import, ast.ImportFrom)):
            continue
        try:
            u = ast.unparse(st)
        except Exception:
            u = repr(st)
        for ln in u.splitlines():
            lines.append(f"        // {ln}")

    lines.append("    }")
    return "\n".join(lines)


def find_main_block(tree: ast.Module) -> list[ast.stmt] | None:
    for node in tree.body:
        if isinstance(node, ast.If) and is_main_guard(node):
            return node.body
    return None


def emit_static_fields_from_module(tree: ast.Module) -> list[str]:
    """e.g. BAD_VERSION = 0 at module level for isBadVersion mocks."""
    lines: list[str] = []
    for node in tree.body:
        if isinstance(node, ast.Assign) and len(node.targets) == 1:
            t = node.targets[0]
            if isinstance(t, ast.Name) and t.id.isupper():
                rhs = ast.unparse(node.value)
                rhs_j = python_expr_to_java_expr(rhs)
                lines.append(f"    static int {t.id} = {rhs_j};")
    return lines


def emit_solution_methods(source: str, solution: ast.ClassDef) -> str:
    chunks: list[str] = []
    for node in solution.body:
        if isinstance(node, ast.Expr) and isinstance(node.value, ast.Constant):
            if isinstance(node.value.value, str):
                continue
        if isinstance(node, ast.FunctionDef):
            sig = method_signature_java(node)
            chunks.append(f"        {sig} {{")
            for st in node.body:
                if isinstance(st, ast.Expr) and isinstance(st.value, ast.Constant):
                    if isinstance(st.value.value, str):
                        continue
                try:
                    u = ast.unparse(st)
                except Exception:
                    u = repr(st)
                for ln in u.splitlines():
                    chunks.append(f"            // {ln}")
            chunks.append("        }")
            chunks.append("")
    return "\n".join(chunks)


def process_file(py_path: Path) -> tuple[bool, str]:
    rel = py_path.relative_to(ROOT)
    text = py_path.read_text(encoding="utf-8")
    try:
        tree = ast.parse(text)
    except SyntaxError as e:
        return False, f"SKIP parse error {rel}: {e}"

    mod_doc = ast.get_docstring(tree) or ""
    classes = collect_classes(tree)
    java_name = kebab_to_class_name(py_path.stem)
    out_path = py_path.parent.parent / "Java" / f"{java_name}.java"

    extra_types = []
    if has_class_named(classes, "TreeNode"):
        extra_types.append(emit_tree_node_java())
    if has_class_named(classes, "ListNode"):
        extra_types.append(emit_list_node_java())

    solution = next((c for c in classes if c.name == "Solution"), None)
    solution_block = (
        emit_solution_methods(text, solution)
        if solution
        else "        // (no Solution class)\n"
    )

    static_fields = emit_static_fields_from_module(tree)

    if find_main_block(tree) is None:
        main_java = """    public static void main(String[] args) {
        System.out.println("No __main__ block");
    }"""
    else:
        main_java = emit_main_block_body(tree, java_name)

    header = f"""/*
 * Ported from: {rel.as_posix()}
 * --- Original description ---
{escape_java_block_comment(mod_doc)}
 */

"""

    static_block = "\n".join(static_fields) + ("\n" if static_fields else "")

    body = f"""
public class {java_name} {{
{static_block}
{chr(10).join(extra_types)}

    static class Solution {{
{solution_block}
    }}

{main_java}
}}
"""

    full = header + "import java.util.*;\nimport java.util.function.*;\n\n" + body

    out_path.parent.mkdir(parents=True, exist_ok=True)
    out_path.write_text(full, encoding="utf-8")
    return True, f"OK {rel} -> {out_path.relative_to(ROOT)}"


def main() -> None:
    pys = sorted(ROOT.glob("**/analogue-questions/Python/*.py"))
    ok, bad = 0, 0
    for py in pys:
        success, msg = process_file(py)
        if success:
            ok += 1
            print(msg)
        else:
            bad += 1
            print(msg, file=sys.stderr)
    print(
        f"\nDone: {ok} written, {bad} skipped.", file=sys.stderr if bad else sys.stdout
    )


if __name__ == "__main__":
    main()
