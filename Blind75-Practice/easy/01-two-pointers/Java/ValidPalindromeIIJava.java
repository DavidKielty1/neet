/*
 * 680. Valid Palindrome II
 * Difficulty: Easy
 * Pattern: Two pointers
 *
 * You are given a string s. Return true if s can become a palindrome after
 * deleting at most one character. If s is already a palindrome, that counts
 * as "at most one delete" (zero deletes), so return true.
 *
 * Examples:
 *   Input:  "aba"     Output: true   // already a palindrome
 *   Input:  "abca"    Output: true   // delete 'c' (or delete one 'a') → palindrome
 *   Input:  "abc"     Output: false  // no single delete makes it a palindrome
 *   Input:  "deeee"   Output: true   // delete leading 'd' → "eeee"
 *
 * Edge cases:
 *   Empty string or length 1 → true (trivially a palindrome).
 *
 * Approach:
 *   Walk two pointers from both ends while characters match. On the first
 *   mismatch, you may delete at most one character: try skipping the left
 *   index or the right index, and check whether the remaining substring is a
 *   palindrome (e.g. with a small helper that validates s[l..r]).
 *
 * Time: O(n)   Space: O(1) extra (only pointers / indices; no copy of the string)
 */

public class ValidPalindromeIIJava {

    private boolean secondChance(String s, int left, int right) {
        while (right > left) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (right > left) {
            if (s.charAt(left) != s.charAt(right)) {
                return secondChance(s, left + 1, right) || secondChance(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        return isPalindrome(s);
    }

    public static void main(String[] args) {
        ValidPalindromeIIJava sol = new ValidPalindromeIIJava();
        assert sol.validPalindrome("aba");
        assert sol.validPalindrome("abca");
        assert !sol.validPalindrome("abc");
        System.out.println("All test cases passed!");
    }
}
