/*
 * 387. First Unique Character in a String
 * Difficulty: Easy
 * Pattern: Hash Map
 *
 * Problem:
 * Given a string s, find the first non-repeating character in it and return
 * its index. If it does not exist, return -1.
 *
 * Example 1:
 * Input: s = "leetcode"
 * Output: 0
 *
 * Example 2:
 * Input: s = "loveleetcode"
 * Output: 2
 *
 * Example 3:
 * Input: s = "aabb"
 * Output: -1
 *
 * Constraints:
 * - 1 <= s.length <= 10^5
 * - s consists of only lowercase English letters
 */
public class LongestSubstringWithoutRepeatingCharactersEasyAscii {

    public static int firstUniqCharAscii(String s) {
        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        // if (s == null || s.isBlank()) {
            // return -1;
        // }
        // int[] charFrequency = new int[128];
        // for (int i = 0; i < s.length(); i++) {
            // char ch = s.charAt(i);
            // if (ch < 128) {
                // charFrequency[ch]++;
            // }
        // }
        // for (int i = 0; i < s.length(); i++) {
            // char ch = s.charAt(i);
            // if (ch < 128 && charFrequency[ch] == 1) {
                // return i;
            // }
        // }
        // return -1;
    }

    public static void main(String[] args) {
        String s1 = "leetcode";
        System.out.println("First Unique Char: " + firstUniqCharAscii(s1));

        String s2 = "loveleetcode";
        System.out.println("First Unique Char: " + firstUniqCharAscii(s2));

        String s3 = "aabb";
        System.out.println("First Unique Char: " + firstUniqCharAscii(s3));

        String s4 = "a b c a B";
        System.out.println("First Unique (ASCII): " + firstUniqCharAscii(s4));
    }
}
