"""
LeetCode 1941: Check if All Characters Have Equal Number of Occurrences
Difficulty: Easy
Pattern: Arrays & Hashing

Problem:
Given a string s, return true if s is a good string, or false otherwise.

A string s is good if all the characters that appear in s have the same number of occurrences
(i.e., the same frequency).

Example 1:
Input: s = "abacbc"
Output: true
Explanation: The characters that appear in s are 'a', 'b', and 'c'. All characters occur 2 times in s.

Example 2:
Input: s = "aaabb"
Output: false
Explanation: The characters that appear in s are 'a' and 'b'.
'a' occurs 3 times while 'b' occurs 2 times, which is not the same number of times.

Constraints:
- 1 <= s.length <= 1000
- s consists of lowercase English letters

Time Complexity: O(n)
Space Complexity: O(1) - at most 26 letters
"""

from collections import Counter


class Solution:
    def areOccurrencesEqual(self, s: str) -> bool:
        """
        Approach: Count frequencies and check if all equal

        Strategy:
        1. Count frequency of each character
        2. Check if all frequencies are the same
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

        count = Counter(s)
        frequencies = list(count.values())
        return len(set(frequencies)) == 1


# Alternative approach
class SolutionSet:
    def areOccurrencesEqual(self, s: str) -> bool:
        count = Counter(s)
        return len(set(count.values())) == 1


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.areOccurrencesEqual("abacbc") == True
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.areOccurrencesEqual("aaabb") == False
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.areOccurrencesEqual("aabbcc") == True
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
