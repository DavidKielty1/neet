/*
 * 51. N-Queens
 * Difficulty: Hard
 * Pattern: Backtracking
 *
 * Problem:
 * The n-queens puzzle is the problem of placing n queens on an n x n chessboard
 * such that no two queens attack each other.
 *
 * Given an integer n, return all distinct solutions to the n-queens puzzle. You
 * may return the answer in any order.
 *
 * Each solution contains a distinct board configuration, where 'Q' indicates a
 * queen and '.' indicates an empty space.
 *
 * Example 1:
 * Input: n = 4
 * Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
 *
 * Example 2:
 * Input: n = 1
 * Output: [["Q"]]
 *
 * Constraints:
 * - 1 <= n <= 9
 */
public class NQueens {
    static class Solution {
        public java.util.List<java.util.List<String>> solveNQueens(int n) {
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //

            // List<List<String>> result = new ArrayList<>();
            // char[][] board = new char[n][n];
            // for (char[] row : board) {
            //     Arrays.fill(row, '.');
            // }
            // backtrack(0, board, new boolean[n], new boolean[2 * n], new boolean[2 * n], result);
            // return result;
            throw new UnsupportedOperationException("Implement solveNQueens");
        }

        // private void backtrack(int row, char[][] board, boolean[] cols,
        //         boolean[] diag, boolean[] antiDiag, List<List<String>> result) {
        //     if (row == board.length) {
        //         result.add(toRows(board));
        //         return;
        //     }
        //     for (int col = 0; col < board.length; col++) {
        //         int d = row - col + board.length;
        //         int a = row + col;
        //         if (cols[col] || diag[d] || antiDiag[a]) {
        //             continue;
        //         }
        //         board[row][col] = 'Q';
        //         cols[col] = diag[d] = antiDiag[a] = true;
        //         backtrack(row + 1, board, cols, diag, antiDiag, result);
        //         cols[col] = diag[d] = antiDiag[a] = false;
        //         board[row][col] = '.';
        //     }
        // }
    }

    public static void main(String[] args) {
        System.out.println("Practice stub ready. Implement solveNQueens and add checks.");
    }
}
