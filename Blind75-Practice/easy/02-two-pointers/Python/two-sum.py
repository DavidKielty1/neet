"""
1. Two Sum
Difficulty: Easy
Pattern: Two Pointers (with Hash Map)

Problem:
Given an array of integers nums and an integer target, return the indices of
the two numbers such that they add up to target. You may assume that each
input has exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]

Constraints:
- 2 <= nums.length <= 10^4
- -10^9 <= nums[i] <= 10^9
- -10^9 <= target <= 10^9
- Only one valid answer exists
"""

from typing import Dict, List


def two_sum(nums: List[int], target: int) -> list[int]:
    # Create an empty dictionary (hashmap)
    # Can use i, num, enumerate for ease
    seen: Dict[int, int] = {}
    for i, val in enumerate(nums):
        complement = target - val
        if complement in seen:
            return [seen[complement], i]

        seen[val] = i

    return []

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

    # hashmap: dict[int, int] = {}

    # for i, num in enumerate[int](nums):
    #     complement = target - num

    #     if complement in hashmap:
    #         return [hashmap[complement], i]

    #     hashmap[num] = i

    # return []


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
