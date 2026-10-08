"""
724. Find Pivot Index
Difficulty: Easy
Pattern: Arrays & Hashing / Prefix Sum

Problem:
Given an integer array nums, return the leftmost pivot index. The pivot
index is the index where the sum of all numbers strictly to the left equals
the sum of all numbers strictly to the right. The pivot element itself is
excluded from both sums. If the index is at an edge, the empty side has sum
0. If no such index exists, return -1.

Example 1:
Input: nums = [1,7,3,6,5,6]
Output: 3

Example 2:
Input: nums = [1,2,3]
Output: -1

Example 3:
Input: nums = [2,1,-1]
Output: 0

Constraints:
- 1 <= nums.length <= 10^4
- -1000 <= nums[i] <= 1000
"""

from typing import List


class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        """
        Approach: Calculate total sum, then iterate with left sum

        Strategy:
        1. Calculate total sum of array
        2. Iterate through array maintaining left sum
        3. Right sum = total - left - current
        4. If left sum equals right sum, return index
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

        total = sum(nums)
        left_sum = 0

        for i, num in enumerate(nums):
            right_sum = total - left_sum - num
            if left_sum == right_sum:
                return i
            left_sum += num

        return -1


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.pivotIndex([1, 7, 3, 6, 5, 6]) == 3
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.pivotIndex([1, 2, 3]) == -1
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.pivotIndex([2, 1, -1]) == 0
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
