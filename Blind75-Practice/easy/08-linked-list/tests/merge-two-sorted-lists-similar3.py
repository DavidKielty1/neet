"""
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
"""

from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def getIntersectionNode(
        self, headA: ListNode, headB: ListNode
    ) -> Optional[ListNode]:
        """
        Approach: Two pointers with length equalization

        Strategy:
        1. Use two pointers, one for each list
        2. When pointer reaches end, switch to other list
        3. Pointers will meet at intersection or both reach None
        4. This equalizes the lengths effectively
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

        pointerA = headA
        pointerB = headB

        # Traverse until they meet or both become None
        while pointerA != pointerB:
            # Move pointerA: go to next or switch to headB
            pointerA = pointerA.next if pointerA else headB
            # Move pointerB: go to next or switch to headA
            pointerB = pointerB.next if pointerB else headA

        return pointerA  # Either intersection node or None


# Helper functions
def create_list(values):
    if not values:
        return None
    head = ListNode(values[0])
    current = head
    for val in values[1:]:
        current.next = ListNode(val)
        current = current.next
    return head


def create_intersection(listA_vals, listB_vals, skipA, skipB):
    """Create two lists with intersection"""
    # Create intersection part
    intersection = create_list(listA_vals[skipA:]) if skipA < len(listA_vals) else None

    # Create listA
    headA = create_list(listA_vals[:skipA])
    if headA:
        current = headA
        while current.next:
            current = current.next
        current.next = intersection
    else:
        headA = intersection

    # Create listB
    headB = create_list(listB_vals[:skipB])
    if headB:
        current = headB
        while current.next:
            current = current.next
        current.next = intersection
    else:
        headB = intersection

    return headA, headB, intersection


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1: With intersection
    headA, headB, intersection = create_intersection(
        [4, 1, 8, 4, 5], [5, 6, 1, 8, 4, 5], 2, 3
    )
    result = solution.getIntersectionNode(headA, headB)
    assert result == intersection
    print("✓ Test case 1 passed")

    # Test case 2: No intersection
    listA = create_list([2, 6, 4])
    listB = create_list([1, 5])
    result = solution.getIntersectionNode(listA, listB)
    assert result is None
    print("✓ Test case 2 passed")

    print("\nAll test cases passed!")
