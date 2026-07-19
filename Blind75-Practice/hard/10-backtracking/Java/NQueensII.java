/*
 * 52. N-Queens II
 * Difficulty: Hard
 * Pattern: Backtracking
 *
 * Problem:
 * The n-queens puzzle is the problem of placing n queens on an n x n chessboard
 * such that no two queens attack each other.
 *
 * Given an integer n, return the number of distinct solutions to the n-queens
 * puzzle.
 *
 * Example 1:
 * Input: n = 4
 * Output: 2
 *
 * Example 2:
 * Input: n = 1
 * Output: 1
 *
 * Constraints:
 * - 1 <= n <= 9
 */
public class NQueensII {
    public int totalNQueens(int n) {
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //

    // return count(0, n, new boolean[n], new boolean[2 * n], new boolean[2 * n]);
        throw new UnsupportedOperationException("Implement totalNQueens");
    }

    // private int count(int row, int n, boolean[] cols, boolean[] diag, boolean[] antiDiag) {
    //     if (row == n) {
    //         return 1;
    //     }
    //     int total = 0;
    //     for (int col = 0; col < n; col++) {
    //         int d = row - col + n;
    //         int a = row + col;
    //         if (cols[col] || diag[d] || antiDiag[a]) {
    //             continue;
    //         }
    //         cols[col] = diag[d] = antiDiag[a] = true;
    //         total += count(row + 1, n, cols, diag, antiDiag);
    //         cols[col] = diag[d] = antiDiag[a] = false;
    //     }
    //     return total;
    // }
    

    public static void main(String[] args) {
        System.out.println("Practice stub ready. Implement totalNQueens and add checks.");
    }
}
