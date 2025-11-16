"""
LeetCode 852: Peak Index in a Mountain Array
Difficulty: Medium (simplified to Easy)
Pattern: Binary Search

Problem:
An array arr is a mountain if the following properties hold:

- arr.length >= 3
- There exists some i with 0 < i < arr.length - 1 such that:
  - arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
  - arr[i] > arr[i + 1] > ... > arr[arr.length - 1]

Given a mountain array arr, return the index i such that
arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].

You must solve it in O(log(arr.length)) time complexity.

Example 1:
Input: arr = [0,1,0]
Output: 1

Example 2:
Input: arr = [0,2,1,0]
Output: 1

Example 3:
Input: arr = [0,10,5,2]
Output: 1

Constraints:
- 3 <= arr.length <= 10^5
- 0 <= arr[i] <= 10^6
- arr is guaranteed to be a mountain array

Time Complexity: O(log n)
Space Complexity: O(1)
"""

from typing import List


class Solution:
    def peakIndexInMountainArray(self, arr: List[int]) -> int:
        """
        Approach: Binary search

        Strategy:
        1. Use binary search to find peak
        2. If arr[mid] < arr[mid+1], peak is on right
        3. Otherwise, peak is on left (including mid)
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

        left, right = 0, len(arr) - 1

        while left < right:
            mid = left + (right - left) // 2

            if arr[mid] < arr[mid + 1]:
                left = mid + 1
            else:
                right = mid

        return left


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.peakIndexInMountainArray([0, 1, 0]) == 1
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.peakIndexInMountainArray([0, 2, 1, 0]) == 1
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.peakIndexInMountainArray([0, 10, 5, 2]) == 1
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
