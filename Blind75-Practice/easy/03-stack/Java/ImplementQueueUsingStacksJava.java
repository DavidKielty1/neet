/*
 * 232. Implement Queue using Stacks
 * Difficulty: Easy
 * Pattern: Stack / Queue
 *
 * Problem
 * -------
 * Implement a first-in-first-out (FIFO) queue using only two stacks. The queue should
 * support the normal operations:
 *
 * - `push(x)`: add `x` to the back of the queue
 * - `pop()`: remove and return the element at the front
 * - `peek()`: return the element at the front without removing it
 * - `empty()`: return whether the queue is empty
 *
 * You may use only standard stack operations such as push, pop, peek/top, size, and
 * checking whether a stack is empty.
 *
 * Example 1
 * ---------
 * Input:
 * ["MyQueue", "push", "push", "peek", "pop", "empty"]
 * [[],        [1],    [2],    [],     [],    []]
 * Output:
 * [null, null, null, 1, 1, false]
 *
 * Constraints
 * -----------
 * - 1 <= x <= 9
 * - At most 100 calls will be made to `push`, `pop`, `peek`, and `empty`
 * - All calls to `pop` and `peek` are valid
 *
 * Follow-up
 * ---------
 * Can each operation be amortized O(1)?
 *
 * How to think about it
 * ---------------------
 * A queue removes from the front, but a stack removes from the back. The trick is to
 * use one stack for incoming elements and one stack for outgoing elements. When the
 * outgoing stack is empty, move everything from the incoming stack into it once; that
 * reversal makes the oldest item become the next one to remove.
 *
 * Time: O(1) amortized per operation, Space: O(n)
 */

import java.util.ArrayDeque;
import java.util.Deque;

public class ImplementQueueUsingStacksJava {

    static class MyQueue {
        private final Deque<Integer> in = new ArrayDeque<>();
        private final Deque<Integer> out = new ArrayDeque<>();

        public void push(int x) {
            in.push(x);
            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            // in.push(x);
            throw new UnsupportedOperationException("Implement push");
        }

        public int pop() {
            while (out.isEmpty()) {
                while (!in.isEmpty()) {
                    out.push(in.pop());
                }
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

            // if (out.isEmpty()) {
            //     while (!in.isEmpty()) {
            //         out.push(in.pop());
            //     }
            // }
            // return out.pop();
            throw new UnsupportedOperationException("Implement pop");
        }

        public int peek() {
            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            // if (out.isEmpty()) {
            //     while (!in.isEmpty()) {
            //         out.push(in.pop());
            //     }
            // }
            // return out.peek();
            throw new UnsupportedOperationException("Implement peek");
        }

        public boolean empty() {
            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            // return in.isEmpty() && out.isEmpty();
            throw new UnsupportedOperationException("Implement empty");
        }
    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.push(1);
        q.push(2);
        assert q.peek() == 1;
        assert q.pop() == 1;
        assert !q.empty();
        System.out.println("All test cases passed!");
    }
}
