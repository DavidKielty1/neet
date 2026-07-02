/*
242. Valid Anagram
Difficulty: Easy
Pattern: Arrays & Hashing

Problem:
Given two strings s and t, return true if t is an anagram of s: the same multiset of
characters with the same frequencies (same letters, same counts). Typically both strings
contain only lowercase English letters.

Notes:
- Different order is fine; only per-letter counts must match.
- If lengths differ, the answer is false.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
Explanation: Both strings use three a’s, one g, one m, one n, one r.

Example 2:
Input: s = "rat", t = "car"
Output: false
Explanation: Letter counts differ (e.g. 't' vs 'c').

Example 3:
Input: s = "listen", t = "silent"
Output: true
Explanation: Same letters, rearranged.

Time: O(n), Space: O(1) — 26 letters
*/

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {


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
    }

    public static void main(String[] args) {
        ValidAnagram sol = new ValidAnagram();
        assert sol.isAnagram("anagram", "nagaram");
        assert !sol.isAnagram("rat", "car");
        assert sol.isAnagram("listen", "silent");
        System.out.println("All test cases passed!");
    }
}
