"""
Similar Problem 1: Remove Outermost Parentheses
Difficulty: Easy
Pattern: Stack

Problem:
A valid parentheses string is either empty, "(" + A + ")", or A + B, where A and B are valid parentheses strings.
You are given a valid parentheses string s. Remove the outermost parentheses of every primitive string
in the primitive decomposition of s.

Example 1:
Input: s = "(()())(())"
Output: "()()()"

Example 2:
Input: s = "(()())(())(()(()))"
Output: "()()()()(())"

Example 3:
Input: s = "()()"
Output: ""

Constraints:
- 1 <= s.length <= 10^5
- s[i] is either '(' or ')'
- s is a valid parentheses string
"""


class Solution:
    def removeOuterParentheses(self, s: str) -> str:
        """
        Approach: Track depth/level of parentheses

        Strategy:
        1. Use counter to track depth
        2. Only add parentheses that are not at outermost level
        3. Increment for '(', decrement for ')'
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

        result = []
        depth = 0

        for char in s:
            if char == "(":
                if depth > 0:  # Not outermost
                    result.append(char)
                depth += 1
            else:  # char == ')'
                depth -= 1
                if depth > 0:  # Not outermost
                    result.append(char)

        return "".join(result)


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.removeOuterParentheses("(()())(())") == "()()()"
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.removeOuterParentheses("(()())(())(()(()))") == "()()()()(())"
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.removeOuterParentheses("()()") == ""
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
