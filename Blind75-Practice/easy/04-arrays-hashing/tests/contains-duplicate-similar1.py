"""
Similar Problem 1: Contains Duplicate II
Difficulty: Easy
Pattern: Hash Map with Index Tracking

Problem:
Given an integer array nums and an integer k, return true if there are two distinct
indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

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

from typing import List


class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        """
        Approach: Hash map to track last seen index

        Strategy:
        1. Store each number with its most recent index
        2. When we see a number again, check if distance <= k
        3. Update the index for this number
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

        seen = {}  # num -> last index

        for i, num in enumerate(nums):
            if num in seen and i - seen[num] <= k:
                return True
            seen[num] = i

        return False


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.containsNearbyDuplicate([1, 2, 3, 1], 3) == True
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.containsNearbyDuplicate([1, 0, 1, 1], 1) == True
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.containsNearbyDuplicate([1, 2, 3, 1, 2, 3], 2) == False
    print("✓ Test case 3 passed")

    # Test case 4
    assert solution.containsNearbyDuplicate([1], 1) == False
    print("✓ Test case 4 passed")

    print("\nAll test cases passed!")
