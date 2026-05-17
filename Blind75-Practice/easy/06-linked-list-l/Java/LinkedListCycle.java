/*
141. Linked List Cycle
Difficulty: Easy
Pattern: Linked List / Fast-Slow

Return true if the list has a cycle.

Time: O(n), Space: O(1) Floyd
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
