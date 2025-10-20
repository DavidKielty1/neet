"""
Easy Version: Valid Anagram
Difficulty: Easy
Pattern: Hash Map

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false

Time: O(n), Space: O(1) - at most 26 characters
"""

from typing import List
from collections import Counter


def is_anagram(s: str, t: str) -> bool:
    """
    Hash map approach to count character frequencies
    Time: O(n), Space: O(1)
    """
    # TODO: Implement hash map solution
    pass


# Test cases
if __name__ == "__main__":
    # Test 1
    s1, t1 = "anagram", "nagaram"
    print(f"Is Anagram: {is_anagram(s1, t1)}")  # True

    # Test 2
    s2, t2 = "rat", "car"
    print(f"Is Anagram: {is_anagram(s2, t2)}")  # False
