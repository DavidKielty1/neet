"""
LeetCode 693: Binary Number with Alternating Bits
Difficulty: Easy
Pattern: Bit Manipulation

Problem:
Given a positive integer, check whether it has alternating bits: namely, if two adjacent
bits will always have different values.

Example 1:
Input: n = 5
Output: true
Explanation: The binary representation of 5 is: 101

Example 2:
Input: n = 7
Output: false
Explanation: The binary representation of 7 is: 111.

Example 3:
Input: n = 11
Output: false
Explanation: The binary representation of 11 is: 1011.

Constraints:
- 1 <= n <= 2^31 - 1

Time Complexity: O(log n)
Space Complexity: O(1)
"""


class Solution:
    def hasAlternatingBits(self, n: int) -> bool:
        """
        Approach: XOR with right shift

        Strategy:
        1. XOR n with n >> 1
        2. If alternating, result should be all 1s
        3. Check if result + 1 is power of 2
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

        xor = n ^ (n >> 1)
        return (xor & (xor + 1)) == 0


# Alternative using loop
class SolutionLoop:
    def hasAlternatingBits(self, n: int) -> bool:
        prev = n & 1
        n >>= 1

        while n > 0:
            curr = n & 1
            if curr == prev:
                return False
            prev = curr
            n >>= 1

        return True


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.hasAlternatingBits(5) == True
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.hasAlternatingBits(7) == False
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.hasAlternatingBits(11) == False
    print("✓ Test case 3 passed")

    # Test case 4
    assert solution.hasAlternatingBits(10) == True
    print("✓ Test case 4 passed")

    print("\nAll test cases passed!")
