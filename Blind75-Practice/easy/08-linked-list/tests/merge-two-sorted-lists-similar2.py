"""
Similar Problem 2: Add Two Numbers
Difficulty: Easy
Pattern: Linked List (Two Pointers)

Problem:
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a single digit.
Add the two numbers and return the sum as a linked list.

Example 1:
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807

Example 2:
Input: l1 = [0], l2 = [0]
Output: [0]

Example 3:
Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]

Constraints:
- The number of nodes in each linked list is in the range [1, 100]
- 0 <= Node.val <= 9
- It is guaranteed that the list represents a number that does not have leading zeros
"""

from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def addTwoNumbers(
        self, l1: Optional[ListNode], l2: Optional[ListNode]
    ) -> Optional[ListNode]:
        """
        Approach: Simulate addition with carry

        Strategy:
        1. Traverse both lists simultaneously
        2. Add corresponding digits plus carry
        3. Handle carry at each step
        4. Continue until both lists exhausted and no carry
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
        current = dummy
        carry = 0

        while l1 or l2 or carry:
            # Get values (0 if None)
            val1 = l1.val if l1 else 0
            val2 = l2.val if l2 else 0

            # Calculate sum and carry
            total = val1 + val2 + carry
            carry = total // 10
            digit = total % 10

            # Create new node
            current.next = ListNode(digit)
            current = current.next

            # Move to next nodes
            if l1:
                l1 = l1.next
            if l2:
                l2 = l2.next

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
    l1 = create_list([2, 4, 3])
    l2 = create_list([5, 6, 4])
    result = solution.addTwoNumbers(l1, l2)
    assert list_to_array(result) == [7, 0, 8]
    print("✓ Test case 1 passed")

    # Test case 2
    l1 = create_list([0])
    l2 = create_list([0])
    result = solution.addTwoNumbers(l1, l2)
    assert list_to_array(result) == [0]
    print("✓ Test case 2 passed")

    # Test case 3
    l1 = create_list([9, 9, 9, 9, 9, 9, 9])
    l2 = create_list([9, 9, 9, 9])
    result = solution.addTwoNumbers(l1, l2)
    assert list_to_array(result) == [8, 9, 9, 9, 0, 0, 0, 1]
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
