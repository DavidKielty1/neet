/*
21. Merge Two Sorted Lists
Difficulty: Easy
Pattern: Linked List

Merge two sorted linked lists into one sorted list.

Time: O(n + m), Space: O(1)
*/
public class MergeTwoSortedListsJava {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
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

        // Dummy head + merge.

        // ListNode dummy = new ListNode(0);
        // ListNode current = dummy;
        // while (list1 != null && list2 != null) {
        //     if (list1.val <= list2.val) {
        //         current.next = list1;
        //         list1 = list1.next;
        //     } else {
        //         current.next = list2;
        //         list2 = list2.next;
        //     }
        //     current = current.next;
        // }
        // current.next = (list1 != null) ? list1 : list2;
        // return dummy.next;
        throw new UnsupportedOperationException("Implement mergeTwoLists");
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
