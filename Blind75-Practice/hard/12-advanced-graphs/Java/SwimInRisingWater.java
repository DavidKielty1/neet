/*
 * 778. Swim in Rising Water
 * Difficulty: Hard
 * Pattern: Dijkstra / minimum bottleneck path
 *
 * Problem:
 * You are given an n x n integer matrix grid where each value grid[i][j]
 * represents the elevation at that point.
 *
 * Rain starts to fall. At time t, the water depth everywhere is t. You can swim
 * from one square to another 4-directionally adjacent square if both squares'
 * elevations are at most t.
 *
 * Return the least time until you can reach the bottom-right square from the
 * top-left square.
 *
 * Example 1:
 * Input: grid = [[0,2],[1,3]]
 * Output: 3
 *
 * Example 2:
 * Input: grid = [[0,1,2,3,4],[24,23,22,21,5],[12,13,14,15,16],[11,17,18,19,20],[10,9,8,7,6]]
 * Output: 16
 *
 * Constraints:
 * - n == grid.length
 * - n == grid[i].length
 * - 1 <= n <= 50
 * - 0 <= grid[i][j] < n^2
 * - Each value grid[i][j] is unique
 */
public class SwimInRisingWater {
    public int swimInWater(int[][] grid) {
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //

    // int n = grid.length;
    // boolean[][] seen = new boolean[n][n];
    // PriorityQueue<int[]> heap = new PriorityQueue<>(Comparator.comparingInt(cell -> cell[0]));
    // heap.offer(new int[] {grid[0][0], 0, 0});
    // int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    //
    // while (!heap.isEmpty()) {
    //     int[] current = heap.poll();
    //     int time = current[0];
    //     int row = current[1];
    //     int col = current[2];
    //     if (seen[row][col]) {
    //         continue;
    //     }
    //     seen[row][col] = true;
    //     if (row == n - 1 && col == n - 1) {
    //         return time;
    //     }
    //     for (int[] direction : directions) {
    //         int nextRow = row + direction[0];
    //         int nextCol = col + direction[1];
    //         if (nextRow < 0 || nextCol < 0 || nextRow == n || nextCol == n
    //                 || seen[nextRow][nextCol]) {
    //             continue;
    //         }
    //         heap.offer(new int[] {Math.max(time, grid[nextRow][nextCol]), nextRow, nextCol});
    //     }
    // }
    //
    // return -1;
        throw new UnsupportedOperationException("Implement swimInWater");
    }
    

    public static void main(String[] args) {
        System.out.println("Practice stub ready. Implement swimInWater and add checks.");
    }
}
