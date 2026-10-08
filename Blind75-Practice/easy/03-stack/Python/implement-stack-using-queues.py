"""
225. Implement Stack using Queues
Difficulty: Easy
Pattern: Stack

Problem:
Implement a last-in-first-out (LIFO) stack using only queues. The
implemented stack should support these operations:
- void push(int x): push element x to the top of the stack.
- int pop(): remove the element on the top of the stack and return it.
- int top(): return the element on the top of the stack.
- boolean empty(): return true if the stack is empty, false otherwise.
You may use only standard queue operations: push to back, peek/pop from
front, size, and is empty.

Example 1:
Input: ["MyStack","push","push","top","pop","empty"]
[[],[1],[2],[],[],[]]
Output: [null,null,null,2,2,false]

Constraints:
- 1 <= x <= 9
- At most 100 calls will be made to push, pop, top, and empty
- All the calls to pop and top are valid
"""

from collections import deque


class MyStack:
    def __init__(self) -> None:
        self._q: deque[int] = deque()

    def push(self, x: int) -> None:
        self._q.append(x)

    def pop(self) -> int:
        for _ in range(len(self._q) - 1):
            self._q.append(self._q.popleft())
        return self._q.popleft()

    def top(self) -> int:
        for _ in range(len(self._q) - 1):
            self._q.append(self._q.popleft())
        x = self._q[0]
        self._q.append(self._q.popleft())
        return x

    def empty(self) -> bool:
        return len(self._q) == 0


if __name__ == "__main__":
    st = MyStack()
    st.push(1)
    st.push(2)
    assert st.top() == 2
    assert st.pop() == 2
    assert st.empty() is False
    assert st.pop() == 1
    assert st.empty() is True
    print("All test cases passed!")
