"""
LeetCode 819: Most Common Word
Difficulty: Easy
Pattern: Arrays & Hashing

Problem:
Given a string paragraph and a string array of the banned words banned, return the
most frequent word that is not banned. It is guaranteed there is at least one word
that is not banned, and that the answer is unique.

The words in paragraph are case-insensitive and the answer should be returned in lowercase.

Example 1:
Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", banned = ["hit"]
Output: "ball"
Explanation:
"hit" occurs 3 times, but it is a banned word.
"ball" occurs twice (and no other word does), so it is the most frequent non-banned word.

Example 2:
Input: paragraph = "a.", banned = []
Output: "a"

Constraints:
- 1 <= paragraph.length <= 1000
- paragraph consists of English letters, space ' ', or one of the symbols: "!?',;."
- 0 <= banned.length <= 100
- 1 <= banned[i].length <= 10
- banned[i] consists of only lowercase English letters

Time Complexity: O(n)
Space Complexity: O(n)
"""

from typing import List
from collections import Counter
import re


class Solution:
    def mostCommonWord(self, paragraph: str, banned: List[str]) -> str:
        """
        Approach: Count words and filter banned

        Strategy:
        1. Convert to lowercase and extract words
        2. Count frequency of each word
        3. Find most frequent non-banned word
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

        # Extract words (only letters)
        words = re.findall(r"\w+", paragraph.lower())

        # Create set of banned words
        banned_set = set(banned)

        # Count words
        word_count = Counter(words)

        # Find most common non-banned word
        for word, count in word_count.most_common():
            if word not in banned_set:
                return word

        return ""


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert (
        solution.mostCommonWord(
            "Bob hit a ball, the hit BALL flew far after it was hit.", ["hit"]
        )
        == "ball"
    )
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.mostCommonWord("a.", []) == "a"
    print("✓ Test case 2 passed")

    print("\nAll test cases passed!")
