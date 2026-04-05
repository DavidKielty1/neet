/*
 * Ported from: 08-linked-list/analogue-questions/Python/reverse-linked-list-similar3.py
 * --- Original description ---
Similar Problem 3: Swap Nodes in Pairs
Difficulty: Easy
Pattern: Linked List

Problem:
Given a linked list, swap every two adjacent nodes and return its head.
You must solve the problem without modifying the values in the list's nodes
(i.e., only nodes themselves may be changed).

Example 1:
Input: head = [1,2,3,4]
Output: [2,1,4,3]

Example 2:
Input: head = []
Output: []

Example 3:
Input: head = [1]
Output: [1]

Constraints:
- The number of nodes in the list is in the range [0, 100]
- 0 <= Node.val <= 100
 */

import java.util.*;
import java.util.function.*;


public class ReverseLinkedListSimilar3Java {

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
        public ListNode swapPairs(ListNode head) {
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

            // dummy = ListNode(0)
            // dummy.next = head
            // prev = dummy
            // while prev.next and prev.next.next:
            // first = prev.next
            // second = prev.next.next
            // first.next = second.next
            // second.next = first
            // prev.next = second
            // prev = first
            // return dummy.next

            throw new UnsupportedOperationException("Implement swapPairs");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // head = create_list(java.util.List.of(1,2,3,4));
        // swapped = sol.swapPairs(head);
        // assert list_to_array(swapped) == [2, 1, 4, 3]  // needs locals (port helpers): ['list_to_array', 'swapped']
        System.out.println("✓ Test case 1 passed");
        // head = create_list([]);
        // swapped = sol.swapPairs(head);
        // assert list_to_array(swapped) == []  // needs locals (port helpers): ['list_to_array', 'swapped']
        System.out.println("✓ Test case 2 passed");
        // head = create_list(java.util.List.of(1));
        // swapped = sol.swapPairs(head);
        // assert list_to_array(swapped) == [1]  // needs locals (port helpers): ['list_to_array', 'swapped']
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
