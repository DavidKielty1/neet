"""
Similar Problem 2: Maximum Product After K Increments
Difficulty: Easy
Pattern: Heap

Problem:
You are given an array of non-negative integers nums and an integer k.
In one operation, you may choose any element from nums and increment it by 1.

Return the maximum product of nums after at most k operations.

Example 1:
Input: nums = [0,4], k = 5
Output: 20
Explanation: Increment first element 5 times: [5,4], product = 20

Example 2:
Input: nums = [6,3,3,2], k = 2
Output: 216
Explanation: Increment 2 to get [6,3,3,4], product = 216

Constraints:
- 1 <= nums.length <= 10^5
- 0 <= nums[i] <= 10^6
- 0 <= k <= 10^5
"""

from typing import List
import heapq


class Solution:
    def maximumProduct(self, nums: List[int], k: int) -> int:
        """
        Approach: Min heap to increment smallest values

        Strategy:
        1. Use min heap to track smallest elements
        2. Always increment the smallest element (greedy)
        3. After k increments, calculate product
        """
        # Create min heap
        heapq.heapify(nums)

        # Perform k increments
        for _ in range(k):
            smallest = heapq.heappop(nums)
            heapq.heappush(nums, smallest + 1)

        # Calculate product
        product = 1
        for num in nums:
            product *= num

        return product


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.maximumProduct([0, 4], 5) == 20
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.maximumProduct([6, 3, 3, 2], 2) == 216
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.maximumProduct([1, 1, 1], 3) == 8
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
