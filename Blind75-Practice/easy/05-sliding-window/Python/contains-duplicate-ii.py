"""
219. Contains Duplicate II
Difficulty: Easy
Pattern: Sliding Window

Problem:
Given an integer array nums and an integer k, return true if there are two
distinct indices i and j such that nums[i] == nums[j] and |i - j| <= k.
Otherwise return false.

Example 1:
Input: nums = [1,2,3,1], k = 3
Output: true

Example 2:
Input: nums = [1,0,1,1], k = 1
Output: true

Example 3:
Input: nums = [1,2,3,1,2,3], k = 2
Output: false

Constraints:
- 1 <= nums.length <= 10^5
- -10^9 <= nums[i] <= 10^9
- 0 <= k <= 10^5
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
