"""
680. Valid Palindrome II
Difficulty: Easy
Pattern: Two Pointers

Problem:
Given a string s, return true if the s can be a palindrome after deleting at
most one character from it. You may delete zero characters. Compare
characters from both ends; on a mismatch you may skip one character on the
left or the right.

Example 1:
Input: s = "aba"
Output: true

Example 2:
Input: s = "abca"
Output: true

Example 3:
Input: s = "abc"
Output: false

Constraints:
- 1 <= s.length <= 10^5
- s consists of lowercase English letters
"""


class Solution:
    def validPalindrome(self, s: str) -> bool:
        def is_palindrome(lo: int, hi: int) -> bool:
            while lo < hi:
                if s[lo] != s[hi]:
                    return False
                lo += 1
                hi -= 1
            return True

        left, right = 0, len(s) - 1
        while left < right:
            if s[left] != s[right]:
                return is_palindrome(left + 1, right) or is_palindrome(left, right - 1)
            left += 1
            right -= 1
        return True


if __name__ == "__main__":
    sol = Solution()
    assert sol.validPalindrome("aba") is True
    assert sol.validPalindrome("abca") is True
    assert sol.validPalindrome("abc") is False
    print("All test cases passed!")
