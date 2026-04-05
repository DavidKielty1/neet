"""
LeetCode 342: Power of Four
Difficulty: Easy
Pattern: Bit Manipulation

Problem:
Given an integer n, return true if it is a power of four. Otherwise, return false.

An integer n is a power of four, if there exists an integer x such that n == 4^x.

Example 1:
Input: n = 16
Output: true

Example 2:
Input: n = 5
Output: false

Example 3:
Input: n = 1
Output: true

Constraints:
- -2^31 <= n <= 2^31 - 1

Follow up: Could you solve it without loops/recursion?

Time Complexity: O(1)
Space Complexity: O(1)
"""


class Solution:
    def isPowerOfFour(self, n: int) -> bool:
        """
        Approach: Bit manipulation

        Strategy:
        1. Power of 4 must be power of 2
        2. Power of 4 has bit set at even positions (0, 2, 4, ...)
        3. Check n > 0, n is power of 2, and bit is at even position
        4. Use mask 0x55555555 (binary: 01010101...) to check even positions
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

        # Check if power of 2 and bit is at even position
        return n > 0 and (n & (n - 1)) == 0 and (n & 0x55555555) != 0


# Alternative approaches
class SolutionLoop:
    def isPowerOfFour(self, n: int) -> bool:
        if n <= 0:
            return False
        while n % 4 == 0:
            n //= 4
        return n == 1


class SolutionModulo:
    def isPowerOfFour(self, n: int) -> bool:
        # Power of 4 is power of 2 and gives remainder 1 when divided by 3
        return n > 0 and (n & (n - 1)) == 0 and n % 3 == 1


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.isPowerOfFour(16) == True
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.isPowerOfFour(5) == False
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.isPowerOfFour(1) == True
    print("✓ Test case 3 passed")

    # Test case 4
    assert solution.isPowerOfFour(2) == False
    print("✓ Test case 4 passed")

    print("\nAll test cases passed!")
