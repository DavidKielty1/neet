"""
LeetCode 172: Factorial Trailing Zeroes
Difficulty: Medium (simplified to Easy)
Pattern: Math

Problem:
Given an integer n, return the number of trailing zeroes in n!.

Note that n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1.

Example 1:
Input: n = 3
Output: 0
Explanation: 3! = 6, no trailing zero.

Example 2:
Input: n = 5
Output: 1
Explanation: 5! = 120, one trailing zero.

Example 3:
Input: n = 0
Output: 0

Constraints:
- 0 <= n <= 10^4

Follow up: Could you write a solution that works in logarithmic time complexity?

Time Complexity: O(log n)
Space Complexity: O(1)
"""


class Solution:
    def trailingZeroes(self, n: int) -> int:
        """
        Approach: Count factors of 5

        Strategy:
        1. Trailing zeros come from 10 = 2 * 5
        2. There are always more 2s than 5s in n!
        3. Count how many times 5 appears as a factor
        4. Also count 25 (5^2), 125 (5^3), etc.
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

        count = 0

        while n > 0:
            n //= 5
            count += n

        return count


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.trailingZeroes(3) == 0
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.trailingZeroes(5) == 1
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.trailingZeroes(0) == 0
    print("✓ Test case 3 passed")

    # Test case 4
    assert solution.trailingZeroes(25) == 6
    print("✓ Test case 4 passed")

    print("\nAll test cases passed!")
