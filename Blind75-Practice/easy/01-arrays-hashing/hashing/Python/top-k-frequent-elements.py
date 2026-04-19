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


def top_k_frequent_no_heap_solution(nums: List[int], k: int) -> List[int]:
    """
    Hash map + bucket sort
    Time: O(n log k), Space: O(n)
    """
    # TODO: Implement hash map + heap solutionW
    # [1,1,1,2,2,3], k = 2

    # {1: 3, 2: 2, 3: 1}
    count = Counter(nums)
    frequency = [[] for i in range(len(nums) + 1)]

    # [[], [3], [2], [1], [], [], []]
    # Index represents frequency count, value is list of numbers with that frequency
    for num, freq in count.items():
        frequency[freq].append(num)

    result = []
    # Iterate from highest frequency to lowest (backwards)
    # Empty arrays are automatically skipped since for n in [] doesn't execute
    for i in range(len(frequency) - 1, 0, -1):
        for n in frequency[i]:
            result.append(n)
            if len(result) == k:
                return result

    return result


def top_k_frequent_heap_solution(nums: List[int], k: int) -> List[int]:
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
    print(f"Top K Frequent: {top_k_frequent_no_heap_solution(nums1, k1)}")  # [1,2]

    # Test 2
    nums2, k2 = [1], 1
    print(f"Top K Frequent: {top_k_frequent_no_heap_solution(nums2, k2)}")  # [1]
