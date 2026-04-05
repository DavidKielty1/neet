"""
LeetCode 268: Missing Number
Difficulty: Easy
Pattern: Math / Bit Manipulation

Problem:
Given an array nums containing n distinct numbers in the range [0, n], return the only
number in the range that is missing from the array.

Example 1:
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2
is the missing number in the range since it does not appear in nums.

Example 2:
Input: nums = [0,1]
Output: 2

Example 3:
Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8

Constraints:
- n == nums.length
- 1 <= n <= 10^4
- 0 <= nums[i] <= n
- All the numbers of nums are unique

Follow up: Could you implement a solution using only O(1) extra space complexity and O(n)
runtime complexity?

Time Complexity: O(n)
Space Complexity: O(1)
"""

from typing import List


class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        """
        Approach: Sum formula

        Strategy:
        1. Calculate expected sum of 0 to n
        2. Calculate actual sum of nums
        3. Difference is missing number
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
        expected_sum = n * (n + 1) // 2
        actual_sum = sum(nums)
        return expected_sum - actual_sum


# Alternative using XOR
class SolutionXOR:
    def missingNumber(self, nums: List[int]) -> int:
        result = len(nums)
        for i, num in enumerate(nums):
            result ^= i ^ num
        return result


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.missingNumber([3, 0, 1]) == 2
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.missingNumber([0, 1]) == 2
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.missingNumber([9, 6, 4, 2, 3, 5, 7, 0, 1]) == 8
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
