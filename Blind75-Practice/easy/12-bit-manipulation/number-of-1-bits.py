"""
LeetCode 191: Number of 1 Bits (Hamming Weight)
Difficulty: Easy
Pattern: Bit Manipulation

Problem:
Write a function that takes the binary representation of an unsigned integer and
returns the number of '1' bits it has (also known as the Hamming weight).

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

Time Complexity: O(1) or O(k) where k is number of 1 bits
Space Complexity: O(1)
"""


class Solution:
    def hammingWeight(self, n: int) -> int:
        """
        Approach: Check each bit using AND operation

        Strategy:
        1. AND with 1 checks if rightmost bit is 1
        2. Right shift to check next bit
        3. Repeat for all 32 bits
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
            count += n & 1  # Check rightmost bit
            n >>= 1  # Right shift
        return count


# Alternative: Brian Kernighan's Algorithm
class SolutionOptimized:
    def hammingWeight(self, n: int) -> int:
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

        Trick: n & (n-1) removes rightmost 1 bit

        Example:
        n     = 1010 (10)
        n-1   = 1001 (9)
        n&(n-1)=1000 (8)  <- removed rightmost 1

        Only iterates for number of 1 bits!
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
            n &= n - 1  # Remove rightmost 1 bit
            count += 1
        return count


# Alternative: Using built-in
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
