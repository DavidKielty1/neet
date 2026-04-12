"""
LeetCode 203: Remove Linked List Elements
Difficulty: Easy
Pattern: Linked List

Problem:
Given the head of a linked list and an integer val, remove all the nodes of the linked
list that has Node.val == val, and return the new head.

Example 1:
Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]

Example 2:
Input: head = [], val = 1
Output: []

Example 3:
Input: head = [7,7,7,7], val = 7
Output: []

Constraints:
- The number of nodes in the list is in the range [0, 10^4]
- 1 <= Node.val <= 50
- 0 <= val <= 50

Time Complexity: O(n)
Space Complexity: O(1)
"""

from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def removeElements(self, head: Optional[ListNode], val: int) -> Optional[ListNode]:
        """
        Approach: Dummy node and iterate

        Strategy:
        1. Create dummy node before head
        2. Iterate through list
        3. Skip nodes with value equal to val
        4. Return dummy.next
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

        dummy = ListNode(0, head)
        current = dummy

        while current.next:
            if current.next.val == val:
                current.next = current.next.next
            else:
                current = current.next

        return dummy.next


# Helper function
def list_to_array(head):
    result = []
    while head:
        result.append(head.val)
        head = head.next
    return result


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1: [1,2,6,3,4,5,6], val = 6
    head1 = ListNode(1)
    head1.next = ListNode(2)
    head1.next.next = ListNode(6)
    head1.next.next.next = ListNode(3)
    head1.next.next.next.next = ListNode(4)
    head1.next.next.next.next.next = ListNode(5)
    head1.next.next.next.next.next.next = ListNode(6)
    result1 = solution.removeElements(head1, 6)
    assert list_to_array(result1) == [1, 2, 3, 4, 5]
    print("✓ Test case 1 passed")

    # Test case 2: [], val = 1
    result2 = solution.removeElements(None, 1)
    assert list_to_array(result2) == []
    print("✓ Test case 2 passed")

    # Test case 3: [7,7,7,7], val = 7
    head3 = ListNode(7)
    head3.next = ListNode(7)
    head3.next.next = ListNode(7)
    head3.next.next.next = ListNode(7)
    result3 = solution.removeElements(head3, 7)
    assert list_to_array(result3) == []
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
