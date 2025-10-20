"""
Easy Version: Maximum of All Subarrays of Size K
Difficulty: Medium
Pattern: Sliding Window + Deque

Given an array and an integer k, find the maximum for each and every contiguous subarray of size k.

Example 1:
Input: arr = [1, 3, -1, -3, 5, 3, 6, 7], k = 3
Output: [3, 3, 5, 5, 6, 7]
Explanation: Maximum of subarray [1, 3, -1] is 3
Maximum of subarray [3, -1, -3] is 3
Maximum of subarray [-1, -3, 5] is 5
Maximum of subarray [-3, 5, 3] is 5
Maximum of subarray [5, 3, 6] is 6
Maximum of subarray [3, 6, 7] is 7

Time: O(n), Space: O(k)
"""

from typing import List
from collections import deque


def max_of_all_subarrays(arr: List[int], k: int) -> List[int]:
    """
    Sliding window with deque to maintain max elements
    Time: O(n), Space: O(k)
    """
    # TODO: Implement deque solution
    pass


# Test cases
if __name__ == "__main__":
    # Test 1
    arr1, k1 = [1, 3, -1, -3, 5, 3, 6, 7], 3
    print(f"Max of Subarrays: {max_of_all_subarrays(arr1, k1)}")  # [3,3,5,5,6,7]
