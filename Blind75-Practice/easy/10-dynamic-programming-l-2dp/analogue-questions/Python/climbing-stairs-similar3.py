"""
Similar Problem 3: Min Cost to Reach Top (Simplified)
Difficulty: Easy
Pattern: Dynamic Programming

Problem:
You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. Each step has a cost associated with it.

Given an array cost where cost[i] is the cost of step i, find the minimum cost to reach the top.
You can start from step 0 or step 1.

Example 1:
Input: n = 3, cost = [10, 15, 20]
Output: 15
Explanation: Start at step 1, pay 15, climb to top

Example 2:
Input: n = 5, cost = [1, 100, 1, 1, 1, 100]
Output: 3
Explanation: Start at 0, pay 1, step to 2, pay 1, step to 4, pay 1, step to top

Constraints:
- 2 <= n <= 1000
- 0 <= cost[i] <= 999
"""

from typing import List


class Solution:
    def minCostToReachTop(self, n: int, cost: List[int]) -> int:
        """
        Approach: Dynamic programming

        Strategy:
        1. dp[i] = minimum cost to reach step i
        2. Can reach step i from i-1 or i-2
        3. Choose minimum cost path
        4. Return cost to reach beyond last step
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

        if n <= 1:
            return 0

        # Extend cost array to include reaching beyond last step
        cost = cost + [0]

        prev2, prev1 = cost[0], cost[1]

        for i in range(2, len(cost)):
            current = cost[i] + min(prev1, prev2)
            prev2 = prev1
            prev1 = current

        return prev1


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.minCostToReachTop(3, [10, 15, 20]) == 15
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.minCostToReachTop(5, [1, 100, 1, 1, 1, 100]) == 3
    print("✓ Test case 2 passed")

    print("\nAll test cases passed!")
