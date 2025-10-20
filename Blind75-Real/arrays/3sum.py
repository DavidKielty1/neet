"""
15. 3Sum - https://leetcode.com/problems/3sum/
Difficulty: Medium
Pattern: Two Pointers

Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

Example 1:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation:
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.

Example 2:
Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.

Example 3:
Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.

Time: O(n²), Space: O(1)
"""

from typing import List


def three_sum(nums: List[int]) -> List[List[int]]:
    """
    Three pointers approach:
    1. Sort the array
    2. Fix first element, use two pointers for remaining two
    3. Skip duplicates to avoid duplicate triplets
    Time: O(n²), Space: O(1)
    """
    # TODO: Implement three pointers solution
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
