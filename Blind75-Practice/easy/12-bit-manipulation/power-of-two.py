"""
LeetCode 231: Power of Two
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

Follow up: Could you solve it without loops/recursion?

Time Complexity: O(1)
Space Complexity: O(1)
"""


class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        """
        Approach: Bit manipulation trick

        Strategy:
        1. Power of 2 has exactly one bit set
        2. n & (n-1) removes the rightmost set bit
        3. If n is power of 2, result should be 0
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

        return n > 0 and (n & (n - 1)) == 0


# Alternative approaches
class SolutionLoop:
    def isPowerOfTwo(self, n: int) -> bool:
        if n <= 0:
            return False
        while n % 2 == 0:
            n //= 2
        return n == 1


class SolutionBitCount:
    def isPowerOfTwo(self, n: int) -> bool:
        return n > 0 and bin(n).count("1") == 1


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
