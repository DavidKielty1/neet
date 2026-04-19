"""
LeetCode 867: Transpose Matrix
Difficulty: Easy
Pattern: Math & Geometry

Return the transpose of matrix: result[j][i] = matrix[i][j].

Time Complexity: O(m * n)
Space Complexity: O(m * n) for output
"""

from typing import List


class Solution:
    def transpose(self, matrix: List[List[int]]) -> List[List[int]]:
        if not matrix:
            return []
        m, n = len(matrix), len(matrix[0])
        return [[matrix[i][j] for i in range(m)] for j in range(n)]


if __name__ == "__main__":
    s = Solution()
    assert s.transpose([[1, 2, 3], [4, 5, 6], [7, 8, 9]]) == [[1, 4, 7], [2, 5, 8], [3, 6, 9]]
    assert s.transpose([[1, 2, 3], [4, 5, 6]]) == [[1, 4], [2, 5], [3, 6]]
    print("All test cases passed!")
