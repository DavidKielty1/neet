"""
Easy Version: Climbing Stairs
Difficulty: Easy
Pattern: Dynamic Programming

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

Time: O(n), Space: O(1)
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
