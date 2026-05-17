/*
 * 22. Generate Parentheses
 * Difficulty: Medium
 * Pattern: Stack / Backtracking
 *
 * Problem:
 * Given `n` pairs of parentheses, write a function to generate all combinations of
 * well-formed parentheses.
 *
 * Example 1:
 * Input: n = 3
 * Output: ["((()))","(()())","(())()","()(())","()()()"]
 *
 * Example 2:
 * Input: n = 1
 * Output: ["()"]
 *
 * Constraints:
 * - 1 <= n <= 8
 *
 * Notes:
 * - You can add `(` while you still have opens left to place.
 * - You can add `)` only when the number of closes used is less than opens used.
 */

import java.util.List;

public class GenerateParentheses {
    static class Solution {
        public List<String> generateParenthesis(int n) {
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

            // List<String> result = new ArrayList<>();
            // backtrack(result, new StringBuilder(), 0, 0, n);
            // return result;
        }

        // private void backtrack(List<String> result, StringBuilder current, int open, int close, int n) {
        //     if (current.length() == 2 * n) {
        //         result.add(current.toString());
        //         return;
        //     }
        //     if (open < n) {
        //         current.append('(');
        //         backtrack(result, current, open + 1, close, n);
        //         current.deleteCharAt(current.length() - 1);
        //     }
        //     if (close < open) {
        //         current.append(')');
        //         backtrack(result, current, open, close + 1, n);
        //         current.deleteCharAt(current.length() - 1);
        //     }
        // }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert sol.generateParenthesis(3).size() == 5;
        assert sol.generateParenthesis(1).size() == 1;
        System.out.println("All test cases passed!");
    }
}
