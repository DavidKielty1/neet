/*
 * 211. Design Add and Search Words Data Structure
 * Difficulty: Medium
 * Pattern: Tries / Design / DFS
 *
 * Problem:
 * Design a data structure that supports adding new words and finding whether a
 * string matches any previously added string.
 *
 * Implement the `WordDictionary` class:
 * - `WordDictionary()` Initializes the object.
 * - `void addWord(word)` Adds `word` to the data structure. It can be matched
 *   later.
 * - `boolean search(word)` Returns `true` if there is any string in the data
 *   structure that matches `word`, or `false` otherwise. `word` may contain
 *   dots `'.'` where dots can be matched with any letter.
 *
 * Example 1:
 * Input:
 * ["WordDictionary", "addWord", "addWord", "addWord", "search", "search",
 *  "search", "search"]
 * [[], ["bad"], ["dad"], ["mad"], ["pad"], ["bad"], [".ad"], ["b.."]]
 * Output:
 * [null, null, null, null, false, true, true, true]
 * Explanation:
 * WordDictionary wordDictionary = new WordDictionary();
 * wordDictionary.addWord("bad");
 * wordDictionary.addWord("dad");
 * wordDictionary.addWord("mad");
 * wordDictionary.search("pad"); // returns false
 * wordDictionary.search("bad"); // returns true
 * wordDictionary.search(".ad"); // returns true
 * wordDictionary.search("b.."); // returns true
 *
 * Example 2:
 * Input:
 * addWord("a"), addWord("ab"), search("a"), search(".a"), search("ab"),
 * search("a."), search(".b"), search("ab.")
 * Output:
 * true, false, true, true, true, false
 *
 * Constraints:
 * - 1 <= word.length <= 25
 * - `word` in `addWord` consists of lowercase English letters
 * - `word` in `search` consists of '.' or lowercase English letters
 * - There will be at most 2 dots in `word` for `search` queries
 * - At most 10^4 calls will be made to `addWord` and `search`
 *
 * Notes / How to think:
 * - A trie is a natural fit for exact prefix traversal.
 * - The wildcard `'.'` means search may branch into multiple children.
 * - A DFS helper from the current node and character index keeps the logic
 *   clean.
 */
public class DesignAddAndSearchWordsDataStructure {
    static class WordDictionary {
        static class Node {
            Node[] children;
            boolean isWord;
        }

        private Node root;

        public WordDictionary() {
        }

        public void addWord(String word) {
        }

        public boolean search(String word) {
        }

        private boolean dfs(String word, int index, Node node) {
        }
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            // static class Node {
            //     Node[] children = new Node[26];
            //     boolean isWord;
            // }
            //
            // private final Node root;
            //
            // public WordDictionary() {
            //     root = new Node();
            // }
            //
            // public void addWord(String word) {
            //     Node node = root;
            //     for (char c : word.toCharArray()) {
            //         int idx = c - 'a';
            //         if (node.children[idx] == null) {
            //             node.children[idx] = new Node();
            //         }
            //         node = node.children[idx];
            //     }
            //     node.isWord = true;
            // }
            //
            // public boolean search(String word) {
            //     return dfs(word, 0, root);
            // }
            //
            // private boolean dfs(String word, int index, Node node) {
            //     if (node == null) {
            //         return false;
            //     }
            //     if (index == word.length()) {
            //         return node.isWord;
            //     }
            //
            //     char c = word.charAt(index);
            //     if (c == '.') {
            //         for (Node child : node.children) {
            //             if (child != null && dfs(word, index + 1, child)) {
            //                 return true;
            //             }
            //         }
            //         return false;
            //     }
            //
            //     return dfs(word, index + 1, node.children[c - 'a']);
            // }
        }
    }

    public static void main(String[] args) {
        WordDictionary wordDictionary = new WordDictionary();

        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
        assert !wordDictionary.search("pad");
        assert wordDictionary.search("bad");
        assert wordDictionary.search(".ad");
        assert wordDictionary.search("b..");

        System.out.println("Basic word-dictionary usage checks are in place.");
    }
}
