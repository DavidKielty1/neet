"""
LeetCode 1768: Merge Strings Alternately
Difficulty: Easy
Pattern: Two Pointers

Merge word1 and word2 by alternating letters. Append remaining letters from the longer string.

Time Complexity: O(len(word1) + len(word2))
Space Complexity: O(len(word1) + len(word2)) for the result
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
