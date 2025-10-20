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

    Approach 1: Using hashmap for close→open mapping
    """
    close_to_opens = {
        ")": "(",
        "]": "[",
        "}": "{",
    }
    stack = []

    for char in s:
        if char in close_to_opens:
            # Closing bracket: check if it matches the most recent opener
            if not stack or stack.pop() != close_to_opens[char]:
                return False
        else:
            # Opening bracket: push to stack
            stack.append(char)

    return len(stack) == 0


# Test cases
if __name__ == "__main__":
    test_cases = ["()", "()[]{}", "(]", "([)]", "{[]}"]

    for s in test_cases:
        result1 = is_valid_parentheses(s)  # Hashmap approach
        print(f"String: '{s}' | Hashmap: {result1}")

    print("\nBoth approaches should give the same results!")
