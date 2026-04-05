"""
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
"""

from typing import List


class Solution:
    def minPathSum(self, grid: List[List[int]]) -> int:
        """
        Approach: Dynamic programming (2D to 1D optimization)

        Strategy:
        1. dp[i][j] = minimum cost to reach cell (i,j)
        2. Can reach from top or left
        3. Take minimum path plus current cost
        4. Optimize space with single row
        """

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        if not grid or not grid[0]:
            return 0

        m, n = len(grid), len(grid[0])

        # Use first row as DP array
        dp = [0] * n
        dp[0] = grid[0][0]

        # Initialize first row
        for j in range(1, n):
            dp[j] = dp[j - 1] + grid[0][j]

        # Process remaining rows
        for i in range(1, m):
            dp[0] += grid[i][0]  # Can only come from above

            for j in range(1, n):
                # Minimum of coming from left or top
                dp[j] = min(dp[j], dp[j - 1]) + grid[i][j]

        return dp[n - 1]


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.minPathSum([[1, 3, 1], [1, 5, 1], [4, 2, 1]]) == 7
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.minPathSum([[1, 2], [1, 1]]) == 3
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.minPathSum([[1]]) == 1
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
