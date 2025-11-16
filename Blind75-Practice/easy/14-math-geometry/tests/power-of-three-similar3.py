"""
LeetCode 507: Perfect Number
Difficulty: Easy
Pattern: Math

Problem:
A perfect number is a positive integer that is equal to the sum of its positive divisors,
excluding the number itself. A divisor of an integer x is an integer that can divide x evenly.

Given an integer n, return true if n is a perfect number, otherwise return false.

Example 1:
Input: num = 28
Output: true
Explanation: 28 = 1 + 2 + 4 + 7 + 14
1, 2, 4, 7, and 14 are all divisors of 28.

Example 2:
Input: num = 7
Output: false

Constraints:
- 1 <= num <= 10^8

Time Complexity: O(sqrt(n))
Space Complexity: O(1)
"""


class Solution:
    def checkPerfectNumber(self, num: int) -> bool:
        """
        Approach: Find divisors up to sqrt(num)

        Strategy:
        1. If num <= 1, return False
        2. Find all divisors up to sqrt(num)
        3. For each divisor i, also add num/i
        4. Check if sum equals num
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

        if num <= 1:
            return False

        divisor_sum = 1  # 1 is always a divisor

        i = 2
        while i * i <= num:
            if num % i == 0:
                divisor_sum += i
                if i != num // i:
                    divisor_sum += num // i
            i += 1

        return divisor_sum == num


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.checkPerfectNumber(28) == True
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.checkPerfectNumber(7) == False
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.checkPerfectNumber(1) == False
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
