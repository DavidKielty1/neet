"""
Similar Problem 3: Missing Number (Using XOR)
Difficulty: Easy
Pattern: Bit Manipulation

Problem:
Given an array nums containing n distinct numbers in the range [0, n],
return the only number in the range that is missing from the array.

Example 1:
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3, numbers in range [0,3] are 0,1,2,3. Missing is 2.

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
- All numbers are unique
"""

from typing import List


class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        """
        Approach: XOR approach (similar to single number)

        Strategy:
        1. XOR all indices 0 to n
        2. XOR all numbers in array
        3. Duplicates cancel out
        4. Only missing number remains
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
        result = n  # Start with n (last index)

        for i in range(n):
            result ^= i ^ nums[i]

        return result


# Alternative: Math approach
class SolutionMath:
    def missingNumber(self, nums: List[int]) -> int:
        n = len(nums)
        expected_sum = n * (n + 1) // 2
        actual_sum = sum(nums)
        return expected_sum - actual_sum


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
