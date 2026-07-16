/*
 * LeetCode 304. Range Sum Query 2D - Immutable
 *
 * Given a 2D matrix matrix, handle multiple queries of the following type:
 * calculate the sum of the elements of matrix inside the rectangle defined by
 * its upper left corner (row1, col1) and lower right corner (row2, col2).
 *
 * Implement the NumMatrix class:
 * - NumMatrix(int[][] matrix) initializes the object with the integer matrix
 * - int sumRegion(int row1, int col1, int row2, int col2) returns the sum
 *   of the elements of matrix inside the rectangle
 *
 * Example 1:
 * Input:
 * ["NumMatrix","sumRegion","sumRegion","sumRegion"]
 * [[[[3,0,1,4,2],[5,6,3,2,1],[1,2,0,1,5],[4,1,0,1,7],[1,0,3,0,5]]],
 *  [2,1,4,3],[1,1,2,2],[1,2,2,4]]
 * Output: [null,8,11,12]
 *
 * Example 2:
 * Input: matrix = [[5]]
 * Output: single-cell queries return 5
 *
 * Constraints:
 * - m == matrix.length
 * - n == matrix[i].length
 * - 1 <= m, n <= 200
 * - -100000 <= matrix[i][j] <= 100000
 * - 0 <= row1 <= row2 < m
 * - 0 <= col1 <= col2 < n
 * - At most 10000 calls will be made to sumRegion
 */
public class RangeSumQuery2DImmutable {
    int[][] prefix;

    public RangeSumQuery2DImmutable(int[][] matrix) {
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        // Build a 2D prefix-sum table with an extra top row and left column.
        //
        // int rows = matrix.length;
        // int cols = matrix[0].length;
        // prefix = new int[rows + 1][cols + 1];
        // for (int r = 1; r <= rows; r++) {
        //     for (int c = 1; c <= cols; c++) {
        //         prefix[r][c] = matrix[r - 1][c - 1]
        //                 + prefix[r - 1][c]
        //                 + prefix[r][c - 1]
        //                 - prefix[r - 1][c - 1];
        //     }
        // }

        // public int sumRegion(int row1, int col1, int row2, int col2) {
            // return prefix[row2 + 1][col2 + 1]
            // - prefix[row1][col2 + 1]
            // - prefix[row2 + 1][col1]
            // + prefix[row1][col1];
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
    }

    public static void main(String[] args) {
        System.out.println("Implement tests.");
    }
}
