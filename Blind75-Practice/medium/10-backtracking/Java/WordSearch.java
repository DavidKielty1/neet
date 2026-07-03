/*
 * 79. Word Search
 * Difficulty: Medium
 * Pattern: Backtracking / DFS
 *
 * Problem:
 * Given an `m x n` grid of characters `board` and a string `word`, return `true` if
 * `word` exists in the grid.
 *
 * The word can be constructed from letters of sequentially adjacent cells, where adjacent
 * cells are horizontally or vertically neighboring. The same letter cell may not be used
 * more than once in a single word path.
 *
 * Example 1:
 * Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
 * Output: true
 *
 * Example 2:
 * Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
 * Output: true
 *
 * Example 3:
 * Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
 * Output: false
 *
 * Constraints:
 * - m == board.length
 * - n == board[i].length
 * - 1 <= m, n <= 6
 * - 1 <= word.length <= 15
 * - `board` and `word` consist of only uppercase and lowercase English letters
 *
 * Notes:
 * - Start a DFS from every cell that matches the first character.
 * - Mark a cell as visited while exploring a path, then restore it on the way back.
 * - Try four directions and stop early as soon as the word is found.
 */

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        // for (int row = 0; row < board.length; row++) {
        //     for (int col = 0; col < board[0].length; col++) {
        //         if (dfs(board, word, row, col, 0)) {
        //             return true;
        //         }
        //     }
        // }
        // return false;
        //
        // private boolean dfs(char[][] board, String word, int row, int col, int index) {
        //     if (index == word.length()) {
        //         return true;
        //     }
        //     if (row < 0 || col < 0 || row >= board.length || col >= board[0].length) {
        //         return false;
        //     }
        //     if (board[row][col] != word.charAt(index)) {
        //         return false;
        //     }
        //
        //     char saved = board[row][col];
        //     board[row][col] = '#';
        //     boolean found = dfs(board, word, row + 1, col, index + 1)
        //             || dfs(board, word, row - 1, col, index + 1)
        //             || dfs(board, word, row, col + 1, index + 1)
        //             || dfs(board, word, row, col - 1, index + 1);
        //     board[row][col] = saved;
        //     return found;
        // }
    }

    public static void main(String[] args) {
        System.out.println("Practice stub ready for 79. Word Search.");
    }
}
