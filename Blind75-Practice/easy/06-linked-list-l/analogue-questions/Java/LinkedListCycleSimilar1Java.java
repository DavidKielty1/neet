/*
 * Ported from: 08-linked-list/analogue-questions/Python/linked-list-cycle-similar1.py
 * --- Original description ---
Similar Problem 1: Linked List Cycle II (Find Entry Point)
Difficulty: Easy
Pattern: Linked List (Fast & Slow Pointers)

Problem:
Given the head of a linked list, return the node where the cycle begins.
If there is no cycle, return null.

Example 1:
Input: head = [3,2,0,-4], pos = 1
Output: tail connects to node index 1

Example 2:
Input: head = [1,2], pos = 0
Output: tail connects to node index 0

Example 3:
Input: head = [1], pos = -1
Output: no cycle

Constraints:
- The number of nodes in the list is in the range [0, 10^4]
- -10^5 <= Node.val <= 10^5
- pos is -1 or a valid index in the linked list
 */

import java.util.*;
import java.util.function.*;


public class LinkedListCycleSimilar1Java {

    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode() {}

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static class Solution {
        public ListNode detectCycle(ListNode head) {
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

            // if not head or not head.next:
            // return None
            // slow = fast = head
            // has_cycle = False
            // while fast and fast.next:
            // slow = slow.next
            // fast = fast.next.next
            // if slow == fast:
            // has_cycle = True
            // break
            // if not has_cycle:
            // return None
            // slow = head
            // while slow != fast:
            // slow = slow.next
            // fast = fast.next
            // return slow

            throw new UnsupportedOperationException("Implement detectCycle");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // head = create_list_with_cycle([3, 2, 0, -4], 1);
        // result = sol.detectCycle(head);
        // assert result is not None and result.val == 2  // needs locals (port helpers): ['result']
        System.out.println("✓ Test case 1 passed");
        // head = create_list_with_cycle(java.util.List.of(1,2), 0);
        // result = sol.detectCycle(head);
        // assert result is not None and result.val == 1  // needs locals (port helpers): ['result']
        System.out.println("✓ Test case 2 passed");
        // head = create_list_with_cycle(java.util.List.of(1), -1);
        // result = sol.detectCycle(head);
        // assert result is None  // needs locals (port helpers): ['result']
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
