/*
 * Ported from: 07-stack/analogue-questions/Python/valid-parentheses-similar2.py
 * --- Original description ---
Similar Problem 2: Minimum Add to Make Parentheses Valid
Difficulty: Easy
Pattern: Stack

Problem:
A parentheses string is valid if and only if:
- It is the empty string,
- It can be written as AB (A concatenated with B), where A and B are valid strings, or
- It can be written as (A), where A is a valid string.

You are given a parentheses string s. In one move, you can insert a parenthesis at any position.
Return the minimum number of moves required to make s valid.

Example 1:
Input: s = "())"
Output: 1

Example 2:
Input: s = "((("
Output: 3

Example 3:
Input: s = "()"
Output: 0

Example 4:
Input: s = "()))(("
Output: 4

Constraints:
- 1 <= s.length <= 1000
- s[i] is either '(' or ')'
 */

import java.util.*;
import java.util.function.*;


public class ValidParenthesesSimilar2 {



    static class Solution {
        public int minAddToMakeValid(String s) {
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

            // open_needed = 0
            // close_needed = 0
            // for char in s:
            // if char == '(':
            // open_needed += 1
            // elif open_needed > 0:
            // open_needed -= 1
            // else:
            // close_needed += 1
            // return open_needed + close_needed

            throw new UnsupportedOperationException("Implement minAddToMakeValid");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.minAddToMakeValid("())") == 1);
        System.out.println("✓ Test case 1 passed");
        assert (sol.minAddToMakeValid("(((") == 3);
        System.out.println("✓ Test case 2 passed");
        assert (sol.minAddToMakeValid("()") == 0);
        System.out.println("✓ Test case 3 passed");
        assert (sol.minAddToMakeValid("()))((") == 4);
        System.out.println("✓ Test case 4 passed");
        System.out.println("\nAll test cases passed!");
    }
}
