"""
LeetCode 746: Min Cost Climbing Stairs
Difficulty: Easy
Pattern: Dynamic Programming

Problem:
You are given an integer array cost where cost[i] is the cost of ith step on a staircase.
Once you pay the cost, you can either climb one or two steps.

You can either start from the step with index 0, or the step with index 1.

Return the minimum cost to reach the top of the floor.

Example 1:
Input: cost = [10,15,20]
Output: 15
Explanation: You will start at index 1.
- Pay 15 and climb two steps to reach the top.
The total cost is 15.

Example 2:
Input: cost = [1,100,1,1,1,100,1,1,1,1]
Output: 6
Explanation: You will start at index 0.
- Pay 1 and climb two steps to reach index 2.
- Pay 1 and climb two steps to reach index 4.
- Pay 1 and climb two steps to reach index 6.
- Pay 1 and climb one step to reach index 7.
- Pay 1 and climb two steps to reach index 9.
- Pay 1 and climb one step to reach the top.
The total cost is 6.

Constraints:
- 2 <= cost.length <= 1000
- 0 <= cost[i] <= 999

Time Complexity: O(n)
Space Complexity: O(1)
"""

from typing import List


class Solution:
    def minCostClimbingStairs(self, cost: List[int]) -> int:
        """
        Approach: Dynamic Programming with space optimization

        Strategy:
        1. dp[i] = minimum cost to reach step i
        2. dp[i] = cost[i] + min(dp[i-1], dp[i-2])
        3. Can start from step 0 or 1 (both have 0 initial cost)
        4. Final answer: min(dp[n-1], dp[n-2]) to reach top
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

        n = len(cost)

        if n == 2:
            return min(cost[0], cost[1])

        # prev2 and prev1 represent min cost to reach previous steps
        prev2 = cost[0]
        prev1 = cost[1]

        for i in range(2, n):
            current = cost[i] + min(prev1, prev2)
            prev2 = prev1
            prev1 = current

        # Can reach top from either of last two steps
        return min(prev1, prev2)


# Alternative DP array approach
class SolutionArray:
    def minCostClimbingStairs(self, cost: List[int]) -> int:
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

        Time: O(n), Space: O(n)
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

        n = len(cost)
        dp = [0] * n

        dp[0] = cost[0]
        dp[1] = cost[1]

        for i in range(2, n):
            dp[i] = cost[i] + min(dp[i - 1], dp[i - 2])

        return min(dp[n - 1], dp[n - 2])


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.minCostClimbingStairs([10, 15, 20]) == 15
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.minCostClimbingStairs([1, 100, 1, 1, 1, 100, 1, 1, 1, 1]) == 6
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.minCostClimbingStairs([0, 0, 0, 1]) == 0
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
