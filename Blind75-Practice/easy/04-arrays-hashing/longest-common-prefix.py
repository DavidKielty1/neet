"""
LeetCode 14: Longest Common Prefix
Difficulty: Easy
Pattern: Arrays & Hashing / String

Problem:
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

Constraints:
- 1 <= strs.length <= 200
- 0 <= strs[i].length <= 200
- strs[i] consists of only lowercase English letters

Time Complexity: O(n * m) where n = number of strings, m = min string length
Space Complexity: O(1)
"""

from typing import List


class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        """
        Approach: Vertical scanning

        Strategy:
        1. Compare characters at same position across all strings
        2. Stop when a mismatch is found or any string ends
        3. Build prefix character by character
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

        if not strs:
            return ""

        # Use first string as reference
        for i in range(len(strs[0])):
            char = strs[0][i]
            # Check if this character exists at position i in all strings
            for string in strs[1:]:
                if i >= len(string) or string[i] != char:
                    return strs[0][:i]

        return strs[0]


# Alternative using sorting
class SolutionSort:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if not strs:
            return ""

        # Sort so we only need to compare first and last
        strs.sort()
        first, last = strs[0], strs[-1]

        i = 0
        while i < len(first) and i < len(last) and first[i] == last[i]:
            i += 1

        return first[:i]


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.longestCommonPrefix(["flower", "flow", "flight"]) == "fl"
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.longestCommonPrefix(["dog", "racecar", "car"]) == ""
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.longestCommonPrefix(["ab", "a"]) == "a"
    print("✓ Test case 3 passed")

    # Test case 4
    assert solution.longestCommonPrefix(["", ""]) == ""
    print("✓ Test case 4 passed")

    print("\nAll test cases passed!")
