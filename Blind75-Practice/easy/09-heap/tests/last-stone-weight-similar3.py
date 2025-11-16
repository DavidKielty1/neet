"""
Similar Problem 3: Minimum Cost to Connect Sticks
Difficulty: Easy
Pattern: Heap

Problem:
You have some number of sticks with positive integer lengths. These lengths are given as an array sticks.

You can connect any two sticks of lengths x and y into one stick by paying a cost of x + y.
You must connect all the sticks until there is only one stick remaining.

Return the minimum cost of connecting all the given sticks into one stick in this way.

Example 1:
Input: sticks = [2,4,3]
Output: 14
Explanation: Connect 2+3=5 (cost 5), then 5+4=9 (cost 9), total = 14

Example 2:
Input: sticks = [1,8,3,5]
Output: 30
Explanation: Connect 1+3=4 (cost 4), 4+5=9 (cost 9), 9+8=17 (cost 17), total = 30

Constraints:
- 1 <= sticks.length <= 10^4
- 1 <= sticks[i] <= 10^4
"""

from typing import List
import heapq


class Solution:
    def connectSticks(self, sticks: List[int]) -> int:
        """
        Approach: Min heap to always combine smallest sticks

        Strategy:
        1. Use min heap to track stick lengths
        2. Always combine two smallest sticks (greedy)
        3. Add cost and push combined stick back
        4. Repeat until one stick remains
        """
        # Create min heap
        heapq.heapify(sticks)

        total_cost = 0

        while len(sticks) > 1:
            # Take two smallest sticks
            first = heapq.heappop(sticks)
            second = heapq.heappop(sticks)

            # Combine and add cost
            cost = first + second
            total_cost += cost

            # Push combined stick back
            heapq.heappush(sticks, cost)

        return total_cost


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.connectSticks([2, 4, 3]) == 14
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.connectSticks([1, 8, 3, 5]) == 30
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.connectSticks([1]) == 0
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
