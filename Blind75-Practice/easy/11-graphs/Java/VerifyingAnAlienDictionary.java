/*
 * 953. Verifying an Alien Dictionary
 * Difficulty: Easy
 * Pattern: Graphs / Custom Ordering
 *
 * Problem:
 * In an alien language, they also use English lowercase letters, but possibly
 * in a different order. The order of the alphabet is some permutation of
 * lowercase letters given by the string order. Given a sequence of words
 * written in this language, return true if and only if the given words are
 * sorted lexicographically in this alien language. If two words share a
 * common prefix, the shorter word must come first.
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
 * - All characters in words[i] and order are English lowercase letters
 * - All characters in order are unique
 */

public class VerifyingAnAlienDictionary {
    public boolean isAlienSorted(String[] words, String order) {
        
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

    private boolean lessOrEqual(String a, String b, int[] rank) {
    }

    public static void main(String[] args) {
        VerifyingAnAlienDictionary sol = new VerifyingAnAlienDictionary();
        assert sol.isAlienSorted(
            new String[] {"hello", "leetcode"}, "hlabcdefgijkmnopqrstuvwxyz");
        assert !sol.isAlienSorted(
            new String[] {"word", "world", "row"}, "worldabcefghijkmnpqstuvxyz");
        assert !sol.isAlienSorted(
            new String[] {"apple", "app"}, "abcdefghijklmnopqrstuvwxyz");
        System.out.println("All tests passed.");
    }
}
