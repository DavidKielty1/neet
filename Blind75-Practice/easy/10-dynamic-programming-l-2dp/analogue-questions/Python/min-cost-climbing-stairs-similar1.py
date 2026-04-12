"""
Similar Problem 1: House Robber (Simplified)
Difficulty: Easy
Pattern: Dynamic Programming

Problem:
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money.
Adjacent houses have security systems connected, so you cannot rob two adjacent houses.

Given an integer array nums representing the amount of money at each house,
return the maximum amount of money you can rob without alerting the police.

Example 1:
Input: nums = [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and house 3 (money = 3), total = 4

Example 2:
Input: nums = [2,7,9,3,1]
Output: 12
Explanation: Rob house 1, 3, and 5: 2 + 9 + 1 = 12

Constraints:
- 1 <= nums.length <= 100
- 0 <= nums[i] <= 400
"""

from typing import List


class Solution:
    def rob(self, nums: List[int]) -> int:
        """
        Approach: Dynamic programming

        Strategy:
        1. At each house, decide: rob it or skip it
        2. If rob: add current + best from 2 houses ago
        3. If skip: take best from 1 house ago
        4. Choose maximum
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

        if not nums:
            return 0
        if len(nums) == 1:
            return nums[0]

        prev2, prev1 = 0, nums[0]

        for i in range(1, len(nums)):
            # Rob current house + best from 2 houses ago
            rob_current = nums[i] + prev2
            # Skip current house, take best from previous
            skip_current = prev1

            current = max(rob_current, skip_current)
            prev2 = prev1
            prev1 = current

        return prev1


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.rob([1, 2, 3, 1]) == 4
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.rob([2, 7, 9, 3, 1]) == 12
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.rob([5]) == 5
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
