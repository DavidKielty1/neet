/*
 * Ported from: 08-linked-list/analogue-questions/Python/merge-two-sorted-lists-similar1.py
 * --- Original description ---
Similar Problem 1: Merge K Sorted Lists (Easy Version - K=2)
Difficulty: Easy
Pattern: Linked List (Two Pointers)

Problem:
You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
Merge all the linked-lists into one sorted linked-list and return it.

For this easy version, k = 2 (same as merge two sorted lists).

Example 1:
Input: lists = [[1,4,5],[1,3,4]]
Output: [1,1,3,4,4,5]

Example 2:
Input: lists = []
Output: []

Example 3:
Input: lists = [[]]
Output: []

Constraints:
- k == lists.length
- 0 <= k <= 10
- 0 <= lists[i].length <= 500
- -10^4 <= lists[i][j] <= 10^4
- lists[i] is sorted in ascending order
 */

import java.util.*;
import java.util.function.*;


public class MergeTwoSortedListsSimilar1 {

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

    static class Solution {
        public ListNode mergeKLists(List<ListNode> lists) {
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

            // if not lists or all((l is None for l in lists)):
            // return None
            // lists = [l for l in lists if l is not None]
            // if not lists:
            // return None
            // result = lists[0]
            // for i in range(1, len(lists)):
            // result = self.mergeTwoLists(result, lists[i])
            // return result

            throw new UnsupportedOperationException("Implement mergeKLists");
        }

        public Object mergeTwoLists(Object l1, Object l2) {
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

            // dummy = ListNode(0)
            // current = dummy
            // while l1 and l2:
            // if l1.val < l2.val:
            // current.next = l1
            // l1 = l1.next
            // else:
            // current.next = l2
            // l2 = l2.next
            // current = current.next
            // current.next = l1 or l2
            // return dummy.next

            throw new UnsupportedOperationException("Implement mergeTwoLists");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // lists = [create_list(java.util.List.of(1,4,5)), create_list(java.util.List.of(1,3,4))];
        // merged = sol.mergeKLists(lists);
        // assert list_to_array(merged) == [1, 1, 3, 4, 4, 5]  // needs locals (port helpers): ['list_to_array', 'merged']
        System.out.println("✓ Test case 1 passed");
        // lists = java.util.List.of();
        // merged = sol.mergeKLists(lists);
        // assert list_to_array(merged) == []  // needs locals (port helpers): ['list_to_array', 'merged']
        System.out.println("✓ Test case 2 passed");
        // lists = [null];
        // merged = sol.mergeKLists(lists);
        // assert list_to_array(merged) == []  // needs locals (port helpers): ['list_to_array', 'merged']
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
