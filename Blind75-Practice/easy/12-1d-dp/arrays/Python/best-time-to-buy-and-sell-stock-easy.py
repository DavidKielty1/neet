"""
Easy Version: Find Minimum and Maximum in Array
Difficulty: Easy
Pattern: One Pass

Given an array of integers, find the minimum and maximum values.

Example 1:
Input: nums = [3, 2, 1, 4, 5]
Output: [1, 5]
Explanation: Minimum is 1, maximum is 5.

Example 2:
Input: nums = [7, 6, 4, 3, 1]
Output: [1, 7]
Explanation: Minimum is 1, maximum is 7.

Time: O(n), Space: O(1)
"""

from typing import List


def find_min_max(nums: List[int]) -> List[int]:
    """
    One pass approach to find min and max
    Time: O(n), Space: O(1)
    """
    # TODO: Implement one pass solution
    pass


# Test cases
if __name__ == "__main__":
    # Test 1
    nums1 = [3, 2, 1, 4, 5]
    print(f"Min Max: {find_min_max(nums1)}")  # [1, 5]

    # Test 2
    nums2 = [7, 6, 4, 3, 1]
    print(f"Min Max: {find_min_max(nums2)}")  # [1, 7]
