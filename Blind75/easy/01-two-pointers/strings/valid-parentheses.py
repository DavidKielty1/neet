"""
20. Valid Parentheses
Difficulty: Easy
Pattern: Two Pointers (with Stack - but can be solved with two pointers for simple cases)

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

Example:
Input: s = "()"
Output: true

Input: s = "()[]{}"
Output: true

Input: s = "(]"
Output: false

Time: O(n), Space: O(n) for stack approach
"""


def is_valid_parentheses(s):
    """
    Stack approach - most common and efficient
    """
    stack = []
    mapping = {")": "(", "}": "{", "]": "["}

    for char in s:
        if char in mapping:
            # Closing bracket
            if not stack or stack.pop() != mapping[char]:
                return False
        else:
            # Opening bracket
            stack.append(char)

    return len(stack) == 0


# Alternative: Two pointers approach (limited cases)
def is_valid_parentheses_two_pointers(s):
    """
    Two pointers approach - works only for simple cases like "()" or "[]"
    This is more of a demonstration of two pointers thinking
    """
    if len(s) % 2 != 0:
        return False

    left, right = 0, len(s) - 1

    while left < right:
        if not is_matching_pair(s[left], s[right]):
            return False
        left += 1
        right -= 1

    return True


def is_matching_pair(left, right):
    """Check if two characters form a valid pair"""
    pairs = {"(": ")", "[": "]", "{": "}"}
    return pairs.get(left) == right


# Alternative: Counter approach (for single type of brackets)
def is_valid_single_type(s, open_char="(", close_char=")"):
    """
    Two pointers with counter - works for single type of brackets
    """
    count = 0

    for char in s:
        if char == open_char:
            count += 1
        elif char == close_char:
            count -= 1
            if count < 0:
                return False

    return count == 0


# Test cases
if __name__ == "__main__":
    # Test 1 - Stack approach
    s1 = "()"
    print(f"Valid Parentheses: {is_valid_parentheses(s1)}")  # True

    s2 = "()[]{}"
    print(f"Valid Parentheses: {is_valid_parentheses(s2)}")  # True

    s3 = "(]"
    print(f"Valid Parentheses: {is_valid_parentheses(s3)}")  # False

    s4 = "([)]"
    print(f"Valid Parentheses: {is_valid_parentheses(s4)}")  # False

    s5 = "{[]}"
    print(f"Valid Parentheses: {is_valid_parentheses(s5)}")  # True

    # Test 2 - Two pointers (simple cases)
    s6 = "()"
    print(f"Two Pointers: {is_valid_parentheses_two_pointers(s6)}")  # True

    s7 = "[]"
    print(f"Two Pointers: {is_valid_parentheses_two_pointers(s7)}")  # True

    # Test 3 - Single type counter
    s8 = "((()))"
    print(f"Single Type: {is_valid_single_type(s8)}")  # True

    s9 = "(()))"
    print(f"Single Type: {is_valid_single_type(s9)}")  # False
