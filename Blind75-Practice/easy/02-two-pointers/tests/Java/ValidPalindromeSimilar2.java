/*
 * Ported from: 01-two-pointers/tests/Python/valid-palindrome-similar2.py
 * --- Original description ---
Similar Problem 2: Remove Palindromic Subsequences
Difficulty: Easy
Pattern: Two Pointers

Problem:
You are given a string s consisting only of letters 'a' and 'b'.
In a single step you can remove one palindromic subsequence from s.

Return the minimum number of steps to make the given string empty.

Example 1:
Input: s = "ababa"
Output: 1
Explanation: The string is already a palindrome, remove it in 1 step.

Example 2:
Input: s = "aaabbb"
Output: 2
Explanation: Remove all 'a' first (palindrome), then remove all 'b' (palindrome).

Example 3:
Input: s = "baabb"
Output: 2

Constraints:
- 1 <= s.length <= 1000
- s consists only of 'a' and 'b'
 */

public class ValidPalindromeSimilar2 {



    static class Solution {
        public int removePalindromeSub(String s) {
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

            // if not s:
            // return 0
            // left, right = (0, len(s) - 1)
            // while left < right:
            // if s[left] != s[right]:
            // return 2
            // left += 1
            // right -= 1
            // return 1
            // if not s:
            // return 0
            // left, right = (0, len(s) - 1)
            // while left < right:
            // if s[left] != s[right]:
            // return 2
            // left += 1
            // right -= 1
            // return 1

            throw new UnsupportedOperationException("Implement removePalindromeSub");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.removePalindromeSub("ababa") == 1);
        System.out.println("✓ Test case 1 passed");
        assert (sol.removePalindromeSub("aaabbb") == 2);
        System.out.println("✓ Test case 2 passed");
        assert (sol.removePalindromeSub("baabb") == 2);
        System.out.println("✓ Test case 3 passed");
        assert (sol.removePalindromeSub("a") == 1);
        System.out.println("✓ Test case 4 passed");
        System.out.println("\nAll test cases passed!");
    }
}
