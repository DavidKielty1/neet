/**
 * Easy Version: Find First Non-Repeating Character
 * Difficulty: Easy
 * Pattern: Hash Map
 *
 * Given a string s, find the first non-repeating character in it and return its index.
 * If it doesn't exist, return -1.
 *
 * Time: O(n), Space: O(1) for 128 ASCII slots
 */
public class LongestSubstringWithoutRepeatingCharactersEasy {

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

    

        // if (s == null || s.isBlank()) {
        //     return -1;
        // }
        // int[] charFrequency = new int[128];
        // for (int i = 0; i < s.length(); i++) {
        //     char ch = s.charAt(i);
        //     if (ch < 128) {
        //         charFrequency[ch]++;
        //     }
        // }
        // for (int i = 0; i < s.length(); i++) {
        //     char ch = s.charAt(i);
        //     if (ch < 128 && charFrequency[ch] == 1) {
        //         return i;
        //     }
        // }
        // return -1;

        throw new UnsupportedOperationException("Implement firstUniqCharAscii");
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
