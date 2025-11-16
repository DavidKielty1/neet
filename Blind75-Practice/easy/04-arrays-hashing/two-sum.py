"""
LeetCode 1: Two Sum
Difficulty: Easy
Pattern: Arrays & Hashing

Problem:
Given an array of integers nums and an integer target, return indices of the
two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may
not use the same element twice.

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
- Only one valid answer exists

Time Complexity: O(n)
Space Complexity: O(n)
"""

from typing import List


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        """
        Approach: Use hash map to store value -> index mapping

        Strategy:
        1. Create empty hash map
        2. For each number, calculate complement (target - num)
        3. If complement exists in map, return [complement_index, current_index]
        4. Otherwise, store current number and index in map
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

        seen = {}  # value -> index

        for i, num in enumerate(nums):
            complement = target - num

            if complement in seen:
                return [seen[complement], i]

            seen[num] = i

        return []  # Should never reach here per problem constraints


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    result = solution.twoSum([2, 7, 11, 15], 9)
    assert sorted(result) == [0, 1]
    print("✓ Test case 1 passed")

    # Test case 2
    result = solution.twoSum([3, 2, 4], 6)
    assert sorted(result) == [1, 2]
    print("✓ Test case 2 passed")

    # Test case 3
    result = solution.twoSum([3, 3], 6)
    assert sorted(result) == [0, 1]
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
