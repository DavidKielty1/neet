"""
Medium Version: Longest Substring with At Most Two Distinct Characters
Difficulty: Medium
Pattern: Sliding Window

Given a string s, return the length of the longest substring that contains at most two distinct characters.

Example 1:
Input: s = "eceba"
Output: 3
Explanation: The substring is "ece" with length 3.

Example 2:
Input: s = "ccaabbb"
Output: 5
Explanation: The substring is "aabbb" with length 5.

Time: O(n), Space: O(1) - at most 2 characters in map
"""

from typing import Dict


def length_of_longest_substring_two_distinct(s: str) -> int:
    """
    Sliding window with hash map for character counts
    Time: O(n), Space: O(1)
    """

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

    # char_count = {}
    # max_length = 0
    # left = 0

    # for right, right_char in enumerate(s):
    #     char_count[right_char] = char_count.get(right_char, 0) + 1

    #     while len(char_count) > 2:
    #         left_char = s[left]
    #         char_count[left_char] -= 1
    #         if char_count[left_char] == 0:
    #             del char_count[left_char]
    #         left += 1

    #     max_length = max(max_length, right - left)

    # return max_length


# def length_of_longest_substring_two_distinct(s: str) -> int:
#     """
#     Sliding window with hash map for character counts
#     Time: O(n), Space: O(1)
#     """
#     if len(s) < 2:
#         return len(s)

#     char_count = {}
#     left = 0
#     max_length = 0

#     for right, char in enumerate(s):
#         char_count[char] = char_count.get(char, 0) + 1

#         while len(char_count) > 2:
#             left_char = s[left]
#             char_count[left_char] -= 1
#             if char_count[left_char] == 0:
#                 del char_count[left_char]
#             left += 1

#         max_length = max(max_length, right - left + 1)

#     return max_length


# Test cases
if __name__ == "__main__":
    # Test 1
    s1 = "eceba"
    print(f"Longest Two Distinct: {length_of_longest_substring_two_distinct(s1)}")  # 3

    # Test 2
    s2 = "ccaabbb"
    print(f"Longest Two Distinct: {length_of_longest_substring_two_distinct(s2)}")  # 5
