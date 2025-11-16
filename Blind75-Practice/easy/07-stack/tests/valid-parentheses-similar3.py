"""
Similar Problem 3: Score of Parentheses
Difficulty: Easy
Pattern: Stack

Problem:
Given a balanced parentheses string s, return the score of the string.

The score of a balanced parentheses string is based on the following rule:
- "()" has score 1
- AB has score A + B, where A and B are balanced parentheses strings
- (A) has score 2 * A, where A is a balanced parentheses string

Example 1:
Input: s = "()"
Output: 1

Example 2:
Input: s = "(())"
Output: 2

Example 3:
Input: s = "()()"
Output: 2

Example 4:
Input: s = "(()(()))"
Output: 6

Constraints:
- 2 <= s.length <= 50
- s consists of only '(' and ')'
- s is a balanced parentheses string
"""


class Solution:
    def scoreOfParentheses(self, s: str) -> int:
        """
        Approach: Stack to track scores at each level

        Strategy:
        1. Use stack to track scores
        2. When '(' found, push 0 (start new level)
        3. When ')' found, pop and calculate score
        4. () = 1, (A) = 2*A
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

        stack = [0]  # Start with base score

        for char in s:
            if char == "(":
                stack.append(0)  # Start new level
            else:  # char == ')'
                top = stack.pop()
                # () has score 1, (A) has score 2*A
                score = max(2 * top, 1)
                stack[-1] += score

        return stack[0]


# Alternative: Count depth
class SolutionDepth:
    def scoreOfParentheses(self, s: str) -> int:
        score = 0
        depth = 0

        for i, char in enumerate(s):
            if char == "(":
                depth += 1
            else:
                depth -= 1
                # If previous char was '(', we have "()"
                if s[i - 1] == "(":
                    score += 2**depth

        return score


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.scoreOfParentheses("()") == 1
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.scoreOfParentheses("(())") == 2
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.scoreOfParentheses("()()") == 2
    print("✓ Test case 3 passed")

    # Test case 4
    assert solution.scoreOfParentheses("(()(()))") == 6
    print("✓ Test case 4 passed")

    print("\nAll test cases passed!")
