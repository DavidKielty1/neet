"""
Similar Problem 3: Perfect Number
Difficulty: Easy
Pattern: Math

Problem:
A perfect number is a positive integer that is equal to the sum of its positive divisors,
excluding the number itself. A divisor of an integer x is an integer that can divide x evenly.

Given an integer n, return true if n is a perfect number, otherwise return false.

Example 1:
Input: num = 28
Output: true
Explanation: 28 = 1 + 2 + 4 + 7 + 14 (divisors excluding 28)

Example 2:
Input: num = 7
Output: false

Example 3:
Input: num = 1
Output: false

Constraints:
- 1 <= num <= 10^8
"""


class Solution:
    def checkPerfectNumber(self, num: int) -> bool:
        """
        Approach: Find divisors and sum them

        Strategy:
        1. Find all divisors up to sqrt(num)
        2. For each divisor i, also count num/i
        3. Check if sum equals num
        4. Optimize by only checking up to sqrt
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

        # Check divisors up to sqrt(num)
        i = 2
        while i * i <= num:
            if num % i == 0:
                divisor_sum += i
                # Add the paired divisor if different
                if i * i != num:
                    divisor_sum += num // i
            i += 1

        return divisor_sum == num


# Alternative: Optimized check
class SolutionOptimized:
    def checkPerfectNumber(self, num: int) -> bool:
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

        Math fact: Only 5 perfect numbers exist below 10^8
        They are: 6, 28, 496, 8128, 33550336
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

        perfect_numbers = {6, 28, 496, 8128, 33550336}
        return num in perfect_numbers


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

    # Test case 4
    assert solution.checkPerfectNumber(6) == True
    print("✓ Test case 4 passed")

    print("\nAll test cases passed!")
