"""
Similar Problem 3: Binary Number with Alternating Bits
Difficulty: Easy
Pattern: Bit Manipulation

Problem:
Given a positive integer, check whether it has alternating bits: namely,
if two adjacent bits will always have different values.

Example 1:
Input: n = 5
Output: true
Explanation: Binary of 5 is 101

Example 2:
Input: n = 7
Output: false
Explanation: Binary of 7 is 111

Example 3:
Input: n = 11
Output: false
Explanation: Binary of 11 is 1011

Example 4:
Input: n = 10
Output: true
Explanation: Binary of 10 is 1010

Constraints:
- 1 <= n <= 2^31 - 1
"""


class Solution:
    def hasAlternatingBits(self, n: int) -> bool:
        """
        Approach: Bit manipulation

        Strategy:
        1. XOR number with right-shifted version
        2. If alternating, result should have all 1's
        3. Check if result is all 1's using (n & (n+1)) == 0
        """
        # XOR with right-shifted version
        xor_result = n ^ (n >> 1)

        # Check if all bits are 1 (e.g., 111, 1111, etc.)
        # All 1's property: x & (x+1) == 0
        return (xor_result & (xor_result + 1)) == 0


# Alternative: Check each adjacent pair
class SolutionIteration:
    def hasAlternatingBits(self, n: int) -> bool:
        prev_bit = n & 1
        n >>= 1

        while n > 0:
            current_bit = n & 1
            if current_bit == prev_bit:
                return False
            prev_bit = current_bit
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
