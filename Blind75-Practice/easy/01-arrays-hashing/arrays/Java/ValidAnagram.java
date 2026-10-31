/*
 * 242. Valid Anagram
 * Difficulty: Easy
 * Pattern: Arrays & Hashing
 *
 * Problem:
 * Given two strings s and t, return true if t is an anagram of s, and false
 * otherwise. An anagram is a word or phrase formed by rearranging the letters
 * of another, using all the original letters exactly once.
 *
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 *
 * Example 2:
 * Input: s = "rat", t = "car"
 * Output: false
 *
 * Constraints:
 * - 1 <= s.length, t.length <= 5 * 10^4
 * - s and t consist of lowercase English letters
 */

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
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

        // if (s.length() != t.length()) {
            // return false;
        // }
        // int[] count = new int[26];
        // for (int i = 0; i < s.length(); i++) {
            // count[s.charAt(i) - 'a']++;
            // count[t.charAt(i) - 'a']--;
        // }
        // for (int c : count) {
            // if (c != 0) {
                // return false;
            // }
        // }
        // return true;

        throw new UnsupportedOperationException("Implement isAnagram");

    public static void main(String[] args) {
        ValidAnagram sol = new ValidAnagram();
        assert sol.isAnagram("anagram", "nagaram");
        assert !sol.isAnagram("rat", "car");
        assert sol.isAnagram("listen", "silent");
        System.out.println("All test cases passed!");
    }
}
