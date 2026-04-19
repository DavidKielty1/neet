"""
LeetCode 58: Length of Last Word
Difficulty: Easy
Pattern: Arrays & Hashing / String

Problem:
Given a string s consisting of words and spaces, return the length of the last word
in the string.

A word is a maximal substring consisting of non-space characters only.

Example 1:
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.

Example 2:
Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.

Example 3:
Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.

Constraints:
- 1 <= s.length <= 10^4
- s consists of only English letters and spaces ' '
- There will be at least one word in s

Time Complexity: O(n)
Space Complexity: O(1) or O(n) depending on approach
"""


class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        """
        Approach: Strip and iterate from end

        Strategy:
        1. Strip trailing spaces
        2. Iterate from end until we hit a space
        3. Count characters
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

        # Strip trailing spaces
        s = s.rstrip()

        # Count from end until space
        length = 0
        for i in range(len(s) - 1, -1, -1):
            if s[i] == " ":
                break
            length += 1

        return length


# Alternative using split
class SolutionSplit:
    def lengthOfLastWord(self, s: str) -> int:
        words = s.split()
        return len(words[-1])


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.lengthOfLastWord("Hello World") == 5
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.lengthOfLastWord("   fly me   to   the moon  ") == 4
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.lengthOfLastWord("luffy is still joyboy") == 6
    print("✓ Test case 3 passed")

    # Test case 4
    assert solution.lengthOfLastWord("a") == 1
    print("✓ Test case 4 passed")

    print("\nAll test cases passed!")
