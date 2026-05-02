/*
 * 2707. Extra Characters in a String
 * Difficulty: Medium
 * Pattern: Tries / Dynamic Programming
 *
 * Problem:
 * You are given a 0-indexed string `s` and a dictionary of words `dictionary`.
 * You have to break `s` into one or more non-overlapping substrings such that
 * each substring is present in `dictionary`. There may be some extra characters
 * in `s` that are not part of any chosen dictionary substring.
 *
 * Return the minimum number of extra characters left over after breaking up `s`
 * optimally.
 *
 * Example 1:
 * Input: s = "leetscode", dictionary = ["leet","code","leetcode"]
 * Output: 1
 * Explanation:
 * Break the string as "leet" + "s" + "code". The character 's' is extra, so
 * the answer is 1.
 *
 * Example 2:
 * Input: s = "sayhelloworld", dictionary = ["hello","world"]
 * Output: 3
 * Explanation:
 * One optimal split is "say" + "hello" + "world". The characters in "say" are
 * extra, so the answer is 3.
 *
 * Example 3:
 * Input: s = "applepenapple", dictionary = ["apple","pen"]
 * Output: 0
 * Explanation:
 * Break the string as "apple" + "pen" + "apple". No extra characters remain.
 *
 * Constraints:
 * - 1 <= s.length <= 50
 * - 1 <= dictionary.length <= 50
 * - 1 <= dictionary[i].length <= 50
 * - `dictionary[i]` and `s` consist only of lowercase English letters
 * - `dictionary` contains distinct words
 *
 * Notes / How to think:
 * - Let `dp[i]` represent the minimum extra characters needed for the suffix
 *   starting at index `i`.
 * - At each position, either treat `s[i]` as extra or match dictionary words
 *   starting there.
 * - A trie can help scan matching words efficiently from each index.
 */
public class ExtraCharactersInAStringJava {
    static class Solution {
        public int minExtraChar(String s, String[] dictionary) {
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            // static class TrieNode {
            //     TrieNode[] children = new TrieNode[26];
            //     boolean isWord;
            // }
            //
            // TrieNode root = new TrieNode();
            // for (String word : dictionary) {
            //     TrieNode node = root;
            //     for (char c : word.toCharArray()) {
            //         int idx = c - 'a';
            //         if (node.children[idx] == null) {
            //             node.children[idx] = new TrieNode();
            //         }
            //         node = node.children[idx];
            //     }
            //     node.isWord = true;
            // }
            //
            // int n = s.length();
            // int[] dp = new int[n + 1];
            // for (int i = n - 1; i >= 0; i--) {
            //     dp[i] = 1 + dp[i + 1];
            //     TrieNode node = root;
            //     for (int j = i; j < n; j++) {
            //         int idx = s.charAt(j) - 'a';
            //         if (node.children[idx] == null) {
            //             break;
            //         }
            //         node = node.children[idx];
            //         if (node.isWord) {
            //             dp[i] = Math.min(dp[i], dp[j + 1]);
            //         }
            //     }
            // }
            // return dp[0];
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        assert sol.minExtraChar(
            "leetscode",
            new String[] {"leet", "code", "leetcode"}
        ) == 1;
        assert sol.minExtraChar(
            "sayhelloworld",
            new String[] {"hello", "world"}
        ) == 3;
        assert sol.minExtraChar(
            "applepenapple",
            new String[] {"apple", "pen"}
        ) == 0;

        System.out.println("Basic practice checks are in place.");
    }
}
