"""
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
"""


class Solution:
    def removePalindromeSub(self, s: str) -> int:
        """
        Approach: Check if string is palindrome

        Strategy:
        1. If empty, return 0
        2. If string is palindrome, remove in 1 step
        3. Otherwise, remove all 'a's then all 'b's in 2 steps
        """
        if not s:
            return 0

        left, right = 0, len(s) - 1

        while left < right:
            if s[left] != s[right]:
                return 2
            left += 1
            right -= 1

        return 1
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
            return 0

        # Check if palindrome using two pointers
        left, right = 0, len(s) - 1
        while left < right:
            if s[left] != s[right]:
                return 2  # Not palindrome, need 2 steps
            left += 1
            right -= 1

        return 1  # Is palindrome, need 1 step


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.removePalindromeSub("ababa") == 1
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.removePalindromeSub("aaabbb") == 2
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.removePalindromeSub("baabb") == 2
    print("✓ Test case 3 passed")

    # Test case 4
    assert solution.removePalindromeSub("a") == 1
    print("✓ Test case 4 passed")

    print("\nAll test cases passed!")
