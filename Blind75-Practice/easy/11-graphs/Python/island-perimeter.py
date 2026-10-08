"""
463. Island Perimeter
Difficulty: Easy
Pattern: Graphs (grid)

Problem:
You are given row x col grid representing a map where grid[i][j] = 1 represents
land and grid[i][j] = 0 represents water. Grid cells are connected
horizontally/vertically (not diagonally). The grid is completely surrounded by
water, and there is exactly one island (one or more connected land cells). The
island does not have lakes. One cell is a square with side length 1. Return the
perimeter of the island.

Example 1:
Input: grid = [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]
Output: 16

Example 2:
Input: grid = [[1]]
Output: 4

Example 3:
Input: grid = [[1,0]]
Output: 4

Constraints:
- row == grid.length
- col == grid[i].length
- 1 <= row, col <= 100
- grid[i][j] is 0 or 1
- There is exactly one island in grid
"""

from typing import List


class Solution:
    def islandPerimeter(self, grid: List[List[int]]) -> int:
        """Each land cell adds 4; subtract 2 for each shared edge between two land cells."""

        rows, cols = len(grid), len(grid[0])
        perimeter = 0
        for r in range(rows):
            for c in range(cols):
                if grid[r][c] != 1:
                    continue
                perimeter += 4
                if r > 0 and grid[r - 1][c] == 1:
                    perimeter -= 2
                if c > 0 and grid[r][c - 1] == 1:
                    perimeter -= 2
        return perimeter


if __name__ == "__main__":
    sol = Solution()
    g = [[0, 1, 0, 0], [1, 1, 1, 0], [0, 1, 0, 0], [1, 1, 0, 0]]
    assert sol.islandPerimeter(g) == 16
    assert sol.islandPerimeter([[1]]) == 4
    assert sol.islandPerimeter([[1, 0]]) == 4
    print("All tests passed.")
