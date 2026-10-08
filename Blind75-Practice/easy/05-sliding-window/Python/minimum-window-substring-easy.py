"""
438. Find All Anagrams in a String
Difficulty: Medium
Pattern: Sliding Window

Problem:
Given two strings s and p, return an array of all the start indices of p's
anagrams in s. You may return the answer in any order. An anagram is a word
formed by rearranging the letters of another, using all the original letters
exactly once.

Example 1:
Input: s = "cbaebabacd", p = "abc"
Output: [0,6]

Example 2:
Input: s = "abab", p = "ab"
Output: [0,1,2]

Constraints:
- 1 <= s.length, p.length <= 3 * 10^4
- s and p consist of lowercase English letters
"""

from typing import List
from typing import Dict


# "cbaebabacd", p = "abc"
def find_anagrams(s: str, p: str) -> List[int]:
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

    # if len(p) > len(s):
    #     return []

    # # Create target frequency map
    # target_count = {}
    # for char in p:
    #     target_count[char] = target_count.get(char, 0) + 1

    # window_count = {}
    # result = []
    # left = 0

    # for right, char in enumerate(s):
    #     window_count[char] = window_count.get(char, 0) + 1

    #     # If window is too big, shrink it
    #     if right - left + 1 > len(p):
    #         left_char = s[left]
    #         window_count[left_char] -= 1
    #         if window_count[left_char] == 0:
    #             del window_count[left_char]
    #         left += 1

    #     # Check if current window is an anagram
    #     if window_count == target_count:
    #         result.append(left)

    # return result


# Test cases
if __name__ == "__main__":
    # Test 1
    s1, p1 = "cbaebabacd", "abc"
    print(f"Find Anagrams: {find_anagrams(s1, p1)}")  # [0,6]

    # Test 2
    s2, p2 = "abab", "ab"
    print(f"Find Anagrams: {find_anagrams(s2, p2)}")  # [0,1,2]
