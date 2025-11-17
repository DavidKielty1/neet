"""
LeetCode 977: Squares of a Sorted Array
Difficulty: Easy
Pattern: Two Pointers

Problem:
Given an integer array nums sorted in non-decreasing order, return an array of the squares
of each number sorted in non-decreasing order.

Example 1:
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].

Example 2:
Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]

Constraints:
- 1 <= nums.length <= 10^4
- -10^4 <= nums[i] <= 10^4
- nums is sorted in non-decreasing order

Follow up: Squaring each element and sorting the new array is very trivial, could you find
an O(n) solution using a different approach?

Time Complexity: O(n)
Space Complexity: O(n)
"""

from typing import List


class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        """
        Approach: Two pointers from both ends

        Strategy:
        1. Since array is sorted, largest squares are at ends
        2. Use two pointers, compare values
        3. Place larger square at end of result array
        4. Move corresponding pointer inward
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
        result = [0] * n
        left, right = 0, n - 1
        pos = n - 1

        while left <= right:
            left_sq = nums[left] ** 2
            right_sq = nums[right] ** 2

            if left_sq > right_sq:
                result[pos] = left_sq
                left += 1
            else:
                result[pos] = right_sq
                right -= 1

            pos -= 1

        return result


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.sortedSquares([-4, -1, 0, 3, 10]) == [0, 1, 9, 16, 100]
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.sortedSquares([-7, -3, 2, 3, 11]) == [4, 9, 9, 49, 121]
    print("✓ Test case 2 passed")

    print("\nAll test cases passed!")
