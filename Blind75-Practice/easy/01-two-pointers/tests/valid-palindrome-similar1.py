"""
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
"""


class Solution:
    def validPalindrome(self, s: str) -> bool:
        """
        Approach: Two pointers with one skip allowed

        Strategy:
        1. Use two pointers from opposite ends
        2. When mismatch found, try skipping left or right character
        3. Check if remaining substring is palindrome
        """

        def is_palindrome(left: int, right: int) -> bool:
            while left < right:
                if s[left] != s[right]:
                    return False
                left += 1
                right -= 1
            return True

        left, right = 0, len(s) - 1

        while left < right:
            if s[left] != s[right]:
                # Try skipping either left or right character
                return is_palindrome(left + 1, right) or is_palindrome(left, right - 1)
            left += 1
            right -= 1

        return True


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.validPalindrome("aba") == True
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.validPalindrome("abca") == True
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.validPalindrome("abc") == False
    print("✓ Test case 3 passed")

    # Test case 4
    assert solution.validPalindrome("racecar") == True
    print("✓ Test case 4 passed")

    print("\nAll test cases passed!")
