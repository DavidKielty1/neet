/*
304. Range Sum Query 2D - Immutable
Difficulty: Medium
Pattern: Prefix Sum / 2D Prefix Sum

Problem:
Implement the NumMatrix class:

- NumMatrixJava(int[][] matrix) initializes the object with the integer matrix.
- int sumRegion(int r1, int c1, int r2, int c2) returns the sum of the rectangle
  whose top-left corner is (r1, c1) and whose bottom-right corner is (r2, c2),
  inclusive.

Idea:
Precompute a 2D prefix-sum matrix so each region query can be answered in O(1).

Time:
- Constructor: O(rows * cols)
- sumRegion: O(1)

Space: O(rows * cols)
*/
public class NumMatrixJava {

    private final int[][] sumMat;

    public NumMatrixJava(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            sumMat = new int[1][1];
            return;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Extra top row and left column of 0s let us avoid boundary checks.
        sumMat = new int[rows + 1][cols + 1];

        for (int r = 0; r < rows; r++) {
            int prefix = 0;

            for (int c = 0; c < cols; c++) {
                prefix += matrix[r][c];
                int above = sumMat[r][c + 1];
                sumMat[r + 1][c + 1] = prefix + above;
            }
        }
    }

    public int sumRegion(int r1, int c1, int r2, int c2) {
        r1++;
        c1++;
        r2++;
        c2++;

        int bottomRight = sumMat[r2][c2];
        int above = sumMat[r1 - 1][c2];
        int left = sumMat[r2][c1 - 1];
        int topLeft = sumMat[r1 - 1][c1 - 1];

        return bottomRight - above - left + topLeft;
    }

    public static void main(String[] args) {
        NumMatrixJava numMatrix =
                new NumMatrixJava(
                        new int[][] {
                            {3, 0, 1, 4, 2},
                            {5, 6, 3, 2, 1},
                            {1, 2, 0, 1, 5},
                            {4, 1, 0, 1, 7},
                            {1, 0, 3, 0, 5}
                        });

        assert numMatrix.sumRegion(2, 1, 4, 3) == 8;
        assert numMatrix.sumRegion(1, 1, 2, 2) == 11;
        assert numMatrix.sumRegion(1, 2, 2, 4) == 12;

        System.out.println("All test cases passed!");
    }
}
