"""
3. Longest Substring Without Repeating Characters - https://leetcode.com/problems/longest-substring-without-repeating-characters/
Difficulty: Medium
Pattern: Sliding Window

Given a string s, find the length of the longest substring without repeating characters.

Example 1:
Input: s = "dabcabcbb"
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

    # "abcabcbb"

    # char_count = {}
    # left = 0
    # longest_substring = 0

    # for right_ch in s:
    #     char_count[right_ch] = char_count.get(right_ch, 0) + 1

    #     while char_count[right_ch] > 1:
    #         left_ch = s[left]
    #         char_count[left_ch] -= 1
    #         if char_count[left_ch] == 0:
    #             del char_count[left_ch]
    #         left += 1

    #     longest_substring = max(longest_substring, len(char_count))

    # return longest_substring


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
