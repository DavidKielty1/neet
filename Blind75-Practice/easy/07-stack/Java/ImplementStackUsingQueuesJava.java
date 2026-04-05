/*
225. Implement Stack using Queues
Difficulty: Easy
Pattern: Stack

LIFO using queue operations only. One deque: push to back; pop/top rotate n-1 to front.

Time: push O(1), pop/top O(n), Space: O(n)
*/

import java.util.ArrayDeque;
import java.util.Deque;

public class ImplementStackUsingQueuesJava {

    static class MyStack {
        private final Deque<Integer> q = new ArrayDeque<>();

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

            // q.addLast(x);

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

            // for (int i = q.size() - 1; i > 0; i--) {
            // q.addLast(q.removeFirst());
            // }
            // return q.removeFirst();

            throw new UnsupportedOperationException("Implement pop");
        }

        public int top() {
            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

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
            // int x = q.peekFirst();
            // q.addLast(q.removeFirst());
            // return x;

            throw new UnsupportedOperationException("Implement top");
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

            // return q.isEmpty();

            throw new UnsupportedOperationException("Implement empty");
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
