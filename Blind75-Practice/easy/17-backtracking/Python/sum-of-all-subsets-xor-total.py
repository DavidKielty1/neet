"""
LeetCode 1863: Sum of All Subsets XOR Total
Difficulty: Easy
Pattern: Backtracking / DFS

Problem:
The XOR total of an array is the bitwise XOR of all its elements, or 0 if empty.
For every subset of nums, compute its XOR total and return the sum of those XOR totals.

Example 1:
Input: nums = [1,3]
Output: 6
Explanation: Subsets are [], [1], [3], [1,3] with XOR totals 0, 1, 3, 2; sum = 6.

Example 2:
Input: nums = [5,1,6]
Output: 28

Constraints:
- 1 <= nums.length <= 12
- 1 <= nums[i] <= 20

Time Complexity: O(2^n)
Space Complexity: O(n) recursion depth
"""


from typing import List


class Solution:
    def subsetXORSum(self, nums: List[int]) -> int:
        """DFS: at each index, branch with and without nums[i] in the current XOR."""

        def dfs(i: int, cur: int) -> int:
            if i == len(nums):
                return cur
            return dfs(i + 1, cur ^ nums[i]) + dfs(i + 1, cur)

        return dfs(0, 0)


if __name__ == "__main__":
    sol = Solution()
    assert sol.subsetXORSum([1, 3]) == 6
    assert sol.subsetXORSum([5, 1, 6]) == 28
    assert sol.subsetXORSum([3]) == 3
    print("All tests passed.")
