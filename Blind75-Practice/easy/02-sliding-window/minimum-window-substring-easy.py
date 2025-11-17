"""
Easy Version: Find All Anagrams in a String
Difficulty: Medium
Pattern: Sliding Window

Given two strings s and p, return an array of all the start indices of p's anagrams in s.

Example 1:
Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation: The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".

Example 2:
Input: s = "abab", p = "ab"
Output: [0,1,2]
Explanation: The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".

Time: O(n), Space: O(1) - at most 26 characters
"""

from typing import List


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
