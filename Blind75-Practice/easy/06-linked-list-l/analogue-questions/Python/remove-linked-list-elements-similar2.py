"""
LeetCode 83: Remove Duplicates from Sorted List
Difficulty: Easy
Pattern: Linked List

Problem:
Given the head of a sorted linked list, delete all duplicates such that each element
appears only once. Return the linked list sorted as well.

Example 1:
Input: head = [1,1,2]
Output: [1,2]

Example 2:
Input: head = [1,1,2,3,3]
Output: [1,2,3]

Constraints:
- The number of nodes in the list is in the range [0, 300]
- -100 <= Node.val <= 100
- The list is guaranteed to be sorted in ascending order

Time Complexity: O(n)
Space Complexity: O(1)
"""

from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        """
        Approach: Iterate and skip duplicates

        Strategy:
        1. Iterate through list
        2. If current value equals next value, skip next
        3. Otherwise move to next node
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

        current = head

        while current and current.next:
            if current.val == current.next.val:
                current.next = current.next.next
            else:
                current = current.next

        return head


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

    # Test case 1: [1,1,2]
    head1 = ListNode(1)
    head1.next = ListNode(1)
    head1.next.next = ListNode(2)
    result1 = solution.deleteDuplicates(head1)
    assert list_to_array(result1) == [1, 2]
    print("✓ Test case 1 passed")

    # Test case 2: [1,1,2,3,3]
    head2 = ListNode(1)
    head2.next = ListNode(1)
    head2.next.next = ListNode(2)
    head2.next.next.next = ListNode(3)
    head2.next.next.next.next = ListNode(3)
    result2 = solution.deleteDuplicates(head2)
    assert list_to_array(result2) == [1, 2, 3]
    print("✓ Test case 2 passed")

    print("\nAll test cases passed!")
