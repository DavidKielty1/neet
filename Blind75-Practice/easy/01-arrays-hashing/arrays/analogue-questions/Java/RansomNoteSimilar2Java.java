/*
 * Ported from: 04-arrays-hashing/analogue-questions/Python/ransom-note-similar2.py
 * --- Original description ---
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
 */

import java.util.*;
import java.util.function.*;


public class RansomNoteSimilar2Java {



    static class Solution {
        public boolean checkIfPangram(String sentence) {
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

            // return len(set(sentence)) == 26

            throw new UnsupportedOperationException("Implement checkIfPangram");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.checkIfPangram("thequickbrownfoxjumpsoverthelazydog") == true);
        System.out.println("✓ Test case 1 passed");
        assert (sol.checkIfPangram("leetcode") == false);
        System.out.println("✓ Test case 2 passed");
        assert (sol.checkIfPangram("abcdefghijklmnopqrstuvwxyz") == true);
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
