"""
70. Climbing Stairs
Difficulty: Easy
Pattern: Dynamic Programming

Problem:
You are climbing a staircase. It takes n steps to reach the top. Each time you
can either climb 1 or 2 steps. Return the number of distinct ways you can
climb to the top.

Example 1:
Input: n = 2
Output: 2

Example 2:
Input: n = 3
Output: 3

Constraints:
- 1 <= n <= 45
"""

from typing import List


def climb_stairs(n: int) -> int:
    """
    Dynamic programming with space optimization
    Time: O(n), Space: O(1)
    """
    # TODO: Implement DP solution
    pass


# Test cases
if __name__ == "__main__":
    # Test 1
    n1 = 2
    print(f"Climb Stairs: {climb_stairs(n1)}")  # 2

    # Test 2
    n2 = 3
    print(f"Climb Stairs: {climb_stairs(n2)}")  # 3
