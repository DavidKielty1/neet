"""
LeetCode 50: Pow(x, n) (simplified to Easy)
Difficulty: Medium (simplified to Easy)
Pattern: Math / Binary Search

Problem:
Implement pow(x, n), which calculates x raised to the power n (i.e., x^n).

Example 1:
Input: x = 2.00000, n = 10
Output: 1024.00000

Example 2:
Input: x = 2.10000, n = 3
Output: 9.26100

Example 3:
Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2^-2 = 1/2^2 = 1/4 = 0.25

Constraints:
- -100.0 < x < 100.0
- -2^31 <= n <= 2^31-1
- n is an integer
- -10^4 <= x^n <= 10^4

Time Complexity: O(log n)
Space Complexity: O(1)
"""


class Solution:
    def myPow(self, x: float, n: int) -> float:
        """
        Approach: Fast exponentiation (binary exponentiation)

        Strategy:
        1. Handle negative powers
        2. Use binary exponentiation for efficiency
        3. x^n = (x^2)^(n/2) if n is even
        4. x^n = x * x^(n-1) if n is odd
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

        def helper(x, n):
            if n == 0:
                return 1

            half = helper(x, n // 2)

            if n % 2 == 0:
                return half * half
            else:
                return half * half * x

        if n < 0:
            return 1 / helper(x, -n)
        return helper(x, n)


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert abs(solution.myPow(2.00000, 10) - 1024.00000) < 0.0001
    print("✓ Test case 1 passed")

    # Test case 2
    assert abs(solution.myPow(2.10000, 3) - 9.26100) < 0.0001
    print("✓ Test case 2 passed")

    # Test case 3
    assert abs(solution.myPow(2.00000, -2) - 0.25000) < 0.0001
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
