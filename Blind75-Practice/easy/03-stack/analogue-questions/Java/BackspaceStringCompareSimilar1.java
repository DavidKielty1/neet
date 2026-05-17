/*
 * Ported from: 07-stack/analogue-questions/Python/backspace-string-compare-similar1.py
 * --- Original description ---
LeetCode 1047: Remove All Adjacent Duplicates In String
Difficulty: Easy
Pattern: Stack

Problem:
You are given a string s consisting of lowercase English letters. A duplicate removal
consists of choosing two adjacent and equal letters and removing them.

We repeatedly make duplicate removals on s until we no longer can.

Return the final string after all such duplicate removals have been made. It can be
proven that the answer is unique.

Example 1:
Input: s = "abbaca"
Output: "ca"
Explanation:
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal,
and this is the only possible move. The result of this move is that the string is "aaca",
of which only "aa" is possible, so the final string is "ca".

Example 2:
Input: s = "azxxzy"
Output: "ay"

Constraints:
- 1 <= s.length <= 10^5
- s consists of lowercase English letters.

Time Complexity: O(n)
Space Complexity: O(n)
 */

import java.util.*;
import java.util.function.*;


public class BackspaceStringCompareSimilar1 {



    static class Solution {
        public String removeDuplicates(String s) {
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

            // stack = []
            // for char in s:
            // if stack and stack[-1] == char:
            // stack.pop()
            // else:
            // stack.append(char)
            // return ''.join(stack)

            throw new UnsupportedOperationException("Implement removeDuplicates");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.removeDuplicates("abbaca") == "ca");
        System.out.println("✓ Test case 1 passed");
        assert (sol.removeDuplicates("azxxzy") == "ay");
        System.out.println("✓ Test case 2 passed");
        assert (sol.removeDuplicates("aaa") == "a");
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
