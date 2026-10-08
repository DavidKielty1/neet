/*
 * 867. Transpose Matrix
 * Difficulty: Easy
 * Pattern: Math & Geometry
 *
 * Problem:
 * Given a 2D integer array matrix, return the transpose of matrix. The
 * transpose of a matrix is the matrix flipped over its main diagonal,
 * switching the matrix's row and column indices: result[j][i] =
 * matrix[i][j].
 *
 * Example 1:
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [[1,4,7],[2,5,8],[3,6,9]]
 *
 * Example 2:
 * Input: matrix = [[1,2,3],[4,5,6]]
 * Output: [[1,4],[2,5],[3,6]]
 *
 * Constraints:
 * - m == matrix.length
 * - n == matrix[i].length
 * - 1 <= m, n <= 1000
 * - 1 <= m * n <= 10^5
 * - -10^9 <= matrix[i][j] <= 10^9
 */

public class TransposeMatrix {

    public int[][] transpose(int[][] matrix) {
        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        // int m = matrix.length;
        // int n = matrix[0].length;
        // int[][] ans = new int[n][m];
        // for (int i = 0; i < m; i++) {
            // for (int j = 0; j < n; j++) {
                // ans[j][i] = matrix[i][j];
            // }
        // }
        // return ans;

        // int m = matrix.length;
        // int n = matrix[0].length;
        // int[][] result = new int[n][m];
        // for (int i = 0; i < m; i++) {
        //     for (int j = 0; j < n; j++) {
        //         result[j][i] = matrix[i][j];
        //     }
        // }
        // return result;
        throw new UnsupportedOperationException("Implement transpose");
    }

    public static void main(String[] args) {
        TransposeMatrix s = new TransposeMatrix();
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] ta = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        assert java.util.Arrays.deepEquals(s.transpose(a), ta);
        int[][] b = {{1, 2, 3}, {4, 5, 6}};
        int[][] tb = {{1, 4}, {2, 5}, {3, 6}};
        assert java.util.Arrays.deepEquals(s.transpose(b), tb);
        System.out.println("All test cases passed!");
    }
}
