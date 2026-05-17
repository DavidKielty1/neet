/*
 * Ported from: 10-dynamic-programming/analogue-questions/Python/min-cost-climbing-stairs-similar3.py
 * --- Original description ---
Similar Problem 3: Minimum Path Cost in Grid
Difficulty: Easy
Pattern: Dynamic Programming

Problem:
Given a 2D grid of costs, find the minimum cost to reach the bottom-right corner from the top-left.
You can only move down or right at each step.

Example 1:
Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
Output: 7
Explanation: Path 1→3→1→1→1 = 7 (minimum)

Example 2:
Input: grid = [[1,2],[1,1]]
Output: 3
Explanation: Path 1→1→1 = 3

Constraints:
- m == grid.length
- n == grid[i].length
- 1 <= m, n <= 200
- 0 <= grid[i][j] <= 100
 */

import java.util.*;
import java.util.function.*;


public class MinCostClimbingStairsSimilar3 {



    static class Solution {
        public int minPathSum(List<List<Integer>> grid) {
            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            // if not grid or not grid[0]:
            // return 0
            // m, n = (len(grid), len(grid[0]))
            // dp = [0] * n
            // dp[0] = grid[0][0]
            // for j in range(1, n):
            // dp[j] = dp[j - 1] + grid[0][j]
            // for i in range(1, m):
            // dp[0] += grid[i][0]
            // for j in range(1, n):
            // dp[j] = min(dp[j], dp[j - 1]) + grid[i][j]
            // return dp[n - 1]

            throw new UnsupportedOperationException("Implement minPathSum");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.minPathSum(java.util.List.of(java.util.List.of(1, 3, 1), java.util.List.of(1, 5, 1), java.util.List.of(4, 2, 1))) == 7);
        System.out.println("✓ Test case 1 passed");
        assert (sol.minPathSum(java.util.List.of(java.util.List.of(1, 2), java.util.List.of(1, 1))) == 3);
        System.out.println("✓ Test case 2 passed");
        assert (sol.minPathSum(java.util.List.of(java.util.List.of(1))) == 1);
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
