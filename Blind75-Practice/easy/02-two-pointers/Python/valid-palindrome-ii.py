"""
LeetCode 680: Valid Palindrome II
Difficulty: Easy
Pattern: Two Pointers

Given a string s, return True if s can be a palindrome after deleting at most one character.

Approach: Two pointers from both ends; on mismatch, try skipping left or right char once.

Time Complexity: O(n)
Space Complexity: O(1)
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
