"""
1863. Sum of All Subset XOR Totals
Difficulty: Easy
Pattern: Backtracking / DFS

Problem:
The XOR total of an array is the bitwise XOR of all its elements, or 0 if the
array is empty. Given an integer array nums, consider every possible subset of
nums (including the empty subset). Return the sum of the XOR totals of all
those subsets. Note that subsets with the same elements should be counted
multiple times if they come from different indices.

Example 1:
Input: nums = [1,3]
Output: 6

Example 2:
Input: nums = [5,1,6]
Output: 28

Example 3:
Input: nums = [3]
Output: 3

Constraints:
- 1 <= nums.length <= 12
- 1 <= nums[i] <= 20
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
