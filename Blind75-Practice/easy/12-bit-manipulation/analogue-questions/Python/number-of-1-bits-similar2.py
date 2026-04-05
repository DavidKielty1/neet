"""
Similar Problem 2: Power of Four
Difficulty: Easy
Pattern: Bit Manipulation

Problem:
Given an integer n, return true if it is a power of four. Otherwise, return false.
An integer n is a power of four, if there exists an integer x such that n == 4^x.

Example 1:
Input: n = 16
Output: true
Explanation: 4^2 = 16

Example 2:
Input: n = 5
Output: false

Example 3:
Input: n = 1
Output: true
Explanation: 4^0 = 1

Constraints:
- -2^31 <= n <= 2^31 - 1
"""


class Solution:
    def isPowerOfFour(self, n: int) -> bool:
        """
        Approach: Bit manipulation

        Strategy:
        1. Must be power of 2: n & (n-1) == 0
        2. The '1' bit must be at an even position (0, 2, 4, 6...)
        3. Use mask 0x55555555 (binary: 01010101...) to check even positions
        4. Also check n > 0
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

        if n <= 0:
            return False

        # Check if power of 2
        if (n & (n - 1)) != 0:
            return False

        # Check if 1 bit is at even position
        # 0x55555555 = 0101 0101 0101 0101 0101 0101 0101 0101
        return (n & 0x55555555) != 0


# Alternative: Count trailing zeros
class SolutionMath:
    def isPowerOfFour(self, n: int) -> bool:
        if n <= 0:
            return False

        # Check if power of 2
        if (n & (n - 1)) != 0:
            return False

        # Count trailing zeros (should be even for power of 4)
        zeros = 0
        while n > 1:
            n >>= 1
            zeros += 1

        return zeros % 2 == 0


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
