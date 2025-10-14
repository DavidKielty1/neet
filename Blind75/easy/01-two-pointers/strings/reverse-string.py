"""
344. Reverse String
Difficulty: Easy
Pattern: Two Pointers

Write a function that reverses a string. The input string is given as an
array of characters s.

Contract (LeetCode 344):
- Do not return anything; modify s in-place by reversing the characters.

Example:
Input: s = ["h","e","l","l","o"]
           [ 0   1   2   3   4]
Output: ["o","l","l","e","h"]

Time: O(n), Space: O(1)
"""

from typing import List


# ["h", "a", "n", "n", "a", "H"
def reverse_string(s: List[str]) -> None:
    pass


# Test cases
if __name__ == "__main__":
    # Test 1
    s1 = ["h", "e", "l", "l", "o"]
    reverse_string(s1)
    print(f"Reverse String: {s1}")  # ["o", "l", "l", "e", "h"]

    # Test 2
    s2 = ["H", "a", "n", "n", "a", "h"]
    reverse_string(s2)
    print(f"Reverse String: {s2}")  # ["h", "a", "n", "n", "a", "H"]

    # Test 3
    s3 = ["A"]
    reverse_string(s3)
    print(f"Reverse String: {s3}")  # ["A"]
