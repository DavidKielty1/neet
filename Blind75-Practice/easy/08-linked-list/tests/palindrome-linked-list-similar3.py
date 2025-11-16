"""
LeetCode 1290: Convert Binary Number in a Linked List to Integer
Difficulty: Easy
Pattern: Linked List

Problem:
Given head which is a reference node to a singly-linked list. The value of each node in
the linked list is either 0 or 1. The linked list holds the binary representation of a number.

Return the decimal value of the number in the linked list.

The most significant bit is at the head of the linked list.

Example 1:
Input: head = [1,0,1]
Output: 5
Explanation: (101) in base 2 = (5) in base 10

Example 2:
Input: head = [0]
Output: 0

Constraints:
- The Linked List is not empty.
- Number of nodes will not exceed 30.
- Each node's value is either 0 or 1.

Time Complexity: O(n)
Space Complexity: O(1)
"""

from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def getDecimalValue(self, head: Optional[ListNode]) -> int:
        """
        Approach: Iterate and build number

        Strategy:
        1. Traverse linked list
        2. For each node, shift result left and add current bit
        3. Return final decimal value
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

        result = 0

        while head:
            result = result * 2 + head.val
            head = head.next

        return result


# Alternative using bit shifting
class SolutionBitShift:
    def getDecimalValue(self, head: Optional[ListNode]) -> int:
        result = 0
        while head:
            result = (result << 1) | head.val
            head = head.next
        return result


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1: [1,0,1]
    head1 = ListNode(1)
    head1.next = ListNode(0)
    head1.next.next = ListNode(1)
    assert solution.getDecimalValue(head1) == 5
    print("✓ Test case 1 passed")

    # Test case 2: [0]
    head2 = ListNode(0)
    assert solution.getDecimalValue(head2) == 0
    print("✓ Test case 2 passed")

    # Test case 3: [1]
    head3 = ListNode(1)
    assert solution.getDecimalValue(head3) == 1
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
