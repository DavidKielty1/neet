/*
 * 953. Verifying an Alien Dictionary
 * Difficulty: Easy
 * Pattern: Graphs / Custom Ordering
 *
 * Problem:
 * In an alien language, the lowercase English letters are arranged in a different order.
 * You are given:
 * - `words`, a sequence of words written in the alien language
 * - `order`, a string giving the alien ordering of the 26 lowercase letters
 *
 * Return `true` if and only if the words are sorted lexicographically by this alien
 * order.
 *
 * Example 1:
 * Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
 * Output: true
 *
 * Example 2:
 * Input: words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
 * Output: false
 *
 * Example 3:
 * Input: words = ["apple","app"], order = "abcdefghijklmnopqrstuvwxyz"
 * Output: false
 *
 * Constraints:
 * - 1 <= words.length <= 100
 * - 1 <= words[i].length <= 20
 * - order.length == 26
 * - words[i] and order consist of lowercase English letters
 *
 * Notes:
 * - Build a rank array so each letter can be compared in O(1).
 * - Compare each adjacent pair of words using a helper method.
 */

public class VerifyingAnAlienDictionaryJava {

    public boolean isAlienSorted(String[] words, String order) {
        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        // public boolean isAlienSorted(String[] words, String order) {
        //     int[] rank = new int[26];
        //     for (int i = 0; i < order.length(); i++) {
        //         rank[order.charAt(i) - 'a'] = i;
        //     }
        //     for (int i = 0; i < words.length - 1; i++) {
        //         if (!lessOrEqual(words[i], words[i + 1], rank)) {
        //             return false;
        //         }
        //     }
        //     return true;
        // }
        //
        // private boolean lessOrEqual(String a, String b, int[] rank) {
        //     int limit = Math.min(a.length(), b.length());
        //     for (int i = 0; i < limit; i++) {
        //         char left = a.charAt(i);
        //         char right = b.charAt(i);
        //         if (left != right) {
        //             return rank[left - 'a'] < rank[right - 'a'];
        //         }
        //     }
        //     return a.length() <= b.length();
        // }
    }

    private boolean lessOrEqual(String a, String b, int[] rank) {
    }

    public static void main(String[] args) {
        VerifyingAnAlienDictionaryJava sol = new VerifyingAnAlienDictionaryJava();
        assert sol.isAlienSorted(
                new String[] {"hello", "leetcode"}, "hlabcdefgijkmnopqrstuvwxyz");
        assert !sol.isAlienSorted(
                new String[] {"word", "world", "row"}, "worldabcefghijkmnpqstuvxyz");
        assert !sol.isAlienSorted(
                new String[] {"apple", "app"}, "abcdefghijklmnopqrstuvwxyz");
        System.out.println("All tests passed.");
    }
}
