"""
344. Reverse String
Difficulty: Easy
Pattern: Two Pointers

Write a function that reverses a string. The input string is given as an array of characters s.

Example:
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Time: O(n), Space: O(1)
"""


def reverse_string(s):
    """
    Two pointers from both ends, swap characters
    """
    left, right = 0, len(s) - 1

    while left < right:
        s[left], s[right] = s[right], s[left]
        left += 1
        right -= 1


# Alternative: Using built-in reverse
def reverse_string_builtin(s):
    """
    Using Python's built-in reverse method
    """
    s.reverse()


# Alternative: Using slicing (creates new list)
def reverse_string_slice(s):
    """
    Using slicing - returns new list
    """
    return s[::-1]


# Test cases
if __name__ == "__main__":
    # Test 1
    s1 = ["h", "e", "l", "l", "o"]
    reverse_string(s1)
    print(f"Reverse String: {s1}")  # ['o', 'l', 'l', 'e', 'h']

    # Test 2
    s2 = ["H", "a", "n", "n", "a", "h"]
    reverse_string(s2)
    print(f"Reverse String: {s2}")  # ['h', 'a', 'n', 'n', 'a', 'H']

    # Test 3
    s3 = ["A"]
    reverse_string(s3)
    print(f"Reverse String: {s3}")  # ['A']
