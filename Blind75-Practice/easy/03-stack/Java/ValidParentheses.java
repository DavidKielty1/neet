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
 * Time: O(n), Space: O(n)
 */

public class ValidParentheses {

    public boolean isValid(String s) {

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

        // Deque<Character> stack = new ArrayDeque<>();
        // for (char ch : s.toCharArray()) {
        //     if (ch == '(' || ch == '[' || ch == '{') {
        //         stack.push(ch);
        //         continue;
        //     }

        //     if (stack.isEmpty()) {
        //         return false;
        //     }

        //     char open = stack.pop();
        //     if ((ch == ')' && open != '(')
        //         || (ch == ']' && open != '[')
        //         || (ch == '}' && open != '{')   
        //     ) return false;
        // }

        // return stack.isEmpty();
    }
    public static void main(String[] args) {
        ValidParentheses x = new ValidParentheses();
        assert x.isValid("()");
        assert x.isValid("()[]{}");
        assert !x.isValid("(]");
        System.out.println("All test cases passed!");
    }

}
