"""
LeetCode 202: Happy Number
Difficulty: Easy
Pattern: Math / Hash Set

Problem:
Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

- Starting with any positive integer, replace the number by the sum of the squares of its digits.
- Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
- Those numbers for which this process ends in 1 are happy.

Return true if n is a happy number, and false if not.

Example 1:
Input: n = 19
Output: true
Explanation:
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1

Example 2:
Input: n = 2
Output: false

Constraints:
- 1 <= n <= 2^31 - 1

Time Complexity: O(log n)
Space Complexity: O(log n)
"""


class Solution:
    def isHappy(self, n: int) -> bool:
        """
        Approach: Detect cycle with hash set

        Strategy:
        1. Calculate sum of squares of digits
        2. Use set to detect cycles
        3. If we reach 1, return True
        4. If we see a repeated number, return False
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

        def get_next(num):
            total = 0
            while num > 0:
                digit = num % 10
                total += digit * digit
                num //= 10
            return total

        seen = set()

        while n != 1 and n not in seen:
            seen.add(n)
            n = get_next(n)

        return n == 1


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.isHappy(19) == True
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.isHappy(2) == False
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.isHappy(1) == True
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
