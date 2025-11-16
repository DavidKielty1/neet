"""
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
"""

from collections import deque


class MyStack:
    def __init__(self):
        """
        Approach: Single queue with rotation

        Strategy:
        1. Use one queue
        2. On push, rotate elements to maintain stack order
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

        self.queue = deque()

    def push(self, x: int) -> None:
        """Push element to top of stack"""
        self.queue.append(x)
        # Rotate queue so new element is at front
        for _ in range(len(self.queue) - 1):
            self.queue.append(self.queue.popleft())

    def pop(self) -> int:
        """Remove and return top element"""
        return self.queue.popleft()

    def top(self) -> int:
        """Return top element without removing"""
        return self.queue[0]

    def empty(self) -> bool:
        """Check if stack is empty"""
        return len(self.queue) == 0


# Test cases
if __name__ == "__main__":
    # Test case 1
    stack = MyStack()
    stack.push(1)
    stack.push(2)
    assert stack.top() == 2
    assert stack.pop() == 2
    assert stack.empty() == False
    print("✓ Test case 1 passed")

    # Test case 2
    stack2 = MyStack()
    stack2.push(1)
    assert stack2.pop() == 1
    assert stack2.empty() == True
    print("✓ Test case 2 passed")

    print("\nAll test cases passed!")
