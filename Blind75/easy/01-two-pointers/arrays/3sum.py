"""
15. 3Sum
Difficulty: Medium
Pattern: Two Pointers

Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

Example:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]

Time: O(n²), Space: O(1)
"""

from typing import List


def three_sum(nums: List[int]) -> List[List[int]]:
    pass


# Test cases
if __name__ == "__main__":
    # Test 1
    nums1 = [-1, 0, 1, 2, -1, -4]
    print(f"3Sum: {three_sum(nums1)}")  # [[-1,-1,2],[-1,0,1]]

    # Test 2
    nums2 = [0, 1, 1]
    print(f"3Sum: {three_sum(nums2)}")  # []

    # Test 3
    nums3 = [0, 0, 0]
    print(f"3Sum: {three_sum(nums3)}")  # [[0,0,0]]
