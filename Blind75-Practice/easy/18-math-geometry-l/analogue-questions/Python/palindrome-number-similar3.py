"""
LeetCode 263: Ugly Number
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
Explanation: 1 has no prime factors, therefore all of its prime factors are limited to 2, 3, and 5.

Example 3:
Input: n = 14
Output: false
Explanation: 14 is not ugly since it includes the prime factor 7.

Constraints:
- -2^31 <= n <= 2^31 - 1

Time Complexity: O(log n)
Space Complexity: O(1)
"""


class Solution:
    def isUgly(self, n: int) -> bool:
        """
        Approach: Divide by 2, 3, 5

        Strategy:
        1. If n <= 0, return False
        2. Divide n by 2, 3, 5 as much as possible
        3. Check if result is 1
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

        for factor in [2, 3, 5]:
            while n % factor == 0:
                n //= factor

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

    print("\nAll test cases passed!")
