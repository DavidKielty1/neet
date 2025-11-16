"""
LeetCode 7: Reverse Integer
Difficulty: Medium (simplified to Easy)
Pattern: Math

Problem:
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes
the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

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

Time Complexity: O(log n)
Space Complexity: O(1)
"""


class Solution:
    def reverse(self, x: int) -> int:
        """
        Approach: Extract digits and build reversed number

        Strategy:
        1. Handle sign separately
        2. Extract digits and build reversed number
        3. Check for overflow
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

        sign = -1 if x < 0 else 1
        x = abs(x)
        result = 0

        while x:
            digit = x % 10
            x //= 10

            # Check for overflow before multiplication
            if result > (2**31 - 1) // 10:
                return 0

            result = result * 10 + digit

        result *= sign

        # Final overflow check
        if result < -(2**31) or result > 2**31 - 1:
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

    print("\nAll test cases passed!")
