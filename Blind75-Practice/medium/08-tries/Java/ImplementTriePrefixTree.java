/*
 * 208. Implement Trie (Prefix Tree)
 * Difficulty: Medium
 * Pattern: Tries / Design
 *
 * Problem:
 * A trie (pronounced as "try") or prefix tree is a tree data structure used to
 * efficiently store and retrieve keys in a dataset of strings. There are various
 * applications of this data structure, such as autocomplete and spell checker.
 *
 * Implement the Trie class:
 * - `Trie()` Initializes the trie object.
 * - `void insert(String word)` Inserts the string `word` into the trie.
 * - `boolean search(String word)` Returns `true` if the string `word` is in the
 *   trie (that is, it was inserted before), and `false` otherwise.
 * - `boolean startsWith(String prefix)` Returns `true` if there is a previously
 *   inserted string `word` that has the prefix `prefix`, and `false` otherwise.
 *
 * Example 1:
 * Input:
 * ["Trie", "insert", "search", "search", "startsWith", "insert", "search"]
 * [[], ["apple"], ["apple"], ["app"], ["app"], ["app"], ["app"]]
 * Output:
 * [null, null, true, false, true, null, true]
 * Explanation:
 * Trie trie = new Trie();
 * trie.insert("apple");
 * trie.search("apple");     // returns true
 * trie.search("app");       // returns false
 * trie.startsWith("app");   // returns true
 * trie.insert("app");
 * trie.search("app");       // returns true
 *
 * Example 2:
 * Input:
 * ["Trie", "insert", "startsWith", "search"]
 * [[], ["dog"], ["do"], ["dot"]]
 * Output:
 * [null, null, true, false]
 *
 * Constraints:
 * - 1 <= word.length, prefix.length <= 2000
 * - `word` and `prefix` consist only of lowercase English letters
 * - At most 3 * 10^4 calls in total will be made to `insert`, `search`, and
 *   `startsWith`
 *
 * Notes / How to think:
 * - Each node stores up to 26 outgoing edges and a marker for whether a full
 *   word ends there.
 * - `insert` creates missing nodes as it walks characters.
 * - `search` and `startsWith` both walk the trie; `search` also checks the end
 *   of word flag.
 */

public class ImplementTriePrefixTree {
    
        

    public ImplementTriePrefixTree() {
        
    }

    public void insert(String word) {
        
    }

    public boolean search(String word) {
        
    }

    public boolean startsWith(String prefix) {
        
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
    //     Map<Character, Node> children = new HashMap<>();
    //     boolean isWord;
    // }

    // private final Node root;

    // public ImplementTriePrefixTree() {
    //     root = new Node();
    // }

    // public void insert(String word) {
    //     Node node = root;
    //     for (char ch : word.toCharArray()) {
    //         node = node.children.computeIfAbsent(ch, key -> new Node());
    //     }
    //     node.isWord = true;
    // }

    // public boolean search(String word) {
    //     Node node = walk(word);
    //     return node != null && node.isWord;
    // }

    // public boolean startsWith(String prefix) {
    //     return walk(prefix) != null;
    // }

    // private Node walk(String word) {
    //     Node node = root;
        
    //     for (char ch : word.toCharArray()) {
    //         node = node.children.get(ch);
    //         if (node == null) {
    //             return null;
    //         }
    //     }
    //     return node;
    // }
    }

    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insert("apple");
        assert trie.search("apple");
        assert !trie.search("app");
        assert trie.startsWith("app");
        trie.insert("app");
        assert trie.search("app");

        System.out.println("Basic trie usage checks are in place.");
    }
}
