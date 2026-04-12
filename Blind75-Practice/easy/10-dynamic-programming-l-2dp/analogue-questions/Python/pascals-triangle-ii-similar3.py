"""
LeetCode 896: Monotonic Array
Difficulty: Easy
Pattern: Arrays

Problem:
An array is monotonic if it is either monotone increasing or monotone decreasing.

An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums
is monotone decreasing if for all i <= j, nums[i] >= nums[j].

Given an integer array nums, return true if the given array is monotonic, or false otherwise.

Example 1:
Input: nums = [1,2,2,3]
Output: true

Example 2:
Input: nums = [6,5,4,4]
Output: true

Example 3:
Input: nums = [1,3,2]
Output: false

Constraints:
- 1 <= nums.length <= 10^5
- -10^5 <= nums[i] <= 10^5

Time Complexity: O(n)
Space Complexity: O(1)
"""

from typing import List


class Solution:
    def isMonotonic(self, nums: List[int]) -> bool:
        """
        Approach: Check increasing and decreasing

        Strategy:
        1. Track if array is increasing or decreasing
        2. Check all adjacent pairs
        3. Return true if either monotonic increasing or decreasing
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

        increasing = decreasing = True

        for i in range(len(nums) - 1):
            if nums[i] > nums[i + 1]:
                increasing = False
            if nums[i] < nums[i + 1]:
                decreasing = False

        return increasing or decreasing


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.isMonotonic([1, 2, 2, 3]) == True
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.isMonotonic([6, 5, 4, 4]) == True
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.isMonotonic([1, 3, 2]) == False
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
