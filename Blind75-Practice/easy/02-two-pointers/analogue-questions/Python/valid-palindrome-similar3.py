"""
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
"""


class Solution:
    def longestPalindrome(self, s: str) -> str:
        """
        Approach: Expand from center using two pointers

        Strategy:
        1. For each position, treat it as center
        2. Expand outward while characters match
        3. Track longest palindrome found
        4. Handle both odd and even length palindromes
        """

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        if not s:
            return ""

        def expand_from_center(left: int, right: int) -> str:
            while left >= 0 and right < len(s) and s[left] == s[right]:
                left -= 1
                right += 1
            return s[left + 1 : right]

        longest = ""

        for i in range(len(s)):
            odd_palindrome = expand_from_center(i, i)
            even_palindrome = expand_from_center(i, i + 1)

            current_longest = (
                odd_palindrome
                if len(odd_palindrome) > len(even_palindrome)
                else even_palindrome
            )
            if len(current_longest) > len(longest):
                longest = current_longest

        return longest


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    result1 = solution.longestPalindrome("babad")
    assert result1 in ["bab", "aba"]
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.longestPalindrome("cbbd") == "bb"
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.longestPalindrome("a") == "a"
    print("✓ Test case 3 passed")

    # Test case 4
    assert solution.longestPalindrome("racecar") == "racecar"
    print("✓ Test case 4 passed")

    print("\nAll test cases passed!")
