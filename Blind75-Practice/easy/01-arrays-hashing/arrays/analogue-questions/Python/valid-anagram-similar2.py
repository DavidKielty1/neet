"""
Similar Problem 2: Group Anagrams (Easy Version)
Difficulty: Easy
Pattern: Hash Map

Problem:
Given an array of strings strs, group the anagrams together.
You can return the answer in any order.

Example 1:
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Example 2:
Input: strs = [""]
Output: [[""]]

Example 3:
Input: strs = ["a"]
Output: [["a"]]

Constraints:
- 1 <= strs.length <= 10^4
- 0 <= strs[i].length <= 100
- strs[i] consists of lowercase English letters
"""

from typing import List
from collections import defaultdict


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        """
        Approach: Hash map with sorted string as key

        Strategy:
        1. Sort each string to get canonical form
        2. Use sorted string as key in hash map
        3. Group strings with same sorted form
        4. Return all groups
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

        anagram_groups = defaultdict(list)

        for s in strs:
            # Sort string to get canonical form
            key = "".join(sorted(s))
            anagram_groups[key].append(s)

        return list(anagram_groups.values())


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    result1 = solution.groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"])
    # Sort for comparison
    result1_sorted = [sorted(group) for group in result1]
    expected1_sorted = [
        sorted(group) for group in [["bat"], ["nat", "tan"], ["ate", "eat", "tea"]]
    ]
    assert sorted(result1_sorted) == sorted(expected1_sorted)
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.groupAnagrams([""]) == [[""]]
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.groupAnagrams(["a"]) == [["a"]]
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
