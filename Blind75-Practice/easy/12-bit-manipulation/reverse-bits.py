"""
LeetCode 190: Reverse Bits
Difficulty: Easy
Pattern: Bit Manipulation

Problem:
Reverse bits of a given 32 bits unsigned integer.

Example 1:
Input: n = 00000010100101000001111010011100
Output:    964176192 (00111001011110000010100101000000)
Explanation: The input binary string represents the unsigned integer 43261596,
so return 964176192 whose binary representation is reversed.

Example 2:
Input: n = 11111111111111111111111111111101
Output:   3221225471 (10111111111111111111111111111111)
Explanation: The input binary string represents the unsigned integer 4294967293,
so return 3221225471 whose binary representation is reversed.

Constraints:
- The input must be a binary string of length 32

Time Complexity: O(1) - always 32 bits
Space Complexity: O(1)
"""


class Solution:
    def reverseBits(self, n: int) -> int:
        """
        Approach: Build reversed number bit by bit

        Strategy:
        1. Extract rightmost bit of n using n & 1
        2. Add it to result (shifted left)
        3. Right shift n to process next bit
        4. Repeat for all 32 bits
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

        result = 0

        for i in range(32):
            # Get rightmost bit of n
            bit = n & 1

            # Add bit to result at correct position
            result = (result << 1) | bit

            # Move to next bit in n
            n >>= 1

        return result


# Alternative: More explicit approach
class SolutionExplicit:
    def reverseBits(self, n: int) -> int:
        result = 0

        for i in range(32):
            # Extract bit at position i from right
            bit = (n >> i) & 1

            # Place bit at position (31-i) from right
            result |= bit << (31 - i)

        return result


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    n = 0b00000010100101000001111010011100
    expected = 964176192
    assert solution.reverseBits(n) == expected
    print("✓ Test case 1 passed")

    # Test case 2
    n = 0b11111111111111111111111111111101
    expected = 3221225471
    assert solution.reverseBits(n) == expected
    print("✓ Test case 2 passed")

    print("\nAll test cases passed!")
