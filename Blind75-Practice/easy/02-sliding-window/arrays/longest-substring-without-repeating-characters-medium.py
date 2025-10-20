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

from typing import List
from collections import defaultdict


def length_of_longest_substring_two_distinct(s: str) -> int:
    """
    Sliding window with hash map for character counts
    Time: O(n), Space: O(1)
    """
    # TODO: Implement sliding window solution
    pass


# Test cases
if __name__ == "__main__":
    # Test 1
    s1 = "eceba"
    print(f"Longest Two Distinct: {length_of_longest_substring_two_distinct(s1)}")  # 3

    # Test 2
    s2 = "ccaabbb"
    print(f"Longest Two Distinct: {length_of_longest_substring_two_distinct(s2)}")  # 5
