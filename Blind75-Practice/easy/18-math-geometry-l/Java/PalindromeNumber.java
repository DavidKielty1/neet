/*
 * 9. Palindrome Number
 * Difficulty: Easy
 * Pattern: Math
 *
 * Problem:
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 * An integer is a palindrome when it reads the same forwards and backwards.
 * Negative numbers are not palindromes.
 *
 * Example 1:
 * Input: x = 121
 * Output: true
 *
 * Example 2:
 * Input: x = -121
 * Output: false
 *
 * Example 3:
 * Input: x = 10
 * Output: false
 *
 * Constraints:
 * - -2^31 <= x <= 2^31 - 1
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
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

        // Reverse half of digits.

        // if (x < 0 || (x % 10 == 0 && x != 0)) {
        //     return false;
        // }
        // int reversedHalf = 0;
        // while (x > reversedHalf) {
        //     reversedHalf = reversedHalf * 10 + (x % 10);
        //     x /= 10;
        // }
        // return x == reversedHalf || x == reversedHalf / 10;
        throw new UnsupportedOperationException("Implement isPalindrome");
    }
    public static void main(String[] args) {
        PalindromeNumber s = new PalindromeNumber();
        assert s.isPalindrome(121);
        assert !s.isPalindrome(10);
        System.out.println("All test cases passed!");
    }

}
