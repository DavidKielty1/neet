"""
LeetCode 225: Implement Stack using Queues
Difficulty: Easy
Pattern: Stack

Implement LIFO stack using only queue operations (FIFO).

Approach: One deque — push appends; pop/peek rotate size-1 times so tail becomes head (amortized
cost per op can be O(n) for naive single-queue rotation, or use two queues / lazy top).

This version: collections.deque for O(1) popleft/append; push O(1); pop O(n) by rotating.

Time Complexity: push O(1), pop/top O(n) worst case per call (acceptable for practice)
Space Complexity: O(n)
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
