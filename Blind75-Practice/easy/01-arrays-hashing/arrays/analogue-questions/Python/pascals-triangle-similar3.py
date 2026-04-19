"""
LeetCode 2022: Convert 1D Array Into 2D Array
Difficulty: Easy
Pattern: Arrays & Hashing

Problem:
You are given a 0-indexed 1-dimensional (1D) integer array original, and two integers,
m and n. You are tasked with creating a 2-dimensional (2D) array with m rows and n
columns using all the elements from original.

The elements from indices 0 to n - 1 (inclusive) of original should form the first row
of the constructed 2D array, the elements from indices n to 2 * n - 1 (inclusive) should
form the second row of the constructed 2D array, and so on.

Return an m x n 2D array constructed according to the above procedure, or an empty 2D
array if it is impossible.

Example 1:
Input: original = [1,2,3,4], m = 2, n = 2
Output: [[1,2],[3,4]]

Example 2:
Input: original = [1,2,3], m = 1, n = 3
Output: [[1,2,3]]

Example 3:
Input: original = [1,2], m = 1, n = 1
Output: []

Constraints:
- 1 <= original.length <= 5 * 10^4
- 1 <= original[i] <= 10^5
- 1 <= m, n <= 4 * 10^4

Time Complexity: O(m * n)
Space Complexity: O(m * n)
"""

from typing import List


class Solution:
    def construct2DArray(self, original: List[int], m: int, n: int) -> List[List[int]]:
        """
        Approach: Check size and partition array

        Strategy:
        1. Check if total elements match m * n
        2. Partition original array into m rows of n elements each
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

        if len(original) != m * n:
            return []

        result = []
        for i in range(m):
            row = original[i * n : (i + 1) * n]
            result.append(row)

        return result


# Alternative using list comprehension
class SolutionComprehension:
    def construct2DArray(self, original: List[int], m: int, n: int) -> List[List[int]]:
        if len(original) != m * n:
            return []

        return [original[i * n : (i + 1) * n] for i in range(m)]


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.construct2DArray([1, 2, 3, 4], 2, 2) == [[1, 2], [3, 4]]
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.construct2DArray([1, 2, 3], 1, 3) == [[1, 2, 3]]
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.construct2DArray([1, 2], 1, 1) == []
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
