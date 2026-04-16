/*
234. Palindrome Linked List
Difficulty: Easy
Pattern: Linked List

Return true if values form a palindrome.

Time: O(n), Space: O(1) reverse half
*/
public class PalindromeLinkedListJava {
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
