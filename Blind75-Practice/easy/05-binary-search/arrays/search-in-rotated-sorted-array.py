"""
33. Search in Rotated Sorted Array - https://leetcode.com/problems/search-in-rotated-sorted-array/
Difficulty: Medium
Pattern: Binary Search

There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

Example 1:
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4

Example 2:
Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1

Example 3:
Input: nums = [1], target = 0
Output: -1

Time: O(log n), Space: O(1)
"""

from typing import List


def search(nums: List[int], target: int) -> int:
    """
    Binary search in rotated sorted array
    Time: O(log n), Space: O(1)
    """
    # TODO: Implement rotated binary search
    pass


# Test cases
if __name__ == "__main__":
    # Test 1
    nums1, target1 = [4, 5, 6, 7, 0, 1, 2], 0
    print(f"Search in Rotated: {search(nums1, target1)}")  # 4

    # Test 2
    nums2, target2 = [4, 5, 6, 7, 0, 1, 2], 3
    print(f"Search in Rotated: {search(nums2, target2)}")  # -1
