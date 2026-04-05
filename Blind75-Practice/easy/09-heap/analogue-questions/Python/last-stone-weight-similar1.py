"""
Similar Problem 1: Last Stone Weight II (Simplified)
Difficulty: Easy
Pattern: Heap

Problem:
You are given an array of integers stones where stones[i] is the weight of the ith stone.
We are playing a game with the stones. On each turn, we choose any two stones and smash them together.
If the stones have different weights x and y with x <= y, the result is a stone of weight y - x.

Return the smallest possible weight of the left stone. If there are no stones left, return 0.

Example 1:
Input: stones = [2,7,4,1,8,1]
Output: 1
Explanation: Combine stones repeatedly until one remains

Example 2:
Input: stones = [31,26,33,21,40]
Output: 5

Constraints:
- 1 <= stones.length <= 30
- 1 <= stones[i] <= 100
"""

from typing import List
import heapq


class Solution:
    def lastStoneWeightII(self, stones: List[int]) -> int:
        """
        Approach: Max heap to simulate smashing

        Strategy:
        1. Use max heap (negate values)
        2. Repeatedly take two largest stones
        3. If different weights, add back the difference
        4. Return last remaining stone or 0
        """
        # Negate for max heap
        heap = [-stone for stone in stones]
        heapq.heapify(heap)

        while len(heap) > 1:
            # Take two largest
            first = -heapq.heappop(heap)
            second = -heapq.heappop(heap)

            # If different, add difference back
            if first != second:
                heapq.heappush(heap, -(first - second))

        return -heap[0] if heap else 0


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.lastStoneWeightII([2, 7, 4, 1, 8, 1]) == 1
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.lastStoneWeightII([31, 26, 33, 21, 40]) == 5
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.lastStoneWeightII([1, 1]) == 0
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
