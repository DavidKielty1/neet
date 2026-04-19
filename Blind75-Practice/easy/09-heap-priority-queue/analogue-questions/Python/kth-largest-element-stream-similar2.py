"""
Similar Problem 2: Top K Frequent Elements
Difficulty: Easy
Pattern: Heap + Hash Map

Problem:
Given an integer array nums and an integer k, return the k most frequent elements.
You may return the answer in any order.

Example 1:
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]

Example 2:
Input: nums = [1], k = 1
Output: [1]

Constraints:
- 1 <= nums.length <= 10^5
- -10^4 <= nums[i] <= 10^4
- k is in the range [1, the number of unique elements in the array]
"""

from typing import List
import heapq
from collections import Counter


class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        """
        Approach: Count frequencies, use min heap of size k

        Strategy:
        1. Count frequency of each number
        2. Use min heap to track k most frequent
        3. Heap stores (frequency, number) pairs
        """
        # Count frequencies
        count = Counter(nums)

        # Min heap of size k
        heap = []

        for num, freq in count.items():
            heapq.heappush(heap, (freq, num))
            if len(heap) > k:
                heapq.heappop(heap)

        return [num for freq, num in heap]


# Alternative: Using nlargest
class SolutionBuiltin:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count = Counter(nums)
        return heapq.nlargest(k, count.keys(), key=count.get)


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    result1 = sorted(solution.topKFrequent([1, 1, 1, 2, 2, 3], 2))
    assert result1 == [1, 2]
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.topKFrequent([1], 1) == [1]
    print("✓ Test case 2 passed")

    # Test case 3
    result3 = sorted(solution.topKFrequent([4, 1, -1, 2, -1, 2, 3], 2))
    assert result3 == [-1, 2]
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
