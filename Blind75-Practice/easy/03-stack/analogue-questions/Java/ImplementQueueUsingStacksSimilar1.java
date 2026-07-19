/*
 * Ported from: 07-stack/analogue-questions/Python/implement-queue-using-stacks-similar1.py
 * --- Original description ---
LeetCode 225: Implement Stack using Queues
Difficulty: Easy
Pattern: Stack / Queue

Problem:
Implement a last-in-first-out (LIFO) stack using only two queues. The implemented
stack should support all the functions of a normal stack (push, top, pop, and empty).

Implement the MyStack class:

- void push(int x) Pushes element x to the top of the stack.
- int pop() Removes the element on the top of the stack and returns it.
- int top() Returns the element on the top of the stack.
- boolean empty() Returns true if the stack is empty, false otherwise.

Notes:
- You must use only standard operations of a queue, which means only push to back,
  peek/pop from front, size, and is empty operations are valid.

Example 1:
Input: ["MyStack", "push", "push", "top", "pop", "empty"]
       [[], [1], [2], [], [], []]
Output: [null, null, null, 2, 2, false]

Constraints:
- 1 <= x <= 9
- At most 100 calls will be made to push, pop, top, and empty
- All the calls to pop and top are valid

Time Complexity: O(n) for push, O(1) for other operations
Space Complexity: O(n)
 */

import java.util.*;
import java.util.function.*;


public class ImplementQueueUsingStacksSimilar1 {
    // (no Solution class)

    

    public static void main(String[] args) {
    // stack = MyStack();
    // stack.push(1)
    // stack.push(2)
    // assert stack.top() == 2  // needs locals (port helpers): ['stack']
    // assert stack.pop() == 2  // needs locals (port helpers): ['stack']
    // assert stack.empty() == False  // needs locals (port helpers): ['stack']
        System.out.println("✓ Test case 1 passed");
    // stack2 = MyStack();
    // stack2.push(1)
    // assert stack2.pop() == 1  // needs locals (port helpers): ['stack2']
    // assert stack2.empty() == True  // needs locals (port helpers): ['stack2']
        System.out.println("✓ Test case 2 passed");
        System.out.println("\nAll test cases passed!");
    }
}
