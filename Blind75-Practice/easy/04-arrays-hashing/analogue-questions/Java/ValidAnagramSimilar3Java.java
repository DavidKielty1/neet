/*
 * Ported from: 04-arrays-hashing/analogue-questions/Python/valid-anagram-similar3.py
 * --- Original description ---
Similar Problem 3: Isomorphic Strings
Difficulty: Easy
Pattern: Hash Map (Two-way Mapping)

Problem:
Given two strings s and t, determine if they are isomorphic.
Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while
preserving the order of characters. No two characters may map to the same character,
but a character may map to itself.

Example 1:
Input: s = "egg", t = "add"
Output: true

Example 2:
Input: s = "foo", t = "bar"
Output: false

Example 3:
Input: s = "paper", t = "title"
Output: true

Constraints:
- 1 <= s.length <= 5 * 10^4
- t.length == s.length
- s and t consist of any valid ascii character
 */

import java.util.*;
import java.util.function.*;


public class ValidAnagramSimilar3Java {



    static class Solution {
        public boolean isIsomorphic(String s, String t) {
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

            // if len(s) != len(t):
            // return False
            // s_to_t = {}
            // t_to_s = {}
            // for char_s, char_t in zip(s, t):
            // if char_s in s_to_t:
            // if s_to_t[char_s] != char_t:
            // return False
            // else:
            // s_to_t[char_s] = char_t
            // if char_t in t_to_s:
            // if t_to_s[char_t] != char_s:
            // return False
            // else:
            // t_to_s[char_t] = char_s
            // return True

            throw new UnsupportedOperationException("Implement isIsomorphic");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.isIsomorphic("egg", "add") == true);
        System.out.println("✓ Test case 1 passed");
        assert (sol.isIsomorphic("foo", "bar") == false);
        System.out.println("✓ Test case 2 passed");
        assert (sol.isIsomorphic("paper", "title") == true);
        System.out.println("✓ Test case 3 passed");
        assert (sol.isIsomorphic("badc", "baba") == false);
        System.out.println("✓ Test case 4 passed");
        System.out.println("\nAll test cases passed!");
    }
}
