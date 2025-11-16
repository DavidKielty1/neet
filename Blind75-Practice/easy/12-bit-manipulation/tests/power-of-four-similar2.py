"""
LeetCode 461: Hamming Distance
Difficulty: Easy
Pattern: Bit Manipulation

Problem:
The Hamming distance between two integers is the number of positions at which the
corresponding bits are different.

Given two integers x and y, return the Hamming distance between them.

Example 1:
Input: x = 1, y = 4
Output: 2
Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑
The above arrows point to positions where the corresponding bits are different.

Example 2:
Input: x = 3, y = 1
Output: 1

Constraints:
- 0 <= x, y <= 2^31 - 1

Time Complexity: O(1)
Space Complexity: O(1)
"""


class Solution:
    def hammingDistance(self, x: int, y: int) -> int:
        """
        Approach: XOR and count bits

        Strategy:
        1. XOR x and y to get bits that differ
        2. Count number of 1 bits in result
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

        xor = x ^ y
        count = 0

        while xor:
            count += xor & 1
            xor >>= 1

        return count


# Alternative using Brian Kernighan's algorithm
class SolutionBrianKernighan:
    def hammingDistance(self, x: int, y: int) -> int:
        xor = x ^ y
        count = 0
        while xor:
            xor &= xor - 1
            count += 1
        return count


# Alternative using built-in
class SolutionBuiltin:
    def hammingDistance(self, x: int, y: int) -> int:
        return bin(x ^ y).count("1")


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.hammingDistance(1, 4) == 2
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.hammingDistance(3, 1) == 1
    print("✓ Test case 2 passed")

    print("\nAll test cases passed!")
