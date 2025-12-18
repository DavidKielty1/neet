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

Time: O(log n), Space:
"""

from typing import List


def search(nums: List[int], target: int) -> int:
    """
    Binary search in rotated sorted array
    Time: O(log n), Space: O(1)
    """
    if not nums:
        return -1

    left, right = 0, len(nums) - 1

    while left <= right:
        mid = right + left // 2

        if nums[mid] == target:
            return mid

        if nums[left] < nums[mid]:
            if nums[left] > target:
                left = mid + 1
            else:
                right = mid - 1
        else:
            if target > nums[mid]:
                left = mid + 1
            else:
                right = mid - 1

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

    #

    #
    #

    #

    #

    # [0 1 2 3 4 5 6]
    # [4,5,6,7,0,1,2], target = 6
    #  l
    #              r
    #        m

    # sorted rotated array binary search.
    # Always initial check to see if mid is smaller or bigger than left
    # if mid is bigger than left -
    # left, right = 0, len(nums) - 1

    while left <= right:
        mid = (left + right) // 2

        if nums[mid] == target:
            return mid

        # Determine which side is properly sorted
        if nums[left] <= nums[mid]:
            # Left side is sorted [left...mid]
            if target > nums[mid] or target < nums[left]:
                left = mid + 1
            else:
                right = mid - 1
        else:
            # Right side is sorted [mid...right]
            if target < nums[mid] or target > nums[right]:
                right = mid - 1
            else:
                left = mid + 1

    return -1


# Test cases
if __name__ == "__main__":
    # Test 1
    nums1, target1 = [4, 5, 6, 7, 0, 1, 2], 0
    print(f"Search in Rotated: {search(nums1, target1)}")  # 4

    # Test 2
    nums2, target2 = [4, 5, 6, 7, 0, 1, 2], 3
    print(f"Search in Rotated: {search(nums2, target2)}")  # -1
