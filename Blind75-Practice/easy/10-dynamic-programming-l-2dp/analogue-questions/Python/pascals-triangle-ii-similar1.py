"""
LeetCode 1: Two Sum (as DP variant)
Difficulty: Easy
Pattern: Dynamic Programming / Hash Map

Problem:
Given an array of integers nums and an integer target, return indices of the two numbers
such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the
same element twice.

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

Constraints:
- 2 <= nums.length <= 10^4
- -10^9 <= nums[i] <= 10^9
- -10^9 <= target <= 10^9
- Only one valid answer exists.

Time Complexity: O(n)
Space Complexity: O(n)
"""

from typing import List


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        """
        Approach: Hash map for complements

        Strategy:
        1. Use hash map to store seen numbers and indices
        2. For each number, check if complement exists
        3. Return indices when found
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

        seen = {}

        for i, num in enumerate(nums):
            complement = target - num
            if complement in seen:
                return [seen[complement], i]
            seen[num] = i

        return []


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.twoSum([2, 7, 11, 15], 9) == [0, 1]
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.twoSum([3, 2, 4], 6) == [1, 2]
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.twoSum([3, 3], 6) == [0, 1]
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
