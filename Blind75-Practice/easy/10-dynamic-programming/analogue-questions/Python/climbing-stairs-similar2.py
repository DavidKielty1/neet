"""
Similar Problem 2: N-th Tribonacci Number
Difficulty: Easy
Pattern: Dynamic Programming

Problem:
The Tribonacci sequence Tn is defined as follows:
T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.

Given n, return the value of Tn.

Example 1:
Input: n = 4
Output: 4
Explanation: T(4) = T(3) + T(2) + T(1) = 2 + 1 + 1 = 4

Example 2:
Input: n = 25
Output: 1389537

Constraints:
- 0 <= n <= 37
"""


class Solution:
    def tribonacci(self, n: int) -> int:
        """
        Approach: Dynamic programming (space optimized)

        Strategy:
        1. Base cases: T(0) = 0, T(1) = 1, T(2) = 1
        2. Use three variables to track previous three values
        3. Calculate current as sum of previous three
        4. Similar to climbing stairs with 3 steps allowed
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

        prev3, prev2, prev1 = 0, 1, 1

        for i in range(3, n + 1):
            current = prev1 + prev2 + prev3
            prev3 = prev2
            prev2 = prev1
            prev1 = current

        return prev1


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

    # Test case 4
    assert solution.tribonacci(1) == 1
    print("✓ Test case 4 passed")

    print("\nAll test cases passed!")
