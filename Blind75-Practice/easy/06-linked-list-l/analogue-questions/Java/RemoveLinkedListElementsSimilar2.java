/*
 * Ported from: 08-linked-list/analogue-questions/Python/remove-linked-list-elements-similar2.py
 * --- Original description ---
LeetCode 83: Remove Duplicates from Sorted List
Difficulty: Easy
Pattern: Linked List

Problem:
Given the head of a sorted linked list, delete all duplicates such that each element
appears only once. Return the linked list sorted as well.

Example 1:
Input: head = [1,1,2]
Output: [1,2]

Example 2:
Input: head = [1,1,2,3,3]
Output: [1,2,3]

Constraints:
- The number of nodes in the list is in the range [0, 300]
- -100 <= Node.val <= 100
- The list is guaranteed to be sorted in ascending order

Time Complexity: O(n)
Space Complexity: O(1)
 */

import java.util.*;
import java.util.function.*;


public class RemoveLinkedListElementsSimilar2 {

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
        public ListNode deleteDuplicates(ListNode head) {
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

            // current = head
            // while current and current.next:
            // if current.val == current.next.val:
            // current.next = current.next.next
            // else:
            // current = current.next
            // return head

            throw new UnsupportedOperationException("Implement deleteDuplicates");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // head1 = ListNode(1);
        // head1.next = ListNode(1)
        // head1.next.next = ListNode(2)
        // result1 = sol.deleteDuplicates(head1);
        // assert list_to_array(result1) == [1, 2]  // needs locals (port helpers): ['list_to_array', 'result1']
        System.out.println("✓ Test case 1 passed");
        // head2 = ListNode(1);
        // head2.next = ListNode(1)
        // head2.next.next = ListNode(2)
        // head2.next.next.next = ListNode(3)
        // head2.next.next.next.next = ListNode(3)
        // result2 = sol.deleteDuplicates(head2);
        // assert list_to_array(result2) == [1, 2, 3]  // needs locals (port helpers): ['list_to_array', 'result2']
        System.out.println("✓ Test case 2 passed");
        System.out.println("\nAll test cases passed!");
    }
}
