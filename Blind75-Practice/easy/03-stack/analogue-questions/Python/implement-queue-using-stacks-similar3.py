"""
LeetCode 1670: Design Front Middle Back Queue
Difficulty: Medium (simplified to Easy)
Pattern: Queue / Design

Problem:
Design a queue that supports push and pop operations in the front, middle, and back.

Implement the FrontMiddleBack class:

- FrontMiddleBack() Initializes the queue.
- void pushFront(int val) Adds val to the front of the queue.
- void pushMiddle(int val) Adds val to the middle of the queue.
- void pushBack(int val) Adds val to the back of the queue.
- int popFront() Removes the front element of the queue and returns it. If the queue is empty, return -1.
- int popMiddle() Removes the middle element of the queue and returns it. If the queue is empty, return -1.
- int popBack() Removes the back element of the queue and returns it. If the queue is empty, return -1.

Notice that when there are two middle position choices, the operation is performed on
the frontmost middle position choice.

Example 1:
Input:
["FrontMiddleBackQueue", "pushFront", "pushBack", "pushMiddle", "pushMiddle", "popFront", "popMiddle", "popMiddle", "popBack", "popFront"]
[[], [1], [2], [3], [4], [], [], [], [], []]
Output:
[null, null, null, null, null, 1, 3, 4, 2, -1]

Constraints:
- 1 <= val <= 10^9
- At most 1000 calls will be made to pushFront, pushMiddle, pushBack, popFront, popMiddle, and popBack.

Time Complexity: O(n) for middle operations, O(1) for others
Space Complexity: O(n)
"""

from collections import deque


class FrontMiddleBackQueue:
    def __init__(self):
        """
        Approach: Use deque for flexible operations

        Strategy:
        1. Use deque to support operations at both ends
        2. For middle operations, calculate index
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

    def pushFront(self, val: int) -> None:
        self.queue.appendleft(val)

    def pushMiddle(self, val: int) -> None:
        mid = len(self.queue) // 2
        self.queue.insert(mid, val)

    def pushBack(self, val: int) -> None:
        self.queue.append(val)

    def popFront(self) -> int:
        return self.queue.popleft() if self.queue else -1

    def popMiddle(self) -> int:
        if not self.queue:
            return -1
        mid = (len(self.queue) - 1) // 2
        val = self.queue[mid]
        del self.queue[mid]
        return val

    def popBack(self) -> int:
        return self.queue.pop() if self.queue else -1


# Test cases
if __name__ == "__main__":
    q = FrontMiddleBackQueue()
    q.pushFront(1)
    q.pushBack(2)
    q.pushMiddle(3)
    q.pushMiddle(4)
    assert q.popFront() == 1
    print("✓ Pop front passed")
    assert q.popMiddle() == 3
    print("✓ Pop middle 1 passed")
    assert q.popMiddle() == 4
    print("✓ Pop middle 2 passed")
    assert q.popBack() == 2
    print("✓ Pop back passed")
    assert q.popFront() == -1
    print("✓ Empty pop passed")

    print("\nAll test cases passed!")
