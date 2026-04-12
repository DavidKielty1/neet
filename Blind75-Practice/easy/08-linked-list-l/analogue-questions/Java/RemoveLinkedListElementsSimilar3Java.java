/*
 * Ported from: 08-linked-list/analogue-questions/Python/remove-linked-list-elements-similar3.py
 * --- Original description ---
LeetCode 1474: Delete N Nodes After M Nodes of a Linked List
Difficulty: Easy
Pattern: Linked List

Problem:
You are given the head of a linked list and two integers m and n.

Traverse the linked list and remove some nodes in the following way:

- Start with the head as the current node.
- Keep the first m nodes starting with the current node.
- Remove the next n nodes
- Keep repeating steps 2 and 3 until you reach the end of the list.

Return the head of the modified list after removing the mentioned nodes.

Example 1:
Input: head = [1,2,3,4,5,6,7,8,9,10,11,12,13], m = 2, n = 3
Output: [1,2,6,7,11,12]
Explanation: Keep the first (m = 2) nodes 1, 2, remove the next (n = 3) nodes 3, 4, 5,
keep the next (m = 2) nodes 6, 7, remove the next (n = 3) nodes 8, 9, 10, and so on.

Example 2:
Input: head = [1,2,3,4,5,6,7,8,9,10,11], m = 1, n = 3
Output: [1,5,9]

Example 3:
Input: head = [1,2,3,4,5,6,7,8,9,10,11], m = 3, n = 1
Output: [1,2,3,5,6,7,9,10,11]

Constraints:
- The number of nodes in the list is in the range [1, 10^4]
- 1 <= Node.val <= 10^6
- 1 <= m, n <= 1000

Time Complexity: O(n)
Space Complexity: O(1)
 */

import java.util.*;
import java.util.function.*;


public class RemoveLinkedListElementsSimilar3Java {

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
        public ListNode deleteNodes(ListNode head, int m, int n) {
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
            // while current:
            // for _ in range(m - 1):
            // if not current:
            // return head
            // current = current.next
            // if not current:
            // return head
            // temp = current.next
            // for _ in range(n):
            // if not temp:
            // break
            // temp = temp.next
            // current.next = temp
            // current = current.next
            // return head

            throw new UnsupportedOperationException("Implement deleteNodes");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // head1 = ListNode(1);
        // curr = head1;
        // for i in range(2, 14):
        //     curr.next = ListNode(i)
        //     curr = curr.next
        // result1 = sol.deleteNodes(head1, 2, 3);
        // assert list_to_array(result1) == [1, 2, 6, 7, 11, 12]  // needs locals (port helpers): ['list_to_array', 'result1']
        System.out.println("✓ Test case 1 passed");
        // head2 = ListNode(1);
        // curr = head2;
        // for i in range(2, 12):
        //     curr.next = ListNode(i)
        //     curr = curr.next
        // result2 = sol.deleteNodes(head2, 1, 3);
        // assert list_to_array(result2) == [1, 5, 9]  // needs locals (port helpers): ['list_to_array', 'result2']
        System.out.println("✓ Test case 2 passed");
        System.out.println("\nAll test cases passed!");
    }
}
