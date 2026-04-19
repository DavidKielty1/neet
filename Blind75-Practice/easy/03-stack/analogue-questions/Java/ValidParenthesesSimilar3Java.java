/*
 * Ported from: 07-stack/analogue-questions/Python/valid-parentheses-similar3.py
 * --- Original description ---
Similar Problem 3: Score of Parentheses
Difficulty: Easy
Pattern: Stack

Problem:
Given a balanced parentheses string s, return the score of the string.

The score of a balanced parentheses string is based on the following rule:
- "()" has score 1
- AB has score A + B, where A and B are balanced parentheses strings
- (A) has score 2 * A, where A is a balanced parentheses string

Example 1:
Input: s = "()"
Output: 1

Example 2:
Input: s = "(())"
Output: 2

Example 3:
Input: s = "()()"
Output: 2

Example 4:
Input: s = "(()(()))"
Output: 6

Constraints:
- 2 <= s.length <= 50
- s consists of only '(' and ')'
- s is a balanced parentheses string
 */

import java.util.*;
import java.util.function.*;


public class ValidParenthesesSimilar3Java {



    static class Solution {
        public int scoreOfParentheses(String s) {
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

            // stack = [0]
            // for char in s:
            // if char == '(':
            // stack.append(0)
            // else:
            // top = stack.pop()
            // score = max(2 * top, 1)
            // stack[-1] += score
            // return stack[0]

            throw new UnsupportedOperationException("Implement scoreOfParentheses");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.scoreOfParentheses("()") == 1);
        System.out.println("✓ Test case 1 passed");
        assert (sol.scoreOfParentheses("(())") == 2);
        System.out.println("✓ Test case 2 passed");
        assert (sol.scoreOfParentheses("()()") == 2);
        System.out.println("✓ Test case 3 passed");
        assert (sol.scoreOfParentheses("(()(()))") == 6);
        System.out.println("✓ Test case 4 passed");
        System.out.println("\nAll test cases passed!");
    }
}
