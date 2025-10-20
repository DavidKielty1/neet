"""
49. Group Anagrams - https://leetcode.com/problems/group-anagrams/
Difficulty: Medium
Pattern: Hash Map

Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Example 2:
Input: strs = [""]
Output: [[""]]

Example 3:
Input: strs = ["a"]
Output: [["a"]]

Time: O(n * m * log(m)), Space: O(n * m)
"""

from typing import List
from collections import defaultdict


def group_anagrams(strs: List[str]) -> List[List[str]]:
    """
    Hash map with sorted string as key
    Time: O(n * m * log(m)), Space: O(n * m)
    """
    # TODO: Implement hash map solution
    pass


# Test cases
if __name__ == "__main__":
    # Test 1
    strs1 = ["eat", "tea", "tan", "ate", "nat", "bat"]
    print(f"Group Anagrams: {group_anagrams(strs1)}")

    # Test 2
    strs2 = [""]
    print(f"Group Anagrams: {group_anagrams(strs2)}")

    # Test 3
    strs3 = ["a"]
    print(f"Group Anagrams: {group_anagrams(strs3)}")
