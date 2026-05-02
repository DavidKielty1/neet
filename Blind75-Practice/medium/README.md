# Medium difficulty — scaffold

This folder mirrors the NeetCode-style pattern taxonomy used in [`easy/`](../easy/).

## Problem File Template Rules

When creating new practice files anywhere under `medium/`, follow the same structure as the Java template in `BinarySearchSimilar1Java.java`.

1. Start every problem file with a full top-of-file block comment.
2. That header comment should include:
   - the LeetCode problem number and title when applicable
   - the full problem description, not just a short summary
   - constraints and any important LeetCode-specific notes
   - 2 or 3 worked examples
3. Inside the solution method, leave a large block of commented-out slash lines before the spoiler/reference section.
4. The spacer block should usually be roughly **40 to 60 comment lines**, with **about 50 lines** as the default target.
5. Keep the reference solution, pseudocode, or implementation outline below that spacer block and keep it commented out.
6. The spacer block is intentional: it hides the spoiler when the file is first opened for practice.
7. If the file is meant to be solved from scratch, leave the real implementation unfilled. Do not add a `throw` placeholder such as `throw new UnsupportedOperationException(...)`; let the missing solution remain unfinished instead.
8. If a solution naturally spans multiple methods, keep exactly one 40-60 line spacer block in the main method the learner should solve from.
9. For those multi-method files, leave earlier helper/API/constructor bodies unimplemented instead of adding separate spacer blocks to each one.
10. Put one combined commented reference implementation under the single spacer block, including all related methods together.
11. Avoid duplicated commented solutions across helper methods and do not reintroduce throw placeholders in those multi-method files.

## Notes

- Medium folders are currently Java-first scaffolds.
- Use the same hidden-spoiler layout consistently across all medium sections.
- See also: [`../README.md`](../README.md).
