"""
1. Two Sum - https://leetcode.com/problems/two-sum/
Difficulty: Easy
Pattern: Two Pointers (with Hash Map)

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]

Time: O(n), Space: O(n)
"""

from typing import List


def two_sum(nums: List[int], target: int) -> List[int]:
    """
    Hash map approach: Store complement -> index mapping
    Time: O(n), Space: O(n)
    """
    # TODO: Implement hash map solution
    pass


def two_sum_sorted(nums: List[int], target: int) -> List[int]:
    """
    Two pointers on sorted array (if array is sorted)
    Time: O(n log n) for sorting + O(n) for two pointers, Space: O(1)
    """
    # TODO: Implement two pointers solution for sorted array
    pass


# Test cases
if __name__ == "__main__":
    # Test 1
    nums1 = [2, 7, 11, 15]
    target1 = 9
    print(f"Two Sum: {two_sum(nums1, target1)}")  # [0, 1]

    # Test 2
    nums2 = [3, 2, 4]
    target2 = 6
    print(f"Two Sum: {two_sum(nums2, target2)}")  # [1, 2]

    # Test 3
    nums3 = [3, 3]
    target3 = 6
    print(f"Two Sum: {two_sum(nums3, target3)}")  # [0, 1]
