"""
LeetCode 400: Nth Digit
Difficulty: Medium (simplified to Easy)
Pattern: Math

Problem:
Given an integer n, return the nth digit of the infinite integer sequence [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...].

Example 1:
Input: n = 3
Output: 3

Example 2:
Input: n = 11
Output: 0
Explanation: The 11th digit of the sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... is a 0,
which is part of the number 10.

Constraints:
- 1 <= n <= 2^31 - 1

Time Complexity: O(log n)
Space Complexity: O(1)
"""


class Solution:
    def findNthDigit(self, n: int) -> int:
        """
        Approach: Calculate digit ranges

        Strategy:
        1. 1-digit numbers: 1-9 (9 numbers, 9 digits)
        2. 2-digit numbers: 10-99 (90 numbers, 180 digits)
        3. 3-digit numbers: 100-999 (900 numbers, 2700 digits)
        4. Find which range n falls into
        5. Find the specific number and digit
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

        length = 1
        count = 9
        start = 1

        while n > length * count:
            n -= length * count
            length += 1
            count *= 10
            start *= 10

        # Find the actual number
        num = start + (n - 1) // length

        # Find the digit within that number
        digit_index = (n - 1) % length
        return int(str(num)[digit_index])


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.findNthDigit(3) == 3
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.findNthDigit(11) == 0
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.findNthDigit(1) == 1
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
