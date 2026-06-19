/*
 * 64. Minimum Path Sum
 * Difficulty: Medium
 * Pattern: Dynamic Programming (grid / rolling 1D)
 *
 * Problem:
 * Given a m x n grid filled with non-negative numbers, find a path from top left to
 * bottom right, which minimizes the sum of all numbers along its path.
 *
 * Note: You can only move either down or right at any point in time.
 *
 * Example 1:
 * Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
 * Output: 7
 * Explanation: Path 1 -> 3 -> 1 -> 1 -> 1.
 *
 * Example 2:
 * Input: grid = [[1,2,3],[4,5,6]]
 * Output: 12
 *
 * Constraints:
 * - m == grid.length
 * - n == grid[i].length
 * - 1 <= m, n <= 200
 * - 0 <= grid[i][j] <= 200
 *
 * Notes:
 * - dp[j] = min path sum to current cell in row, from top or left.
 * - Can mutate grid in-place instead of extra array.
 */

public class MinimumPathSum {
    static class Solution {
        public int minPathSum(int[][] grid) {
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //

            // int m = grid.length;
            // int n = grid[0].length;
            // int[] dp = new int[n];
            // dp[0] = grid[0][0];
            // for (int j = 1; j < n; j++) {
            //     dp[j] = dp[j - 1] + grid[0][j];
            // }
            // for (int i = 1; i < m; i++) {
            //     dp[0] += grid[i][0];
            //     for (int j = 1; j < n; j++) {
            //         dp[j] = Math.min(dp[j], dp[j - 1]) + grid[i][j];
            //     }
            // }
            // return dp[n - 1];
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert sol.minPathSum(new int[][] {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}) == 7;
        assert sol.minPathSum(new int[][] {{1, 2, 3}, {4, 5, 6}}) == 12;
        System.out.println("All test cases passed!");
    }
}
