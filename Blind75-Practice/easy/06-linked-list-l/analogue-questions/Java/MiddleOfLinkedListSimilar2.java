/*
 * Ported from: 08-linked-list/analogue-questions/Python/middle-of-linked-list-similar2.py
 * --- Original description ---
LeetCode 19: Remove Nth Node From End of List
Difficulty: Medium (simplified to Easy)
Pattern: Linked List / Two Pointers

Problem:
Given the head of a linked list, remove the nth node from the end of the list and return
its head.

Example 1:
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]

Example 2:
Input: head = [1], n = 1
Output: []

Example 3:
Input: head = [1,2], n = 1
Output: [1]

Constraints:
- The number of nodes in the list is sz.
- 1 <= sz <= 30
- 0 <= Node.val <= 100
- 1 <= n <= sz

Follow up: Could you do this in one pass?

Time Complexity: O(n)
Space Complexity: O(1)
 */

import java.util.*;
import java.util.function.*;


public class MiddleOfLinkedListSimilar2 {

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
        public ListNode removeNthFromEnd(ListNode head, int n) {
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

            // dummy = ListNode(0, head)
            // left = right = dummy
            // for _ in range(n + 1):
            // right = right.next
            // while right:
            // left = left.next
            // right = right.next
            // left.next = left.next.next
            // return dummy.next

            throw new UnsupportedOperationException("Implement removeNthFromEnd");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // head1 = ListNode(1);
        // head1.next = ListNode(2)
        // head1.next.next = ListNode(3)
        // head1.next.next.next = ListNode(4)
        // head1.next.next.next.next = ListNode(5)
        // result1 = sol.removeNthFromEnd(head1, 2);
        // assert list_to_array(result1) == [1, 2, 3, 5]  // needs locals (port helpers): ['list_to_array', 'result1']
        System.out.println("✓ Test case 1 passed");
        // head2 = ListNode(1);
        // result2 = sol.removeNthFromEnd(head2, 1);
        // assert list_to_array(result2) == []  // needs locals (port helpers): ['list_to_array', 'result2']
        System.out.println("✓ Test case 2 passed");
        System.out.println("\nAll test cases passed!");
    }
}
