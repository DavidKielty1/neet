/*
 * 953. Verifying an Alien Dictionary
 * Difficulty: Easy
 * Pattern: Graphs / Custom Ordering
 *
 * Problem:
 * In an alien language, the lowercase English letters appear in a custom order.
 * You are given:
 * - `words`, a list of words written in that language
 * - `order`, a string that lists the alien alphabet order
 *
 * Return `true` if the words are sorted lexicographically according to that alien
 * alphabet, otherwise return `false`.
 *
 * Example 1:
 * Input: words = ["hello", "leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
 * Output: true
 * Explanation:
 * 'h' comes before 'l' in the alien alphabet, so "hello" correctly comes before
 * "leetcode".
 *
 * Example 2:
 * Input: words = ["word", "world", "row"], order = "worldabcefghijkmnpqstuvxyz"
 * Output: false
 * Explanation:
 * The first mismatch between "word" and "world" makes "world" come before "word"
 * in the alien order, so the list is not sorted.
 *
 * Example 3:
 * Input: words = ["apple", "app"], order = "abcdefghijklmnopqrstuvwxyz"
 * Output: false
 * Explanation:
 * If one word is a prefix of another, the shorter word must come first.
 * "app" should come before "apple".
 *
 * Constraints:
 * - 1 <= words.length <= 100
 * - 1 <= words[i].length <= 20
 * - order.length == 26
 * - words[i] and `order` consist of lowercase English letters
 *
 * Why this works:
 * Build a rank array so every alien letter maps to its position. Then compare each
 * adjacent pair of words character by character, using the rank array for O(1)
 * letter comparisons.
 *
 * Time: O(total characters across comparisons)
 * Space: O(1)
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
