/*
 * 286. Walls and Gates
 * Difficulty: Medium
 * Pattern: Graphs / Multi-source BFS
 *
 * Problem:
 * You are given an m x n 2D grid `rooms` initialized with these three values:
 * - `-1` means a wall or obstacle
 * - `0` means a gate
 * - `2147483647` means an empty room (INF)
 *
 * Fill each empty room with the distance to its nearest gate. If it is
 * impossible to reach a gate, leave the room as INF.
 *
 * You must modify the grid in-place.
 *
 * Example 1:
 * Input:
 * [
 *   [2147483647,-1,0,2147483647],
 *   [2147483647,2147483647,2147483647,-1],
 *   [2147483647,-1,2147483647,-1],
 *   [0,-1,2147483647,2147483647]
 * ]
 * Output:
 * [
 *   [3,-1,0,1],
 *   [2,2,1,-1],
 *   [1,-1,2,-1],
 *   [0,-1,3,4]
 * ]
 *
 * Example 2:
 * Input: [[-1]]
 * Output: [[-1]]
 *
 * Constraints:
 * - m == rooms.length
 * - n == rooms[i].length
 * - 1 <= m, n <= 250
 * - rooms[i][j] is -1, 0, or 2147483647
 *
 * Notes:
 * - Start BFS from every gate at the same time.
 * - The first time a room is reached is its shortest distance to any gate.
 */

public class WallsAndGates {
    public void wallsAndGates(int[][] rooms) {
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
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
    // int rows = rooms.length;
    // int cols = rooms[0].length;
    //
    // for (int r = 0; r < rows; r++) {
    //     for (int c = 0; c < cols; c++) {
    //         if (rooms[r][c] == 0) {
    //             queue.offer(new int[] {r, c});
    //         }
    //     }
    // }
    //
    // int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    // while (!queue.isEmpty()) {
    //     int[] cell = queue.poll();
    //     for (int[] dir : dirs) {
    //         int nr = cell[0] + dir[0];
    //         int nc = cell[1] + dir[1];
    //         if (nr < 0 || nc < 0 || nr == rows || nc == cols) {
    //             continue;
    //         }
    //         if (rooms[nr][nc] != Integer.MAX_VALUE) {
    //             continue;
    //         }
    //         rooms[nr][nc] = rooms[cell[0]][cell[1]] + 1;
    //         queue.offer(new int[] {nr, nc});
    //     }
    // }
    }
    

    public static void main(String[] args) {
        System.out.println("Practice stub ready. Implement wallsAndGates and add assertions.");
    }
}
