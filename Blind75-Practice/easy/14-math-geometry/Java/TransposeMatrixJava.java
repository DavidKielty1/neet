/*
867. Transpose Matrix
Difficulty: Easy
Pattern: Math & Geometry

result[j][i] = matrix[i][j].

Time: O(mn), Space: O(mn) output
*/

public class TransposeMatrixJava {

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

        throw new UnsupportedOperationException("Implement transpose");
    }

    public static void main(String[] args) {
        TransposeMatrixJava s = new TransposeMatrixJava();
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] ta = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        assert java.util.Arrays.deepEquals(s.transpose(a), ta);
        int[][] b = {{1, 2, 3}, {4, 5, 6}};
        int[][] tb = {{1, 4}, {2, 5}, {3, 6}};
        assert java.util.Arrays.deepEquals(s.transpose(b), tb);
        System.out.println("All test cases passed!");
    }
}
