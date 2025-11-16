"""
LeetCode 1556: Thousand Separator
Difficulty: Easy
Pattern: String

Problem:
Given an integer n, add a dot (".") as the thousands separator and return it in string format.

Example 1:
Input: n = 987
Output: "987"

Example 2:
Input: n = 1234
Output: "1.234"

Example 3:
Input: n = 123456789
Output: "123.456.789"

Constraints:
- 0 <= n <= 2^31 - 1

Time Complexity: O(log n) - number of digits
Space Complexity: O(log n)
"""


class Solution:
    def thousandSeparator(self, n: int) -> str:
        """
        Approach: Convert to string and insert separators

        Strategy:
        1. Convert number to string
        2. Iterate from right to left
        3. Insert dot every 3 digits
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

        s = str(n)
        result = []

        for i, digit in enumerate(reversed(s)):
            if i > 0 and i % 3 == 0:
                result.append(".")
            result.append(digit)

        return "".join(reversed(result))


# Alternative using join
class SolutionJoin:
    def thousandSeparator(self, n: int) -> str:
        s = str(n)
        parts = []

        while len(s) > 3:
            parts.append(s[-3:])
            s = s[:-3]
        parts.append(s)

        return ".".join(reversed(parts))


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.thousandSeparator(987) == "987"
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.thousandSeparator(1234) == "1.234"
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.thousandSeparator(123456789) == "123.456.789"
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
