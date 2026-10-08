"""
344. Reverse String
Difficulty: Easy
Pattern: Two Pointers

Problem:
Write a function that reverses a string. The input string is given as an
array of characters s. You must do this by modifying the input array
in-place with O(1) extra memory. Do not return a new array.

Example 1:
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Example 2:
Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]

Constraints:
- 1 <= s.length <= 10^5
- s[i] is a printable ascii character
"""

from typing import List


# ["h", "a", "n", "n", "a", "H"
def reverse_string(s: List[str]) -> None:
    pass

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

    #

    #

    #

    #

    #

    # left, right = 0, len(s) - 1

    # while left < right:
    #     s[left], s[right] = s[right], s[left]
    #     left += 1
    #     right -= 1


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
