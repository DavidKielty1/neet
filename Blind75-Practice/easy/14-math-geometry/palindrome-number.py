"""
LeetCode 9: Palindrome Number
Difficulty: Easy
Pattern: Math

Problem:
Given an integer x, return true if x is a palindrome, and false otherwise.

Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-.
Therefore it is not a palindrome.

Example 3:
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

Constraints:
- -2^31 <= x <= 2^31 - 1

Follow up: Could you solve it without converting the integer to a string?

Time Complexity: O(log n)
Space Complexity: O(1)
"""


class Solution:
    def isPalindrome(self, x: int) -> bool:
        """
        Approach: Reverse half of the number

        Strategy:
        1. Negative numbers are not palindromes
        2. Numbers ending in 0 (except 0 itself) are not palindromes
        3. Reverse second half and compare with first half
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

        # Handle special cases
        if x < 0 or (x % 10 == 0 and x != 0):
            return False

        # Reverse second half
        reversed_half = 0
        while x > reversed_half:
            reversed_half = reversed_half * 10 + x % 10
            x //= 10

        # Check if equal (even length) or equal after removing middle digit (odd length)
        return x == reversed_half or x == reversed_half // 10


# Alternative using string
class SolutionString:
    def isPalindrome(self, x: int) -> bool:
        s = str(x)
        return s == s[::-1]


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.isPalindrome(121) == True
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.isPalindrome(-121) == False
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.isPalindrome(10) == False
    print("✓ Test case 3 passed")

    # Test case 4
    assert solution.isPalindrome(0) == True
    print("✓ Test case 4 passed")

    print("\nAll test cases passed!")
