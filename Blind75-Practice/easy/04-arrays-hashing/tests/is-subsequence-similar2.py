"""
LeetCode 524: Longest Word in Dictionary through Deleting
Difficulty: Medium (simplified to Easy)
Pattern: Arrays & Hashing / Two Pointers

Problem:
Given a string s and a string array dictionary, return the longest string in the
dictionary that can be formed by deleting some of the given string characters.
If there is more than one possible result, return the longest word with the smallest
lexicographical order. If there is no possible result, return the empty string.

Example 1:
Input: s = "abpcplea", dictionary = ["ale","apple","monkey","plea"]
Output: "apple"

Example 2:
Input: s = "abpcplea", dictionary = ["a","b","c"]
Output: "a"

Constraints:
- 1 <= s.length <= 1000
- 1 <= dictionary.length <= 1000
- 1 <= dictionary[i].length <= 1000
- s and dictionary[i] consist of lowercase English letters

Time Complexity: O(n * m) where n = dictionary length, m = s length
Space Complexity: O(1)
"""

from typing import List


class Solution:
    def findLongestWord(self, s: str, dictionary: List[str]) -> str:
        """
        Approach: Check each word as subsequence

        Strategy:
        1. For each word in dictionary, check if subsequence of s
        2. Track longest valid word
        3. If tie in length, choose lexicographically smaller
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

        result = ""
        for word in dictionary:
            if is_subsequence(word):
                if len(word) > len(result) or (
                    len(word) == len(result) and word < result
                ):
                    result = word

        return result


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert (
        solution.findLongestWord("abpcplea", ["ale", "apple", "monkey", "plea"])
        == "apple"
    )
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.findLongestWord("abpcplea", ["a", "b", "c"]) == "a"
    print("✓ Test case 2 passed")

    print("\nAll test cases passed!")
