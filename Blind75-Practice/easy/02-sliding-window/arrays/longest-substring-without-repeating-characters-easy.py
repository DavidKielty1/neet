"""
Easy Version: Find First Non-Repeating Character
Difficulty: Easy
Pattern: Hash Map

Given a string s, find the first non-repeating character in it and return its index. If it doesn't exist, return -1.

Example 1:
Input: s = "leetcode"
Output: 0
Explanation: 'l' is the first non-repeating character.

Example 2:
Input: s = "loveleetcode"
Output: 2
Explanation: 'v' is the first non-repeating character.

Example 3:
Input: s = "aabb"
Output: -1
Explanation: No non-repeating character exists.

Time: O(n), Space: O(1) - at most 26 characters
"""


def first_uniq_char(s: str) -> int:
    """
    Hash map approach to count character frequencies
    Time: O(n), Space: O(1)
    """
    char_count = {}

    for ch in s:
        char_count[ch] = char_count.get(ch, 0) + 1

    for i, ch in enumerate(s):
        if char_count[ch] == 1:
            return i

    return -1


# Test cases
if __name__ == "__main__":
    # Test 1
    s1 = "leetcode"
    print(f"First Unique Char: {first_uniq_char(s1)}")  # 0

    # Test 2
    s2 = "loveleetcode"
    print(f"First Unique Char: {first_uniq_char(s2)}")  # 2

    # Test 3
    s3 = "aabb"
    print(f"First Unique Char: {first_uniq_char(s3)}")  # -1
