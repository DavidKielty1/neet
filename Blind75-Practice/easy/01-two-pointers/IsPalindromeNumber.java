/*
LeetCode 125: Valid Palindrome
Difficulty: Easy
Pattern: Two Pointers

Problem:
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
and removing all non-alphanumeric characters, it reads the same forward and backward.
Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

Example 3:
Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.

Time Complexity: O(n)
Space Complexity: O(1)
*/
public class IsPalindromeNumber {

    /*
     * Approach: Two pointers from both ends
     *
     * Strategy:
     * 1. Use two pointers, one at start and one at end
     * 2. Skip non-alphanumeric characters
     * 3. Compare characters (case-insensitive)
     * 4. Move pointers inward
     */

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
    // public static boolean isPalindrome(String s) {
    // int left = 0;
    // int right = s.length() - 1;

    // while (left < right) {
    // // Skip non-alphanumeric from left
    // while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
    // left++;
    // }

    // // Skip non-alphanumeric from right
    // while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
    // right--;
    // }

    // // Compare characters
    // char cLeft = Character.toLowerCase(s.charAt(left));
    // char cRight = Character.toLowerCase(s.charAt(right));

    // if (cLeft != cRight) {
    // return false;
    // }

    // left++;
    // right--;
    // }

    // return true;
    // }

    // Test cases
    public static void main(String[] args) {
        // Test case 1
        assert isPalindrome("A man, a plan, a canal: Panama");
        System.out.println("✓ Test case 1 passed");

        // Test case 2
        assert !isPalindrome("race a car");
        System.out.println("✓ Test case 2 passed");

        // Test case 3
        assert isPalindrome(" ");
        System.out.println("✓ Test case 3 passed");

        System.out.println("\nAll test cases passed!");
    }
}
