"""
Similar Problem 1: Reverse Integer
Difficulty: Easy
Pattern: Bit Manipulation / Math

Problem:
Given a signed 32-bit integer x, return x with its digits reversed.
If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.

Example 1:
Input: x = 123
Output: 321

Example 2:
Input: x = -123
Output: -321

Example 3:
Input: x = 120
Output: 21

Constraints:
- -2^31 <= x <= 2^31 - 1
"""


class Solution:
    def reverse(self, x: int) -> int:
        """
        Approach: Extract digits and rebuild reversed number

        Strategy:
        1. Handle sign separately
        2. Extract digits one by one
        3. Build reversed number
        4. Check for overflow
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

        INT_MIN, INT_MAX = -(2**31), 2**31 - 1

        sign = -1 if x < 0 else 1
        x = abs(x)

        result = 0
        while x:
            digit = x % 10
            x //= 10

            # Check overflow before multiplication
            if result > INT_MAX // 10:
                return 0

            result = result * 10 + digit

        result *= sign

        # Final overflow check
        if result < INT_MIN or result > INT_MAX:
            return 0

        return result


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.reverse(123) == 321
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.reverse(-123) == -321
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.reverse(120) == 21
    print("✓ Test case 3 passed")

    # Test case 4
    assert solution.reverse(0) == 0
    print("✓ Test case 4 passed")

    print("\nAll test cases passed!")
