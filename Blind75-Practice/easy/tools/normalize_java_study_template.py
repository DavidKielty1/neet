#!/usr/bin/env python3
"""
Normalize Java study files to the IsPalindromeNumber-style template:
  - scaffold of blank // lines (count configurable), with an empty line between
    each // row so the commented solution sits below the fold when opening the file
  - prior implementation commented with // at method body indent
  - throw new UnsupportedOperationException("Implement <methodName>");

Skips: main, constructors, class/interface declarations.

Usage:
  python normalize_java_study_template.py [--dry-run] [--root PATH]
"""

from __future__ import annotations

import argparse
import re
import sys
from pathlib import Path

# Number of "//" placeholder rows (blank line after each row except the last).
SCAFFOLD_LINES = 30


def find_matching_close_brace(text: str, open_brace_idx: int) -> int:
    """Return index of closing } for { at open_brace_idx, or -1."""
    if open_brace_idx < 0 or open_brace_idx >= len(text) or text[open_brace_idx] != "{":
        return -1
    depth = 1
    i = open_brace_idx + 1
    while i < len(text) and depth > 0:
        c = text[i]
        if c == "{":
            depth += 1
        elif c == "}":
            depth -= 1
        i += 1
    if depth != 0:
        return -1
    return i - 1


def class_names_in_file(text: str) -> set[str]:
    return set(re.findall(r"\b(?:class|interface|enum|record)\s+(\w+)", text))


def is_single_line_method_decl(line: str) -> bool:
    s = line.strip()
    if not (
        s.startswith("public ")
        or s.startswith("private ")
        or s.startswith("protected ")
    ):
        return False
    if re.match(r"(public|protected|private)\s+(static\s+)?(final\s+)?class\s", s):
        return False
    if re.match(r"(public|protected|private)\s+interface\s", s):
        return False
    if re.search(r"\bstatic\s+void\s+main\s*\(", s):
        return False
    if "(" not in s or "{" not in s:
        return False
    if s.endswith(";"):
        return False
    if s.rfind("{") < s.rfind(")"):
        # '{' might be on next line (not single-line decl)
        pass
    # Require opening brace on same line as signature
    if "{" not in s:
        return False
    return True


def method_name_from_decl(line: str) -> str | None:
    """Allow `{` followed by same-line comments (e.g. `{        //`)."""
    s = line.strip()
    brace = s.rfind("{")
    if brace < 0:
        return None
    head = s[:brace].rstrip()
    m = re.search(r"(\w+)\s*\([^)]*\)\s*$", head)
    if not m:
        return None
    return m.group(1)


def is_scaffold_only_line(line: str) -> bool:
    t = line.strip()
    return t == "" or t == "//"


def extract_impl_lines(old_inner: str) -> list[str]:
    """Drop scaffold-only and throw; keep commented or code lines for re-comment."""
    out: list[str] = []
    for line in old_inner.splitlines():
        if "throw new UnsupportedOperationException" in line:
            break
        if is_scaffold_only_line(line):
            continue
        out.append(line)
    return out


def to_commented_line(line: str, body_indent: int) -> str:
    indent = " " * body_indent
    stripped = line.lstrip()
    if stripped.startswith("//"):
        rest = stripped[2:].lstrip()
        return indent + "// " + rest if rest else indent + "//"
    return indent + "// " + line.rstrip()


def build_scaffold(indent: str) -> str:
    """Alternating `//` and blank lines so the solution block is pushed down visually."""
    rows: list[str] = []
    for i in range(SCAFFOLD_LINES):
        rows.append(indent + "//")
        if i < SCAFFOLD_LINES - 1:
            rows.append("")
    return "\n".join(rows)


def build_new_inner(
    old_inner: str,
    method_name: str,
    body_indent: int,
    method_base_indent: int,
) -> str:
    """method_base_indent = spaces before `public` on the method line (closing `}` aligns with it)."""
    indent = " " * body_indent
    scaffold = build_scaffold(indent)

    impl_lines = extract_impl_lines(old_inner)
    commented_lines = [to_commented_line(L, body_indent) for L in impl_lines]

    parts = [scaffold]
    if commented_lines:
        parts.append("")
        parts.append("\n".join(commented_lines))

    exc = f'{indent}throw new UnsupportedOperationException("Implement {method_name}");'
    parts.append("")
    parts.append(exc)

    # After `{` we need a newline before the scaffold; before `}` we need the method's closing indent.
    close_align = " " * method_base_indent
    return "\n" + "\n".join(parts) + "\n" + close_align


def transform_java_text(text: str) -> tuple[str, int]:
    """Return (new_text, num_methods_replaced)."""
    text = text.replace("\r\n", "\n").replace("\r", "\n")
    classes = class_names_in_file(text)
    lines = text.splitlines(keepends=True)
    pos = 0
    spans: list[tuple[int, int, str]] = []

    for line in lines:
        if not is_single_line_method_decl(line):
            pos += len(line)
            continue
        name = method_name_from_decl(line)
        if not name:
            pos += len(line)
            continue
        if name in classes:
            pos += len(line)
            continue
        brace_idx = line.rfind("{")
        open_brace = pos + brace_idx
        close_brace = find_matching_close_brace(text, open_brace)
        if close_brace < 0:
            pos += len(line)
            continue
        old_inner = text[open_brace + 1 : close_brace]
        base = len(line) - len(line.lstrip())
        body_indent = base + 4
        new_inner = build_new_inner(old_inner, name, body_indent, base)
        if new_inner == old_inner:
            pos += len(line)
            continue
        spans.append((open_brace + 1, close_brace, new_inner))
        pos += len(line)

    # Apply from end to start so indices stay valid
    spans.sort(key=lambda x: x[0], reverse=True)
    out = text
    replaced = 0
    for start, end, new_inner in spans:
        out = out[:start] + new_inner + out[end:]
        replaced += 1
    return out, replaced


def collect_java_files(root: Path) -> list[Path]:
    out: list[Path] = []
    for p in root.rglob("*.java"):
        if "Java" not in p.parts:
            continue
        if p.name.endswith("Test.java"):
            continue
        out.append(p)
    return sorted(out)


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument(
        "--root",
        type=Path,
        default=Path(__file__).resolve().parents[1],
        help="Blind75-Practice/easy (default)",
    )
    ap.add_argument("--dry-run", action="store_true")
    args = ap.parse_args()
    root: Path = args.root
    files = collect_java_files(root)
    total_replaced = 0
    for path in files:
        try:
            text = path.read_text(encoding="utf-8")
        except OSError as e:
            print(f"skip read {path}: {e}", file=sys.stderr)
            continue
        new_text, n = transform_java_text(text)
        if n == 0:
            continue
        total_replaced += n
        if args.dry_run:
            print(f"would update {path} ({n} method(s))")
        else:
            path.write_text(new_text, encoding="utf-8", newline="\n")
            print(f"updated {path} ({n} method(s))")
    print(f"Done. Methods replaced: {total_replaced} across {len(files)} files scanned.")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
