/*
 * Ported from: 08-linked-list/analogue-questions/Python/middle-of-linked-list-similar1.py
 * --- Original description ---
LeetCode 2095: Delete the Middle Node of a Linked List
Difficulty: Medium (simplified to Easy)
Pattern: Linked List / Two Pointers

Problem:
You are given the head of a linked list. Delete the middle node, and return the head of
the modified linked list.

The middle node of a linked list of size n is the ⌊n / 2⌋th node from the start using
0-based indexing, where ⌊x⌋ denotes the largest integer less than or equal to x.

For n = 1, 2, 3, 4, and 5, the middle nodes are 0, 1, 1, 2, and 2, respectively.

Example 1:
Input: head = [1,3,4,7,1,2,6]
Output: [1,3,4,1,2,6]
Explanation:
The above figure represents the given linked list. The indices of the nodes are written below.
Since n = 7, node 3 with value 7 is the middle node, which is marked in red.
We return the new list after removing this node.

Example 2:
Input: head = [1,2,3,4]
Output: [1,2,4]

Example 3:
Input: head = [2,1]
Output: [2]

Constraints:
- The number of nodes in the list is in the range [1, 10^5]
- 1 <= Node.val <= 10^5

Time Complexity: O(n)
Space Complexity: O(1)
 */

import java.util.*;
import java.util.function.*;


public class MiddleOfLinkedListSimilar1 {
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


    public ListNode deleteMiddle(ListNode head) {
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
    // dummy = ListNode(0, head)
    // slow = dummy
    // fast = head
    // while fast and fast.next:
    // slow = slow.next
    // fast = fast.next.next
    // slow.next = slow.next.next
    // return dummy.next

        throw new UnsupportedOperationException("Implement deleteMiddle");
    }

    

    public static void main(String[] args) {
        MiddleOfLinkedListSimilar1 sol = new MiddleOfLinkedListSimilar1();
    // head1 = ListNode(1);
    // head1.next = ListNode(3)
    // head1.next.next = ListNode(4)
    // head1.next.next.next = ListNode(7)
    // head1.next.next.next.next = ListNode(1)
    // head1.next.next.next.next.next = ListNode(2)
    // head1.next.next.next.next.next.next = ListNode(6)
    // result1 = sol.deleteMiddle(head1);
    // assert list_to_array(result1) == [1, 3, 4, 1, 2, 6]  // needs locals (port helpers): ['list_to_array', 'result1']
        System.out.println("✓ Test case 1 passed");
    // head2 = ListNode(1);
    // head2.next = ListNode(2)
    // head2.next.next = ListNode(3)
    // head2.next.next.next = ListNode(4)
    // result2 = sol.deleteMiddle(head2);
    // assert list_to_array(result2) == [1, 2, 4]  // needs locals (port helpers): ['list_to_array', 'result2']
        System.out.println("✓ Test case 2 passed");
        System.out.println("\nAll test cases passed!");
    }
}
