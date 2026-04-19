"""
LeetCode 206: Reverse Linked List
Difficulty: Easy
Pattern: Linked List

Problem:
Given the head of a singly linked list, reverse the list, and return the reversed list.

Example 1:
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]

Example 2:
Input: head = [1,2]
Output: [2,1]

Example 3:
Input: head = []
Output: []

Constraints:
- The number of nodes in the list is the range [0, 5000]
- -5000 <= Node.val <= 5000

Time Complexity: O(n)
Space Complexity: O(1) for iterative, O(n) for recursive
"""

from typing import Optional


# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        """
        Approach: Iterative pointer reversal

        Strategy:
        1. Use three pointers: prev, curr, next
        2. Iterate through list
        3. For each node, reverse the pointer to previous
        4. Move all pointers forward
        5. Return prev (new head)
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

        prev = None
        curr = head

        while curr:
            # Save next node
            next_temp = curr.next

            # Reverse current node's pointer
            curr.next = prev

            # Move pointers forward
            prev = curr
            curr = next_temp

        return prev


# Alternative recursive approach
class SolutionRecursive:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
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

        Recursive approach
        """
        # Base case
        if not head or not head.next:
            return head

        # Recursively reverse rest of list
        new_head = self.reverseList(head.next)

        # Reverse current node
        head.next.next = head
        head.next = None

        return new_head


# Helper functions for testing
def create_linked_list(values):
    """Create linked list from list of values"""
    if not values:
        return None

    head = ListNode(values[0])
    current = head
    for val in values[1:]:
        current.next = ListNode(val)
        current = current.next

    return head


def linked_list_to_list(head):
    """Convert linked list to Python list"""
    result = []
    current = head
    while current:
        result.append(current.val)
        current = current.next
    return result


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    head = create_linked_list([1, 2, 3, 4, 5])
    result = solution.reverseList(head)
    assert linked_list_to_list(result) == [5, 4, 3, 2, 1]
    print("✓ Test case 1 passed")

    # Test case 2
    head = create_linked_list([1, 2])
    result = solution.reverseList(head)
    assert linked_list_to_list(result) == [2, 1]
    print("✓ Test case 2 passed")

    # Test case 3
    head = create_linked_list([])
    result = solution.reverseList(head)
    assert linked_list_to_list(result) == []
    print("✓ Test case 3 passed")

    # Test case 4
    head = create_linked_list([1])
    result = solution.reverseList(head)
    assert linked_list_to_list(result) == [1]
    print("✓ Test case 4 passed")

    print("\nAll test cases passed!")
