/*
 * LeetCode 680: Valid Palindrome II
 * Difficulty: Easy
 * Pattern: Two Pointers
 *
 * Problem:
 * Given a string `s`, return `true` if it can become a palindrome after
 * deleting at most one character.
 *
 * Example 1:
 * Input: s = "aba"
 * Output: true
 * Explanation: The string is already a palindrome, so zero deletions are needed.
 *
 * Example 2:
 * Input: s = "abca"
 * Output: true
 * Explanation: Deleting 'c' makes the string "aba", which is a palindrome.
 *
 * Example 3:
 * Input: s = "abc"
 * Output: false
 * Explanation: No single deletion can make the string a palindrome.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class ValidPalindromeIIJava {

    public static void main(String[] args) {
        ValidPalindromeIIJava sol = new ValidPalindromeIIJava();
        assert sol.validPalindrome("aba");
        assert sol.validPalindrome("abca");
        assert !sol.validPalindrome("abc");
        System.out.println("All test cases passed!");
    }
}
