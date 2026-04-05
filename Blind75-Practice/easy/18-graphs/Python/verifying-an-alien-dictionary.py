"""
LeetCode 953: Verifying an Alien Dictionary
Difficulty: Easy
Pattern: Graphs / ordering

Problem:
In an alien language alphabet order is given by string order (all letters are unique).
Given an array of words from that language, return true if and only if they are sorted
lexicographically in this alien language.

Example 1:
Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
Output: true

Example 2:
Input: words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
Output: false

Constraints:
- 1 <= words.length <= 100, 1 <= words[i].length <= 20
- order.length == 26

Time Complexity: O(total characters)
Space Complexity: O(1) for the rank map (fixed alphabet size)
"""

from typing import List


class Solution:
    def isAlienSorted(self, words: List[str], order: str) -> bool:
        """Map each letter to rank; compare each adjacent pair char by char."""

        rank = {ch: i for i, ch in enumerate(order)}
        for a, b in zip(words, words[1:]):
            if a == b:
                continue
            for i in range(min(len(a), len(b))):
                if a[i] != b[i]:
                    if rank[a[i]] > rank[b[i]]:
                        return False
                    break
            else:
                if len(a) > len(b):
                    return False
        return True


if __name__ == "__main__":
    sol = Solution()
    assert sol.isAlienSorted(["hello", "leetcode"], "hlabcdefgijkmnopqrstuvwxyz")
    assert not sol.isAlienSorted(["word", "world", "row"], "worldabcefghijkmnpqstuvxyz")
    assert sol.isAlienSorted(["apple", "app"], "abcdefghijklmnopqrstuvwxyz") is False
    print("All tests passed.")
