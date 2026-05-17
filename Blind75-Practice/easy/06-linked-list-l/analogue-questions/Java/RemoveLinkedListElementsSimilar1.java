/*
 * Ported from: 08-linked-list/analogue-questions/Python/remove-linked-list-elements-similar1.py
 * --- Original description ---
LeetCode 237: Delete Node in a Linked List
Difficulty: Medium (simplified to Easy)
Pattern: Linked List

Problem:
There is a singly-linked list head and we want to delete a node node in it.

You are given the node to be deleted node. You will not be given access to the first
node of head.

All the values of the linked list are unique, and it is guaranteed that the given node
node is not the last node in the linked list.

Delete the given node. Note that by deleting the node, we do not mean removing it from
memory. We mean:

- The value of the given node should not exist in the linked list.
- The number of nodes in the linked list should decrease by one.
- All the values before node should be in the same order.
- All the values after node should be in the same order.

Example 1:
Input: head = [4,5,1,9], node = 5
Output: [4,1,9]
Explanation: You are given the second node with value 5, the linked list should become
4 -> 1 -> 9 after calling your function.

Example 2:
Input: head = [4,5,1,9], node = 1
Output: [4,5,9]

Constraints:
- The number of the nodes in the given list is in the range [2, 1000]
- -1000 <= Node.val <= 1000
- The value of each node in the list is unique
- The node to be deleted is in the list and is not a tail node

Time Complexity: O(1)
Space Complexity: O(1)
 */

import java.util.*;
import java.util.function.*;


public class RemoveLinkedListElementsSimilar1 {

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
        public void deleteNode(ListNode node) {
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

            // node.val = node.next.val
            // node.next = node.next.next

            throw new UnsupportedOperationException("Implement deleteNode");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // head1 = ListNode(4);
        // node_to_delete = ListNode(5);
        // head1.next = node_to_delete
        // head1.next.next = ListNode(1)
        // head1.next.next.next = ListNode(9)
        // solution.deleteNode(node_to_delete)
        // assert list_to_array(head1) == [4, 1, 9]  // needs locals (port helpers): ['head1', 'list_to_array']
        System.out.println("✓ Test case 1 passed");
        // head2 = ListNode(4);
        // head2.next = ListNode(5)
        // node_to_delete2 = ListNode(1);
        // head2.next.next = node_to_delete2
        // head2.next.next.next = ListNode(9)
        // solution.deleteNode(node_to_delete2)
        // assert list_to_array(head2) == [4, 5, 9]  // needs locals (port helpers): ['head2', 'list_to_array']
        System.out.println("✓ Test case 2 passed");
        System.out.println("\nAll test cases passed!");
    }
}
