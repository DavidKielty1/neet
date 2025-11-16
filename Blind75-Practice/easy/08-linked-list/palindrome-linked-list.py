"""
LeetCode 234: Palindrome Linked List
Difficulty: Easy
Pattern: Linked List / Two Pointers

Problem:
Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

Example 1:
Input: head = [1,2,2,1]
Output: true

Example 2:
Input: head = [1,2]
Output: false

Constraints:
- The number of nodes in the list is in the range [1, 10^5]
- 0 <= Node.val <= 9

Follow up: Could you do it in O(n) time and O(1) space?

Time Complexity: O(n)
Space Complexity: O(1) for optimal solution, O(n) for simple solution
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
        1. Find middle of linked list using slow/fast pointers
        2. Reverse second half of list
        3. Compare first half with reversed second half
        4. Restore list (optional)
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


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1: [1,2,2,1]
    head1 = ListNode(1)
    head1.next = ListNode(2)
    head1.next.next = ListNode(2)
    head1.next.next.next = ListNode(1)
    assert solution.isPalindrome(head1) == True
    print("✓ Test case 1 passed")

    # Test case 2: [1,2]
    head2 = ListNode(1)
    head2.next = ListNode(2)
    assert solution.isPalindrome(head2) == False
    print("✓ Test case 2 passed")

    # Test case 3: [1]
    head3 = ListNode(1)
    assert solution.isPalindrome(head3) == True
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
