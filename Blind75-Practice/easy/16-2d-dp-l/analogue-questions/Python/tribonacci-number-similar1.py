"""
LeetCode 509: Fibonacci Number
Difficulty: Easy
Pattern: Dynamic Programming

Problem:
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence,
such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.

Given n, calculate F(n).

Example 1:
Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.

Example 2:
Input: n = 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.

Example 3:
Input: n = 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.

Constraints:
- 0 <= n <= 30

Time Complexity: O(n)
Space Complexity: O(1)
"""


class Solution:
    def fib(self, n: int) -> int:
        """
        Approach: Iterative DP with O(1) space

        Strategy:
        1. Handle base cases
        2. Maintain two variables for last two values
        3. Calculate next value and update
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
            return n

        a, b = 0, 1

        for _ in range(2, n + 1):
            a, b = b, a + b

        return b


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.fib(2) == 1
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.fib(3) == 2
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.fib(4) == 3
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
