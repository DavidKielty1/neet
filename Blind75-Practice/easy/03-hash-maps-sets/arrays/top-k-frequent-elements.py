"""
347. Top K Frequent Elements - https://leetcode.com/problems/top-k-frequent-elements/
Difficulty: Medium
Pattern: Hash Map + Heap

Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

Example 1:
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]

Example 2:
Input: nums = [1], k = 1
Output: [1]

Time: O(n log k), Space: O(n)
"""

from typing import List
from collections import Counter
import heapq


def top_k_frequent(nums: List[int], k: int) -> List[int]:
    """
    Hash map + heap approach
    Time: O(n log k), Space: O(n)
    """
    # TODO: Implement hash map + heap solution
    pass


# Test cases
if __name__ == "__main__":
    # Test 1
    nums1, k1 = [1, 1, 1, 2, 2, 3], 2
    print(f"Top K Frequent: {top_k_frequent(nums1, k1)}")  # [1,2]

    # Test 2
    nums2, k2 = [1], 1
    print(f"Top K Frequent: {top_k_frequent(nums2, k2)}")  # [1]
