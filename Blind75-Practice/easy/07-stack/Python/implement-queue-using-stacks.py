"""
LeetCode 232: Implement Queue using Stacks
Difficulty: Easy
Pattern: Stack / Queue

Problem:
Implement a first in first out (FIFO) queue using only two stacks. The implemented
queue should support all the functions of a normal queue (push, peek, pop, and empty).

Implement the MyQueue class:

- void push(int x) Pushes element x to the back of the queue.
- int pop() Removes the element from the front of the queue and returns it.
- int peek() Returns the element at the front of the queue.
- boolean empty() Returns true if the queue is empty, false otherwise.

Notes:
- You must use only standard operations of a stack, which means only push to top,
  peek/pop from top, size, and is empty operations are valid.
- Depending on your language, the stack may not be supported natively. You may simulate
  a stack using a list or deque (double-ended queue) as long as you use only a stack's
  standard operations.

Example 1:
Input: ["MyQueue", "push", "push", "peek", "pop", "empty"]
       [[], [1], [2], [], [], []]
Output: [null, null, null, 1, 1, false]

Constraints:
- 1 <= x <= 9
- At most 100 calls will be made to push, pop, peek, and empty
- All the calls to pop and peek are valid

Follow-up: Can you implement the queue such that each operation is amortized O(1)
time complexity? In other words, performing n operations will take overall O(n) time
even if one of those operations may take longer.

Time Complexity: O(1) amortized for all operations
Space Complexity: O(n)
"""


class MyQueue:
    def __init__(self):
        """
        Approach: Two stacks for queue simulation

        Strategy:
        1. Use input stack for push operations
        2. Use output stack for pop/peek operations
        3. Transfer elements from input to output when needed
        """

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        self.input_stack = []
        self.output_stack = []

    def push(self, x: int) -> None:
        """Push element to the back of queue"""
        self.input_stack.append(x)

    def pop(self) -> int:
        """Remove and return front element"""
        self._move_to_output()
        return self.output_stack.pop()

    def peek(self) -> int:
        """Return front element without removing"""
        self._move_to_output()
        return self.output_stack[-1]

    def empty(self) -> bool:
        """Check if queue is empty"""
        return len(self.input_stack) == 0 and len(self.output_stack) == 0

    def _move_to_output(self):
        """Transfer elements from input to output stack if output is empty"""
        if not self.output_stack:
            while self.input_stack:
                self.output_stack.append(self.input_stack.pop())


# Test cases
if __name__ == "__main__":
    # Test case 1
    queue = MyQueue()
    queue.push(1)
    queue.push(2)
    assert queue.peek() == 1
    assert queue.pop() == 1
    assert queue.empty() == False
    print("✓ Test case 1 passed")

    # Test case 2
    queue2 = MyQueue()
    queue2.push(1)
    assert queue2.pop() == 1
    assert queue2.empty() == True
    print("✓ Test case 2 passed")

    print("\nAll test cases passed!")
