"""
Similar Problem 1: Power of Two
Difficulty: Easy
Pattern: Bit Manipulation

Problem:
Given an integer n, return true if it is a power of two. Otherwise, return false.
An integer n is a power of two, if there exists an integer x such that n == 2^x.

Example 1:
Input: n = 1
Output: true
Explanation: 2^0 = 1

Example 2:
Input: n = 16
Output: true
Explanation: 2^4 = 16

Example 3:
Input: n = 3
Output: false

Constraints:
- -2^31 <= n <= 2^31 - 1
"""


class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        """
        Approach: Bit manipulation

        Strategy:
        1. Power of 2 has exactly one '1' bit
        2. Use n & (n-1) to remove rightmost '1' bit
        3. If result is 0, then only one '1' bit exists
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

        # Remove rightmost 1 bit
        # If power of 2, result should be 0
        return (n & (n - 1)) == 0


# Alternative: Count bits
class SolutionCount:
    def isPowerOfTwo(self, n: int) -> bool:
        if n <= 0:
            return False

        # Count 1 bits
        count = 0
        while n:
            count += n & 1
            n >>= 1

        return count == 1


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.isPowerOfTwo(1) == True
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.isPowerOfTwo(16) == True
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.isPowerOfTwo(3) == False
    print("✓ Test case 3 passed")

    # Test case 4
    assert solution.isPowerOfTwo(0) == False
    print("✓ Test case 4 passed")

    print("\nAll test cases passed!")
