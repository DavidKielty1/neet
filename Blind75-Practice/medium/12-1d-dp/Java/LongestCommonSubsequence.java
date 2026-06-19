/*
 * 1143. Longest Common Subsequence
 * Difficulty: Medium
 * Pattern: Dynamic Programming (2D / rolling 1D)
 *
 * Problem:
 * Given two strings text1 and text2, return the length of their longest common
 * subsequence. If there is no common subsequence, return 0.
 *
 * A subsequence is formed by deleting some (possibly zero) characters without changing
 * the relative order of the remaining characters.
 *
 * Example 1:
 * Input: text1 = "abcde", text2 = "ace"
 * Output: 3
 * Explanation: LCS is "ace", length 3.
 *
 * Example 2:
 * Input: text1 = "abc", text2 = "def"
 * Output: 0
 *
 * Example 3:
 * Input: text1 = "abc", text2 = "abc"
 * Output: 3
 *
 * Constraints:
 * - 1 <= text1.length, text2.length <= 1000
 * - text1 and text2 consist of only lowercase English letters.
 *
 * Notes:
 * - dp[i][j] = LCS length of text1[0..i) and text2[0..j).
 * - If chars match: 1 + dp[i-1][j-1]; else max(dp[i-1][j], dp[i][j-1]).
 */

public class LongestCommonSubsequence {
    static class Solution {
        public int longestCommonSubsequence(String text1, String text2) {
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

            // int m = text1.length();
            // int n = text2.length();
            // int[] dp = new int[n + 1];
            // for (int i = 1; i <= m; i++) {
            //     int prev = 0;
            //     for (int j = 1; j <= n; j++) {
            //         int temp = dp[j];
            //         if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
            //             dp[j] = prev + 1;
            //         } else {
            //             dp[j] = Math.max(dp[j], dp[j - 1]);
            //         }
            //         prev = temp;
            //     }
            // }
            // return dp[n];
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert sol.longestCommonSubsequence("abcde", "ace") == 3;
        assert sol.longestCommonSubsequence("abc", "def") == 0;
        assert sol.longestCommonSubsequence("abc", "abc") == 3;
        System.out.println("All test cases passed!");
    }
}
