"""
Easy Version: Find Target in Sorted Array
Difficulty: Easy
Pattern: Binary Search

Given a sorted array of integers and a target value, return the index of the target if it exists, otherwise return -1.

Example 1:
Input: nums = [1, 3, 5, 7, 9], target = 5
Output: 2
Explanation: 5 is found at index 2.

Example 2:
indexes        0  1  2  3  4  5
Input: nums = [1, 3, 5, 7, 9, 0], target = 4

Output: -1
Explanation: 4 is not found in the array.

Time: O(log n), Space: O(1)
"""

from typing import List


def find_target(nums: List[int], target: int) -> int:
    """
    Binary search implementation
    Time: O(log n), Space: O(1)
    """
    left, right = 0, len(nums) - 1

    while right >= left:
        mid = (left + right) // 2

        if nums[mid] == target:
            return mid

        if target > nums[mid]:
            left = mid + 1
        elif target < nums[mid]:
            right = mid - 1

    return -1


# Test cases
if __name__ == "__main__":
    # Test 1
    nums1, target1 = [1, 3, 5, 7, 9], 5
    print(f"Find Target: {find_target(nums1, target1)}")  # 2

    # Test 2
    nums2, target2 = [1, 3, 5, 7, 9], 4
    print(f"Find Target: {find_target(nums2, target2)}")  # -1
