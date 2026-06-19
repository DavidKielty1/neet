/*
 * 72. Edit Distance
 * Difficulty: Medium
 * Pattern: Dynamic Programming (2D / rolling 1D)
 *
 * Problem:
 * Given two strings word1 and word2, return the minimum number of operations required
 * to convert word1 to word2.
 *
 * You have the following three operations permitted on a word:
 * - Insert a character
 * - Delete a character
 * - Replace a character
 *
 * Example 1:
 * Input: word1 = "horse", word2 = "ros"
 * Output: 3
 * Explanation: horse ->rorse -> rose -> ros
 *
 * Example 2:
 * Input: word1 = "intention", word2 = "execution"
 * Output: 5
 *
 * Constraints:
 * - 0 <= word1.length, word2.length <= 500
 * - word1 and word2 consist of lowercase English letters.
 *
 * Notes:
 * - dp[i][j] = min edits to convert word1[0..i) to word2[0..j).
 * - If chars match: dp[i-1][j-1]; else 1 + min(insert, delete, replace).
 */

public class EditDistance {
    static class Solution {
        public int minDistance(String word1, String word2) {
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
            //
            //
            //
            //
            //
            //

            // int m = word1.length();
            // int n = word2.length();
            // int[] dp = new int[n + 1];
            // for (int j = 0; j <= n; j++) {
            //     dp[j] = j;
            // }
            // for (int i = 1; i <= m; i++) {
            //     int prev = dp[0];
            //     dp[0] = i;
            //     for (int j = 1; j <= n; j++) {
            //         int temp = dp[j];
            //         if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
            //             dp[j] = prev;
            //         } else {
            //             dp[j] = 1 + Math.min(prev, Math.min(dp[j], dp[j - 1]));
            //         }
            //         prev = temp;
            //     }
            // }
            // return dp[n];
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert sol.minDistance("horse", "ros") == 3;
        assert sol.minDistance("intention", "execution") == 5;
        System.out.println("All test cases passed!");
    }
}
