/*
 * 200. Number of Islands
 * Difficulty: Medium
 * Pattern: Graphs / DFS or BFS
 *
 * Problem:
 * Given an m x n 2D binary grid `grid` which represents a map of '1's (land)
 * and '0's (water), return the number of islands.
 *
 * An island is formed by connecting adjacent lands horizontally or vertically.
 * You may assume all four edges of the grid are surrounded by water.
 *
 * Example 1:
 * Input:
 * grid = [
 *   ['1','1','1','1','0'],
 *   ['1','1','0','1','0'],
 *   ['1','1','0','0','0'],
 *   ['0','0','0','0','0']
 * ]
 * Output: 1
 *
 * Example 2:
 * Input:
 * grid = [
 *   ['1','1','0','0','0'],
 *   ['1','1','0','0','0'],
 *   ['0','0','1','0','0'],
 *   ['0','0','0','1','1']
 * ]
 * Output: 3
 *
 * Constraints:
 * - m == grid.length
 * - n == grid[i].length
 * - 1 <= m, n <= 300
 * - grid[i][j] is '0' or '1'
 *
 * Notes:
 * - Start a search whenever you find unvisited land.
 * - Mark the whole connected component so it is counted once.
 */

public class NumberOfIslands {
    static class Solution {
        public int numIslands(char[][] grid) {
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            // if (grid == null || grid.length == 0) {
            //     return 0;
            // }
            //
            // int rows = grid.length;
            // int cols = grid[0].length;
            // int islands = 0;
            //
            // for (int r = 0; r < rows; r++) {
            //     for (int c = 0; c < cols; c++) {
            //         if (grid[r][c] == '1') {
            //             islands++;
            //             dfs(grid, r, c);
            //         }
            //     }
            // }
            //
            // return islands;
            //
            // private void dfs(char[][] grid, int r, int c) {
            //     if (r < 0 || c < 0 || r == grid.length || c == grid[0].length
            //             || grid[r][c] != '1') {
            //         return;
            //     }
            //
            //     grid[r][c] = '0';
            //     dfs(grid, r + 1, c);
            //     dfs(grid, r - 1, c);
            //     dfs(grid, r, c + 1);
            //     dfs(grid, r, c - 1);
            // }

    public static void main(String[] args) {
        Solution solution = new Solution();

        char[][] grid1 = {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
        };

        char[][] grid2 = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };

        assert solution.numIslands(grid1) == 1;
        assert solution.numIslands(grid2) == 3;
        System.out.println("All test cases passed!");
    }
}
