/*
 * 695. Max Area of Island
 * Difficulty: Medium
 * Pattern: Graphs / DFS-BFS
 *
 * Problem:
 * You are given an `m x n` binary matrix `grid`. An island is a group of `1`s
 * connected 4-directionally. The area of an island is the number of cells in
 * that connected component.
 *
 * Return the maximum area of an island in `grid`. If there is no island,
 * return `0`.
 *
 * Example 1:
 * Input:
 * [
 *   [0,0,1,0,0,0,1,1],
 *   [0,1,1,0,1,0,1,1],
 *   [0,0,0,0,1,0,0,0]
 * ]
 * Output: 4
 *
 * Example 2:
 * Input: [[0,0,0,0,0,0,0,0]]
 * Output: 0
 *
 * Constraints:
 * - m == grid.length
 * - n == grid[i].length
 * - 1 <= m, n <= 50
 * - grid[i][j] is 0 or 1
 *
 * Notes:
 * - This is the same flood-fill idea as counting islands, but accumulate size.
 * - Mutating visited land to water is a simple in-place marking strategy.
 */

public class MaxAreaOfIsland {
    public int maxAreaOfIsland(int[][] grid) {
    }

        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        // int best = 0;
        // for (int r = 0; r < grid.length; r++) {
        //     for (int c = 0; c < grid[0].length; c++) {
        //         if (grid[r][c] == 1) {
        //             best = Math.max(best, dfs(grid, r, c));
        //         }
        //     }
        // }
        // return best;
        //
        // private int dfs(int[][] grid, int r, int c) {
        //     if (r < 0 || c < 0 || r == grid.length || c == grid[0].length) {
        //         return 0;
        //     }
        //     if (grid[r][c] == 0) {
        //         return 0;
        //     }
        //
        //     grid[r][c] = 0;
        //     return 1
        //             + dfs(grid, r + 1, c)
        //             + dfs(grid, r - 1, c)
        //             + dfs(grid, r, c + 1)
        //             + dfs(grid, r, c - 1);
        // }
    }

    public static void main(String[] args) {
        MaxAreaOfIsland solution = new MaxAreaOfIsland();
        int[][] grid = {
            {0, 0, 1, 0, 0, 0, 1, 1},
            {0, 1, 1, 0, 1, 0, 1, 1},
            {0, 0, 0, 0, 1, 0, 0, 0}
        };
        assert solution.maxAreaOfIsland(grid) == 4;
        System.out.println("All test cases passed!");
    }
}
