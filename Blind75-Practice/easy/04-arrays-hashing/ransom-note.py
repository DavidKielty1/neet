"""
LeetCode 383: Ransom Note
Difficulty: Easy
Pattern: Arrays & Hashing

Problem:
Given two strings ransomNote and magazine, return true if ransomNote can be constructed
by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

Example 1:
Input: ransomNote = "a", magazine = "b"
Output: false

Example 2:
Input: ransomNote = "aa", magazine = "ab"
Output: false

Example 3:
Input: ransomNote = "aa", magazine = "aab"
Output: true

Constraints:
- 1 <= ransomNote.length, magazine.length <= 10^5
- ransomNote and magazine consist of lowercase English letters

Time Complexity: O(m + n) where m = ransomNote length, n = magazine length
Space Complexity: O(1) - at most 26 lowercase letters
"""

from collections import Counter


class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        """
        Approach: Hash map counting

        Strategy:
        1. Count frequency of each letter in magazine
        2. For each letter in ransomNote, check if available
        3. Decrement count in magazine for each used letter
        4. If any letter not available, return false
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

        # Count letters in magazine
        mag_count = Counter(magazine)

        # Check if ransomNote can be constructed
        for char in ransomNote:
            if mag_count[char] <= 0:
                return False
            mag_count[char] -= 1

        return True


# Alternative approach using Counter directly
class SolutionCounter:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        ransom_count = Counter(ransomNote)
        mag_count = Counter(magazine)

        # Check if all characters in ransom are available in magazine
        for char, count in ransom_count.items():
            if mag_count[char] < count:
                return False
        return True


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.canConstruct("a", "b") == False
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.canConstruct("aa", "ab") == False
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.canConstruct("aa", "aab") == True
    print("✓ Test case 3 passed")

    # Test case 4
    assert solution.canConstruct("abc", "aabbcc") == True
    print("✓ Test case 4 passed")

    print("\nAll test cases passed!")
