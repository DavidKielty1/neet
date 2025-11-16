"""
Similar Problem 1: Find Missing and Duplicate
Difficulty: Easy
Pattern: Bit Manipulation / Math

Problem:
You are given an integer array nums of length n which contains numbers from 1 to n,
but one number appears twice and one number is missing.

Return an array of [duplicate, missing].

Example 1:
Input: nums = [1,2,2,4]
Output: [2,3]

Example 2:
Input: nums = [1,1]
Output: [1,2]

Example 3:
Input: nums = [3,1,3]
Output: [3,2]

Constraints:
- 2 <= n <= 10^4
- 1 <= nums[i] <= n
"""

from typing import List


class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        """
        Approach: XOR to find missing and duplicate

        Strategy:
        1. XOR all numbers and indices
        2. This gives missing ^ duplicate
        3. Use rightmost set bit to separate them
        4. Divide numbers into two groups and XOR
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

        # XOR all numbers 1 to n and all array elements
        xor_all = 0
        for i in range(1, n + 1):
            xor_all ^= i
        for num in nums:
            xor_all ^= num

        # This gives us missing ^ duplicate
        # Find rightmost set bit
        rightmost_bit = xor_all & (-xor_all)

        # Divide into two groups
        num1, num2 = 0, 0
        for i in range(1, n + 1):
            if i & rightmost_bit:
                num1 ^= i
            else:
                num2 ^= i

        for num in nums:
            if num & rightmost_bit:
                num1 ^= num
            else:
                num2 ^= num

        # Check which is duplicate
        for num in nums:
            if num == num1:
                return [num1, num2]
        return [num2, num1]


# Alternative: Using set
class SolutionSet:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        n = len(nums)
        expected_sum = n * (n + 1) // 2
        actual_sum = sum(nums)
        unique_sum = sum(set(nums))

        duplicate = actual_sum - unique_sum
        missing = expected_sum - unique_sum

        return [duplicate, missing]


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.findErrorNums([1, 2, 2, 4]) == [2, 3]
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.findErrorNums([1, 1]) == [1, 2]
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.findErrorNums([3, 1, 3]) == [3, 2]
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
