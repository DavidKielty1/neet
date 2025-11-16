"""
LeetCode 242: Valid Anagram
Difficulty: Easy
Pattern: Arrays & Hashing

Problem:
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false

Constraints:
- 1 <= s.length, t.length <= 5 * 10^4
- s and t consist of lowercase English letters

Time Complexity: O(n)
Space Complexity: O(1) - max 26 characters
"""

from collections import Counter


class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        """
        Approach: Use hash map to count character frequencies

        Strategy:
        1. If lengths differ, cannot be anagram
        2. Count frequency of each character in both strings
        3. Compare frequency maps
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

        if len(s) != len(t):
            return False

        return Counter(s) == Counter(t)


# Alternative approach using sorting
class SolutionSorting:
    def isAnagram(self, s: str, t: str) -> bool:
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

        Time Complexity: O(n log n)
        Space Complexity: O(1) or O(n) depending on sort implementation
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

        return sorted(s) == sorted(t)


# Alternative approach using manual count
class SolutionManual:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        count = {}

        for char in s:
            count[char] = count.get(char, 0) + 1

        for char in t:
            if char not in count:
                return False
            count[char] -= 1
            if count[char] < 0:
                return False

        return True


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.isAnagram("anagram", "nagaram") == True
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.isAnagram("rat", "car") == False
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.isAnagram("listen", "silent") == True
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
