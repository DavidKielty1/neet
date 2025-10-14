"""
20. Valid Parentheses
Difficulty: Easy
Pattern: Stack

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

Example:
Input: s = "()"
Output: true

Input: s = "()[]{}"
Output: true

Input: s = "(]"
Output: false

Time: O(n), Space: O(n)
"""


def is_valid_parentheses(s: str) -> bool:
    """
    Validate brackets using a stack.
    Time: O(n), Space: O(n)
    """
    pairs = {")": "(", "]": "[", "}": "{"}
    openers = set(pairs.values())
    stack = []

    for ch in s:
        if ch in openers:
            stack.append(ch)
        elif ch in pairs:
            if not stack or stack[-1] != pairs[ch]:
                return False
            stack.pop()
        else:
            # Non-bracket character (guard; LeetCode inputs are only brackets)
            return False

    return not stack


# Test cases
if __name__ == "__main__":
    # Test 1
    s1 = "()"
    print(f"Valid Parentheses: {is_valid_parentheses(s1)}")  # True

    # Test 2
    s2 = "()[]{}"
    print(f"Valid Parentheses: {is_valid_parentheses(s2)}")  # True

    # Test 3
    s3 = "(]"
    print(f"Valid Parentheses: {is_valid_parentheses(s3)}")  # False

    # Test 4
    s4 = "([)]"
    print(f"Valid Parentheses: {is_valid_parentheses(s4)}")  # False

    # Test 5
    s5 = "{[]}"
    print(f"Valid Parentheses: {is_valid_parentheses(s5)}")  # True
