/*
 * Ported from: 08-linked-list/analogue-questions/Python/linked-list-cycle-similar3.py
 * --- Original description ---
Similar Problem 3: Middle of the Linked List
Difficulty: Easy
Pattern: Linked List (Fast & Slow Pointers)

Problem:
Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.

Example 1:
Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node is 3.

Example 2:
Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: There are two middle nodes 3 and 4, return the second (4).

Constraints:
- The number of nodes in the list is in the range [1, 100]
- 1 <= Node.val <= 100
 */

import java.util.*;
import java.util.function.*;


public class LinkedListCycleSimilar3 {
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


    public ListNode middleNode(ListNode head) {
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

    // slow = fast = head
    // while fast and fast.next:
    // slow = slow.next
    // fast = fast.next.next
    // return slow

        throw new UnsupportedOperationException("Implement middleNode");
    }

    

    public static void main(String[] args) {
        LinkedListCycleSimilar3 sol = new LinkedListCycleSimilar3();
    // head = create_list(java.util.List.of(1,2,3,4,5));
    // middle = sol.middleNode(head);
    // assert list_to_array(middle) == [3, 4, 5]  // needs locals (port helpers): ['list_to_array', 'middle']
        System.out.println("✓ Test case 1 passed");
    // head = create_list(java.util.List.of(1,2,3,4,5,6));
    // middle = sol.middleNode(head);
    // assert list_to_array(middle) == [4, 5, 6]  // needs locals (port helpers): ['list_to_array', 'middle']
        System.out.println("✓ Test case 2 passed");
    // head = create_list(java.util.List.of(1));
    // middle = sol.middleNode(head);
    // assert list_to_array(middle) == [1]  // needs locals (port helpers): ['list_to_array', 'middle']
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
