"""
Similar Problem 2: Add Digits
Difficulty: Easy
Pattern: Math

Problem:
Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

Example 1:
Input: num = 38
Output: 2
Explanation: 38 -> 3 + 8 = 11 -> 1 + 1 = 2

Example 2:
Input: num = 0
Output: 0

Example 3:
Input: num = 9
Output: 9

Constraints:
- 0 <= num <= 2^31 - 1

Follow up: Could you do it without any loop/recursion in O(1) runtime?
"""


class Solution:
    def addDigits(self, num: int) -> int:
        """
        Approach: Iterative digit sum

        Strategy:
        1. Repeatedly sum digits until single digit
        2. Similar to cycle detection in happy number
        3. Keep summing until num < 10
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

        while num >= 10:
            digit_sum = 0
            while num > 0:
                digit_sum += num % 10
                num //= 10
            num = digit_sum

        return num


# O(1) solution using digital root formula
class SolutionOptimized:
    def addDigits(self, num: int) -> int:
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

        Math insight: Digital root formula

        Pattern:
        - 0 -> 0
        - 1-9 -> same
        - 10-18 -> 1-9
        - 19 -> 1, 20 -> 2, etc.

        Formula: num == 0 ? 0 : 1 + (num - 1) % 9
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

        if num == 0:
            return 0
        return 1 + (num - 1) % 9


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.addDigits(38) == 2
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.addDigits(0) == 0
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.addDigits(9) == 9
    print("✓ Test case 3 passed")

    # Test case 4
    assert solution.addDigits(100) == 1
    print("✓ Test case 4 passed")

    print("\nAll test cases passed!")
