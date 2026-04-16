/*
20. Valid Parentheses
Difficulty: Easy
Pattern: Stack

Return true if brackets are valid and properly nested.

Time: O(n), Space: O(n)
*/
import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParenthesesJava {
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
