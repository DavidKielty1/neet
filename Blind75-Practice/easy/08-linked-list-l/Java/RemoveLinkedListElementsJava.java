/*
203. Remove Linked List Elements
Difficulty: Easy
Pattern: Linked List

Remove all nodes with value val.

Time: O(n), Space: O(1)
*/
public class RemoveLinkedListElementsJava {
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
