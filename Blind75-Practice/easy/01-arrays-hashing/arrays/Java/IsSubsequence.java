/*
 * 392. Is Subsequence
 * Difficulty: Easy
 * Pattern: Two Pointers
 *
 * Problem:
 * Given two strings s and t, return true if s is a subsequence of t, or false
 * otherwise. A subsequence is formed by deleting zero or more characters from
 * t without changing the relative order of the remaining characters. For
 * example, "ace" is a subsequence of "abcde" while "aec" is not. An empty s is
 * a subsequence of any t.
 *
 * Example 1:
 * Input: s = "abc", t = "ahbgdc"
 * Output: true
 *
 * Example 2:
 * Input: s = "axc", t = "ahbgdc"
 * Output: false
 *
 * Constraints:
 * - 0 <= s.length <= 100
 * - 0 <= t.length <= 10^4
 * - s and t consist only of lowercase English letters
 */

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
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

        // if (s.isEmpty()) {
            // return true;
        // }
        // int si = 0;
        // for (int ti = 0; ti < t.length(); ti++) {
            // if (si < s.length() && t.charAt(ti) == s.charAt(si)) {
                // si++;
            // }
        // }
        // return si == s.length();

        throw new UnsupportedOperationException("Implement isSubsequence");
    }

    public static void main(String[] args) {
        IsSubsequence sol = new IsSubsequence();
        assert sol.isSubsequence("abc", "ahbgdc");
        assert !sol.isSubsequence("axc", "ahbgdc");
        assert sol.isSubsequence("", "ahbgdc");
        assert !sol.isSubsequence("abc", "");
        System.out.println("All test cases passed!");
    }
}
