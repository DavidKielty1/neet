#!/usr/bin/env python3
"""
Script to add blank comment lines after docstrings in Solution methods
"""

import os
import re
from pathlib import Path

# Blank section to insert (16 lines of # comments)
BLANK_SECTION = """
        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

"""


def process_file(filepath):
    """Add blank comment section after docstrings if not already present"""
    with open(filepath, "r", encoding="utf-8") as f:
        content = f.read()

    # Check if file already has the blank section
    if content.count("\n        #\n") >= 10:
        print(f"  Skipping {filepath.name} (already has blank sections)")
        return False

    # Pattern to match CLOSING """ of method docstring followed by actual code
    # Must have Strategy/Approach text before the closing """
    pattern = r'(Strategy:.*?\n)(        """\n)(        \w)'

    # Replace with strategy + closing """ + blank section + code
    replacement = r"\1\2" + BLANK_SECTION + r"\3"

    new_content = re.sub(pattern, replacement, content, flags=re.DOTALL)

    if new_content != content:
        with open(filepath, "w", encoding="utf-8") as f:
            f.write(new_content)
        print(f"  ✓ Updated {filepath.name}")
        return True
    else:
        print(f"  - No changes needed for {filepath.name}")
        return False


def main():
    # Find all Python files in Blind75-Practice/easy
    base_path = Path("Blind75-Practice/easy")

    if not base_path.exists():
        print(f"Error: {base_path} not found")
        return

    python_files = list(base_path.rglob("*.py"))
    print(f"Found {len(python_files)} Python files\n")

    updated_count = 0

    for py_file in sorted(python_files):
        if process_file(py_file):
            updated_count += 1

    print(f"\n✅ Complete! Updated {updated_count} files out of {len(python_files)}")


if __name__ == "__main__":
    main()
