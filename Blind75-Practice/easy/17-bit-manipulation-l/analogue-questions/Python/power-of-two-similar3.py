"""
LeetCode 191: Number of 1 Bits (Hamming Weight)
Difficulty: Easy
Pattern: Bit Manipulation

Problem:
Write a function that takes the binary representation of an unsigned integer and returns
the number of '1' bits it has (also known as the Hamming weight).

Example 1:
Input: n = 00000000000000000000000000001011
Output: 3
Explanation: The input binary string has a total of three '1' bits.

Example 2:
Input: n = 00000000000000000000000010000000
Output: 1

Example 3:
Input: n = 11111111111111111111111111111101
Output: 31

Constraints:
- The input must be a binary string of length 32

Follow up: If this function is called many times, how would you optimize it?

Time Complexity: O(1) or O(k) where k is number of set bits
Space Complexity: O(1)
"""


class Solution:
    def hammingWeight(self, n: int) -> int:
        """
        Approach: Count set bits using n & (n-1)

        Strategy:
        1. n & (n-1) removes the rightmost set bit
        2. Count how many times we can do this until n becomes 0
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

        count = 0
        while n:
            n &= n - 1
            count += 1
        return count


# Alternative approaches
class SolutionShift:
    def hammingWeight(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count


class SolutionBuiltin:
    def hammingWeight(self, n: int) -> int:
        return bin(n).count("1")


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.hammingWeight(0b00000000000000000000000000001011) == 3
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.hammingWeight(0b00000000000000000000000010000000) == 1
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.hammingWeight(0b11111111111111111111111111111101) == 31
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
