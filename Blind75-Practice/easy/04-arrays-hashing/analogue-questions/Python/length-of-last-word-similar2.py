"""
LeetCode 884: Uncommon Words from Two Sentences
Difficulty: Easy
Pattern: Arrays & Hashing

Problem:
A sentence is a string of single-space separated words where each word consists only
of lowercase letters.

A word is uncommon if it appears exactly once in one of the sentences, and does not
appear in the other sentence.

Given two sentences s1 and s2, return a list of all the uncommon words. You may return
the answer in any order.

Example 1:
Input: s1 = "this apple is sweet", s2 = "this apple is sour"
Output: ["sweet","sour"]

Example 2:
Input: s1 = "apple apple", s2 = "banana"
Output: ["banana"]

Constraints:
- 1 <= s1.length, s2.length <= 200
- s1 and s2 consist of lowercase English letters and spaces
- s1 and s2 do not have leading or trailing spaces
- All the words in s1 and s2 are separated by a single space

Time Complexity: O(n + m)
Space Complexity: O(n + m)
"""

from typing import List
from collections import Counter


class Solution:
    def uncommonFromSentences(self, s1: str, s2: str) -> List[str]:
        """
        Approach: Count all words from both sentences

        Strategy:
        1. Combine both sentences
        2. Count frequency of each word
        3. Return words that appear exactly once
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

        words = s1.split() + s2.split()
        word_count = Counter(words)

        return [word for word, count in word_count.items() if count == 1]


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    result1 = solution.uncommonFromSentences(
        "this apple is sweet", "this apple is sour"
    )
    assert set(result1) == set(["sweet", "sour"])
    print("✓ Test case 1 passed")

    # Test case 2
    result2 = solution.uncommonFromSentences("apple apple", "banana")
    assert result2 == ["banana"]
    print("✓ Test case 2 passed")

    print("\nAll test cases passed!")
