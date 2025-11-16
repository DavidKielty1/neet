"""
Similar Problem 1: Linked List Cycle II (Find Entry Point)
Difficulty: Easy
Pattern: Linked List (Fast & Slow Pointers)

Problem:
Given the head of a linked list, return the node where the cycle begins.
If there is no cycle, return null.

Example 1:
Input: head = [3,2,0,-4], pos = 1
Output: tail connects to node index 1

Example 2:
Input: head = [1,2], pos = 0
Output: tail connects to node index 0

Example 3:
Input: head = [1], pos = -1
Output: no cycle

Constraints:
- The number of nodes in the list is in the range [0, 10^4]
- -10^5 <= Node.val <= 10^5
- pos is -1 or a valid index in the linked list
"""

from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        """
        Approach: Floyd's algorithm with entry point detection

        Strategy:
        1. Use fast and slow pointers to detect cycle
        2. If cycle exists, find entry point
        3. Move one pointer to head, keep other at meeting point
        4. Move both one step at a time until they meet at entry
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

        if not head or not head.next:
            return None

        # Detect cycle
        slow = fast = head
        has_cycle = False

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

            if slow == fast:
                has_cycle = True
                break

        if not has_cycle:
            return None

        # Find entry point
        slow = head
        while slow != fast:
            slow = slow.next
            fast = fast.next

        return slow


# Helper functions
def create_list_with_cycle(values, pos):
    if not values:
        return None

    head = ListNode(values[0])
    current = head
    cycle_node = None

    if pos == 0:
        cycle_node = head

    for i, val in enumerate(values[1:], 1):
        current.next = ListNode(val)
        current = current.next
        if i == pos:
            cycle_node = current

    # Create cycle
    if pos >= 0 and cycle_node:
        current.next = cycle_node

    return head


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1: Cycle at index 1
    head = create_list_with_cycle([3, 2, 0, -4], 1)
    result = solution.detectCycle(head)
    assert result is not None and result.val == 2
    print("✓ Test case 1 passed")

    # Test case 2: Cycle at index 0
    head = create_list_with_cycle([1, 2], 0)
    result = solution.detectCycle(head)
    assert result is not None and result.val == 1
    print("✓ Test case 2 passed")

    # Test case 3: No cycle
    head = create_list_with_cycle([1], -1)
    result = solution.detectCycle(head)
    assert result is None
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
