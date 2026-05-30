/*
 * LeetCode 36. Valid Sudoku
 *
 * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be
 * validated according to the following rules:
 * - Each row must contain the digits 1-9 without repetition.
 * - Each column must contain the digits 1-9 without repetition.
 * - Each of the nine 3 x 3 sub-boxes must contain the digits 1-9 without
 *   repetition.
 *
 * Note:
 * - A Sudoku board could be valid but not necessarily solvable.
 * - Only the filled cells need to be validated.
 *
 * Example 1:
 * Input: board =
 * [["5","3",".",".","7",".",".",".","."],
 *  ["6",".",".","1","9","5",".",".","."],
 *  [".","9","8",".",".",".",".","6","."],
 *  ["8",".",".",".","6",".",".",".","3"],
 *  ["4",".",".","8",".","3",".",".","1"],
 *  ["7",".",".",".","2",".",".",".","6"],
 *  [".","6",".",".",".",".","2","8","."],
 *  [".",".",".","4","1","9",".",".","5"],
 *  [".",".",".",".","8",".",".","7","9"]]
 * Output: true
 *
 * Example 2:
 * Input: same board but top-left 5 replaced by 8
 * Output: false
 *
 * Constraints:
 * - board.length == 9
 * - board[i].length == 9
 * - board[i][j] is a digit 1-9 or '.'
 */

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        // Track seen digits for each row, column, and 3x3 box.
        //
        // boolean[][] rows = new boolean[9][9];
        // boolean[][] cols = new boolean[9][9];
        // boolean[][] boxes = new boolean[9][9];
        // for (int r = 0; r < 9; r++) {
        //     for (int c = 0; c < 9; c++) {
        //         if (board[r][c] == '.') {
        //             continue;
        //         }
        //         int digit = board[r][c] - '1';
        //         int box = (r / 3) * 3 + (c / 3);
        //         if (rows[r][digit] || cols[c][digit] || boxes[box][digit]) {
        //             return false;
        //         }
        //         rows[r][digit] = true;
        //         cols[c][digit] = true;
        //         boxes[box][digit] = true;
        //     }
        // }
        // return true;
    }

    public static void main(String[] args) {
        System.out.println("Implement tests.");
    }
}
