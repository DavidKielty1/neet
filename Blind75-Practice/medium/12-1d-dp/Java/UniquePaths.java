/*
 * 62. Unique Paths
 * Difficulty: Medium
 * Pattern: Dynamic Programming (grid / rolling 1D)
 *
 * Problem:
 * There is a robot on an m x n grid. The robot is initially located at the top-left
 * corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner
 * (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any
 * point in time.
 *
 * Given the two integers m and n, return the number of possible unique paths that the
 * robot can take to reach the bottom-right corner.
 *
 * Example 1:
 * Input: m = 3, n = 7
 * Output: 28
 *
 * Example 2:
 * Input: m = 3, n = 2
 * Output: 3
 * Explanation: Three paths: RRD, RDR, DRR.
 *
 * Constraints:
 * - 1 <= m, n <= 100
 *
 * Notes:
 * - dp[j] += dp[j - 1] when iterating rows (paths from above + from left).
 * - Can also use combinatorics: C(m+n-2, m-1).
 */

public class UniquePaths {
    static class Solution {
        public int uniquePaths(int m, int n) {
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

            // int[] dp = new int[n];
            // Arrays.fill(dp, 1);
            // for (int row = 1; row < m; row++) {
            //     for (int col = 1; col < n; col++) {
            //         dp[col] += dp[col - 1];
            //     }
            // }
            // return dp[n - 1];
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert sol.uniquePaths(3, 7) == 28;
        assert sol.uniquePaths(3, 2) == 3;
        System.out.println("All test cases passed!");
    }
}
