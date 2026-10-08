"""
198. House Robber
Difficulty: Easy
Pattern: Dynamic Programming

Problem:
You are a professional robber planning to rob houses along a street. Each house
has a certain amount of money stashed. The only constraint stopping you from
robbing each of them is that adjacent houses have security systems connected
and it will automatically contact the police if two adjacent houses were broken
into on the same night. Given an integer array nums representing the amount of
money of each house, return the maximum amount of money you can rob tonight
without alerting the police.

Example 1:
Input: nums = [1,2,3,1]
Output: 4

Example 2:
Input: nums = [2,7,9,3,1]
Output: 12

Constraints:
- 1 <= nums.length <= 100
- 0 <= nums[i] <= 400
"""

from typing import List


def rob(nums: List[int]) -> int:
    """
    Dynamic programming with space optimization
    Time: O(n), Space: O(1)
    """
    # TODO: Implement DP solution
    pass


# Test cases
if __name__ == "__main__":
    # Test 1
    nums1 = [1, 2, 3, 1]
    print(f"House Robber: {rob(nums1)}")  # 4

    # Test 2
    nums2 = [2, 7, 9, 3, 1]
    print(f"House Robber: {rob(nums2)}")  # 12
