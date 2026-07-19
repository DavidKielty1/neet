/*
 * 150. Evaluate Reverse Polish Notation
 * Difficulty: Medium
 * Pattern: Stack
 *
 * Problem:
 * You are given an array of strings `tokens` representing an arithmetic expression in
 * Reverse Polish Notation.
 *
 * Evaluate the expression and return the result.
 *
 * Valid operators are `+`, `-`, `*`, and `/`.
 *
 * Each operand may be an integer or another expression. Division between two integers
 * should truncate toward zero.
 *
 * Example 1:
 * Input: tokens = ["2","1","+","3","*"]
 * Output: 9
 *
 * Example 2:
 * Input: tokens = ["4","13","5","/","+"]
 * Output: 6
 *
 * Example 3:
 * Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
 * Output: 22
 *
 * Constraints:
 * - 1 <= tokens.length <= 10^4
 * - tokens[i] is an operator or an integer in the range [-200, 200]
 * - The expression is valid
 *
 * Notes:
 * - Push numbers onto the stack.
 * - When you see an operator, pop the top two operands in the correct order.
 */

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
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

    // Deque<Integer> stack = new ArrayDeque<>();
    // for (String token : tokens) {
    //     if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
    //         int b = stack.pop();
    //         int a = stack.pop();
    //         if (token.equals("+")) {
    //             stack.push(a + b);
    //         } else if (token.equals("-")) {
    //             stack.push(a - b);
    //         } else if (token.equals("*")) {
    //             stack.push(a * b);
    //         } else {
    //             stack.push(a / b);
    //         }
    //     } else {
    //         stack.push(Integer.parseInt(token));
    //     }
    // }
    // return stack.pop();
    }
    

    public static void main(String[] args) {
        EvaluateReversePolishNotation sol = new EvaluateReversePolishNotation();
        assert sol.evalRPN(new String[] {"2", "1", "+", "3", "*"}) == 9;
        assert sol.evalRPN(new String[] {"4", "13", "5", "/", "+"}) == 6;
        assert sol.evalRPN(
                        new String[] {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"})
                == 22;
        System.out.println("All test cases passed!");
    }
}
