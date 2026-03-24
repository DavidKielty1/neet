/*
LeetCode 125: Valid Palindrome
Difficulty: Easy
Pattern: Two Pointers

(Note: filename references number problems; this file follows the valid palindrome string problem.)

Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Hint: Skip non-alphanumerics, compare lowercase from both ends.

Example 2:
Input: s = "race a car"
Output: false
Hint: After filtering, "raceacar" is not symmetric — two pointers inward.

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

    

        // int left = 0;
        // int right = s.length() - 1;
        // while (left < right) {
        //     while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
        //         left++;
        //     }
        //     while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
        //         right--;
        //     }
        //     char cLeft = Character.toLowerCase(s.charAt(left));
        //     char cRight = Character.toLowerCase(s.charAt(right));
        //     if (cLeft != cRight) {
        //         return false;
        //     }
        //     left++;
        //     right--;
        // }
        // return true;

        throw new UnsupportedOperationException("Implement isPalindrome");
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
