"""
LeetCode 219: Contains Duplicate II
Difficulty: Easy
Pattern: Sliding Window

Given an integer array nums and an integer k, return true if there are two distinct indices
i and j such that nums[i] == nums[j] and abs(i - j) <= k.

Approach: Hash map from value to last index; slide by removing stale entries or checking distance.

Time Complexity: O(n)
Space Complexity: O(min(n, k)) — at most k+1 distinct indices matter in the window
"""

from typing import Dict, List


class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        last: Dict[int, int] = {}
        for i, x in enumerate(nums):
            if x in last and i - last[x] <= k:
                return True
            last[x] = i
        return False


if __name__ == "__main__":
    s = Solution()
    assert s.containsNearbyDuplicate([1, 2, 3, 1], 3) is True
    assert s.containsNearbyDuplicate([1, 0, 1, 1], 1) is True
    assert s.containsNearbyDuplicate([1, 2, 3, 1, 2, 3], 2) is False
    print("All test cases passed!")
