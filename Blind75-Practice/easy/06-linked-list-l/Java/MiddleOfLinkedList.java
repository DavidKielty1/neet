/*
 * 876. Middle of the Linked List
 * Difficulty: Easy
 * Pattern: Linked List
 *
 * Problem:
 * Given the head of a singly linked list, return the middle node of the linked
 * list. If there are two middle nodes, return the second middle node.
 *
 * Example 1:
 * Input: head = [1,2,3,4,5]
 * Output: [3,4,5]
 *
 * Example 2:
 * Input: head = [1,2,3,4,5,6]
 * Output: [4,5,6]
 *
 * Constraints:
 * - The number of nodes in the list is in the range [1, 100]
 * - 1 <= Node.val <= 100
 */
public class MiddleOfLinkedList {
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

        // Fast moves 2 steps, slow 1 step.

        // ListNode slow = head;
        // ListNode fast = head;
        // while (fast != null && fast.next != null) {
        //     slow = slow.next;
        //     fast = fast.next.next;
        // }
        // return slow;
        throw new UnsupportedOperationException("Implement middleNode");
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
