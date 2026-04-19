"""
LeetCode 326: Power of Three
Difficulty: Easy
Pattern: Math / Bit Manipulation

Problem:
Given an integer n, return true if it is a power of three. Otherwise, return false.

An integer n is a power of three, if there exists an integer x such that n == 3^x.

Example 1:
Input: n = 27
Output: true
Explanation: 27 = 3^3

Example 2:
Input: n = 0
Output: false
Explanation: There is no x where 3^x = 0.

Example 3:
Input: n = -1
Output: false
Explanation: There is no x where 3^x = (-1).

Constraints:
- -2^31 <= n <= 2^31 - 1

Follow up: Could you solve it without loops/recursion?

Time Complexity: O(log n) with loop, O(1) with math
Space Complexity: O(1)
"""


class Solution:
    def isPowerOfThree(self, n: int) -> bool:
        """
        Approach: Division by 3

        Strategy:
        1. If n <= 0, return False
        2. Keep dividing by 3 while divisible
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

        while n % 3 == 0:
            n //= 3

        return n == 1


# Alternative using math (O(1))
class SolutionMath:
    def isPowerOfThree(self, n: int) -> bool:
        # 3^19 = 1162261467 is the largest power of 3 within 32-bit int
        # If n is power of 3, it must divide 3^19 evenly
        return n > 0 and 1162261467 % n == 0


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.isPowerOfThree(27) == True
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.isPowerOfThree(0) == False
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.isPowerOfThree(-1) == False
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
