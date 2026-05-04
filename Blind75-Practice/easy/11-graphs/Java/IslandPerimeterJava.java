/*
463. Island Perimeter
Difficulty: Easy
Pattern: Graphs (grid)

Problem:
You are given a rectangular `grid` of 0s and 1s where:
- `1` represents land
- `0` represents water

The grid contains exactly one island. The island has no lakes, meaning any water
inside the grid is connected to the outer water. Return the perimeter of the island.

Example 1:
Input:
grid = [
  [0,1,0,0],
  [1,1,1,0],
  [0,1,0,0],
  [1,1,0,0]
]
Output: 16
Explanation:
Each land cell contributes 4 sides, but shared edges between neighboring land
cells should not count twice.

Example 2:
Input: grid = [[1]]
Output: 4
Explanation:
A single land cell has all 4 edges exposed.

Example 3:
Input: grid = [[1,0]]
Output: 4
Explanation:
The island is still just one cell, so its perimeter is 4.

Constraints:
- 1 <= grid.length, grid[i].length <= 100
- grid[i][j] is 0 or 1
- There is exactly one island

Why this works:
Start each land cell with 4 sides. Whenever it shares an edge with land above
or to the left, subtract 2 because that shared edge was counted twice.

Time: O(mn)
Space: O(1)
*/
public class IslandPerimeterJava {

    public int islandPerimeter(int[][] grid) {
        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        // int perimeter = 0;
        // for (int r = 0; r < grid.length; r++) {
        //     for (int c = 0; c < grid[0].length; c++) {
        //         if (grid[r][c] == 0) {
        //             continue;
        //         }
        //         perimeter += 4;
        //         if (r > 0 && grid[r - 1][c] == 1) {
        //             perimeter -= 2;
        //         }
        //         if (c > 0 && grid[r][c - 1] == 1) {
        //             perimeter -= 2;
        //         }
        //     }
        // }
        // return perimeter;
        throw new UnsupportedOperationException("Implement islandPerimeter");
    }

    public static void main(String[] args) {
        IslandPerimeterJava sol = new IslandPerimeterJava();
        int[][] g = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        assert sol.islandPerimeter(g) == 16;
        assert sol.islandPerimeter(new int[][] {{1}}) == 4;
        assert sol.islandPerimeter(new int[][] {{1, 0}}) == 4;
        System.out.println("All tests passed.");
    }
}
