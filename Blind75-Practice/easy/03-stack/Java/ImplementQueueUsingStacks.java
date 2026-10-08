/*
 * 232. Implement Queue using Stacks
 * Difficulty: Easy
 * Pattern: Stack / Queue
 *
 * Problem:
 * Implement a first-in-first-out (FIFO) queue using only two stacks. The
 * implemented queue should support these operations:
 * - void push(int x): push element x to the back of the queue.
 * - int pop(): remove the element from the front of the queue and return it.
 * - int peek(): return the element at the front of the queue.
 * - boolean empty(): return true if the queue is empty, false otherwise.
 * You may use only standard stack operations: push to top, peek/pop from top,
 * size, and is empty.
 *
 * Example 1:
 * Input: ["MyQueue","push","push","peek","pop","empty"]
 * [[],[1],[2],[],[],[]]
 * Output: [null,null,null,1,1,false]
 *
 * Constraints:
 * - 1 <= x <= 9
 * - At most 100 calls will be made to push, pop, peek, and empty
 * - All the calls to pop and peek are valid
 */

public class ImplementQueueUsingStacks {
    static class MyQueue {
        
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
        //
        //
        

        //
        //
        //
        //
        
        // private final Deque<Integer> in = new ArrayDeque<>();
        // private final Deque<Integer> out = new ArrayDeque<>();

        // public void push(int x) {
            // in.push(x);
        // }

        // public int pop() {
            // if (out.isEmpty()) {
            //     while (!in.isEmpty()) {
            //         out.push(in.pop());
            //     }
            // }
            // return out.pop();
        // }

        // public int peek() {
            // if (out.isEmpty()) {
            //     while (!in.isEmpty()) {
            //         out.push(in.pop());
            //     }
            // }
            // return out.peek();
        // }

        // public boolean empty() {
            // return in.isEmpty() && out.isEmpty();
        // }
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
