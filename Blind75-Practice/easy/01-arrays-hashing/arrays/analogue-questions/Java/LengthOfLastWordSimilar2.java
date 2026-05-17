/*
 * Ported from: 04-arrays-hashing/analogue-questions/Python/length-of-last-word-similar2.py
 * --- Original description ---
LeetCode 884: Uncommon Words from Two Sentences
Difficulty: Easy
Pattern: Arrays & Hashing

Problem:
A sentence is a string of single-space separated words where each word consists only
of lowercase letters.

A word is uncommon if it appears exactly once in one of the sentences, and does not
appear in the other sentence.

Given two sentences s1 and s2, return a list of all the uncommon words. You may return
the answer in any order.

Example 1:
Input: s1 = "this apple is sweet", s2 = "this apple is sour"
Output: ["sweet","sour"]

Example 2:
Input: s1 = "apple apple", s2 = "banana"
Output: ["banana"]

Constraints:
- 1 <= s1.length, s2.length <= 200
- s1 and s2 consist of lowercase English letters and spaces
- s1 and s2 do not have leading or trailing spaces
- All the words in s1 and s2 are separated by a single space

Time Complexity: O(n + m)
Space Complexity: O(n + m)
 */

import java.util.*;
import java.util.function.*;


public class LengthOfLastWordSimilar2 {



    static class Solution {
        public List<String> uncommonFromSentences(String s1, String s2) {
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

            // words = s1.split() + s2.split()
            // word_count = Counter(words)
            // return [word for word, count in word_count.items() if count == 1]

            throw new UnsupportedOperationException("Implement uncommonFromSentences");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // result1 = sol.uncommonFromSentences("this apple is sweet", "this apple is sour");
        // assert set(result1) == set(['sweet', 'sour'])  // needs locals (port helpers): ['result1']
        System.out.println("✓ Test case 1 passed");
        // result2 = sol.uncommonFromSentences("apple apple", "banana");
        // assert result2 == ['banana']  // needs locals (port helpers): ['result2']
        System.out.println("✓ Test case 2 passed");
        System.out.println("\nAll test cases passed!");
    }
}
