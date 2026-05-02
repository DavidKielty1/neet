/*
 * 71. Simplify Path
 * Difficulty: Medium
 * Pattern: Stack
 *
 * Problem:
 * Given a string `path`, which is an absolute path for a Unix-style file system,
 * convert it to the simplified canonical path.
 *
 * Rules:
 * - `.` means the current directory
 * - `..` means go up one directory
 * - multiple consecutive slashes are treated as a single slash
 * - any other name is a valid directory name
 *
 * The canonical path should:
 * - start with a single slash `/`
 * - separate directories with a single slash
 * - not end with a trailing slash unless it is the root
 *
 * Example 1:
 * Input: path = "/home/"
 * Output: "/home"
 *
 * Example 2:
 * Input: path = "/../"
 * Output: "/"
 *
 * Example 3:
 * Input: path = "/home//foo/"
 * Output: "/home/foo"
 *
 * Constraints:
 * - 1 <= path.length <= 3000
 * - path consists of English letters, digits, period `.`, slash `/`, and underscore `_`
 * - path is a valid absolute Unix path
 *
 * Notes:
 * - Split by `/`, ignore empty parts and `.`.
 * - Use a stack of directory names and pop on `..` when possible.
 */

public class SimplifyPathJava {
    static class Solution {
        public String simplifyPath(String path) {
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //

            // Deque<String> stack = new ArrayDeque<>();
            // for (String part : path.split("/")) {
            //     if (part.isEmpty() || part.equals(".")) {
            //         continue;
            //     }
            //     if (part.equals("..")) {
            //         if (!stack.isEmpty()) {
            //             stack.pollLast();
            //         }
            //     } else {
            //         stack.offerLast(part);
            //     }
            // }
            // if (stack.isEmpty()) {
            //     return "/";
            // }
            // StringBuilder result = new StringBuilder();
            // for (String dir : stack) {
            //     result.append('/').append(dir);
            // }
            // return result.toString();
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert sol.simplifyPath("/home/").equals("/home");
        assert sol.simplifyPath("/../").equals("/");
        assert sol.simplifyPath("/home//foo/").equals("/home/foo");
        System.out.println("All test cases passed!");
    }
}
