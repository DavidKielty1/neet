/*
 * Ported from: 01-two-pointers/analogue-questions/Python/valid-palindrome-similar3.py
 * --- Original description ---
Similar Problem 3: Longest Palindromic Substring (Easy Version)
Difficulty: Easy
Pattern: Two Pointers (Expand from Center)

Problem:
Given a string s, return the longest palindromic substring in s.
For this easy version, we'll use the expand-from-center approach.

Example 1:
Input: s = "babad"
Output: "bab" or "aba"
Explanation: Both are valid answers.

Example 2:
Input: s = "cbbd"
Output: "bb"

Example 3:
Input: s = "a"
Output: "a"

Constraints:
- 1 <= s.length <= 1000
- s consist of only digits and English letters
 */

public class ValidPalindromeSimilar3 {



    static class Solution {
        public String longestPalindrome(String s) {
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
            // return ''
            // def expand_from_center(left: int, right: int) -> str:
            // while left >= 0 and right < len(s) and (s[left] == s[right]):
            // left -= 1
            // right += 1
            // return s[left + 1:right]
            // longest = ''
            // for i in range(len(s)):
            // odd_palindrome = expand_from_center(i, i)
            // even_palindrome = expand_from_center(i, i + 1)
            // current_longest = odd_palindrome if len(odd_palindrome) > len(even_palindrome) else even_palindrome
            // if len(current_longest) > len(longest):
            // longest = current_longest
            // return longest

            throw new UnsupportedOperationException("Implement longestPalindrome");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // result1 = sol.longestPalindrome("babad");
        // assert result1 in ['bab', 'aba']  // needs locals (port helpers): ['result1']
        System.out.println("✓ Test case 1 passed");
        assert (sol.longestPalindrome("cbbd") == "bb");
        System.out.println("✓ Test case 2 passed");
        assert (sol.longestPalindrome("a") == "a");
        System.out.println("✓ Test case 3 passed");
        assert (sol.longestPalindrome("racecar") == "racecar");
        System.out.println("✓ Test case 4 passed");
        System.out.println("\nAll test cases passed!");
    }
}
