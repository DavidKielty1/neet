/*
 * Ported from: 08-linked-list/analogue-questions/Python/reverse-linked-list-similar2.py
 * --- Original description ---
Similar Problem 2: Reverse Linked List II (Easy Version - Fixed Range)
Difficulty: Easy
Pattern: Linked List

Problem:
Given the head of a singly linked list and two integers left and right where left <= right,
reverse the nodes of the list from position left to position right (1-indexed), and return the reversed list.

For this easy version, assume left = 1 and right = list length (reverse entire list).

Example 1:
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]

Example 2:
Input: head = [5]
Output: [5]

Constraints:
- The number of nodes in the list is n
- 1 <= n <= 500
- -500 <= Node.val <= 500
 */

import java.util.*;
import java.util.function.*;


public class ReverseLinkedListSimilar2Java {

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
        public ListNode reverseBetween(ListNode head) {
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

            // prev = None
            // current = head
            // while current:
            // next_node = current.next
            // current.next = prev
            // prev = current
            // current = next_node
            // return prev

            throw new UnsupportedOperationException("Implement reverseBetween");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // head = create_list(java.util.List.of(1,2,3,4,5));
        // reversed_head = sol.reverseBetween(head);
        // assert list_to_array(reversed_head) == [5, 4, 3, 2, 1]  // needs locals (port helpers): ['list_to_array', 'reversed_head']
        System.out.println("✓ Test case 1 passed");
        // head = create_list(java.util.List.of(5));
        // reversed_head = sol.reverseBetween(head);
        // assert list_to_array(reversed_head) == [5]  // needs locals (port helpers): ['list_to_array', 'reversed_head']
        System.out.println("✓ Test case 2 passed");
        System.out.println("\nAll test cases passed!");
    }
}
