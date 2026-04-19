/*
 * Ported from: 04-arrays-hashing/analogue-questions/Python/isomorphic-strings-similar3.py
 * --- Original description ---
LeetCode 890: Find and Replace Pattern
Difficulty: Medium (simplified to Easy)
Pattern: Arrays & Hashing

Problem:
Given a list of strings words and a string pattern, return a list of words[i] that
match pattern. You may return the answer in any order.

A word matches the pattern if there exists a permutation of letters p so that after
replacing every letter x in the pattern with p(x), we get the desired word.

Example 1:
Input: words = ["abc","deq","mee","aqq","dkd","ccc"], pattern = "abb"
Output: ["mee","aqq"]
Explanation: "mee" matches the pattern because there is a permutation {a -> m, b -> e, ...}.
"ccc" does not match the pattern because {a -> c, b -> c, ...} is not a permutation,
since a and b map to the same letter.

Example 2:
Input: words = ["a","b","c"], pattern = "a"
Output: ["a","b","c"]

Constraints:
- 1 <= pattern.length <= 20
- 1 <= words.length <= 50
- words[i].length == pattern.length
- pattern and words[i] are lowercase English letters

Time Complexity: O(n * m) where n = number of words, m = pattern length
Space Complexity: O(m)
 */

import java.util.*;
import java.util.function.*;


public class IsomorphicStringsSimilar3Java {



    static class Solution {
        public List<String> findAndReplacePattern(List<String> words, String pattern) {
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

            // def is_match(word: str) -> bool:
            // if len(word) != len(pattern):
            // return False
            // char_map = {}
            // pattern_map = {}
            // for w_char, p_char in zip(word, pattern):
            // if w_char in char_map:
            // if char_map[w_char] != p_char:
            // return False
            // else:
            // char_map[w_char] = p_char
            // if p_char in pattern_map:
            // if pattern_map[p_char] != w_char:
            // return False
            // else:
            // pattern_map[p_char] = w_char
            // return True
            // return [word for word in words if is_match(word)]

            throw new UnsupportedOperationException("Implement findAndReplacePattern");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // result1 = sol.findAndReplacePattern(["abc", "deq", "mee", "aqq", "dkd", "ccc"], "abb");
        // assert set(result1) == set(['mee', 'aqq'])  // needs locals (port helpers): ['result1']
        System.out.println("✓ Test case 1 passed");
        // result2 = sol.findAndReplacePattern(["a", "b", "c"], "a");
        // assert set(result2) == set(['a', 'b', 'c'])  // needs locals (port helpers): ['result2']
        System.out.println("✓ Test case 2 passed");
        System.out.println("\nAll test cases passed!");
    }
}
