"""
LeetCode 290: Word Pattern
Difficulty: Easy
Pattern: Arrays & Hashing

Problem:
Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter
in pattern and a non-empty word in s.

Example 1:
Input: pattern = "abba", s = "dog cat cat dog"
Output: true

Example 2:
Input: pattern = "abba", s = "dog cat cat fish"
Output: false

Example 3:
Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false

Constraints:
- 1 <= pattern.length <= 300
- pattern contains only lower-case English letters
- 1 <= s.length <= 3000
- s contains only lowercase English letters and spaces ' '
- s does not contain any leading or trailing spaces
- All the words in s are separated by a single space

Time Complexity: O(n) where n is the length of words
Space Complexity: O(n)
"""


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        """
        Approach: Two hash maps for bijection

        Strategy:
        1. Split s into words
        2. Check if pattern length matches words length
        3. Create two mappings: pattern->word and word->pattern
        4. Ensure bijection is maintained
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

        words = s.split()

        if len(pattern) != len(words):
            return False

        char_to_word = {}
        word_to_char = {}

        for char, word in zip(pattern, words):
            if char in char_to_word:
                if char_to_word[char] != word:
                    return False
            else:
                char_to_word[char] = word

            if word in word_to_char:
                if word_to_char[word] != char:
                    return False
            else:
                word_to_char[word] = char

        return True


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.wordPattern("abba", "dog cat cat dog") == True
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.wordPattern("abba", "dog cat cat fish") == False
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.wordPattern("aaaa", "dog cat cat dog") == False
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
