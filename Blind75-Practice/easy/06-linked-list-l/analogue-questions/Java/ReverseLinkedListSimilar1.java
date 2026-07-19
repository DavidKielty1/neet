/*
 * Ported from: 08-linked-list/analogue-questions/Python/reverse-linked-list-similar1.py
 * --- Original description ---
Similar Problem 1: Palindrome Linked List
Difficulty: Easy
Pattern: Linked List (Two Pointers + Reverse)

Problem:
Given the head of a singly linked list, return true if it is a palindrome.

Example 1:
Input: head = [1,2,2,1]
Output: true

Example 2:
Input: head = [1,2]
Output: false

Constraints:
- The number of nodes in the list is in the range [1, 10^5]
- 0 <= Node.val <= 9
 */

import java.util.*;
import java.util.function.*;


public class ReverseLinkedListSimilar1 {
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


    public boolean isPalindrome(ListNode head) {
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
    // return True
    // slow = fast = head
    // while fast.next and fast.next.next:
    // slow = slow.next
    // fast = fast.next.next
    // second_half = self.reverse(slow.next)
    // first_half = head
    // while second_half:
    // if first_half.val != second_half.val:
    // return False
    // first_half = first_half.next
    // second_half = second_half.next
    // return True

        throw new UnsupportedOperationException("Implement isPalindrome");
    }

    public Object reverse(Object head) {
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

        throw new UnsupportedOperationException("Implement reverse");
    }

    

    public static void main(String[] args) {
        ReverseLinkedListSimilar1 sol = new ReverseLinkedListSimilar1();
    // head = create_list(java.util.List.of(1,2,2,1));
    // assert solution.isPalindrome(head) == True  // needs locals (port helpers): ['head']
        System.out.println("✓ Test case 1 passed");
    // head = create_list(java.util.List.of(1,2));
    // assert solution.isPalindrome(head) == False  // needs locals (port helpers): ['head']
        System.out.println("✓ Test case 2 passed");
    // head = create_list(java.util.List.of(1));
    // assert solution.isPalindrome(head) == True  // needs locals (port helpers): ['head']
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
