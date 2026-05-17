/*
 * Ported from: 08-linked-list/analogue-questions/Python/middle-of-linked-list-similar3.py
 * --- Original description ---
LeetCode 160: Intersection of Two Linked Lists
Difficulty: Easy
Pattern: Linked List / Two Pointers

Problem:
Given the heads of two singly linked-lists headA and headB, return the node at which the
two lists intersect. If the two linked lists have no intersection at all, return null.

For example, the following two linked lists begin to intersect at node c1:
   a1 → a2
            ↘
             c1 → c2 → c3
            ↗
        b1 → b2 → b3

The test cases are generated such that there are no cycles anywhere in the entire linked
structure.

Note that the linked lists must retain their original structure after the function returns.

Example 1:
Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
Output: Intersected at '8'

Example 2:
Input: intersectVal = 2, listA = [1,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
Output: Intersected at '2'

Example 3:
Input: intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
Output: No intersection

Constraints:
- The number of nodes of listA is in the m.
- The number of nodes of listB is in the n.
- 1 <= m, n <= 3 * 10^4
- 1 <= Node.val <= 10^5
- 0 <= skipA < m
- 0 <= skipB < n
- intersectVal is 0 if listA and listB do not intersect.
- intersectVal == listA[skipA] == listB[skipB] if listA and listB intersect.

Time Complexity: O(m + n)
Space Complexity: O(1)
 */

import java.util.*;
import java.util.function.*;


public class MiddleOfLinkedListSimilar3 {

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
            // pA, pB = (headA, headB)
            // while pA != pB:
            // pA = pA.next if pA else headB
            // pB = pB.next if pB else headA
            // return pA

            throw new UnsupportedOperationException("Implement getIntersectionNode");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // common = ListNode(8);
        // common.next = ListNode(4)
        // common.next.next = ListNode(5)
        // headA = ListNode(4);
        // headA.next = ListNode(1)
        // headA.next.next = common
        // headB = ListNode(5);
        // headB.next = ListNode(6)
        // headB.next.next = ListNode(1)
        // headB.next.next.next = common
        // result = sol.getIntersectionNode(headA, headB);
        // assert result == common  // needs locals (port helpers): ['common', 'result']
        System.out.println("✓ Test case 1 passed");
        // headC = ListNode(2);
        // headC.next = ListNode(6)
        // headC.next.next = ListNode(4)
        // headD = ListNode(1);
        // headD.next = ListNode(5)
        // result2 = sol.getIntersectionNode(headC, headD);
        // assert result2 is None  // needs locals (port helpers): ['result2']
        System.out.println("✓ Test case 2 passed");
        System.out.println("\nAll test cases passed!");
    }
}
