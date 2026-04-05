/*
232. Implement Queue using Stacks
Difficulty: Easy
Pattern: Stack

FIFO queue using only stack operations.

Amortized O(1) per operation typical.
*/

import java.util.ArrayDeque;
import java.util.Deque;

public class ImplementQueueUsingStacksJava {

    static class MyQueue {
        private final Deque<Integer> in = new ArrayDeque<>();
        private final Deque<Integer> out = new ArrayDeque<>();

        public void push(int x) {
            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            throw new UnsupportedOperationException("Implement push");
        }

        public int pop() {
            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

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
