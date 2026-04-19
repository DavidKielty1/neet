"""
Similar Problem 3: Missing Ranges
Difficulty: Easy
Pattern: Array

Problem:
You are given an inclusive range [lower, upper] and a sorted unique integer array nums,
where all elements are in the inclusive range.

A number x is considered missing if x is in the range [lower, upper] and x is not in nums.

Return the smallest sorted list of ranges that cover every missing number exactly.

Example 1:
Input: nums = [0,1,3,50,75], lower = 0, upper = 99
Output: [[2,2],[4,49],[51,74],[76,99]]

Example 2:
Input: nums = [-1], lower = -1, upper = -1
Output: []

Example 3:
Input: nums = [], lower = 1, upper = 1
Output: [[1,1]]

Constraints:
- -10^9 <= lower <= upper <= 10^9
- 0 <= nums.length <= 100
- lower <= nums[i] <= upper
- All values are distinct
"""

from typing import List


class Solution:
    def findMissingRanges(
        self, nums: List[int], lower: int, upper: int
    ) -> List[List[int]]:
        """
        Approach: Iterate and find gaps

        Strategy:
        1. Check gap before first number
        2. Check gaps between consecutive numbers
        3. Check gap after last number
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

        result = []

        # Helper to add range
        def add_range(start, end):
            if start <= end:
                result.append([start, end])

        # Check before first number
        if not nums:
            add_range(lower, upper)
            return result

        # Gap before first number
        if nums[0] > lower:
            add_range(lower, nums[0] - 1)

        # Gaps between numbers
        for i in range(len(nums) - 1):
            if nums[i + 1] - nums[i] > 1:
                add_range(nums[i] + 1, nums[i + 1] - 1)

        # Gap after last number
        if nums[-1] < upper:
            add_range(nums[-1] + 1, upper)

        return result


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    result1 = solution.findMissingRanges([0, 1, 3, 50, 75], 0, 99)
    assert result1 == [[2, 2], [4, 49], [51, 74], [76, 99]]
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.findMissingRanges([-1], -1, -1) == []
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.findMissingRanges([], 1, 1) == [[1, 1]]
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
