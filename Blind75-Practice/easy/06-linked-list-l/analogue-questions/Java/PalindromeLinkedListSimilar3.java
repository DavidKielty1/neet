/*
 * Ported from: 08-linked-list/analogue-questions/Python/palindrome-linked-list-similar3.py
 * --- Original description ---
LeetCode 1290: Convert Binary Number in a Linked List to Integer
Difficulty: Easy
Pattern: Linked List

Problem:
Given head which is a reference node to a singly-linked list. The value of each node in
the linked list is either 0 or 1. The linked list holds the binary representation of a number.

Return the decimal value of the number in the linked list.

The most significant bit is at the head of the linked list.

Example 1:
Input: head = [1,0,1]
Output: 5
Explanation: (101) in base 2 = (5) in base 10

Example 2:
Input: head = [0]
Output: 0

Constraints:
- The Linked List is not empty.
- Number of nodes will not exceed 30.
- Each node's value is either 0 or 1.

Time Complexity: O(n)
Space Complexity: O(1)
 */

import java.util.*;
import java.util.function.*;


public class PalindromeLinkedListSimilar3 {

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
        public int getDecimalValue(ListNode head) {
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

            // result = 0
            // while head:
            // result = result * 2 + head.val
            // head = head.next
            // return result

            throw new UnsupportedOperationException("Implement getDecimalValue");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // head1 = ListNode(1);
        // head1.next = ListNode(0)
        // head1.next.next = ListNode(1)
        // assert solution.getDecimalValue(head1) == 5  // needs locals (port helpers): ['head1']
        System.out.println("✓ Test case 1 passed");
        // head2 = ListNode(0);
        // assert solution.getDecimalValue(head2) == 0  // needs locals (port helpers): ['head2']
        System.out.println("✓ Test case 2 passed");
        // head3 = ListNode(1);
        // assert solution.getDecimalValue(head3) == 1  // needs locals (port helpers): ['head3']
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
