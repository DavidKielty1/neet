"""
LeetCode 476: Number Complement
Difficulty: Easy
Pattern: Bit Manipulation

Problem:
The complement of an integer is the integer you get when you flip all the 0's to 1's and
all the 1's to 0's in its binary representation.

For example, The integer 5 is "101" in binary and its complement is "010" which is the
integer 2.

Given an integer num, return its complement.

Example 1:
Input: num = 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its
complement is 010. So you need to output 2.

Example 2:
Input: num = 1
Output: 0
Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.

Constraints:
- 1 <= num < 2^31

Time Complexity: O(1)
Space Complexity: O(1)
"""


class Solution:
    def findComplement(self, num: int) -> int:
        """
        Approach: XOR with mask

        Strategy:
        1. Find number of bits in num
        2. Create mask with all 1s of that length
        3. XOR num with mask to flip all bits
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

        bit_length = num.bit_length()
        mask = (1 << bit_length) - 1
        return num ^ mask


# Alternative approach
class SolutionLoop:
    def findComplement(self, num: int) -> int:
        result = 0
        power = 0

        while num > 0:
            if num & 1 == 0:
                result += 1 << power
            num >>= 1
            power += 1

        return result


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.findComplement(5) == 2
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.findComplement(1) == 0
    print("✓ Test case 2 passed")

    print("\nAll test cases passed!")
