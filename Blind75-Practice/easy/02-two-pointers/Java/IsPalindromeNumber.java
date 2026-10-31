/*
 * 125. Valid Palindrome
 * Difficulty: Easy
 * Pattern: Two Pointers
 *
 * Problem:
 * A phrase is a palindrome if, after converting all uppercase letters into
 * lowercase letters and removing all non-alphanumeric characters, it reads the
 * same forward and backward. Alphanumeric characters include letters and
 * numbers. Given a string s, return true if it is a palindrome, or false
 * otherwise.
 *
 * Example 1:
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 *
 * Example 2:
 * Input: s = "race a car"
 * Output: false
 *
 * Example 3:
 * Input: s = " "
 * Output: true
 *
 * Constraints:
 * - 1 <= s.length <= 2 * 10^5
 * - s consists only of printable ASCII characters
 */
public class IsPalindromeNumber {
    public static boolean isPalindrome(String s) {
        
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

        // int l = 0;
        // int r = s.length() - 1;
        // while (l < r) {
        //     while (l < r && !Character.isLetterOfDigit(s.charAt(l))) {
        //         l++;
        //     }
        //     while (l < r && !Character.isLetterOfDigit(s.charAt(r))) {
        //         r++;
        //     }
        //     char lc = Character.toLowerCase(s.charAt(l));
        //     char rc = Character.toLowerCase(s.charAt(r));

        //     if (lc != s.rc) {
        //         return false;
        //     }
        //     l++;
        //     r--;
        // }
        // return true;


    public static void main(String[] args) {
        assert isPalindrome("A man, a plan, a canal: Panama");
        System.out.println("✓ Test case 1 passed");

        assert !isPalindrome("race a car");
        System.out.println("✓ Test case 2 passed");

        assert isPalindrome(" ");
        System.out.println("✓ Test case 3 passed");

        System.out.println("\nAll test cases passed!");
    }
}
