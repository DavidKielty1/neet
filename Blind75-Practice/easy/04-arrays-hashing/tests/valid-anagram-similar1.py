"""
Similar Problem 1: Find All Anagrams in String
Difficulty: Easy
Pattern: Hash Map / Sliding Window

Problem:
Given two strings s and p, return an array of all the start indices of p's anagrams in s.

Example 1:
Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation: The substring "cba" at index 0 is an anagram of "abc".
The substring "bac" at index 6 is an anagram of "abc".

Example 2:
Input: s = "abab", p = "ab"
Output: [0,1,2]

Constraints:
- 1 <= s.length, p.length <= 3 * 10^4
- s and p consist of lowercase English letters
"""

from typing import List
from collections import Counter


class Solution:
    def findAnagrams(self, s: str, p: str) -> List[int]:
        """
        Approach: Sliding window with character frequency

        Strategy:
        1. Get frequency map of p
        2. Slide window of size len(p) through s
        3. Compare window frequency with p frequency
        4. Record indices where they match
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

        if len(p) > len(s):
            return []

        result = []
        p_count = Counter(p)
        window_count = Counter(s[: len(p)])

        if window_count == p_count:
            result.append(0)

        # Slide window
        for i in range(len(p), len(s)):
            # Add new character
            window_count[s[i]] += 1

            # Remove old character
            old_char = s[i - len(p)]
            window_count[old_char] -= 1
            if window_count[old_char] == 0:
                del window_count[old_char]

            # Check if anagram
            if window_count == p_count:
                result.append(i - len(p) + 1)

        return result


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.findAnagrams("cbaebabacd", "abc") == [0, 6]
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.findAnagrams("abab", "ab") == [0, 1, 2]
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.findAnagrams("a", "a") == [0]
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
