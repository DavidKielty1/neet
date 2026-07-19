/*
 * Ported from: 07-stack/analogue-questions/Python/valid-parentheses-similar1.py
 * --- Original description ---
Similar Problem 1: Remove Outermost Parentheses
Difficulty: Easy
Pattern: Stack

Problem:
A valid parentheses string is either empty, "(" + A + ")", or A + B, where A and B are valid parentheses strings.
You are given a valid parentheses string s. Remove the outermost parentheses of every primitive string
in the primitive decomposition of s.

Example 1:
Input: s = "(()())(())"
Output: "()()()"

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
 */

public class ValidParenthesesSimilar1 {
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
    // depth = 0
    // for char in s:
    // if char == '(':
    // if depth > 0:
    // result.append(char)
    // depth += 1
    // else:
    // depth -= 1
    // if depth > 0:
    // result.append(char)
    // return ''.join(result)

        throw new UnsupportedOperationException("Implement removeOuterParentheses");
    }

    

    public static void main(String[] args) {
        ValidParenthesesSimilar1 sol = new ValidParenthesesSimilar1();
        assert (sol.removeOuterParentheses("(()())(())") == "()()()");
        System.out.println("✓ Test case 1 passed");
        assert (sol.removeOuterParentheses("(()())(())(()(()))") == "()()()()(())");
        System.out.println("✓ Test case 2 passed");
        assert (sol.removeOuterParentheses("()()") == "");
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
