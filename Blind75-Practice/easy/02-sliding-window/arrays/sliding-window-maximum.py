"""
239. Sliding Window Maximum - https://leetcode.com/problems/sliding-window-maximum/
Difficulty: Hard
Pattern: Sliding Window + Deque

You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.

Return the max sliding window.

Example 1:
Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]

Example 2:
Input: nums = [1], k = 1
Output: [1]

Time: O(n), Space: O(k)
"""

from typing import List
from collections import deque


def max_sliding_window(nums: List[int], k: int) -> List[int]:
    """
    Sliding window with deque to maintain max elements
    Time: O(n), Space: O(k)
    """
    # TODO: Implement deque solution
    pass


# Test cases
if __name__ == "__main__":
    # Test 1
    nums1, k1 = [1, 3, -1, -3, 5, 3, 6, 7], 3
    print(f"Max Sliding Window: {max_sliding_window(nums1, k1)}")  # [3,3,5,5,6,7]

    # Test 2
    nums2, k2 = [1], 1
    print(f"Max Sliding Window: {max_sliding_window(nums2, k2)}")  # [1]
