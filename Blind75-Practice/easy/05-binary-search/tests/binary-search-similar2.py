"""
Similar Problem 2: Search Insert Position
Difficulty: Easy
Pattern: Binary Search

Problem:
Given a sorted array of distinct integers and a target value, return the index if the target is found.
If not, return the index where it would be if it were inserted in order.

Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1

Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4

Constraints:
- 1 <= nums.length <= 10^4
- -10^4 <= nums[i] <= 10^4
- nums contains distinct values sorted in ascending order
- -10^4 <= target <= 10^4
"""

from typing import List


class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        """
        Approach: Binary search for insertion position

        Strategy:
        1. Use binary search to find target or insertion point
        2. If target found, return index
        3. If not found, left pointer will be at insertion position
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

        left, right = 0, len(nums) - 1

        while left <= right:
            mid = left + (right - left) // 2

            if nums[mid] == target:
                return mid
            elif nums[mid] < target:
                left = mid + 1
            else:
                right = mid - 1

        # Left is the insertion position
        return left


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.searchInsert([1, 3, 5, 6], 5) == 2
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.searchInsert([1, 3, 5, 6], 2) == 1
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.searchInsert([1, 3, 5, 6], 7) == 4
    print("✓ Test case 3 passed")

    # Test case 4
    assert solution.searchInsert([1, 3, 5, 6], 0) == 0
    print("✓ Test case 4 passed")

    print("\nAll test cases passed!")
