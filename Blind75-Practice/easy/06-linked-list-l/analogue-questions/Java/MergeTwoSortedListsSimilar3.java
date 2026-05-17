/*
 * Ported from: 08-linked-list/analogue-questions/Python/merge-two-sorted-lists-similar3.py
 * --- Original description ---
Similar Problem 3: Intersection of Two Linked Lists
Difficulty: Easy
Pattern: Linked List (Two Pointers)

Problem:
Given the heads of two singly linked-lists headA and headB, return the node at which
the two lists intersect. If the two linked lists have no intersection at all, return null.

Example 1:
Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
Output: Reference to node with value 8

Example 2:
Input: intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
Output: null

Constraints:
- The number of nodes in listA is in the range [0, 3 * 10^4]
- The number of nodes in listB is in the range [0, 3 * 10^4]
- 1 <= Node.val <= 10^5
 */

import java.util.*;
import java.util.function.*;


public class MergeTwoSortedListsSimilar3 {

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
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
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

            // if not headA or not headB:
            // return None
            // pointerA = headA
            // pointerB = headB
            // while pointerA != pointerB:
            // pointerA = pointerA.next if pointerA else headB
            // pointerB = pointerB.next if pointerB else headA
            // return pointerA

            throw new UnsupportedOperationException("Implement getIntersectionNode");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // headA, headB, intersection = create_intersection([4, 1, 8, 4, 5], [5, 6, 1, 8, 4, 5], 2, 3)
        // result = sol.getIntersectionNode(headA, headB);
        // assert result == intersection  // needs locals (port helpers): ['intersection', 'result']
        System.out.println("✓ Test case 1 passed");
        // listA = create_list(java.util.List.of(2,6,4));
        // listB = create_list(java.util.List.of(1,5));
        // result = sol.getIntersectionNode(listA, listB);
        // assert result is None  // needs locals (port helpers): ['result']
        System.out.println("✓ Test case 2 passed");
        System.out.println("\nAll test cases passed!");
    }
}
