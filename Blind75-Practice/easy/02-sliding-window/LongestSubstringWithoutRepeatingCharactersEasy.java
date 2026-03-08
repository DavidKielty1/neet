/**
 * Easy Version: Find First Non-Repeating Character
 * Difficulty: Easy
 * Pattern: Hash Map
 *
 * Given a string s, find the first non-repeating character in it and return its
 * index.
 * If it doesn't exist, return -1.
 *
 * Example 1:
 * Input: s = "leetcode"
 * Output: 0
 * Explanation: 'l' is the first non-repeating character.
 *
 * Example 2:
 * Input: s = "loveleetcode"
 * Output: 2
 * Explanation: 'v' is the first non-repeating character.
 *
 * Example 3:
 * Input: s = "aabb"
 * Output: -1
 * Explanation: No non-repeating character exists.
 *
 * Time: O(n), Space: O(1) - at most 26 characters
 */
public class LongestSubstringWithoutRepeatingCharactersEasy {
    /**
     * Same logic using a 128-slot array: index = char value (ASCII).
     * Counts every ASCII character (letters, digits, spaces, etc.).
     * Time: O(n), Space: O(128) = O(1).
     */
    public static int firstUniqCharAscii(String s) {
        if (s == null || s.isBlank()) {
            return -1;
        }

        int[] charFrequency = new int[128];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch < 128) {
                charFrequency[ch]++;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch < 128 && charFrequency[ch] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String s1 = "leetcode";
        System.out.println("First Unique Char: " + firstUniqCharAscii(s1)); // 0

        String s2 = "loveleetcode";
        System.out.println("First Unique Char: " + firstUniqCharAscii(s2)); // 2

        String s3 = "aabb";
        System.out.println("First Unique Char: " + firstUniqCharAscii(s3)); // -1

        // 128 (ASCII) variant: counts every character including spaces/digits
        String s4 = "a b c a B";
        System.out.println("First Unique (ASCII): " + firstUniqCharAscii(s4)); // 2 ('c')
    }
}
