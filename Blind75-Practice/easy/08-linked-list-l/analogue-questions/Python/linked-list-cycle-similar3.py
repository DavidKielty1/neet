"""
Similar Problem 3: Middle of the Linked List
Difficulty: Easy
Pattern: Linked List (Fast & Slow Pointers)

Problem:
Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.

Example 1:
Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node is 3.

Example 2:
Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: There are two middle nodes 3 and 4, return the second (4).

Constraints:
- The number of nodes in the list is in the range [1, 100]
- 1 <= Node.val <= 100
"""

from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        """
        Approach: Fast & slow pointers

        Strategy:
        1. Slow moves one step, fast moves two steps
        2. When fast reaches end, slow is at middle
        3. For even length, this gives second middle
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

        slow = fast = head

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

        return slow


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

    # Test case 1: Odd length
    head = create_list([1, 2, 3, 4, 5])
    middle = solution.middleNode(head)
    assert list_to_array(middle) == [3, 4, 5]
    print("✓ Test case 1 passed")

    # Test case 2: Even length
    head = create_list([1, 2, 3, 4, 5, 6])
    middle = solution.middleNode(head)
    assert list_to_array(middle) == [4, 5, 6]
    print("✓ Test case 2 passed")

    # Test case 3: Single node
    head = create_list([1])
    middle = solution.middleNode(head)
    assert list_to_array(middle) == [1]
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
