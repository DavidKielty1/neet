"""
Similar Problem 2: Contains Duplicate III (Easy Version)
Difficulty: Easy
Pattern: Hash Set with Sliding Window

Problem:
Given an integer array nums and two integers k and t, return true if there are
two distinct indices i and j such that abs(nums[i] - nums[j]) <= t and abs(i - j) <= k.

For this easy version, we'll assume t = 0 (exact duplicates).

Example 1:
Input: nums = [1,2,3,1], k = 3
Output: true

Example 2:
Input: nums = [1,5,9,1,5,9], k = 2
Output: false

Constraints:
- 1 <= nums.length <= 2 * 10^4
- -10^9 <= nums[i] <= 10^9
- 0 <= k <= 10^4
"""

from typing import List


class Solution:
    def containsNearbyAlmostDuplicate(self, nums: List[int], k: int) -> bool:
        """
        Approach: Sliding window with hash set

        Strategy:
        1. Maintain a window of size k
        2. Use set to check for duplicates in window
        3. Slide window and update set
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

        if k == 0:
            return False

        window = set()

        for i, num in enumerate(nums):
            # Check if duplicate in current window
            if num in window:
                return True

            # Add current number to window
            window.add(num)

            # Remove element outside window
            if i >= k:
                window.remove(nums[i - k])

        return False


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.containsNearbyAlmostDuplicate([1, 2, 3, 1], 3) == True
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.containsNearbyAlmostDuplicate([1, 5, 9, 1, 5, 9], 2) == False
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.containsNearbyAlmostDuplicate([1, 2, 1], 1) == False
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
