/*
 * Ported from: 04-arrays-hashing/analogue-questions/Python/valid-anagram-similar2.py
 * --- Original description ---
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
 */

import java.util.*;
import java.util.function.*;


public class ValidAnagramSimilar2Java {



    static class Solution {
        public List<List<String>> groupAnagrams(List<String> strs) {
            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            // anagram_groups = defaultdict(list)
            // for s in strs:
            // key = ''.join(sorted(s))
            // anagram_groups[key].append(s)
            // return list(anagram_groups.values())

            throw new UnsupportedOperationException("Implement groupAnagrams");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // result1 = sol.groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]);
        // result1_sorted = [sorted(group) for group in result1];
        // expected1_sorted = [sorted(group) for group in [["bat"], ["nat", "tan"], ["ate", "eat", "tea"]]];
        // assert sorted(result1_sorted) == sorted(expected1_sorted)  // needs locals (port helpers): ['expected1_sorted', 'result1_sorted']
        System.out.println("✓ Test case 1 passed");
        assert java.util.Objects.equals(sol.groupAnagrams(java.util.List.of("")), java.util.List.of(java.util.List.of("")));
        System.out.println("✓ Test case 2 passed");
        assert java.util.Objects.equals(sol.groupAnagrams(java.util.List.of("a")), java.util.List.of(java.util.List.of("a")));
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
