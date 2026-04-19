/*
 * 20. Valid Parentheses
 * Difficulty: Easy
 * Pattern: Stack
 *
 * Problem
 * -------
 * Given a string `s` containing just the characters `(`, `)`, `{`, `}`, `[` and `]`,
 * determine if the input string is valid.
 *
 * An input string is valid if:
 * 1. Open brackets are closed by the same type of bracket.
 * 2. Open brackets are closed in the correct order.
 * 3. Every closing bracket has a matching opening bracket.
 *
 * Example 1
 * ---------
 * Input: s = "()"
 * Output: true
 *
 * Example 2
 * ---------
 * Input: s = "()[]{}"
 * Output: true
 *
 * Example 3
 * ---------
 * Input: s = "(]"
 * Output: false
 *
 * Example 4
 * ---------
 * Input: s = "([)]"
 * Output: false
 *
 * Constraints
 * -----------
 * - 1 <= s.length <= 10^4
 * - `s` consists only of the characters `()[]{}`.
 *
 * How to think about it
 * ---------------------
 * This is the classic stack matching problem. Push opening brackets as you scan left
 * to right. When you see a closing bracket, the most recent unmatched opening bracket
 * must be the one that pairs with it. If the types do not match, or you try to close
 * when the stack is empty, the string is invalid. At the end, the stack must be empty.
 *
 * Time: O(n), Space: O(n)
 */

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParenthesesJava {
    public boolean isValid(String s) {
        // make a map of closers and openers (optional?)
        // Create Deque deque = new ArrayDeque()
        // Loop for each o(n) of s
        // Check s.charAt(i): 
        // if it is closer and stack is empty -> return false
        // if is it opener : add to stack
        // if it is closer check in our deque to see if top of stack is the corresponding opener
        // if so, pop from stack, move onto next i
        // if not, not a valid parenthesis stack
        // return stack is empty (returns true for empty;  false if not)

        Deque<Character> stack = new ArrayDeque<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
                continue;
            }

            if (stack.isEmpty()) {
                return false;
            }

            char open = stack.pop();
            if ((ch == ')' && open != '(')
                || (ch == ']' && open != '[')
                || (ch == '}' && open != '{')   
            ) return false;
            
        }
        return stack.isEmpty();

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

        // Stack of opening chars; match closing.

        // java.util.Deque<Character> stack = new java.util.ArrayDeque<>();
        // for (char ch : s.toCharArray()) {
        //     if (ch == "(".charAt(0) || ch == "[".charAt(0) || ch == "{".charAt(0)) {
        //         stack.push(ch);
        //         continue;
        //     }
        //     if (stack.isEmpty()) {
        //         return false;
        //     }
        //     char open = stack.pop();
        //     if ((ch == ')' && open != "(".charAt(0))
        //             || (ch == ']' && open != "[".charAt(0))
        //             || (ch == '}' && open != "{".charAt(0))) {
        //         return false;
        //     }
        // }
        // return stack.isEmpty();
        throw new UnsupportedOperationException("Implement isValid");
    }
    public static void main(String[] args) {
        ValidParenthesesJava x = new ValidParenthesesJava();
        assert x.isValid("()");
        assert x.isValid("()[]{}");
        assert !x.isValid("(]");
        System.out.println("All test cases passed!");
    }

}
