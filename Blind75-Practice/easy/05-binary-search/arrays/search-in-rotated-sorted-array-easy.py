"""
Easy Version: Find Peak Element
Difficulty: Medium
Pattern: Binary Search

A peak element is an element that is strictly greater than its neighbors.

Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

Example 1:
Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.

Example 2:
Input: nums = [1,2,1,3,5,6,4]
Output: 5
Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.

Time: O(log n), Space: O(1)
"""

from typing import List


def find_peak_element(nums: List[int]) -> int:
    """
    Binary search approach
    Time: O(log n), Space: O(1)
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

    #

    #
    #

    #

    #

    # left, right = 0, len(nums) - 1

    # while left < right:
    #     mid = (right + left) // 2

    #     if nums[mid] < nums[mid + 1]:
    #         left = mid + 1
    #     else:
    #         right = mid - 1

    # return left


# Test cases
if __name__ == "__main__":
    # Test 1
    nums1 = [1, 2, 3, 1]
    print(f"Peak Element: {find_peak_element(nums1)}")  # 2

    # Test 2
    nums2 = [1, 2, 1, 3, 5, 6, 4]
    print(f"Peak Element: {find_peak_element(nums2)}")  # 5
