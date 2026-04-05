"""
LeetCode 463: Island Perimeter
Difficulty: Easy
Pattern: Graphs (grid)

Problem:
You are given row x col binary grid where 1 is land and 0 is water. Grid cells connect
only horizontally/vertically. There is exactly one island (connected 1s). Return its
perimeter (number of edges touching water or boundary).

Example:
Input: grid = [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]
Output: 16

Constraints:
- row == grid.length, col == grid[i].length
- 1 <= row, col <= 100

Time Complexity: O(m * n)
Space Complexity: O(1)
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
