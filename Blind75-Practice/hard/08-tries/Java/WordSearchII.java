/*
 * 212. Word Search II
 * Difficulty: Hard
 * Pattern: Trie and backtracking
 *
 * Problem:
 * Given an m x n board of characters and a list of strings words, return all
 * words on the board.
 *
 * Each word must be constructed from letters of sequentially adjacent cells,
 * where adjacent cells are horizontally or vertically neighboring. The same
 * letter cell may not be used more than once in a word.
 *
 * Example 1:
 * Input: board = [["o","a","a","n"],["e","t","a","e"],["i","h","k","r"],["i","f","l","v"]],
 * words = ["oath","pea","eat","rain"]
 * Output: ["eat","oath"]
 *
 * Example 2:
 * Input: board = [["a","b"],["c","d"]], words = ["abcb"]
 * Output: []
 *
 * Constraints:
 * - m == board.length
 * - n == board[i].length
 * - 1 <= m, n <= 12
 * - board[i][j] is a lowercase English letter
 * - 1 <= words.length <= 3 * 10^4
 * - 1 <= words[i].length <= 10
 * - words[i] consists of lowercase English letters
 * - All strings of words are unique
 */
public class WordSearchII {
    public java.util.List<String> findWords(char[][] board, String[] words) {
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //

    // TrieNode root = new TrieNode();
    // for (String word : words) {
    //     insert(root, word);
    // }
    //
    // List<String> result = new ArrayList<>();
    // for (int row = 0; row < board.length; row++) {
    //     for (int col = 0; col < board[0].length; col++) {
    //         dfs(board, row, col, root, result);
    //     }
    // }
    // return result;
        throw new UnsupportedOperationException("Implement findWords");
    }

    // static class TrieNode {
    //     TrieNode[] children = new TrieNode[26];
    //     String word;
    // }
    //
    // private void insert(TrieNode root, String word) {
    //     TrieNode node = root;
    //     for (char c : word.toCharArray()) {
    //         int index = c - 'a';
    //         if (node.children[index] == null) {
    //             node.children[index] = new TrieNode();
    //         }
    //         node = node.children[index];
    //     }
    //     node.word = word;
    // }
    //
    // private void dfs(char[][] board, int row, int col, TrieNode node, List<String> result) {
    //     if (row < 0 || col < 0 || row == board.length || col == board[0].length) {
    //         return;
    //     }
    //     char c = board[row][col];
    //     if (c == '#' || node.children[c - 'a'] == null) {
    //         return;
    //     }
    //     node = node.children[c - 'a'];
    //     if (node.word != null) {
    //         result.add(node.word);
    //         node.word = null;
    //     }
    //     board[row][col] = '#';
    //     dfs(board, row + 1, col, node, result);
    //     dfs(board, row - 1, col, node, result);
    //     dfs(board, row, col + 1, node, result);
    //     dfs(board, row, col - 1, node, result);
    //     board[row][col] = c;
    // }
    

    public static void main(String[] args) {
        System.out.println("Practice stub ready. Implement findWords and add checks.");
    }
}
