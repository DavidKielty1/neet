"""
LeetCode 70: Climbing Stairs
Difficulty: Easy
Pattern: Dynamic Programming

Problem:
You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Example 1:
Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps

Example 2:
Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step

Constraints:
- 1 <= n <= 45

Time Complexity: O(n)
Space Complexity: O(1)
"""


class Solution:
    def climbStairs(self, n: int) -> int:
        """
        Approach: Dynamic Programming (Fibonacci pattern)

        Strategy:
        1. To reach step n, you can come from step n-1 or n-2
        2. Ways to reach n = ways to reach (n-1) + ways to reach (n-2)
        3. This is Fibonacci sequence!
        4. Use space-optimized DP with two variables
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

        if n <= 2:
            return n

        # Base cases: 1 way to reach step 1, 2 ways to reach step 2
        prev2 = 1  # n-2
        prev1 = 2  # n-1

        # Calculate for steps 3 to n
        for i in range(3, n + 1):
            current = prev1 + prev2
            prev2 = prev1
            prev1 = current

        return prev1


# Alternative DP array approach
class SolutionArray:
    def climbStairs(self, n: int) -> int:
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

        if n <= 2:
            return n

        dp = [0] * (n + 1)
        dp[1] = 1
        dp[2] = 2

        for i in range(3, n + 1):
            dp[i] = dp[i - 1] + dp[i - 2]

        return dp[n]


# Alternative recursive with memoization
class SolutionMemo:
    def climbStairs(self, n: int) -> int:
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

        Top-down DP with memoization
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

        memo = {}

        def dp(n):
            if n <= 2:
                return n
            if n in memo:
                return memo[n]

            memo[n] = dp(n - 1) + dp(n - 2)
            return memo[n]

        return dp(n)


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.climbStairs(2) == 2
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.climbStairs(3) == 3
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.climbStairs(5) == 8
    print("✓ Test case 3 passed")

    # Test case 4
    assert solution.climbStairs(1) == 1
    print("✓ Test case 4 passed")

    print("\nAll test cases passed!")
