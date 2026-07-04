/*
LeetCode 125: Valid Palindrome
Difficulty: Easy
Pattern: Two Pointers

Problem:
Given a string `s`, return `true` if it is a palindrome, or `false` otherwise.

A phrase is a palindrome if, after converting all uppercase letters to
lowercase and removing all non-alphanumeric characters, it reads the same
forward and backward.

Note:
This file is named `IsPalindromeNumber`, but the implementation here is for the
string problem `Valid Palindrome`.

Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: After filtering and lowercasing, "amanaplanacanalpanama" is a palindrome.

Example 2:
Input: s = "race a car"
Output: false
Explanation: After filtering and lowercasing, "raceacar" is not a palindrome.

Example 3:
Input: s = " "
Output: true
Explanation: An empty filtered string is still considered a palindrome.

Time Complexity: O(n)
Space Complexity: O(1)
*/
public class IsPalindromeNumber {
    public static boolean isPalindrome(String s) {

        
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

        // int left = 0;
        // int right = s.length() - 1;
        // while (left < right) {
            // while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                // left++;
            // }
            // while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                // right--;
            // }
            // char cLeft = Character.toLowerCase(s.charAt(left));
            // char cRight = Character.toLowerCase(s.charAt(right));
            // if (cLeft != cRight) {
                // return false;
            // }
            // left++;
            // right--;
        // }
        // return true;

    }

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
