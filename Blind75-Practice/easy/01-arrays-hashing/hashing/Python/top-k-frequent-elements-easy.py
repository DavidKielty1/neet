"""
Easy Version: Find the Most Frequent Element
Difficulty: Easy
Pattern: Hash Map

Given an array of integers, find the most frequent element.

Example 1:
Input: nums = [1,1,1,2,2,3]
Output: 1
Explanation: 1 appears 3 times, which is more frequent than 2 (appears 2 times) and 3 (appears 1 time).

Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2
Explanation: 2 appears 4 times, which is more frequent than 1 (appears 3 times).

Time: O(n), Space: O(n)
"""

from typing import List


def most_frequent(nums: List[int]) -> int:
    """
    Hash map approach to count frequencies
    Time: O(n), Space: O(n)
    """
    # TODO: Implement hash map solution

    ncount = {}
    for n in nums:
        ncount[n] = ncount.get(n, 0) + 1

    most_freq_count = 0
    most_freq_value = float("-inf")
    for n, count in ncount.items():
        if count > most_freq_count:
            most_freq_count = count
            most_freq_value = n

    return most_freq_value


# Test cases
if __name__ == "__main__":
    # Test 1
    nums1 = [1, 1, 1, 2, 2, 3]
    print(f"Most Frequent: {most_frequent(nums1)}")  # 1

    # Test 2
    nums2 = [2, 2, 1, 1, 1, 2, 2]
    print(f"Most Frequent: {most_frequent(nums2)}")  # 2
