"""
Similar Problem 2: Reverse Linked List II (Easy Version - Fixed Range)
Difficulty: Easy
Pattern: Linked List

Problem:
Given the head of a singly linked list and two integers left and right where left <= right,
reverse the nodes of the list from position left to position right (1-indexed), and return the reversed list.

For this easy version, assume left = 1 and right = list length (reverse entire list).

Example 1:
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]

Example 2:
Input: head = [5]
Output: [5]

Constraints:
- The number of nodes in the list is n
- 1 <= n <= 500
- -500 <= Node.val <= 500
"""

from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def reverseBetween(self, head: Optional[ListNode]) -> Optional[ListNode]:
        """
        Approach: Reverse entire list (same as reverse linked list)

        Strategy:
        1. Use three pointers: prev, current, next
        2. Reverse all links
        3. Return new head
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
        current = head

        while current:
            next_node = current.next
            current.next = prev
            prev = current
            current = next_node

        return prev


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
    head = create_list([1, 2, 3, 4, 5])
    reversed_head = solution.reverseBetween(head)
    assert list_to_array(reversed_head) == [5, 4, 3, 2, 1]
    print("✓ Test case 1 passed")

    # Test case 2
    head = create_list([5])
    reversed_head = solution.reverseBetween(head)
    assert list_to_array(reversed_head) == [5]
    print("✓ Test case 2 passed")

    print("\nAll test cases passed!")
