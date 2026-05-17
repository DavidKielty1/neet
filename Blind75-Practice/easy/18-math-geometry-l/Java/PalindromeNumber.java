/*
9. Palindrome Number
Difficulty: Easy
Pattern: Math

Return true if x reads same forwards/backwards (no string conv trick allowed in some variants).

Time: O(log10 x), Space: O(1)
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
