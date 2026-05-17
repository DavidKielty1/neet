/*
 * Ported from: 07-stack/analogue-questions/Python/backspace-string-compare-similar3.py
 * --- Original description ---
LeetCode 1021: Remove Outermost Parentheses
Difficulty: Easy
Pattern: Stack

Problem:
A valid parentheses string is either empty "", "(" + A + ")", or A + B, where A and B
are valid parentheses strings, and + represents string concatenation.

For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.

A valid parentheses string s is primitive if it is nonempty, and there does not exist a
way to split it into s = A + B, with A and B nonempty valid parentheses strings.

Given a valid parentheses string s, consider its primitive decomposition:
s = P1 + P2 + ... + Pk, where Pi are primitive valid parentheses strings.

Return s after removing the outermost parentheses of every primitive string in the
primitive decomposition of s.

Example 1:
Input: s = "(()())(())"
Output: "()()()"
Explanation:
The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
After removing outer parentheses of each part, this is "()()" + "()" = "()()()".

Example 2:
Input: s = "(()())(())(()(()))"
Output: "()()()()(())"

Example 3:
Input: s = "()()"
Output: ""

Constraints:
- 1 <= s.length <= 10^5
- s[i] is either '(' or ')'
- s is a valid parentheses string

Time Complexity: O(n)
Space Complexity: O(n)
 */

import java.util.*;
import java.util.function.*;


public class BackspaceStringCompareSimilar3 {



    static class Solution {
        public String removeOuterParentheses(String s) {
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

            // result = []
            // balance = 0
            // for char in s:
            // if char == '(':
            // if balance > 0:
            // result.append(char)
            // balance += 1
            // else:
            // balance -= 1
            // if balance > 0:
            // result.append(char)
            // return ''.join(result)

            throw new UnsupportedOperationException("Implement removeOuterParentheses");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.removeOuterParentheses("(()())(())") == "()()()");
        System.out.println("✓ Test case 1 passed");
        assert (sol.removeOuterParentheses("(()())(())(()(()))") == "()()()()(())");
        System.out.println("✓ Test case 2 passed");
        assert (sol.removeOuterParentheses("()()") == "");
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
