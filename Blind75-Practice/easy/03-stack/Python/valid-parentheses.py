"""
LeetCode 20: Valid Parentheses
Difficulty: Easy
Pattern: Stack

Problem:
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
determine if the input string is valid.

An input string is valid if:
1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.
3. Every close bracket has a corresponding open bracket of the same type.

Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false

Example 4:
Input: s = "([)]"
Output: false

Constraints:
- 1 <= s.length <= 10^4
- s consists of parentheses only '()[]{}'

Time Complexity: O(n)
Space Complexity: O(n)
"""


class Solution:
    def isValid(self, s: str) -> bool:
        """
        Approach: Use stack to match opening and closing brackets

        Strategy:
        1. Create a stack and mapping of closing to opening brackets
        2. For each character:
           - If opening bracket: push to stack
           - If closing bracket: pop from stack and check if it matches
        3. At the end, stack should be empty
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

        # stack: list[str] = []
        # bracket_map = {")": "(", "}": "{", "]": "["}

        # for char in s:
        #     if char in bracket_map:
        #         if not stack or stack[-1] != bracket_map[char]:
        #             return False
        #         stack.pop()
        #     else:
        #         stack.append(char)

        # return len(stack) == 0


# Alternative with more explicit logic
class SolutionAlternative:
    def isValid(self, s: str) -> bool:
        stack: list[str] = []

        for char in s:
            if char == "(":
                stack.append(")")
            elif char == "{":
                stack.append("}")
            elif char == "[":
                stack.append("]")
            elif not stack or stack.pop() != char:
                return False

        return not stack


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.isValid("()") == True
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.isValid("()[]{}") == True
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.isValid("(]") == False
    print("✓ Test case 3 passed")

    # Test case 4
    assert solution.isValid("([)]") == False
    print("✓ Test case 4 passed")

    # Test case 5
    assert solution.isValid("{[]}") == True
    print("✓ Test case 5 passed")

    # Test case 6
    assert solution.isValid("(") == False
    print("✓ Test case 6 passed")

    print("\nAll test cases passed!")
