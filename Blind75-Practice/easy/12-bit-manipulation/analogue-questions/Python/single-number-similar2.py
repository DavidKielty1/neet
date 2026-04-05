"""
Similar Problem 2: Single Number III (Easy Version - Two Unique)
Difficulty: Easy
Pattern: Bit Manipulation

Problem:
Given an integer array nums where exactly two elements appear only once and all other elements
appear exactly twice, find the two elements that appear only once.

Example 1:
Input: nums = [1,2,1,3,2,5]
Output: [3,5] or [5,3]

Example 2:
Input: nums = [-1,0]
Output: [-1,0] or [0,-1]

Example 3:
Input: nums = [0,1]
Output: [0,1] or [1,0]

Constraints:
- 2 <= nums.length <= 3 * 10^4
- Each integer appears either once or twice
- Exactly two integers appear once
"""

from typing import List


class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        """
        Approach: XOR and bit manipulation

        Strategy:
        1. XOR all numbers to get xor of two unique numbers
        2. Find rightmost set bit in xor result
        3. Divide numbers into two groups based on this bit
        4. XOR each group separately to find the two numbers
        """
        # XOR all numbers
        xor_all = 0
        for num in nums:
            xor_all ^= num

        # Find rightmost set bit
        rightmost_bit = xor_all & (-xor_all)

        # Divide into two groups and XOR
        num1, num2 = 0, 0
        for num in nums:
            if num & rightmost_bit:
                num1 ^= num
            else:
                num2 ^= num

        return [num1, num2]


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    result1 = sorted(solution.singleNumber([1, 2, 1, 3, 2, 5]))
    assert result1 == [3, 5]
    print("✓ Test case 1 passed")

    # Test case 2
    result2 = sorted(solution.singleNumber([-1, 0]))
    assert result2 == [-1, 0]
    print("✓ Test case 2 passed")

    # Test case 3
    result3 = sorted(solution.singleNumber([0, 1]))
    assert result3 == [0, 1]
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
