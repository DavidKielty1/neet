/*
 * Ported from: 04-arrays-hashing/analogue-questions/Python/ransom-note-similar3.py
 * --- Original description ---
LeetCode 1941: Check if All Characters Have Equal Number of Occurrences
Difficulty: Easy
Pattern: Arrays & Hashing

Problem:
Given a string s, return true if s is a good string, or false otherwise.

A string s is good if all the characters that appear in s have the same number of occurrences
(i.e., the same frequency).

Example 1:
Input: s = "abacbc"
Output: true
Explanation: The characters that appear in s are 'a', 'b', and 'c'. All characters occur 2 times in s.

Example 2:
Input: s = "aaabb"
Output: false
Explanation: The characters that appear in s are 'a' and 'b'.
'a' occurs 3 times while 'b' occurs 2 times, which is not the same number of times.

Constraints:
- 1 <= s.length <= 1000
- s consists of lowercase English letters

Time Complexity: O(n)
Space Complexity: O(1) - at most 26 letters
 */

import java.util.*;
import java.util.function.*;


public class RansomNoteSimilar3Java {



    static class Solution {
        public boolean areOccurrencesEqual(String s) {
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

            // count = Counter(s)
            // frequencies = list(count.values())
            // return len(set(frequencies)) == 1

            throw new UnsupportedOperationException("Implement areOccurrencesEqual");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.areOccurrencesEqual("abacbc") == true);
        System.out.println("✓ Test case 1 passed");
        assert (sol.areOccurrencesEqual("aaabb") == false);
        System.out.println("✓ Test case 2 passed");
        assert (sol.areOccurrencesEqual("aabbcc") == true);
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
