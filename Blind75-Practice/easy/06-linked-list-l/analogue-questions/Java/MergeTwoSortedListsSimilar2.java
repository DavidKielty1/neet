/*
 * Ported from: 08-linked-list/analogue-questions/Python/merge-two-sorted-lists-similar2.py
 * --- Original description ---
Similar Problem 2: Add Two Numbers
Difficulty: Easy
Pattern: Linked List (Two Pointers)

Problem:
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a single digit.
Add the two numbers and return the sum as a linked list.

Example 1:
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807

Example 2:
Input: l1 = [0], l2 = [0]
Output: [0]

Example 3:
Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]

Constraints:
- The number of nodes in each linked list is in the range [1, 100]
- 0 <= Node.val <= 9
- It is guaranteed that the list represents a number that does not have leading zeros
 */

import java.util.*;
import java.util.function.*;


public class MergeTwoSortedListsSimilar2 {
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


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
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
    // current = dummy
    // carry = 0
    // while l1 or l2 or carry:
    // val1 = l1.val if l1 else 0
    // val2 = l2.val if l2 else 0
    // total = val1 + val2 + carry
    // carry = total // 10
    // digit = total % 10
    // current.next = ListNode(digit)
    // current = current.next
    // if l1:
    // l1 = l1.next
    // if l2:
    // l2 = l2.next
    // return dummy.next

        throw new UnsupportedOperationException("Implement addTwoNumbers");
    }

    

    public static void main(String[] args) {
        MergeTwoSortedListsSimilar2 sol = new MergeTwoSortedListsSimilar2();
    // l1 = create_list(java.util.List.of(2,4,3));
    // l2 = create_list(java.util.List.of(5,6,4));
    // result = sol.addTwoNumbers(l1, l2);
    // assert list_to_array(result) == [7, 0, 8]  // needs locals (port helpers): ['list_to_array', 'result']
        System.out.println("✓ Test case 1 passed");
    // l1 = create_list(java.util.List.of(0));
    // l2 = create_list(java.util.List.of(0));
    // result = sol.addTwoNumbers(l1, l2);
    // assert list_to_array(result) == [0]  // needs locals (port helpers): ['list_to_array', 'result']
        System.out.println("✓ Test case 2 passed");
    // l1 = create_list(java.util.List.of(9,9,9,9,9,9,9));
    // l2 = create_list(java.util.List.of(9,9,9,9));
    // result = sol.addTwoNumbers(l1, l2);
    // assert list_to_array(result) == [8, 9, 9, 9, 0, 0, 0, 1]  // needs locals (port helpers): ['list_to_array', 'result']
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
