"""
Similar Problem 1: Ugly Number
Difficulty: Easy
Pattern: Math

Problem:
An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
Given an integer n, return true if n is an ugly number.

Example 1:
Input: n = 6
Output: true
Explanation: 6 = 2 × 3

Example 2:
Input: n = 1
Output: true
Explanation: 1 has no prime factors, considered ugly

Example 3:
Input: n = 14
Output: false
Explanation: 14 includes prime factor 7

Constraints:
- -2^31 <= n <= 2^31 - 1
"""


class Solution:
    def isUgly(self, n: int) -> bool:
        """
        Approach: Divide by 2, 3, 5 repeatedly

        Strategy:
        1. If n <= 0, return false
        2. Keep dividing by 2, 3, 5 while possible
        3. If result is 1, all factors were 2/3/5 only
        4. Similar to cycle detection in happy number
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

        if n <= 0:
            return False

        # Divide by 2, 3, 5 as many times as possible
        for factor in [2, 3, 5]:
            while n % factor == 0:
                n //= factor

        # If only factors were 2, 3, 5, result should be 1
        return n == 1


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.isUgly(6) == True
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.isUgly(1) == True
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.isUgly(14) == False
    print("✓ Test case 3 passed")

    # Test case 4
    assert solution.isUgly(0) == False
    print("✓ Test case 4 passed")

    print("\nAll test cases passed!")
