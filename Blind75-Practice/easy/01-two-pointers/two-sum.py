"""
1. Two Sum
Difficulty: Easy
Pattern: Two Pointers (with Hash Map)

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

Example:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Time: O(n), Space: O(n)
"""

from typing import List


def two_sum(nums: List[int], target: int) -> list[int]:
    # Create an empty dictionary (hashmap)
    # Can use i, num, enumerate for ease
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
