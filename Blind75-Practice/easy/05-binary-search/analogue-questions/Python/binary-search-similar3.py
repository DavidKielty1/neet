"""
Similar Problem 3: Sqrt(x)
Difficulty: Easy
Pattern: Binary Search

Problem:
Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

Example 1:
Input: x = 4
Output: 2

Example 2:
Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round down, 2 is returned.

Example 3:
Input: x = 0
Output: 0

Constraints:
- 0 <= x <= 2^31 - 1
"""


class Solution:
    def mySqrt(self, x: int) -> int:
        """
        Approach: Binary search for square root

        Strategy:
        1. Search range [0, x]
        2. Find largest number whose square <= x
        3. Use binary search to narrow down
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

        if x < 2:
            return x

        left, right = 1, x
        result = 0

        while left <= right:
            mid = left + (right - left) // 2

            if mid * mid == x:
                return mid
            elif mid * mid < x:
                result = mid  # Store potential answer
                left = mid + 1
            else:
                right = mid - 1

        return result


# Alternative: Using right boundary
class SolutionAlternative:
    def mySqrt(self, x: int) -> int:
        if x < 2:
            return x

        left, right = 1, x // 2

        while left <= right:
            mid = left + (right - left) // 2
            square = mid * mid

            if square == x:
                return mid
            elif square < x:
                left = mid + 1
            else:
                right = mid - 1

        return right


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.mySqrt(4) == 2
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.mySqrt(8) == 2
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.mySqrt(0) == 0
    print("✓ Test case 3 passed")

    # Test case 4
    assert solution.mySqrt(1) == 1
    print("✓ Test case 4 passed")

    # Test case 5
    assert solution.mySqrt(16) == 4
    print("✓ Test case 5 passed")

    print("\nAll test cases passed!")
