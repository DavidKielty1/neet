/*
 * 994. Rotting Oranges
 * Difficulty: Medium
 * Pattern: Graphs / Multi-source BFS
 *
 * Problem:
 * You are given an `m x n` grid where each cell can have one of three values:
 * - `0` representing an empty cell
 * - `1` representing a fresh orange
 * - `2` representing a rotten orange
 *
 * Every minute, any fresh orange that is 4-directionally adjacent to a rotten
 * orange becomes rotten. Return the minimum number of minutes that must elapse
 * until no cell has a fresh orange. If this is impossible, return `-1`.
 *
 * Example 1:
 * Input: grid = [[2,1,1],[1,1,0],[0,1,1]]
 * Output: 4
 *
 * Example 2:
 * Input: grid = [[2,1,1],[0,1,1],[1,0,1]]
 * Output: -1
 *
 * Example 3:
 * Input: grid = [[0,2]]
 * Output: 0
 *
 * Constraints:
 * - m == grid.length
 * - n == grid[i].length
 * - 1 <= m, n <= 10
 * - grid[i][j] is 0, 1, or 2
 *
 * Notes:
 * - Start BFS from every initially rotten orange.
 * - Count fresh oranges so you know when the process is complete.
 */

public class RottingOrangesJava {

    static class Solution {
        public int orangesRotting(int[][] grid) {
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            // Queue<int[]> queue = new ArrayDeque<>();
            // int fresh = 0;
            // for (int r = 0; r < grid.length; r++) {
            //     for (int c = 0; c < grid[0].length; c++) {
            //         if (grid[r][c] == 2) {
            //             queue.offer(new int[] {r, c});
            //         } else if (grid[r][c] == 1) {
            //             fresh++;
            //         }
            //     }
            // }
            //
            // int minutes = 0;
            // int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
            // while (!queue.isEmpty() && fresh > 0) {
            //     int size = queue.size();
            //     for (int i = 0; i < size; i++) {
            //         int[] cell = queue.poll();
            //         for (int[] dir : dirs) {
            //             int nr = cell[0] + dir[0];
            //             int nc = cell[1] + dir[1];
            //             if (nr < 0 || nc < 0 || nr == grid.length || nc == grid[0].length) {
            //                 continue;
            //             }
            //             if (grid[nr][nc] != 1) {
            //                 continue;
            //             }
            //             grid[nr][nc] = 2;
            //             fresh--;
            //             queue.offer(new int[] {nr, nc});
            //         }
            //     }
            //     minutes++;
            // }
            //
            // return fresh == 0 ? minutes : -1;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        assert solution.orangesRotting(new int[][] {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}}) == 4;
        assert solution.orangesRotting(new int[][] {{2, 1, 1}, {0, 1, 1}, {1, 0, 1}}) == -1;
        System.out.println("All test cases passed!");
    }
}
