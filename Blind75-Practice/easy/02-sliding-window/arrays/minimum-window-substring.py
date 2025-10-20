"""
76. Minimum Window Substring - https://leetcode.com/problems/minimum-window-substring/
Difficulty: Hard
Pattern: Sliding Window

Given two strings s and t, return the minimum window substring of s such that every character in t (including duplicates) is included in the window. If there is no such window, return the empty string "".

Example 1:
Input: s = "ADOBECODEBANC", t = "ABC"
Output: "BANC"
Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.

Example 2:
Input: s = "a", t = "a"
Output: "a"

Example 3:
Input: s = "a", t = "aa"
Output: ""
Explanation: Both 'a's from t must be included in the window.

Time: O(|s| + |t|), Space: O(|s| + |t|)
"""

from typing import List


def min_window(s: str, t: str) -> str:
    """
    Sliding window with hash map for character counts
    Time: O(|s| + |t|), Space: O(|s| + |t|)
    """
    # TODO: Implement sliding window solution
    pass


# Test cases
if __name__ == "__main__":
    # Test 1
    s1, t1 = "ADOBECODEBANC", "ABC"
    print(f"Min Window: '{min_window(s1, t1)}'")  # "BANC"

    # Test 2
    s2, t2 = "a", "a"
    print(f"Min Window: '{min_window(s2, t2)}'")  # "a"

    # Test 3
    s3, t3 = "a", "aa"
    print(f"Min Window: '{min_window(s3, t3)}'")  # ""
