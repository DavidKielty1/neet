/*
 * 203. Remove Linked List Elements
 * Difficulty: Easy
 * Pattern: Linked List
 *
 * Problem:
 * Given the head of a linked list and an integer val, remove all the nodes of
 * the linked list that have Node.val == val, and return the new head.
 *
 * Example 1:
 * Input: head = [1,2,6,3,4,5,6], val = 6
 * Output: [1,2,3,4,5]
 *
 * Example 2:
 * Input: head = [], val = 1
 * Output: []
 *
 * Example 3:
 * Input: head = [7,7,7,7], val = 7
 * Output: []
 *
 * Constraints:
 * - The number of nodes in the list is in the range [0, 10^4]
 * - 1 <= Node.val <= 50
 * - 0 <= val <= 50
 */
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
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

        // Dummy head simplifies removal.

        // ListNode dummy = new ListNode(0, head);
        // ListNode current = dummy;
        // while (current.next != null) {
        //     if (current.next.val == val) {
        //         current.next = current.next.next;
        //     } else {
        //         current = current.next;
        //     }
        // }
        // return dummy.next;
        throw new UnsupportedOperationException("Implement removeElements");
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
