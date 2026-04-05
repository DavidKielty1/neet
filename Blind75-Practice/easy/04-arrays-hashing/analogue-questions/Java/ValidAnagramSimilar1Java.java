/*
 * Ported from: 04-arrays-hashing/analogue-questions/Python/valid-anagram-similar1.py
 * --- Original description ---
Similar Problem 1: Find All Anagrams in String
Difficulty: Easy
Pattern: Hash Map / Sliding Window

Problem:
Given two strings s and p, return an array of all the start indices of p's anagrams in s.

Example 1:
Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation: The substring "cba" at index 0 is an anagram of "abc".
The substring "bac" at index 6 is an anagram of "abc".

Example 2:
Input: s = "abab", p = "ab"
Output: [0,1,2]

Constraints:
- 1 <= s.length, p.length <= 3 * 10^4
- s and p consist of lowercase English letters
 */

import java.util.*;
import java.util.function.*;


public class ValidAnagramSimilar1Java {



    static class Solution {
        public List<Integer> findAnagrams(String s, String p) {
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

            // if len(p) > len(s):
            // return []
            // result = []
            // p_count = Counter(p)
            // window_count = Counter(s[:len(p)])
            // if window_count == p_count:
            // result.append(0)
            // for i in range(len(p), len(s)):
            // window_count[s[i]] += 1
            // old_char = s[i - len(p)]
            // window_count[old_char] -= 1
            // if window_count[old_char] == 0:
            // del window_count[old_char]
            // if window_count == p_count:
            // result.append(i - len(p) + 1)
            // return result

            throw new UnsupportedOperationException("Implement findAnagrams");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert java.util.Objects.equals(sol.findAnagrams("cbaebabacd", "abc"), java.util.List.of(0, 6));
        System.out.println("✓ Test case 1 passed");
        assert java.util.Objects.equals(sol.findAnagrams("abab", "ab"), java.util.List.of(0, 1, 2));
        System.out.println("✓ Test case 2 passed");
        assert java.util.Objects.equals(sol.findAnagrams("a", "a"), java.util.List.of(0));
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
