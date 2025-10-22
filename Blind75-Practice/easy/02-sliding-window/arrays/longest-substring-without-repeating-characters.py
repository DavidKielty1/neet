"""
3. Longest Substring Without Repeating Characters - https://leetcode.com/problems/longest-substring-without-repeating-characters/
Difficulty: Medium
Pattern: Sliding Window

Given a string s, find the length of the longest substring without repeating characters.

Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.

Time: O(n), Space: O(min(m,n)) where m is the size of the charset
"""


def length_of_longest_substring(s: str) -> int:
    """
    Sliding window approach with hash set
    Time: O(n), Space: O(min(m,n))
    """

    char_count = {}
    max_length = 0
    left = 0

    for right, char in enumerate(s):
        char_count[char] = char_count.get(char, 0) + 1

        while char_count[char] > 1:
            left_char = s[left]
            char_count[left_char] -= 1
            if char_count[left_char] == 0:
                del char_count[left_char]
            left += 1

        max_length = max(max_length, right - left + 1)

    return max_length


# Test cases
if __name__ == "__main__":
    # Test 1
    s1 = "abcabcbb"
    print(f"Longest Substring: {length_of_longest_substring(s1)}")  # 3

    # Test 2
    s2 = "bbbbb"
    print(f"Longest Substring: {length_of_longest_substring(s2)}")  # 1

    # Test 3
    s3 = "pwwkew"
    print(f"Longest Substring: {length_of_longest_substring(s3)}")  # 3
