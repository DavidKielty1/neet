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


def min_window(s: str, t: str) -> str:
    """
    Sliding window with hash map for character counts
    Time: O(|s| + |t|), Space: O(|s| + |t|)
    """

    t_count = {}

    for ch in t:
        t_count[ch] = t_count.get(ch, 0) + 1

    window_count = {}
    left = 0
    min_len = float("inf")
    min_start = 0
    required = len(t_count)
    formed = 0

    for right, right_ch in enumerate(s):
        window_count[right_ch] = window_count.get(right_ch, 0) + 1

        if right_ch in t_count and window_count[right_ch] == t_count[right_ch]:
            formed += 1

        while left <= right and required == formed:
            curr_len = right - left + 1
            if curr_len < min_len:
                min_len = curr_len
                min_start = left

            left_ch = s[left]
            window_count[left_ch] -= 1
            if left_ch in t_count and window_count[left_ch] < t_count[left_ch]:
                formed -= 1

            left += 1

    return s[min_start : min_start + min_len] if min_len != float("inf") else ""

    # target_count = {}
    # for char in t:
    #     target_count[char] = target_count.get(char, 0) + 1

    # window_count = {}
    # left = 0
    # min_len = float("inf")
    # min_start = 0
    # required = len(target_count)
    # formed = 0

    # for right, char in enumerate(s):
    #     window_count[char] = window_count.get(char, 0) + 1

    #     if char in target_count and window_count[char] == target_count[char]:
    #         formed += 1

    #     while left <= right and formed == required:
    #         if right - left + 1 < min_len:
    #             min_len = right - left + 1
    #             min_start = left

    #         left_char = s[left]
    #         window_count[left_char] -= 1
    #         if (
    #             left_char in target_count
    #             and window_count[left_char] < target_count[left_char]
    #         ):
    #             formed -= 1
    #         left += 1

    # return s[min_start : min_start + min_len] if min_len != float("inf") else ""


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
