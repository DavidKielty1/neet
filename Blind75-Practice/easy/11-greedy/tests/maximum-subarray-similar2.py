"""
Similar Problem 2: Maximum Product Subarray (Easy Version)
Difficulty: Easy
Pattern: Greedy / Dynamic Programming

Problem:
Given an integer array nums, find a contiguous non-empty subarray within the array
that has the largest product, and return the product.

Example 1:
Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6

Example 2:
Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray

Example 3:
Input: nums = [-2,3,-4]
Output: 24
Explanation: [-2,3,-4] has the largest product 24

Constraints:
- 1 <= nums.length <= 2 * 10^4
- -10 <= nums[i] <= 10
"""

from typing import List


class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        """
        Approach: Track both max and min products

        Strategy:
        1. Keep track of max and min product ending at current position
        2. Negative number can turn min into max
        3. Update max_product with best seen so far
        4. Similar to Kadane's but handling negative numbers
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

        max_product = nums[0]
        max_ending = nums[0]
        min_ending = nums[0]

        for i in range(1, len(nums)):
            num = nums[i]

            # If negative, swap max and min
            if num < 0:
                max_ending, min_ending = min_ending, max_ending

            # Update max and min ending here
            max_ending = max(num, max_ending * num)
            min_ending = min(num, min_ending * num)

            # Update global max
            max_product = max(max_product, max_ending)

        return max_product


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.maxProduct([2, 3, -2, 4]) == 6
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.maxProduct([-2, 0, -1]) == 0
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.maxProduct([-2, 3, -4]) == 24
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
