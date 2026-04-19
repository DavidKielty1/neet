"""
LeetCode 141: Linked List Cycle
Difficulty: Easy
Pattern: Linked List (Fast & Slow Pointers)

Problem:
Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be
reached again by continuously following the next pointer. Internally, pos is used
to denote the index of the node that tail's next pointer is connected to. Note that
pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.

Example 1:
Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

Example 2:
Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.

Example 3:
Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.

Constraints:
- The number of the nodes in the list is in the range [0, 10^4]
- -10^5 <= Node.val <= 10^5
- pos is -1 or a valid index in the linked-list

Time Complexity: O(n)
Space Complexity: O(1)
"""

from typing import Optional


# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        """
        Approach: Floyd's Cycle Detection (Fast & Slow Pointers)

        Strategy:
        1. Use two pointers: slow moves 1 step, fast moves 2 steps
        2. If there's a cycle, fast will eventually meet slow
        3. If fast reaches None, there's no cycle

        Why it works:
        - If there's a cycle, fast pointer will eventually lap slow pointer
        - If no cycle, fast pointer reaches end
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
            return False

        slow = head
        fast = head

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

            if slow == fast:
                return True

        return False


# Alternative approach using hash set
class SolutionHashSet:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
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

        Time Complexity: O(n)
        Space Complexity: O(n)
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

        seen = set()
        current = head

        while current:
            if current in seen:
                return True
            seen.add(current)
            current = current.next

        return False


# Helper functions for testing
def create_linked_list_with_cycle(values, pos):
    """Create linked list with cycle at position pos"""
    if not values:
        return None

    head = ListNode(values[0])
    current = head
    nodes = [head]

    for val in values[1:]:
        current.next = ListNode(val)
        current = current.next
        nodes.append(current)

    # Create cycle
    if pos >= 0:
        current.next = nodes[pos]

    return head


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1: Has cycle
    head = create_linked_list_with_cycle([3, 2, 0, -4], 1)
    assert solution.hasCycle(head) == True
    print("✓ Test case 1 passed")

    # Test case 2: Has cycle
    head = create_linked_list_with_cycle([1, 2], 0)
    assert solution.hasCycle(head) == True
    print("✓ Test case 2 passed")

    # Test case 3: No cycle
    head = create_linked_list_with_cycle([1], -1)
    assert solution.hasCycle(head) == False
    print("✓ Test case 3 passed")

    # Test case 4: Empty list
    head = create_linked_list_with_cycle([], -1)
    assert solution.hasCycle(head) == False
    print("✓ Test case 4 passed")

    print("\nAll test cases passed!")
