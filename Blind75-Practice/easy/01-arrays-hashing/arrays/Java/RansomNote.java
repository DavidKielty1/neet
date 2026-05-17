/*
383. Ransom Note
Difficulty: Easy
Pattern: Arrays & Hashing

Problem:
Given two strings ransomNote and magazine, return true if you can construct ransomNote by
using letters from magazine, where each letter in magazine can be used at most as many times
as it appears in magazine (you cannot reuse a letter more than you have).

Notes:
- Only lowercase English letters in typical versions.
- Count letters in magazine, then subtract for each character in ransomNote; any negative count fails.

Example 1:
Input: ransomNote = "a", magazine = "b"
Output: false
Explanation: Magazine has no 'a' to supply the ransom note.

Example 2:
Input: ransomNote = "aa", magazine = "aab"
Output: true
Explanation: Magazine has two 'a's; the note needs two 'a's.

Example 3:
Input: ransomNote = "aa", magazine = "ab"
Output: false
Explanation: Magazine has only one 'a'; cannot spell "aa".

Time: O(m + n), Space: O(1) — 26 letters
*/

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {

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

    

        // int[] mag = new int[26];
        // for (int i = 0; i < magazine.length(); i++) {
        //     mag[magazine.charAt(i) - 'a']++;
        // }
        // for (int i = 0; i < ransomNote.length(); i++) {
        //     int idx = ransomNote.charAt(i) - 'a';
        //     mag[idx]--;
        //     if (mag[idx] < 0) {
        //         return false;
        //     }
        // }
        // return true;
    }

    public static void main(String[] args) {
        RansomNote s = new RansomNote();
        assert !s.canConstruct("a", "b");
        assert !s.canConstruct("aa", "ab");
        assert s.canConstruct("aa", "aab");
        assert s.canConstruct("abc", "aabbcc");
        System.out.println("All test cases passed!");
    }
}
