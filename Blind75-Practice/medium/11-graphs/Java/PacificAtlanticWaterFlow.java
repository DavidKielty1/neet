/*
 * 417. Pacific Atlantic Water Flow
 * Difficulty: Medium
 * Pattern: Graphs / Reverse DFS-BFS
 *
 * Problem:
 * There is an m x n rectangular island that borders both the Pacific Ocean and
 * Atlantic Ocean. The Pacific touches the island's left and top edges, and the
 * Atlantic touches the island's right and bottom edges.
 *
 * You are given an `m x n` matrix `heights` where `heights[r][c]` represents
 * the height above sea level of the cell at `(r, c)`. Rain water can flow from
 * a cell to a neighboring cell in the four cardinal directions if the
 * neighboring cell's height is less than or equal to the current cell's
 * height. Return all coordinates where water can flow to both oceans.
 *
 * Example 1:
 * Input:
 * heights = [
 *   [1,2,2,3,5],
 *   [3,2,3,4,4],
 *   [2,4,5,3,1],
 *   [6,7,1,4,5],
 *   [5,1,1,2,4]
 * ]
 * Output: [[0,4],[1,3],[1,4],[2,2],[3,0],[3,1],[4,0]]
 *
 * Example 2:
 * Input: heights = [[1]]
 * Output: [[0,0]]
 *
 * Constraints:
 * - m == heights.length
 * - n == heights[r].length
 * - 1 <= m, n <= 200
 * - 0 <= heights[r][c] <= 10^5
 *
 * Notes:
 * - It is easier to search backward from the oceans than forward from each cell.
 * - Mark cells reachable from the Pacific and from the Atlantic, then intersect.
 */

import java.util.Arrays;
import java.util.List;

public class PacificAtlanticWaterFlow {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        
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
    // int rows = heights.length;
    // int cols = heights[0].length;
    // boolean[][] pacific = new boolean[rows][cols];
    // boolean[][] atlantic = new boolean[rows][cols];
    //
    // for (int c = 0; c < cols; c++) {
    //     dfs(heights, 0, c, pacific, heights[0][c]);
    //     dfs(heights, rows - 1, c, atlantic, heights[rows - 1][c]);
    // }
    //
    // for (int r = 0; r < rows; r++) {
    //     dfs(heights, r, 0, pacific, heights[r][0]);
    //     dfs(heights, r, cols - 1, atlantic, heights[r][cols - 1]);
    // }
    //
    // List<List<Integer>> answer = new ArrayList<>();
    // for (int r = 0; r < rows; r++) {
    //     for (int c = 0; c < cols; c++) {
    //         if (pacific[r][c] && atlantic[r][c]) {
    //             answer.add(Arrays.asList(r, c));
    //         }
    //     }
    // }
    // return answer;
    //
    // private void dfs(int[][] heights, int r, int c, boolean[][] seen, int prev) {
    //     if (r < 0 || c < 0 || r == heights.length || c == heights[0].length) {
    //         return;
    //     }
    //     if (seen[r][c] || heights[r][c] < prev) {
    //         return;
    //     }
    //
    //     seen[r][c] = true;
    //     dfs(heights, r + 1, c, seen, heights[r][c]);
    //     dfs(heights, r - 1, c, seen, heights[r][c]);
    //     dfs(heights, r, c + 1, seen, heights[r][c]);
    //     dfs(heights, r, c - 1, seen, heights[r][c]);
    // }
    }
    

    public static void main(String[] args) {
        PacificAtlanticWaterFlow solution = new PacificAtlanticWaterFlow();
        int[][] heights = {
            {1, 2, 2, 3, 5},
            {3, 2, 3, 4, 4},
            {2, 4, 5, 3, 1},
            {6, 7, 1, 4, 5},
            {5, 1, 1, 2, 4}
        };

        List<List<Integer>> result = solution.pacificAtlantic(heights);
        assert result.size() == 7;
        assert result.contains(Arrays.asList(0, 4));
        assert result.contains(Arrays.asList(4, 0));
        System.out.println("All test cases passed!");
    }
}
