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
     * Hash map approach to count character frequencies,
     * then iterate through the string and return the index of the first
     * character whose count is 1.
     * Time: O(n), Space: O(1) - at most 26 characters (assuming lowercase letters).
     */
    public static int firstUniqChar(String s) {
        if (s == null || s.isBlank()) {
            return -1;
        }

        int[] charFrequency = new int[26];
        int length = s.length();

        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            charFrequency[ch - 'a']++;
        }

        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z' && charFrequency[ch - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String s1 = "leetcode";
        System.out.println("First Unique Char: " + firstUniqChar(s1)); // 0

        String s2 = "loveleetcode";
        System.out.println("First Unique Char: " + firstUniqChar(s2)); // 2

        String s3 = "aabb";
        System.out.println("First Unique Char: " + firstUniqChar(s3)); // -1
    }
}
