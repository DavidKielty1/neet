"""
LeetCode 268: Missing Number
Difficulty: Easy
Pattern: Bit Manipulation / Math

Problem:
Given an array nums containing n distinct numbers in the range [0, n],
return the only number in the range that is missing from the array.

Example 1:
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
2 is the missing number in the range since it does not appear in nums.

Example 2:
Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2].
2 is the missing number in the range since it does not appear in nums.

Example 3:
Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8

Constraints:
- n == nums.length
- 1 <= n <= 10^4
- 0 <= nums[i] <= n
- All the numbers of nums are unique

Time Complexity: O(n)
Space Complexity: O(1)
"""

from typing import List


class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        """
        Approach: XOR all numbers and indices

        Strategy:
        1. XOR all array values
        2. XOR with all numbers from 0 to n
        3. Pairs cancel out, missing number remains

        Example: [3,0,1]
        0^1^2^3 ^ 3^0^1 = 2
        (all except 2 cancel out)
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

        result = len(nums)  # Start with n

        for i, num in enumerate(nums):
            result ^= i ^ num

        return result


# Alternative: Math approach (sum formula)
class SolutionMath:
    def missingNumber(self, nums: List[int]) -> int:
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

        Sum of 0 to n = n * (n + 1) / 2
        Missing number = expected sum - actual sum
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


# Alternative: Set approach
class SolutionSet:
    def missingNumber(self, nums: List[int]) -> int:
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

        Time: O(n), Space: O(n)
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
        n = len(nums)

        for i in range(n + 1):
            if i not in num_set:
                return i

        return -1  # Should never reach here


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

    # Test case 4
    assert solution.missingNumber([0]) == 1
    print("✓ Test case 4 passed")

    print("\nAll test cases passed!")
