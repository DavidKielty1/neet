"""
20. Valid Parentheses
Difficulty: Easy
Pattern: Stack

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

A string is valid iff:
- It contains only the bracket characters () {} []
- Every opening bracket is closed by the same type of bracket
- Brackets are closed in the correct LIFO order (properly nested)
- No extra closing bracket appears before a matching opener

Example:
Input: s = "()"
Output: true

Input: s = "()[]{}"
Output: true

Input: s = "(]"
Output: false

Input: s = "([{}])"
Output: true

Input: s = "([){]}"
Output: false  # mismatched and out-of-order

Time: O(n), Space: O(n)
"""


def is_valid_parentheses(s: str) -> bool:
    """
    Validate brackets using a stack.
    Time: O(n), Space: O(n)

    Stask using hashmap for keys, set for values
    """
    pass


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
