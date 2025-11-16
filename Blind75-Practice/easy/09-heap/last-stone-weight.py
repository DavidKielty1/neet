"""
LeetCode 1046: Last Stone Weight
Difficulty: Easy
Pattern: Heap / Priority Queue

Problem:
You are given an array of integers stones where stones[i] is the weight of the ith stone.

We are playing a game with the stones. On each turn, we choose the heaviest two stones
and smash them together. Suppose the heaviest two stones have weights x and y with x <= y.
The result of this smash is:

- If x == y, both stones are destroyed, and
- If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.

At the end of the game, there is at most one stone left.

Return the weight of the last remaining stone. If there are no stones left, return 0.

Example 1:
Input: stones = [2,7,4,1,8,1]
Output: 1
Explanation:
We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of the last stone.

Example 2:
Input: stones = [1]
Output: 1

Constraints:
- 1 <= stones.length <= 30
- 1 <= stones[i] <= 1000

Time Complexity: O(n log n)
Space Complexity: O(n)
"""

import heapq
from typing import List


class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        """
        Approach: Use max heap (negate values for min heap)

        Strategy:
        1. Python only has min heap, so negate all values
        2. While more than 1 stone:
           - Pop two heaviest stones
           - If different weights, push difference back
        3. Return last stone (or 0 if none left)
        """
        # Convert to max heap (negate values)
        heap = [-stone for stone in stones]
        heapq.heapify(heap)

        while len(heap) > 1:
            # Get two heaviest stones (most negative = largest positive)
            first = -heapq.heappop(heap)
            second = -heapq.heappop(heap)

            # Smash stones
            if first != second:
                heapq.heappush(heap, -(first - second))

        # Return last stone or 0
        return -heap[0] if heap else 0


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.lastStoneWeight([2, 7, 4, 1, 8, 1]) == 1
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.lastStoneWeight([1]) == 1
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.lastStoneWeight([2, 2]) == 0
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
