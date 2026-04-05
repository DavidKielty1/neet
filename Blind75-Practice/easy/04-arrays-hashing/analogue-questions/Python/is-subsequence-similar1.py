"""
LeetCode 792: Number of Matching Subsequences
Difficulty: Medium (simplified to Easy)
Pattern: Arrays & Hashing

Problem:
Given a string s and an array of strings words, return the number of words[i] that
is a subsequence of s.

A subsequence of a string is a new string generated from the original string with
some characters (can be none) deleted without changing the relative order of the
remaining characters.

Example 1:
Input: s = "abcde", words = ["a","bb","acd","ace"]
Output: 3
Explanation: There are three strings in words that are a subsequence of s: "a", "acd", "ace".

Example 2:
Input: s = "dsahjpjauf", words = ["ahjpjau","ja","ahbwzgqnuk","tnmlanowax"]
Output: 2

Constraints:
- 1 <= s.length <= 5 * 10^4
- 1 <= words.length <= 5000
- 1 <= words[i].length <= 50
- s and words[i] consist of only lowercase English letters

Time Complexity: O(n * m) where n = words length, m = s length
Space Complexity: O(1)
"""

from typing import List


class Solution:
    def numMatchingSubseq(self, s: str, words: List[str]) -> int:
        """
        Approach: Check each word as subsequence

        Strategy:
        1. For each word, check if it's a subsequence of s
        2. Use two pointers approach for each check
        3. Count matching words
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

        def is_subsequence(word: str) -> bool:
            w_idx = 0
            for char in s:
                if w_idx < len(word) and char == word[w_idx]:
                    w_idx += 1
            return w_idx == len(word)

        return sum(is_subsequence(word) for word in words)


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.numMatchingSubseq("abcde", ["a", "bb", "acd", "ace"]) == 3
    print("✓ Test case 1 passed")

    # Test case 2
    assert (
        solution.numMatchingSubseq(
            "dsahjpjauf", ["ahjpjau", "ja", "ahbwzgqnuk", "tnmlanowax"]
        )
        == 2
    )
    print("✓ Test case 2 passed")

    print("\nAll test cases passed!")
