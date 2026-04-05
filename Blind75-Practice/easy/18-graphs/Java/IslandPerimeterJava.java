/*
463. Island Perimeter
Difficulty: Easy
Pattern: Graphs (grid)

Single island of 1s in a binary grid; return boundary length.

Time: O(mn), Space: O(1)
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

        // int rows = grid.length;
        // int cols = grid[0].length;
        // int perimeter = 0;
        // for (int r = 0; r < rows; r++) {
            // for (int c = 0; c < cols; c++) {
                // if (grid[r][c] != 1) {
                    // continue;
                // }
                // perimeter += 4;
                // if (r > 0 && grid[r - 1][c] == 1) {
                    // perimeter -= 2;
                // }
                // if (c > 0 && grid[r][c - 1] == 1) {
                    // perimeter -= 2;
                // }
            // }
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
