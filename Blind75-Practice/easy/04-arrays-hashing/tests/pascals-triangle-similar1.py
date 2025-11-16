"""
LeetCode 119: Pascal's Triangle II
Difficulty: Easy
Pattern: Arrays & Hashing / Dynamic Programming

Problem:
Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it.

Example 1:
Input: rowIndex = 3
Output: [1,3,3,1]

Example 2:
Input: rowIndex = 0
Output: [1]

Example 3:
Input: rowIndex = 1
Output: [1,1]

Constraints:
- 0 <= rowIndex <= 33

Follow up: Could you optimize your algorithm to use only O(rowIndex) extra space?

Time Complexity: O(rowIndex^2)
Space Complexity: O(rowIndex)
"""

from typing import List


class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        """
        Approach: Build row iteratively with O(k) space

        Strategy:
        1. Start with [1]
        2. For each row, build it from previous row
        3. Update in-place to save space
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

        row = [1]

        for i in range(rowIndex):
            # Build next row from current row
            new_row = [1]
            for j in range(len(row) - 1):
                new_row.append(row[j] + row[j + 1])
            new_row.append(1)
            row = new_row

        return row


# Alternative in-place approach
class SolutionInPlace:
    def getRow(self, rowIndex: int) -> List[int]:
        row = [1]

        for i in range(rowIndex):
            row.append(1)
            # Update from right to left to avoid overwriting values we need
            for j in range(len(row) - 2, 0, -1):
                row[j] = row[j] + row[j - 1]

        return row


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.getRow(3) == [1, 3, 3, 1]
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.getRow(0) == [1]
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.getRow(1) == [1, 1]
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
