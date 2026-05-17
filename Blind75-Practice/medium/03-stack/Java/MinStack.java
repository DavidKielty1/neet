/*
 * 155. Min Stack
 * Difficulty: Medium
 * Pattern: Stack / Design
 *
 * Problem:
 * Design a stack that supports:
 * - `push(val)`
 * - `pop()`
 * - `top()`
 * - `getMin()`
 *
 * Each function should work in O(1) time.
 *
 * Implement the `MinStack` class:
 * - `MinStack()` initializes the stack
 * - `void push(int val)` pushes `val` onto the stack
 * - `void pop()` removes the top element
 * - `int top()` gets the top element
 * - `int getMin()` retrieves the minimum element in the stack
 *
 * Example 1:
 * Input:
 * ["MinStack","push","push","push","getMin","pop","top","getMin"]
 * [[],[-2],[0],[-3],[],[],[],[]]
 * Output:
 * [null,null,null,null,-3,null,0,-2]
 *
 * Constraints:
 * - -2^31 <= val <= 2^31 - 1
 * - pop, top and getMin will always be called on non-empty stacks
 * - At most 3 * 10^4 calls will be made
 *
 * Notes:
 * - Keep a second stack of running minimums, or store pairs of value and current min.
 */

public class MinStack {
    static class MinStack {
        public MinStack() {
            //
        }

        public void push(int val) {
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
            // private final Deque<Integer> stack = new ArrayDeque<>();
            // private final Deque<Integer> minStack = new ArrayDeque<>();
            //
            // public MinStack() {
            // }
            //
            // public void push(int val) {
            //     stack.push(val);
            //     minStack.push(minStack.isEmpty() ? val : Math.min(val, minStack.peek()));
            // }
            //
            // public void pop() {
            //     stack.pop();
            //     minStack.pop();
            // }
            //
            // public int top() {
            //     return stack.peek();
            // }
            //
            // public int getMin() {
            //     return minStack.peek();
            // }
        }

        public void pop() {
        }

        public int top() {
        }

        public int getMin() {
        }
    }

    public static void main(String[] args) {
        MinStack st = new MinStack();
        st.push(-2);
        st.push(0);
        st.push(-3);
        assert st.getMin() == -3;
        st.pop();
        assert st.top() == 0;
        assert st.getMin() == -2;
        System.out.println("All test cases passed!");
    }
}
