"""
Similar Problem 1: Two Sum II - Input Array is Sorted
Difficulty: Easy
Pattern: Two Pointers (can also use hash map)

Problem:
Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
find two numbers such that they add up to a specific target number.

Return the indices of the two numbers (1-indexed).

Example 1:
Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2.

Example 2:
Input: numbers = [2,3,4], target = 6
Output: [1,3]

Example 3:
Input: numbers = [-1,0], target = -1
Output: [1,2]

Constraints:
- 2 <= numbers.length <= 3 * 10^4
- -1000 <= numbers[i] <= 1000
- numbers is sorted in non-decreasing order
- -1000 <= target <= 1000
"""

from typing import List


class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        """
        Approach: Two pointers from both ends

        Strategy:
        1. Use two pointers: left at start, right at end
        2. If sum is too small, move left pointer right
        3. If sum is too large, move right pointer left
        4. Return when sum equals target (1-indexed)
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

        left, right = 0, len(numbers) - 1

        while left < right:
            current_sum = numbers[left] + numbers[right]

            if current_sum == target:
                return [left + 1, right + 1]  # 1-indexed
            elif current_sum < target:
                left += 1
            else:
                right -= 1

        return []  # Should not reach here given constraints


# Alternative: Hash Map approach
class SolutionHashMap:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        seen = {}
        for i, num in enumerate(numbers):
            complement = target - num
            if complement in seen:
                return [seen[complement] + 1, i + 1]  # 1-indexed
            seen[num] = i
        return []


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.twoSum([2, 7, 11, 15], 9) == [1, 2]
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.twoSum([2, 3, 4], 6) == [1, 3]
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.twoSum([-1, 0], -1) == [1, 2]
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
