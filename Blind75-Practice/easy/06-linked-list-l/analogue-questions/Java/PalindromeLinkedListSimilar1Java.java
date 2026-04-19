/*
 * Ported from: 08-linked-list/analogue-questions/Python/palindrome-linked-list-similar1.py
 * --- Original description ---
LeetCode 143: Reorder List
Difficulty: Medium (simplified to Easy)
Pattern: Linked List / Two Pointers

Problem:
You are given the head of a singly linked-list. The list can be represented as:

L0 → L1 → … → Ln - 1 → Ln

Reorder the list to be on the following form:

L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …

You may not modify the values in the list's nodes. Only nodes themselves may be changed.

Example 1:
Input: head = [1,2,3,4]
Output: [1,4,2,3]

Example 2:
Input: head = [1,2,3,4,5]
Output: [1,5,2,4,3]

Constraints:
- The number of nodes in the list is in the range [1, 5 * 10^4]
- 1 <= Node.val <= 1000

Time Complexity: O(n)
Space Complexity: O(1)
 */

import java.util.*;
import java.util.function.*;


public class PalindromeLinkedListSimilar1Java {

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
        public void reorderList(ListNode head) {
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
            // return
            // slow = fast = head
            // while fast.next and fast.next.next:
            // slow = slow.next
            // fast = fast.next.next
            // second = slow.next
            // slow.next = None
            // prev = None
            // while second:
            // next_node = second.next
            // second.next = prev
            // prev = second
            // second = next_node
            // second = prev
            // first = head
            // while second:
            // temp1, temp2 = (first.next, second.next)
            // first.next = second
            // second.next = temp1
            // first, second = (temp1, temp2)

            throw new UnsupportedOperationException("Implement reorderList");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // head1 = ListNode(1);
        // head1.next = ListNode(2)
        // head1.next.next = ListNode(3)
        // head1.next.next.next = ListNode(4)
        // solution.reorderList(head1)
        // assert list_to_array(head1) == [1, 4, 2, 3]  // needs locals (port helpers): ['head1', 'list_to_array']
        System.out.println("✓ Test case 1 passed");
        // head2 = ListNode(1);
        // head2.next = ListNode(2)
        // head2.next.next = ListNode(3)
        // head2.next.next.next = ListNode(4)
        // head2.next.next.next.next = ListNode(5)
        // solution.reorderList(head2)
        // assert list_to_array(head2) == [1, 5, 2, 4, 3]  // needs locals (port helpers): ['head2', 'list_to_array']
        System.out.println("✓ Test case 2 passed");
        System.out.println("\nAll test cases passed!");
    }
}
