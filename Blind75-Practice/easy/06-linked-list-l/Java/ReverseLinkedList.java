/*
 * 206. Reverse Linked List
 * Difficulty: Easy
 * Pattern: Linked List
 *
 * Problem:
 * Given the head of a singly linked list, reverse the list, and return the
 * reversed list.
 *
 * Example 1:
 * Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 *
 * Example 2:
 * Input: head = [1,2]
 * Output: [2,1]
 *
 * Example 3:
 * Input: head = []
 * Output: []
 *
 * Constraints:
 * - The number of nodes in the list is the range [0, 5000]
 * - -5000 <= Node.val <= 5000
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
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

        // prev/curr iteration.

        // ListNode prev = null;
        // ListNode current = head;
        // while (current != null) {
        //     ListNode nextNode = current.next;
        //     current.next = prev;
        //     prev = current;
        //     current = nextNode;
        // }
        // return prev;
        throw new UnsupportedOperationException("Implement reverseList");
    }
    public static void main(String[] args) {
        System.out.println("Build ListNodes for tests.");
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
