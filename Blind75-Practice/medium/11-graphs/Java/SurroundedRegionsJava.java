/*
 * 130. Surrounded Regions
 * Difficulty: Medium
 * Pattern: Graphs / Flood Fill
 *
 * Problem:
 * You are given an `m x n` matrix `board` containing letters 'X' and 'O'.
 * Capture all regions that are 4-directionally surrounded by 'X' by flipping
 * all surrounded 'O' cells into 'X'. Any 'O' connected to the border cannot be
 * captured and must remain 'O'.
 *
 * Modify the board in-place.
 *
 * Example 1:
 * Input:
 * [
 *   ['X','X','X','X'],
 *   ['X','O','O','X'],
 *   ['X','X','O','X'],
 *   ['X','O','X','X']
 * ]
 * Output:
 * [
 *   ['X','X','X','X'],
 *   ['X','X','X','X'],
 *   ['X','X','X','X'],
 *   ['X','O','X','X']
 * ]
 *
 * Example 2:
 * Input: [['X']]
 * Output: [['X']]
 *
 * Constraints:
 * - m == board.length
 * - n == board[i].length
 * - 1 <= m, n <= 200
 * - board[i][j] is 'X' or 'O'
 *
 * Notes:
 * - Do not search inward from every region.
 * - Instead, mark all border-connected 'O' cells as safe, then flip the rest.
 */

public class SurroundedRegionsJava {

    static class Solution {
        public void solve(char[][] board) {
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            // int rows = board.length;
            // int cols = board[0].length;
            //
            // for (int r = 0; r < rows; r++) {
            //     dfs(board, r, 0);
            //     dfs(board, r, cols - 1);
            // }
            // for (int c = 0; c < cols; c++) {
            //     dfs(board, 0, c);
            //     dfs(board, rows - 1, c);
            // }
            //
            // for (int r = 0; r < rows; r++) {
            //     for (int c = 0; c < cols; c++) {
            //         if (board[r][c] == 'O') {
            //             board[r][c] = 'X';
            //         } else if (board[r][c] == '#') {
            //             board[r][c] = 'O';
            //         }
            //     }
            // }
            //
            // private void dfs(char[][] board, int r, int c) {
            //     if (r < 0 || c < 0 || r == board.length || c == board[0].length) {
            //         return;
            //     }
            //     if (board[r][c] != 'O') {
            //         return;
            //     }
            //     board[r][c] = '#';
            //     dfs(board, r + 1, c);
            //     dfs(board, r - 1, c);
            //     dfs(board, r, c + 1);
            //     dfs(board, r, c - 1);
            // }
        }
    }

    public static void main(String[] args) {
        System.out.println("Practice stub ready. Implement solve and inspect board output.");
    }
}
