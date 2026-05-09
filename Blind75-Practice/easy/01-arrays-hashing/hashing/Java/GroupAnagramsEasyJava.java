/*
242. Valid Anagram (easy practice file; pairs with Python group-anagrams-easy.py)
Difficulty: Easy
Pattern: Hash Maps & Arrays

Problem:
Given two strings s and t, return true if t is an anagram of s (same character
multiset and frequencies), and false otherwise.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false

Time: O(n), Space: O(1) for lowercase English letters (fixed alphabet size)
*/

public class GroupAnagramsEasyJava {
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
        GroupAnagramsEasyJava sol = new GroupAnagramsEasyJava();
        assert sol.isAnagram("anagram", "nagaram");
        assert !sol.isAnagram("rat", "car");
        assert sol.isAnagram("listen", "silent");
        System.out.println("All test cases passed!");
    }
}
