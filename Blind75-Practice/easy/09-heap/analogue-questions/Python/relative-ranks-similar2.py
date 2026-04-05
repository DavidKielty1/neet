"""
LeetCode 2099: Find Subsequence of Length K With the Largest Sum
Difficulty: Easy
Pattern: Heap / Sorting

Problem:
You are given an integer array nums and an integer k. You want to find a subsequence of
nums of length k that has the largest sum.

Return any such subsequence as an integer array of length k.

A subsequence is an array that can be derived from another array by deleting some or no
elements without changing the order of the remaining elements.

Example 1:
Input: nums = [2,1,3,3], k = 2
Output: [3,3]
Explanation:
The subsequence has the largest sum of 3 + 3 = 6.

Example 2:
Input: nums = [-1,-2,3,4], k = 3
Output: [-1,3,4]
Explanation:
The subsequence has the largest sum of -1 + 3 + 4 = 6.

Example 3:
Input: nums = [3,4,3,3], k = 2
Output: [3,4] or [4,3] or [3,3]
Explanation:
The subsequence has the largest sum of 3 + 4 = 7.
Other possible subsequences are [4,3] and [3,3] with sum 7.

Constraints:
- 1 <= nums.length <= 1000
- -10^5 <= nums[i] <= 10^5
- 1 <= k <= nums.length

Time Complexity: O(n log n)
Space Complexity: O(n)
"""

from typing import List


class Solution:
    def maxSubsequence(self, nums: List[int], k: int) -> List[int]:
        """
        Approach: Sort indices by values

        Strategy:
        1. Get indices of k largest elements
        2. Sort these indices to maintain original order
        3. Return elements at these indices
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

        # Get indices sorted by value (descending)
        indices = sorted(range(len(nums)), key=lambda i: nums[i], reverse=True)

        # Take k largest indices and sort them to maintain order
        selected_indices = sorted(indices[:k])

        return [nums[i] for i in selected_indices]


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.maxSubsequence([2, 1, 3, 3], 2) == [3, 3]
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.maxSubsequence([-1, -2, 3, 4], 3) == [-1, 3, 4]
    print("✓ Test case 2 passed")

    print("\nAll test cases passed!")
