#!/usr/bin/env python3
"""
Script to remove incorrectly placed blank comment lines from docstrings
"""

import re
from pathlib import Path


def cleanup_file(filepath):
    """Remove blank comment sections that are inside docstrings"""
    with open(filepath, "r", encoding="utf-8") as f:
        content = f.read()

    original_content = content

    # Pattern to find blank comment lines followed by "Approach:" or "Strategy:"
    # These are the incorrectly placed ones INSIDE the docstring
    pattern = r"(\n\s+#\s*\n)+(\s+(?:Approach|Strategy):)"
    content = re.sub(pattern, r"\n\2", content)

    # Also remove any blank comment lines right after opening """ in methods
    pattern2 = r'(    def \w+\([^)]*\):[^"]*"""\n)(\s+#\s*\n)+'
    content = re.sub(pattern2, r"\1", content, flags=re.DOTALL)

    if content != original_content:
        with open(filepath, "w", encoding="utf-8") as f:
            f.write(content)
        print(f"  ✓ Cleaned {filepath.name}")
        return True
    else:
        print(f"  - No cleanup needed for {filepath.name}")
        return False


def main():
    base_path = Path("Blind75-Practice/easy")

    if not base_path.exists():
        print(f"Error: {base_path} not found")
        return

    python_files = list(base_path.rglob("*.py"))
    print(f"Found {len(python_files)} Python files\n")

    cleaned_count = 0

    for py_file in sorted(python_files):
        if cleanup_file(py_file):
            cleaned_count += 1

    print(f"\n✅ Cleaned {cleaned_count} files out of {len(python_files)}")


if __name__ == "__main__":
    main()
