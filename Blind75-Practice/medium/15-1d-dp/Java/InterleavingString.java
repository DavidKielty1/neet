/*
 * 97. Interleaving String
 * Difficulty: Medium
 * Pattern: Dynamic Programming (2D boolean)
 *
 * Problem:
 * Given strings s1, s2, and s3, return true if s3 is formed by an interleaving of s1
 * and s2.
 *
 * An interleaving of two strings s and t is a configuration where s and t are combined
 * by interleaving their characters while preserving the relative order of characters
 * within each string.
 *
 * Example 1:
 * Input: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac"
 * Output: true
 *
 * Example 2:
 * Input: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc"
 * Output: false
 *
 * Example 3:
 * Input: s1 = "", s2 = "", s3 = ""
 * Output: true
 *
 * Constraints:
 * - 0 <= s1.length, s2.length <= 100
 * - 0 <= s3.length <= 200
 * - s1, s2, and s3 consist of lowercase English letters.
 *
 * Notes:
 * - dp[i][j] = can s1[0..i) and s2[0..j) form s3[0..i+j)?
 * - Transition: match next char from s1 or s2.
 */

public class InterleavingString {
    public boolean isInterleave(String s1, String s2, String s3) {
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

    // if (s1.length() + s2.length() != s3.length()) {
    //     return false;
    // }
    // int m = s1.length();
    // int n = s2.length();
    // boolean[][] dp = new boolean[m + 1][n + 1];
    // dp[0][0] = true;
    // for (int i = 0; i <= m; i++) {
    //     for (int j = 0; j <= n; j++) {
    //         if (i > 0 && s1.charAt(i - 1) == s3.charAt(i + j - 1)) {
    //             dp[i][j] = dp[i][j] || dp[i - 1][j];
    //         }
    //         if (j > 0 && s2.charAt(j - 1) == s3.charAt(i + j - 1)) {
    //             dp[i][j] = dp[i][j] || dp[i][j - 1];
    //         }
    //     }
    // }
    // return dp[m][n];
    }
    

    public static void main(String[] args) {
        InterleavingString sol = new InterleavingString();
        assert sol.isInterleave("aabcc", "dbbca", "aadbbcbcac");
        assert !sol.isInterleave("aabcc", "dbbca", "aadbbbaccc");
        assert sol.isInterleave("", "", "");
        System.out.println("All test cases passed!");
    }
}
