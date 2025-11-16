"""
Similar Problem 2: Happy Number (Cycle Detection with Numbers)
Difficulty: Easy
Pattern: Fast & Slow Pointers (Cycle Detection)

Problem:
Write an algorithm to determine if a number n is happy.
A happy number is a number defined by the following process:
- Starting with any positive integer, replace the number by the sum of the squares of its digits.
- Repeat until the number equals 1 (happy), or it loops endlessly in a cycle (not happy).
- Return true if n is a happy number, and false if not.

Example 1:
Input: n = 19
Output: true
Explanation: 1² + 9² = 82, 8² + 2² = 68, 6² + 8² = 100, 1² + 0² + 0² = 1

Example 2:
Input: n = 2
Output: false

Constraints:
- 1 <= n <= 2^31 - 1
"""


class Solution:
    def isHappy(self, n: int) -> bool:
        """
        Approach: Fast & slow pointers to detect cycle

        Strategy:
        1. Use Floyd's cycle detection on number transformations
        2. Slow moves one step, fast moves two steps
        3. If they meet and value is not 1, there's a cycle (not happy)
        4. If we reach 1, number is happy
        """

        def get_next(num):
            total = 0
            while num > 0:
                digit = num % 10
                total += digit * digit
                num //= 10
            return total

        slow = n
        fast = get_next(n)

        while fast != 1 and slow != fast:
            slow = get_next(slow)
            fast = get_next(get_next(fast))

        return fast == 1


# Alternative: Using set
class SolutionSet:
    def isHappy(self, n: int) -> bool:
        seen = set()

        while n != 1 and n not in seen:
            seen.add(n)
            n = sum(int(digit) ** 2 for digit in str(n))

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
