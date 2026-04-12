"""
LeetCode 19: Remove Nth Node From End of List
Difficulty: Medium (simplified to Easy)
Pattern: Linked List / Two Pointers

Problem:
Given the head of a linked list, remove the nth node from the end of the list and return
its head.

Example 1:
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]

Example 2:
Input: head = [1], n = 1
Output: []

Example 3:
Input: head = [1,2], n = 1
Output: [1]

Constraints:
- The number of nodes in the list is sz.
- 1 <= sz <= 30
- 0 <= Node.val <= 100
- 1 <= n <= sz

Follow up: Could you do this in one pass?

Time Complexity: O(n)
Space Complexity: O(1)
"""

from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        """
        Approach: Two pointers with gap

        Strategy:
        1. Create dummy node before head
        2. Use two pointers with n+1 gap
        3. Move both until right reaches end
        4. Left will be at node before target
        5. Remove target node
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
        left = right = dummy

        # Move right n+1 steps ahead
        for _ in range(n + 1):
            right = right.next

        # Move both until right reaches end
        while right:
            left = left.next
            right = right.next

        # Remove nth node
        left.next = left.next.next

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

    # Test case 1: [1,2,3,4,5], n = 2
    head1 = ListNode(1)
    head1.next = ListNode(2)
    head1.next.next = ListNode(3)
    head1.next.next.next = ListNode(4)
    head1.next.next.next.next = ListNode(5)
    result1 = solution.removeNthFromEnd(head1, 2)
    assert list_to_array(result1) == [1, 2, 3, 5]
    print("✓ Test case 1 passed")

    # Test case 2: [1], n = 1
    head2 = ListNode(1)
    result2 = solution.removeNthFromEnd(head2, 1)
    assert list_to_array(result2) == []
    print("✓ Test case 2 passed")

    print("\nAll test cases passed!")
