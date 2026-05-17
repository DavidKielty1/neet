# Math and geometry (medium)

**Pattern:** Math and geometry

## Problem File Template Rules

When creating new practice files in this folder, follow the same structure as the Java template in `BinarySearchSimilar1.java`.

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

## Recommended Java Shape

```java
/*
 * LeetCode #...
 * Full problem description
 *
 * Example 1:
 * ...
 *
 * Example 2:
 * ...
 *
 * Constraints:
 * ...
 */
public class Example {
    static class Solution {
        public int solve(int n) {
            //
            //
            //
            // about 40-60 slash lines here; ~50 is a good default
            // to push the spoiler below the fold when the file opens
            //
            //
            //

            // reference solution / pseudocode below
            // left = 1;
            // right = n;
            // while (left < right) {
            //     ...
            // }
            // Do not add a throw placeholder here; leave the method unfinished.
        }
    }
}
```

## Notes

- Keep the folder structure consistent with the rest of the section, such as `Java/`, `Python/`, `analogue-questions/`, and `tests/` when needed.
- Prefer the same hidden-spoiler layout for future files so the repository feels consistent across sections.
