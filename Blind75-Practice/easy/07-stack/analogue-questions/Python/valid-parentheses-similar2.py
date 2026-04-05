"""
Similar Problem 2: Minimum Add to Make Parentheses Valid
Difficulty: Easy
Pattern: Stack

Problem:
A parentheses string is valid if and only if:
- It is the empty string,
- It can be written as AB (A concatenated with B), where A and B are valid strings, or
- It can be written as (A), where A is a valid string.

You are given a parentheses string s. In one move, you can insert a parenthesis at any position.
Return the minimum number of moves required to make s valid.

Example 1:
Input: s = "())"
Output: 1

Example 2:
Input: s = "((("
Output: 3

Example 3:
Input: s = "()"
Output: 0

Example 4:
Input: s = "()))(("
Output: 4

Constraints:
- 1 <= s.length <= 1000
- s[i] is either '(' or ')'
"""


class Solution:
    def minAddToMakeValid(self, s: str) -> int:
        """
        Approach: Track unmatched parentheses

        Strategy:
        1. Count unmatched opening parentheses
        2. Count unmatched closing parentheses
        3. Return sum of both
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

        open_needed = 0  # Unmatched '('
        close_needed = 0  # Unmatched ')'

        for char in s:
            if char == "(":
                open_needed += 1
            else:  # char == ')'
                if open_needed > 0:
                    open_needed -= 1  # Match with previous '('
                else:
                    close_needed += 1  # Unmatched ')'

        return open_needed + close_needed


# Alternative using stack
class SolutionStack:
    def minAddToMakeValid(self, s: str) -> int:
        stack = []
        unmatched_close = 0

        for char in s:
            if char == "(":
                stack.append(char)
            else:  # char == ')'
                if stack:
                    stack.pop()
                else:
                    unmatched_close += 1

        return len(stack) + unmatched_close


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.minAddToMakeValid("())") == 1
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.minAddToMakeValid("(((") == 3
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.minAddToMakeValid("()") == 0
    print("✓ Test case 3 passed")

    # Test case 4
    assert solution.minAddToMakeValid("()))((") == 4
    print("✓ Test case 4 passed")

    print("\nAll test cases passed!")
