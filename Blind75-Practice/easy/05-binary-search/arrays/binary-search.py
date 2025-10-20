"""
704. Binary Search - https://leetcode.com/problems/binary-search/
Difficulty: Easy
Pattern: Binary Search

Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4

Example 2:
Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1

Time: O(log n), Space: O(1)
"""

from typing import List


def search(nums: List[int], target: int) -> int:
    """
    Binary search implementation
    Time: O(log n), Space: O(1)
    """
    # TODO: Implement binary search
    pass


# Test cases
if __name__ == "__main__":
    # Test 1
    nums1, target1 = [-1, 0, 3, 5, 9, 12], 9
    print(f"Binary Search: {search(nums1, target1)}")  # 4

    # Test 2
    nums2, target2 = [-1, 0, 3, 5, 9, 12], 2
    print(f"Binary Search: {search(nums2, target2)}")  # -1
