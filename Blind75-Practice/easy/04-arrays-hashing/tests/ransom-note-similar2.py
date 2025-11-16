"""
LeetCode 1832: Check if the Sentence Is Pangram
Difficulty: Easy
Pattern: Arrays & Hashing

Problem:
A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if
sentence is a pangram, or false otherwise.

Example 1:
Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.

Example 2:
Input: sentence = "leetcode"
Output: false

Constraints:
- 1 <= sentence.length <= 1000
- sentence consists of lowercase English letters

Time Complexity: O(n)
Space Complexity: O(1) - at most 26 letters
"""


class Solution:
    def checkIfPangram(self, sentence: str) -> bool:
        """
        Approach: Hash set to track unique letters

        Strategy:
        1. Add all characters from sentence to a set
        2. Check if set size is 26 (all letters)
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

        return len(set(sentence)) == 26


# Alternative using all()
class SolutionAll:
    def checkIfPangram(self, sentence: str) -> bool:
        return all(chr(i) in sentence for i in range(ord("a"), ord("z") + 1))


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.checkIfPangram("thequickbrownfoxjumpsoverthelazydog") == True
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.checkIfPangram("leetcode") == False
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.checkIfPangram("abcdefghijklmnopqrstuvwxyz") == True
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
