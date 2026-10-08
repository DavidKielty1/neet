"""
1768. Merge Strings Alternately
Difficulty: Easy
Pattern: Two Pointers

Problem:
You are given two strings word1 and word2. Merge the strings by adding
letters in alternating order, starting with word1. If a string is longer
than the other, append the additional letters onto the end of the merged
string. Return the merged string.

Example 1:
Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"

Example 2:
Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"

Example 3:
Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"

Constraints:
- 1 <= word1.length, word2.length <= 100
- word1 and word2 consist of lowercase English letters
"""

from typing import List


class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        i, j = 0, 0
        out: List[str] = []
        while i < len(word1) and j < len(word2):
            out.append(word1[i])
            out.append(word2[j])
            i += 1
            j += 1
        if i < len(word1):
            out.append(word1[i:])
        if j < len(word2):
            out.append(word2[j:])
        return "".join(out)


if __name__ == "__main__":
    s = Solution()
    assert s.mergeAlternately("abc", "pqr") == "apbqcr"
    assert s.mergeAlternately("ab", "pqrs") == "apbqrs"
    assert s.mergeAlternately("abcd", "pq") == "apbqcd"
    print("All test cases passed!")
