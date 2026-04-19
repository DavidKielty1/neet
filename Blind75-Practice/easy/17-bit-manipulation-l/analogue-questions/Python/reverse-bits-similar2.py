"""
Similar Problem 2: Complement of Base 10 Integer
Difficulty: Easy
Pattern: Bit Manipulation

Problem:
The complement of an integer is the integer you get when you flip all the 0's to 1's
and all the 1's to 0's in its binary representation.

For example, the integer 5 is "101" in binary and its complement is "010" which is the integer 2.

Given an integer n, return its complement.

Example 1:
Input: n = 5
Output: 2
Explanation: 5 is "101" in binary, complement is "010" which is 2

Example 2:
Input: n = 7
Output: 0
Explanation: 7 is "111" in binary, complement is "000" which is 0

Example 3:
Input: n = 10
Output: 5
Explanation: 10 is "1010" in binary, complement is "0101" which is 5

Constraints:
- 0 <= n < 10^9
"""


class Solution:
    def bitwiseComplement(self, n: int) -> int:
        """
        Approach: XOR with mask of all 1's

        Strategy:
        1. Find number of bits in n
        2. Create mask with all 1's of same length
        3. XOR n with mask to flip all bits
        4. Special case: n = 0 returns 1
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

        if n == 0:
            return 1

        # Find number of bits
        bits = n.bit_length()

        # Create mask: 2^bits - 1 gives all 1's
        mask = (1 << bits) - 1

        # XOR to flip all bits
        return n ^ mask


# Alternative: Bit by bit
class SolutionIterative:
    def bitwiseComplement(self, n: int) -> int:
        if n == 0:
            return 1

        result = 0
        power = 0

        while n > 0:
            # Flip the bit
            if (n & 1) == 0:
                result |= 1 << power
            n >>= 1
            power += 1

        return result


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.bitwiseComplement(5) == 2
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.bitwiseComplement(7) == 0
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.bitwiseComplement(10) == 5
    print("✓ Test case 3 passed")

    # Test case 4
    assert solution.bitwiseComplement(0) == 1
    print("✓ Test case 4 passed")

    print("\nAll test cases passed!")
