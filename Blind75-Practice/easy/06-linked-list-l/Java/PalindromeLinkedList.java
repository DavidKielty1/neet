/*
 * 234. Palindrome Linked List
 * Difficulty: Easy
 * Pattern: Linked List
 *
 * Problem:
 * Given the head of a singly linked list, return true if it is a palindrome or
 * false otherwise. The list is a palindrome if the sequence of node values
 * reads the same forward and backward.
 *
 * Example 1:
 * Input: head = [1,2,2,1]
 * Output: true
 *
 * Example 2:
 * Input: head = [1,2]
 * Output: false
 *
 * Constraints:
 * - The number of nodes in the list is in the range [1, 10^5]
 * - 0 <= Node.val <= 9
 */
public class PalindromeLinkedList {
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

        // Reverse second half and compare.

        // if (head == null || head.next == null) {
        //     return true;
        // }
        // ListNode slow = head;
        // ListNode fast = head;
        // while (fast.next != null && fast.next.next != null) {
        //     slow = slow.next;
        //     fast = fast.next.next;
        // }
        // ListNode prev = null;
        // ListNode current = slow.next;
        // while (current != null) {
        //     ListNode nextNode = current.next;
        //     current.next = prev;
        //     prev = current;
        //     current = nextNode;
        // }
        // ListNode left = head;
        // ListNode right = prev;
        // while (right != null) {
        //     if (left.val != right.val) {
        //         return false;
        //     }
        //     left = left.next;
        //     right = right.next;
        // }
        // return true;
        throw new UnsupportedOperationException("Implement isPalindrome");
    }
    public static void main(String[] args) {
        System.out.println("Implement tests.");
    }
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


}
