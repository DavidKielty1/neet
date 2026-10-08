/*
 * 141. Linked List Cycle
 * Difficulty: Easy
 * Pattern: Linked List / Fast-Slow
 *
 * Problem:
 * Given head, the head of a linked list, determine if the linked list has a
 * cycle in it. There is a cycle if some node can be reached again by
 * continuously following the next pointer. Internally, pos is used to denote
 * the index of the node that tail's next pointer is connected to. Note that
 * pos is not passed as a parameter. Return true if there is a cycle, otherwise
 * return false.
 *
 * Example 1:
 * Input: head = [3,2,0,-4], pos = 1
 * Output: true
 *
 * Example 2:
 * Input: head = [1,2], pos = 0
 * Output: true
 *
 * Example 3:
 * Input: head = [1], pos = -1
 * Output: false
 *
 * Constraints:
 * - The number of the nodes in the list is in the range [0, 10^4]
 * - -10^5 <= Node.val <= 10^5
 * - pos is -1 or a valid index in the linked-list
 */
import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
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

        // Floyd tortoise and hare.

        // ListNode slow = head;
        // ListNode fast = head;
        // while (fast != null && fast.next != null) {
        //     slow = slow.next;
        //     fast = fast.next.next;
        //     if (slow == fast) {
        //         return true;
        //     }
        // }
        // return false;
        throw new UnsupportedOperationException("Implement hasCycle");
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
