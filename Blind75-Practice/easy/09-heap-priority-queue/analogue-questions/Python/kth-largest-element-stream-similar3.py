"""
Similar Problem 3: Find Kth Smallest Element in Array
Difficulty: Easy
Pattern: Heap

Problem:
Given an integer array nums and an integer k, return the kth smallest element in the array.
Note that it is the kth smallest element in the sorted order, not the kth distinct element.

Example 1:
Input: nums = [3,2,1,5,6,4], k = 2
Output: 2

Example 2:
Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 3

Constraints:
- 1 <= k <= nums.length <= 10^5
- -10^4 <= nums[i] <= 10^4
"""

from typing import List
import heapq


class Solution:
    def findKthSmallest(self, nums: List[int], k: int) -> int:
        """
        Approach: Max heap of size k

        Strategy:
        1. Maintain heap of k smallest elements
        2. Use max heap (negate values)
        3. Heap root is kth smallest
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

        heap = []

        for num in nums:
            heapq.heappush(heap, -num)  # Negate for max heap
            if len(heap) > k:
                heapq.heappop(heap)

        return -heap[0]  # Negate back


# Alternative: Using nsmallest
class SolutionBuiltin:
    def findKthSmallest(self, nums: List[int], k: int) -> int:
        return heapq.nsmallest(k, nums)[-1]


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.findKthSmallest([3, 2, 1, 5, 6, 4], 2) == 2
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.findKthSmallest([3, 2, 3, 1, 2, 4, 5, 5, 6], 4) == 3
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.findKthSmallest([1], 1) == 1
    print("✓ Test case 3 passed")

    # Test case 4
    assert solution.findKthSmallest([7, 10, 4, 3, 20, 15], 3) == 7
    print("✓ Test case 4 passed")

    print("\nAll test cases passed!")
