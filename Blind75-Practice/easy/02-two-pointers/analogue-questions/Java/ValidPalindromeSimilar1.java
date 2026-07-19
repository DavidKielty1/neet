/*
 * Ported from: 01-two-pointers/analogue-questions/Python/valid-palindrome-similar1.py
 * --- Original description ---
Similar Problem 1: Valid Palindrome II
Difficulty: Easy
Pattern: Two Pointers

Problem:
Given a string s, return true if the s can be palindrome after deleting at most one character from it.

Example 1:
Input: s = "aba"
Output: true

Example 2:
Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.

Example 3:
Input: s = "abc"
Output: false

Constraints:
- 1 <= s.length <= 10^5
- s consists of lowercase English letters
 */

import java.util.*;
import java.util.function.*;


public class ValidPalindromeSimilar1 {
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

    // def is_palindrome(left: int, right: int) -> bool:
    // while left < right:
    // if s[left] != s[right]:
    // return False
    // left += 1
    // right -= 1
    // return True
    // left, right = (0, len(s) - 1)
    // while left < right:
    // if s[left] != s[right]:
    // return is_palindrome(left + 1, right) or is_palindrome(left, right - 1)
    // left += 1
    // right -= 1
    // return True

        throw new UnsupportedOperationException("Implement validPalindrome");
    }

    

    public static void main(String[] args) {
        ValidPalindromeSimilar1 sol = new ValidPalindromeSimilar1();
        assert sol.validPalindrome("aba");
        System.out.println("✓ Test case 1 passed");
        assert sol.validPalindrome("abca");
        System.out.println("✓ Test case 2 passed");
        assert !(sol.validPalindrome("abc"));
        System.out.println("✓ Test case 3 passed");
        assert sol.validPalindrome("racecar");
        System.out.println("✓ Test case 4 passed");
        System.out.println("\nAll test cases passed!");
    }
}
