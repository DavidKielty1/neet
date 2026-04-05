"""
LeetCode 1636: Sort Array by Increasing Frequency
Difficulty: Easy
Pattern: Heap / Sorting

Problem:
Given an array of integers nums, sort the array in increasing order based on the frequency
of the values. If multiple values have the same frequency, sort them in decreasing order.

Return the sorted array.

Example 1:
Input: nums = [1,1,2,2,2,3]
Output: [3,1,1,2,2,2]
Explanation: '3' has a frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3.

Example 2:
Input: nums = [2,3,1,3,2]
Output: [1,3,3,2,2]
Explanation: '2' and '3' both have a frequency of 2, so they are sorted in decreasing order.

Example 3:
Input: nums = [-1,1,-6,4,5,-6,1,4,1]
Output: [5,-1,4,4,-6,-6,1,1,1]

Constraints:
- 1 <= nums.length <= 100
- -100 <= nums[i] <= 100

Time Complexity: O(n log n)
Space Complexity: O(n)
"""

from typing import List
from collections import Counter


class Solution:
    def frequencySort(self, nums: List[int]) -> List[int]:
        """
        Approach: Sort by frequency then value

        Strategy:
        1. Count frequency of each number
        2. Sort by frequency (ascending) then by value (descending)
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

        count = Counter(nums)
        return sorted(nums, key=lambda x: (count[x], -x))


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.frequencySort([1, 1, 2, 2, 2, 3]) == [3, 1, 1, 2, 2, 2]
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.frequencySort([2, 3, 1, 3, 2]) == [1, 3, 3, 2, 2]
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.frequencySort([-1, 1, -6, 4, 5, -6, 1, 4, 1]) == [
        5,
        -1,
        4,
        4,
        -6,
        -6,
        1,
        1,
        1,
    ]
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
