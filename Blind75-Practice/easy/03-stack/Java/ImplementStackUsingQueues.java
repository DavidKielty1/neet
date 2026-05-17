/*
 * 225. Implement Stack using Queues
 * Difficulty: Easy
 * Pattern: Stack / Queue Simulation
 *
 * Problem
 * -------
 * Implement a last-in-first-out (LIFO) stack using only queue operations. The stack
 * should support the normal operations:
 *
 * - `push(x)`: push `x` onto the top of the stack
 * - `pop()`: remove and return the top element
 * - `top()`: return the top element without removing it
 * - `empty()`: return whether the stack is empty
 *
 * You may use only standard queue operations such as push to back, peek/pop from front,
 * size, and checking whether the queue is empty.
 *
 * Example 1
 * ---------
 * Input:
 * ["MyStack", "push", "push", "top", "pop", "empty"]
 * [[],        [1],    [2],    [],    [],    []]
 * Output:
 * [null, null, null, 2, 2, false]
 *
 * Constraints
 * -----------
 * - 1 <= x <= 9
 * - At most 100 calls will be made to `push`, `pop`, `top`, and `empty`
 * - All calls to `pop` and `top` are valid
 *
 * How to think about it
 * ---------------------
 * A stack needs access to the most recently added value, but a queue naturally exposes
 * the oldest value first. One clean simulation is to keep everything in one queue and,
 * whenever you need the top, rotate the first `n - 1` items to the back so the newest
 * item moves to the front. That makes `pop()` and `top()` more expensive, but keeps the
 * behavior correct using queue-only operations.
 *
 * Time: push O(1), pop/top O(n), Space: O(n)
 */

import java.util.ArrayDeque;
import java.util.Deque;

public class ImplementStackUsingQueues {

    static class MyStack {
        private final Deque<Integer> q = new ArrayDeque<>();

        public void push(int x) {
            q.push(x);
            for(int i = 0; i < q.size() -1; i++) {
                q.push(q.removeFirst());
            }
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

            // q.addLast(x);
        }

        public int pop() {
            return q.remove();
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

            // for (int i = q.size() - 1; i > 0; i--) {
                // q.addLast(q.removeFirst());
            // }
            // return q.removeFirst();
        }

        public int top() {
            return q.peek();
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

            // [1 2 3 4]

            // [2 3 4 1]
            // [3 4 1 2]
            // [4 1 2 3]

            // for (int i = q.size() - 1; i > 0; i--) {
            //     q.addLast(q.removeFirst());
            // }
            // int value = q.peekFirst();
            // q.addLast(q.removeFirst());
            // return value;
        }

        public boolean empty() {
            return q.isEmpty();
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

            // return q.isEmpty();
        }
    }

    public static void main(String[] args) {
        MyStack st = new MyStack();
        st.push(1);
        st.push(2);
        assert st.top() == 2;
        assert st.pop() == 2;
        assert !st.empty();
        assert st.pop() == 1;
        assert st.empty();
        System.out.println("All test cases passed!");
    }
}
