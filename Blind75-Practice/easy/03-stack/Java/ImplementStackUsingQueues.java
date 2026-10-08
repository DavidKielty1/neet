/*
 * 225. Implement Stack using Queues
 * Difficulty: Easy
 * Pattern: Stack / Queue Simulation
 *
 * Problem:
 * Implement a last-in-first-out (LIFO) stack using only queues. The
 * implemented stack should support these operations:
 * - void push(int x): push element x to the top of the stack.
 * - int pop(): remove the element on the top of the stack and return it.
 * - int top(): return the element on the top of the stack.
 * - boolean empty(): return true if the stack is empty, false otherwise.
 * You may use only standard queue operations: push to back, peek/pop from
 * front, size, and is empty.
 *
 * Example 1:
 * Input: ["MyStack","push","push","top","pop","empty"]
 * [[],[1],[2],[],[],[]]
 * Output: [null,null,null,2,2,false]
 *
 * Constraints:
 * - 1 <= x <= 9
 * - At most 100 calls will be made to push, pop, top, and empty
 * - All the calls to pop and top are valid
 */

public class ImplementStackUsingQueues {

    static class MyStack {

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
        

        // private final Deque<Integer> q = new ArrayDeque<>();

        // public void push(int x) {
        //     q.push(x);
        //     for(int i = 0; i < q.size() -1; i++) {
        //         q.push(q.removeFirst());
        //     }
        // }

        // public int pop() {
        //     return q.remove();
        // }

        // public int top() {
        //     return q.peek();
        // }

        // public boolean empty() {
        //     return q.isEmpty();
        // }
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
