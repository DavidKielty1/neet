/*
242. Valid Anagram
Difficulty: Easy
Pattern: Arrays & Hashing

Return true if t is an anagram of s (lowercase English letters).

Time: O(n), Space: O(1) — 26 letters
*/
public class ValidAnagramJava {

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

    

        // if (s.length() != t.length()) {
        //     return false;
        // }
        // int[] count = new int[26];
        // for (int i = 0; i < s.length(); i++) {
        //     count[s.charAt(i) - 'a']++;
        //     count[t.charAt(i) - 'a']--;
        // }
        // for (int c : count) {
        //     if (c != 0) {
        //         return false;
        //     }
        // }
        // return true;

        throw new UnsupportedOperationException("Implement isAnagram");
    }

    public static void main(String[] args) {
        ValidAnagramJava sol = new ValidAnagramJava();
        assert sol.isAnagram("anagram", "nagaram");
        assert !sol.isAnagram("rat", "car");
        assert sol.isAnagram("listen", "silent");
        System.out.println("All test cases passed!");
    }
}
