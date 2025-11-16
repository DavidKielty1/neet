"""
LeetCode 118: Pascal's Triangle
Difficulty: Easy
Pattern: Arrays & Hashing / Dynamic Programming

Problem:
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it.

Example 1:
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

Example 2:
Input: numRows = 1
Output: [[1]]

Constraints:
- 1 <= numRows <= 30

Time Complexity: O(numRows^2)
Space Complexity: O(numRows^2)
"""

from typing import List


class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        """
        Approach: Build row by row

        Strategy:
        1. Initialize result with first row [1]
        2. For each subsequent row:
           - Start and end with 1
           - Middle values = sum of two values above
        3. Use previous row to build current row
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

        result = [[1]]

        for i in range(1, numRows):
            prev_row = result[-1]
            new_row = [1]

            # Calculate middle values
            for j in range(len(prev_row) - 1):
                new_row.append(prev_row[j] + prev_row[j + 1])

            new_row.append(1)
            result.append(new_row)

        return result


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.generate(5) == [
        [1],
        [1, 1],
        [1, 2, 1],
        [1, 3, 3, 1],
        [1, 4, 6, 4, 1],
    ]
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.generate(1) == [[1]]
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.generate(3) == [[1], [1, 1], [1, 2, 1]]
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
