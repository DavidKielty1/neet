"""
Similar Problem 1: Palindrome Linked List
Difficulty: Easy
Pattern: Linked List (Two Pointers + Reverse)

Problem:
Given the head of a singly linked list, return true if it is a palindrome.

Example 1:
Input: head = [1,2,2,1]
Output: true

Example 2:
Input: head = [1,2]
Output: false

Constraints:
- The number of nodes in the list is in the range [1, 10^5]
- 0 <= Node.val <= 9
"""

from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        """
        Approach: Find middle, reverse second half, compare

        Strategy:
        1. Use fast/slow pointers to find middle
        2. Reverse second half of list
        3. Compare first half with reversed second half
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
            return True

        # Find middle
        slow = fast = head
        while fast.next and fast.next.next:
            slow = slow.next
            fast = fast.next.next

        # Reverse second half
        second_half = self.reverse(slow.next)

        # Compare
        first_half = head
        while second_half:
            if first_half.val != second_half.val:
                return False
            first_half = first_half.next
            second_half = second_half.next

        return True

    def reverse(self, head):
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


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    head = create_list([1, 2, 2, 1])
    assert solution.isPalindrome(head) == True
    print("✓ Test case 1 passed")

    # Test case 2
    head = create_list([1, 2])
    assert solution.isPalindrome(head) == False
    print("✓ Test case 2 passed")

    # Test case 3
    head = create_list([1])
    assert solution.isPalindrome(head) == True
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
