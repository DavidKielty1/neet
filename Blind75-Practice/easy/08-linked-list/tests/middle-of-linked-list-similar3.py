"""
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
"""

from typing import Optional


class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution:
    def getIntersectionNode(
        self, headA: ListNode, headB: ListNode
    ) -> Optional[ListNode]:
        """
        Approach: Two pointers with path switching

        Strategy:
        1. Two pointers start at headA and headB
        2. When a pointer reaches end, redirect to other head
        3. They will meet at intersection or both become None
        4. This works because they travel same total distance
        """

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        if not headA or not headB:
            return None

        pA, pB = headA, headB

        while pA != pB:
            pA = pA.next if pA else headB
            pB = pB.next if pB else headA

        return pA


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1: Intersection at value 8
    # listA = [4,1,8,4,5]
    # listB = [5,6,1,8,4,5]
    common = ListNode(8)
    common.next = ListNode(4)
    common.next.next = ListNode(5)

    headA = ListNode(4)
    headA.next = ListNode(1)
    headA.next.next = common

    headB = ListNode(5)
    headB.next = ListNode(6)
    headB.next.next = ListNode(1)
    headB.next.next.next = common

    result = solution.getIntersectionNode(headA, headB)
    assert result == common
    print("✓ Test case 1 passed")

    # Test case 2: No intersection
    headC = ListNode(2)
    headC.next = ListNode(6)
    headC.next.next = ListNode(4)

    headD = ListNode(1)
    headD.next = ListNode(5)

    result2 = solution.getIntersectionNode(headC, headD)
    assert result2 is None
    print("✓ Test case 2 passed")

    print("\nAll test cases passed!")
