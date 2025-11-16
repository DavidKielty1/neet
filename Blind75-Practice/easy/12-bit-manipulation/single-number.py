"""
LeetCode 136: Single Number
Difficulty: Easy
Pattern: Bit Manipulation

Problem:
Given a non-empty array of integers nums, every element appears twice except for one.
Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:
Input: nums = [2,2,1]
Output: 1

Example 2:
Input: nums = [4,1,2,1,2]
Output: 4

Example 3:
Input: nums = [1]
Output: 1

Constraints:
- 1 <= nums.length <= 3 * 10^4
- -3 * 10^4 <= nums[i] <= 3 * 10^4
- Each element in the array appears twice except for one element which appears only once.

Time Complexity: O(n)
Space Complexity: O(1)
"""

from typing import List


class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        """
        Approach: XOR all numbers

        Strategy:
        1. XOR has special properties:
           - a ^ a = 0 (same numbers cancel out)
           - a ^ 0 = a (XOR with 0 gives original)
           - XOR is commutative and associative
        2. XOR all numbers: pairs cancel out, leaving single number

        Example: [4,1,2,1,2]
        4 ^ 1 ^ 2 ^ 1 ^ 2
        = 4 ^ (1 ^ 1) ^ (2 ^ 2)
        = 4 ^ 0 ^ 0
        = 4
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

        result = 0
        for num in nums:
            result ^= num
        return result


# Alternative using functools.reduce
class SolutionFunctional:
    def singleNumber(self, nums: List[int]) -> int:
        from functools import reduce

        return reduce(lambda x, y: x ^ y, nums)


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.singleNumber([2, 2, 1]) == 1
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.singleNumber([4, 1, 2, 1, 2]) == 4
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.singleNumber([1]) == 1
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
