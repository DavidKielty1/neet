"""
Similar Problem 2: First Missing Positive
Difficulty: Easy (Simplified)
Pattern: Array / Math

Problem:
Given an unsorted integer array nums, return the smallest missing positive integer.

Example 1:
Input: nums = [1,2,0]
Output: 3
Explanation: Numbers in range [1,2] are in array, so smallest missing is 3

Example 2:
Input: nums = [3,4,-1,1]
Output: 2

Example 3:
Input: nums = [7,8,9,11,12]
Output: 1

Constraints:
- 1 <= nums.length <= 10^5
- -2^31 <= nums[i] <= 2^31 - 1
"""

from typing import List


class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        """
        Approach: Use set for O(n) lookup

        Strategy:
        1. Put all positive numbers in a set
        2. Check from 1 upwards for first missing
        3. Return first positive not in set
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

        num_set = set(nums)

        # Check from 1 upwards
        i = 1
        while True:
            if i not in num_set:
                return i
            i += 1


# Alternative: Using in-place marking
class SolutionInPlace:
    def firstMissingPositive(self, nums: List[int]) -> int:
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

        Mark presence by making values negative at index
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

        n = len(nums)

        # Replace non-positive and out-of-range with n+1
        for i in range(n):
            if nums[i] <= 0 or nums[i] > n:
                nums[i] = n + 1

        # Mark presence by negating value at index
        for i in range(n):
            val = abs(nums[i])
            if val <= n:
                nums[val - 1] = -abs(nums[val - 1])

        # Find first positive value
        for i in range(n):
            if nums[i] > 0:
                return i + 1

        return n + 1


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.firstMissingPositive([1, 2, 0]) == 3
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.firstMissingPositive([3, 4, -1, 1]) == 2
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.firstMissingPositive([7, 8, 9, 11, 12]) == 1
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
