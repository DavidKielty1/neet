"""
LeetCode 1408: String Matching in an Array
Difficulty: Easy
Pattern: Arrays & Hashing / String

Problem:
Given an array of string words, return all strings in words that is a substring of
another word. You can return the answer in any order.

A substring is a contiguous sequence of characters within a string.

Example 1:
Input: words = ["mass","as","hero","superhero"]
Output: ["as","hero"]
Explanation: "as" is substring of "mass" and "hero" is substring of "superhero".
["hero","as"] is also a valid answer.

Example 2:
Input: words = ["leetcode","et","code"]
Output: ["et","code"]
Explanation: "et", "code" are substring of "leetcode".

Example 3:
Input: words = ["blue","green","bu"]
Output: []
Explanation: No string of words is substring of another string.

Constraints:
- 1 <= words.length <= 100
- 1 <= words[i].length <= 30
- words[i] contains only lowercase English letters
- All the strings of words are unique

Time Complexity: O(n^2 * m) where n = number of words, m = average word length
Space Complexity: O(n)
"""

from typing import List


class Solution:
    def stringMatching(self, words: List[str]) -> List[str]:
        """
        Approach: Check each word against all others

        Strategy:
        1. For each word, check if it's substring of any other word
        2. Add to result if found
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

        result = []

        for i in range(len(words)):
            for j in range(len(words)):
                if i != j and words[i] in words[j]:
                    result.append(words[i])
                    break

        return result


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    result1 = solution.stringMatching(["mass", "as", "hero", "superhero"])
    assert set(result1) == set(["as", "hero"])
    print("✓ Test case 1 passed")

    # Test case 2
    result2 = solution.stringMatching(["leetcode", "et", "code"])
    assert set(result2) == set(["et", "code"])
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.stringMatching(["blue", "green", "bu"]) == []
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
