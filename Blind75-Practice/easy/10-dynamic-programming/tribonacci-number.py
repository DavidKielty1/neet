"""
LeetCode 1137: N-th Tribonacci Number
Difficulty: Easy
Pattern: Dynamic Programming

Problem:
The Tribonacci sequence Tn is defined as follows:

T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.

Given n, return the value of Tn.

Example 1:
Input: n = 4
Output: 4
Explanation:
T_3 = 0 + 1 + 1 = 2
T_4 = 1 + 1 + 2 = 4

Example 2:
Input: n = 25
Output: 1389537

Constraints:
- 0 <= n <= 37
- The answer is guaranteed to fit within a 32-bit integer, ie. answer <= 2^31 - 1.

Time Complexity: O(n)
Space Complexity: O(1)
"""


class Solution:
    def tribonacci(self, n: int) -> int:
        """
        Approach: Iterative DP with O(1) space

        Strategy:
        1. Handle base cases: n = 0, 1, 2
        2. Maintain three variables for last three values
        3. Calculate next value and update variables
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

        if n == 0:
            return 0
        if n <= 2:
            return 1

        a, b, c = 0, 1, 1

        for _ in range(3, n + 1):
            a, b, c = b, c, a + b + c

        return c


# Alternative with array DP
class SolutionArray:
    def tribonacci(self, n: int) -> int:
        if n == 0:
            return 0
        if n <= 2:
            return 1

        dp = [0] * (n + 1)
        dp[1] = dp[2] = 1

        for i in range(3, n + 1):
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3]

        return dp[n]


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.tribonacci(4) == 4
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.tribonacci(25) == 1389537
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.tribonacci(0) == 0
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
