"""
Similar Problem 1: Sort Integers by Number of 1 Bits
Difficulty: Easy
Pattern: Bit Manipulation

Problem:
You are given an integer array arr. Sort the integers in the array in ascending order
by the number of 1's in their binary representation and in case of two or more integers
have the same number of 1's you have to sort them in ascending order.

Return the array after sorting it.

Example 1:
Input: arr = [0,1,2,3,4,5,6,7,8]
Output: [0,1,2,4,8,3,5,6,7]
Explanation: [0] has 0 ones, [1,2,4,8] have 1 one, [3,5,6] have 2 ones, [7] has 3 ones

Example 2:
Input: arr = [1024,512,256,128,64,32,16,8,4,2,1]
Output: [1,2,4,8,16,32,64,128,256,512,1024]

Constraints:
- 1 <= arr.length <= 500
- 0 <= arr[i] <= 10^4
"""

from typing import List


class Solution:
    def sortByBits(self, arr: List[int]) -> List[int]:
        """
        Approach: Sort with custom key using bit count

        Strategy:
        1. Count 1 bits for each number
        2. Sort by (bit_count, number)
        3. Use Brian Kernighan's algorithm or bin().count()
        """

        def count_ones(n):
            count = 0
            while n:
                n &= n - 1  # Remove rightmost 1 bit
                count += 1
            return count

        # Sort by (number of 1's, then by value)
        return sorted(arr, key=lambda x: (count_ones(x), x))


# Alternative: Using built-in
class SolutionBuiltin:
    def sortByBits(self, arr: List[int]) -> List[int]:
        return sorted(arr, key=lambda x: (bin(x).count("1"), x))


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.sortByBits([0, 1, 2, 3, 4, 5, 6, 7, 8]) == [
        0,
        1,
        2,
        4,
        8,
        3,
        5,
        6,
        7,
    ]
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.sortByBits([1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1]) == [
        1,
        2,
        4,
        8,
        16,
        32,
        64,
        128,
        256,
        512,
        1024,
    ]
    print("✓ Test case 2 passed")

    print("\nAll test cases passed!")
