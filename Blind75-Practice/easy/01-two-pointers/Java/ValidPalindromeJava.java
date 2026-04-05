/*
LeetCode 125: Valid Palindrome
Difficulty: Easy
Pattern: Two Pointers

Problem:
A phrase is a palindrome if, after converting all uppercase letters into lowercase
letters and removing all non-alphanumeric characters, it reads the same forward and backward.
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

Time Complexity: O(n)
Space Complexity: O(1) for two-pointer, O(n) for filtered approach
*/
public class ValidPalindromeJava {

    static class Solution {
        public boolean isPalindrome(String s) {
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

            throw new UnsupportedOperationException("Implement isPalindrome");
        }
    }

    static class SolutionAlternative {
        /*
         * Time Complexity: O(n)
         * Space Complexity: O(n) - creates filtered string
         */
        // public boolean isPalindrome(String s) {
        //     StringBuilder filtered = new StringBuilder();
        //     for (int i = 0; i < s.length(); i++) {
        //         char c = s.charAt(i);
        //         if (Character.isLetterOrDigit(c)) {
        //             filtered.append(Character.toLowerCase(c));
        //         }
        //     }
        //     String f = filtered.toString();
        //     return f.contentEquals(filtered.reverse());
        // }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        assert solution.isPalindrome("A man, a plan, a canal: Panama");
        System.out.println("✓ Test case 1 passed");

        assert !solution.isPalindrome("race a car");
        System.out.println("✓ Test case 2 passed");

        assert solution.isPalindrome(" ");
        System.out.println("✓ Test case 3 passed");

        assert solution.isPalindrome("a.");
        System.out.println("✓ Test case 4 passed");

        System.out.println("\nAll test cases passed!");
    }
}
