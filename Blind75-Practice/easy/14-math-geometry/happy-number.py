"""
LeetCode 202: Happy Number
Difficulty: Easy
Pattern: Math

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
Space Complexity: O(log n) for set approach, O(1) for Floyd's cycle
"""


class Solution:
    def isHappy(self, n: int) -> bool:
        """
        Approach: Detect cycle with hash set

        Strategy:
        1. Keep calculating sum of squares of digits
        2. If we see same number again, there's a cycle (not happy)
        3. If we reach 1, it's happy
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

        seen = set()

        while n != 1 and n not in seen:
            seen.add(n)
            n = self.sum_of_squares(n)

        return n == 1

    def sum_of_squares(self, n: int) -> int:
        """Calculate sum of squares of digits"""
        total = 0
        while n > 0:
            digit = n % 10
            total += digit * digit
            n //= 10
        return total


# Alternative: Floyd's Cycle Detection (constant space)
class SolutionFloyd:
    def isHappy(self, n: int) -> bool:
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

        Use slow and fast pointers to detect cycle
        Space: O(1)
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

        slow = n
        fast = n

        while True:
            slow = self.sum_of_squares(slow)
            fast = self.sum_of_squares(self.sum_of_squares(fast))

            if fast == 1:
                return True
            if slow == fast:
                return False

    def sum_of_squares(self, n: int) -> int:
        total = 0
        while n > 0:
            digit = n % 10
            total += digit * digit
            n //= 10
        return total


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
