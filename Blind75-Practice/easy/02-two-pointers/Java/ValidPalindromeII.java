/*
 * 680. Valid Palindrome II
 * Difficulty: Easy
 * Pattern: Two Pointers
 *
 * Problem:
 * Given a string s, return true if the s can be a palindrome after deleting at
 * most one character from it. You may delete zero characters. Compare
 * characters from both ends; on a mismatch you may skip one character on the
 * left or the right.
 *
 * Example 1:
 * Input: s = "aba"
 * Output: true
 *
 * Example 2:
 * Input: s = "abca"
 * Output: true
 *
 * Example 3:
 * Input: s = "abc"
 * Output: false
 *
 * Constraints:
 * - 1 <= s.length <= 10^5
 * - s consists of lowercase English letters
 */

public class ValidPalindromeII {
    private boolean retry(String s, int l, int r) {
    }

    public static void main(String[] args) {
        ValidPalindromeII sol = new ValidPalindromeII();
        assert sol.validPalindrome("aba");
        assert sol.validPalindrome("abca");
        assert !sol.validPalindrome("abc");
        System.out.println("All test cases passed!");
    }
}
