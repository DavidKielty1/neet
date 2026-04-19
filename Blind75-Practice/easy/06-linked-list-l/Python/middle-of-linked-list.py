"""
LeetCode 876: Middle of the Linked List
Difficulty: Easy
Pattern: Linked List / Two Pointers

Problem:
Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.

Example 1:
Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.

Example 2:
Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.

Constraints:
- The number of nodes in the list is in the range [1, 100]
- 1 <= Node.val <= 100

Time Complexity: O(n)
Space Complexity: O(1)
"""

from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        """
        Approach: Fast and slow pointers

        Strategy:
        1. Use two pointers: slow and fast
        2. Slow moves one step, fast moves two steps
        3. When fast reaches end, slow is at middle
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


# Helper function to convert list to array
def list_to_array(head):
    result = []
    while head:
        result.append(head.val)
        head = head.next
    return result


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1: [1,2,3,4,5]
    head1 = ListNode(1)
    head1.next = ListNode(2)
    head1.next.next = ListNode(3)
    head1.next.next.next = ListNode(4)
    head1.next.next.next.next = ListNode(5)
    result1 = solution.middleNode(head1)
    assert list_to_array(result1) == [3, 4, 5]
    print("✓ Test case 1 passed")

    # Test case 2: [1,2,3,4,5,6]
    head2 = ListNode(1)
    head2.next = ListNode(2)
    head2.next.next = ListNode(3)
    head2.next.next.next = ListNode(4)
    head2.next.next.next.next = ListNode(5)
    head2.next.next.next.next.next = ListNode(6)
    result2 = solution.middleNode(head2)
    assert list_to_array(result2) == [4, 5, 6]
    print("✓ Test case 2 passed")

    print("\nAll test cases passed!")
