"""
LeetCode 69: Sqrt(x)
Difficulty: Easy
Pattern: Binary Search / Math

Problem:
Given a non-negative integer x, return the square root of x rounded down to the nearest
integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

Example 1:
Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.

Example 2:
Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the
nearest integer, 2 is returned.

Constraints:
- 0 <= x <= 2^31 - 1

Time Complexity: O(log x)
Space Complexity: O(1)
"""


class Solution:
    def mySqrt(self, x: int) -> int:
        """
        Approach: Binary search

        Strategy:
        1. Use binary search to find largest num where num*num <= x
        2. This is the floor of square root
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

    print("\nAll test cases passed!")
