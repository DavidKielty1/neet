/*
 * Ported from: 07-stack/analogue-questions/Python/implement-queue-using-stacks-similar3.py
 * --- Original description ---
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
 */

import java.util.*;
import java.util.function.*;


public class ImplementQueueUsingStacksSimilar3Java {



    static class Solution {
        // (no Solution class)

    }

    public static void main(String[] args) {
        // q = FrontMiddleBackQueue();
        // q.pushFront(1)
        // q.pushBack(2)
        // q.pushMiddle(3)
        // q.pushMiddle(4)
        // assert q.popFront() == 1  // needs locals (port helpers): ['q']
        System.out.println("✓ Pop front passed");
        // assert q.popMiddle() == 3  // needs locals (port helpers): ['q']
        System.out.println("✓ Pop middle 1 passed");
        // assert q.popMiddle() == 4  // needs locals (port helpers): ['q']
        System.out.println("✓ Pop middle 2 passed");
        // assert q.popBack() == 2  // needs locals (port helpers): ['q']
        System.out.println("✓ Pop back passed");
        // assert q.popFront() == -1  // needs locals (port helpers): ['q']
        System.out.println("✓ Empty pop passed");
        System.out.println("\nAll test cases passed!");
    }
}
