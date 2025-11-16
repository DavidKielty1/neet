"""
Similar Problem 3: Two Sum Less Than K
Difficulty: Easy
Pattern: Two Pointers / Sorting

Problem:
Given an array nums of integers and integer k, return the maximum sum such that
there exists i < j with nums[i] + nums[j] = sum and sum < k.
If no i, j exist satisfying this equation, return -1.

Example 1:
Input: nums = [34,23,1,24,75,33,54,8], k = 60
Output: 58
Explanation: We can use 34 and 24 to sum 58 which is less than 60.

Example 2:
Input: nums = [10,20,30], k = 15
Output: -1
Explanation: No pair sum is less than 15.

Constraints:
- 1 <= nums.length <= 100
- 1 <= nums[i] <= 1000
- 1 <= k <= 2000
"""

from typing import List


class Solution:
    def twoSumLessThanK(self, nums: List[int], k: int) -> int:
        """
        Approach: Sort then use two pointers

        Strategy:
        1. Sort the array
        2. Use two pointers to find pairs
        3. Track maximum sum that's less than k
        4. Move pointers based on sum comparison with k
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

        if len(nums) < 2:
            return -1

        nums.sort()
        left, right = 0, len(nums) - 1
        max_sum = -1

        while left < right:
            current_sum = nums[left] + nums[right]

            if current_sum < k:
                max_sum = max(max_sum, current_sum)
                left += 1  # Try to get a larger sum
            else:
                right -= 1  # Sum is too large, decrease it

        return max_sum


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.twoSumLessThanK([34, 23, 1, 24, 75, 33, 54, 8], 60) == 58
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.twoSumLessThanK([10, 20, 30], 15) == -1
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.twoSumLessThanK([1, 2, 3, 4], 6) == 5
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
