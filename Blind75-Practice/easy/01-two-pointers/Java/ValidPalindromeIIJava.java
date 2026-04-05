/*
680. Valid Palindrome II
Difficulty: Easy
Pattern: Two Pointers

Return true if s can become a palindrome after deleting at most one character.

Approach: Two pointers; on mismatch, check palindrome on either side of one skip.

Time: O(n), Space: O(1)
*/

public class ValidPalindromeIIJava {

    private boolean isPalindrome(String s, int lo, int hi) {
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

        // while (lo < hi) {
            // if (s.charAt(lo) != s.charAt(hi)) {
                // return false;
            // }
            // lo++;
            // hi--;
        // }
        // return true;

        throw new UnsupportedOperationException("Implement isPalindrome");
    }

    public boolean validPalindrome(String s) {
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

        // int left = 0, right = s.length() - 1;
        // while (left < right) {
            // if (s.charAt(left) != s.charAt(right)) {
                // return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            // }
            // left++;
            // right--;
        // }
        // return true;

        throw new UnsupportedOperationException("Implement validPalindrome");
    }

    public static void main(String[] args) {
        ValidPalindromeIIJava sol = new ValidPalindromeIIJava();
        assert sol.validPalindrome("aba");
        assert sol.validPalindrome("abca");
        assert !sol.validPalindrome("abc");
        System.out.println("All test cases passed!");
    }
}
