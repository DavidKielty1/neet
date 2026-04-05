"""
LeetCode 367: Valid Perfect Square
Difficulty: Easy
Pattern: Binary Search

Problem:
Given a positive integer num, return true if num is a perfect square or false otherwise.

A perfect square is an integer that is the square of an integer. In other words, it is
the product of some integer with itself.

You must not use any built-in library function, such as sqrt.

Example 1:
Input: num = 16
Output: true
Explanation: We return true because 4 * 4 = 16 and 4 is an integer.

Example 2:
Input: num = 14
Output: false
Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer.

Constraints:
- 1 <= num <= 2^31 - 1

Time Complexity: O(log n)
Space Complexity: O(1)
"""


class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        """
        Approach: Binary search

        Strategy:
        1. Use binary search to find x where x*x = num
        2. If found, return True
        3. Otherwise return False
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

        if num < 2:
            return True

        left, right = 2, num // 2

        while left <= right:
            mid = left + (right - left) // 2
            square = mid * mid

            if square == num:
                return True
            elif square < num:
                left = mid + 1
            else:
                right = mid - 1

        return False


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.isPerfectSquare(16) == True
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.isPerfectSquare(14) == False
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.isPerfectSquare(1) == True
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
