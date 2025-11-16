"""
Similar Problem 3: Swap Nodes in Pairs
Difficulty: Easy
Pattern: Linked List

Problem:
Given a linked list, swap every two adjacent nodes and return its head.
You must solve the problem without modifying the values in the list's nodes
(i.e., only nodes themselves may be changed).

Example 1:
Input: head = [1,2,3,4]
Output: [2,1,4,3]

Example 2:
Input: head = []
Output: []

Example 3:
Input: head = [1]
Output: [1]

Constraints:
- The number of nodes in the list is in the range [0, 100]
- 0 <= Node.val <= 100
"""

from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def swapPairs(self, head: Optional[ListNode]) -> Optional[ListNode]:
        """
        Approach: Swap pairs iteratively

        Strategy:
        1. Use dummy node to handle head swap
        2. For each pair, swap the nodes
        3. Move to next pair
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

        dummy = ListNode(0)
        dummy.next = head
        prev = dummy

        while prev.next and prev.next.next:
            # Nodes to swap
            first = prev.next
            second = prev.next.next

            # Perform swap
            first.next = second.next
            second.next = first
            prev.next = second

            # Move to next pair
            prev = first

        return dummy.next


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


def list_to_array(head):
    result = []
    while head:
        result.append(head.val)
        head = head.next
    return result


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    head = create_list([1, 2, 3, 4])
    swapped = solution.swapPairs(head)
    assert list_to_array(swapped) == [2, 1, 4, 3]
    print("✓ Test case 1 passed")

    # Test case 2
    head = create_list([])
    swapped = solution.swapPairs(head)
    assert list_to_array(swapped) == []
    print("✓ Test case 2 passed")

    # Test case 3
    head = create_list([1])
    swapped = solution.swapPairs(head)
    assert list_to_array(swapped) == [1]
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
