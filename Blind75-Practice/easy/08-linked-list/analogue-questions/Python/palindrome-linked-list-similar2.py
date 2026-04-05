"""
LeetCode 2130: Maximum Twin Sum of a Linked List
Difficulty: Medium (simplified to Easy)
Pattern: Linked List / Two Pointers

Problem:
In a linked list of size n, where n is even, the ith node (0-indexed) of the linked
list is known as the twin of the (n-1-i)th node, if 0 <= i <= (n / 2) - 1.

For example, if n = 4, then node 0 is the twin of node 3, and node 1 is the twin of node 2.
These are the only nodes with twins for n = 4.

The twin sum is defined as the sum of a node and its twin.

Given the head of a linked list with even length, return the maximum twin sum of the
linked list.

Example 1:
Input: head = [5,4,2,1]
Output: 6
Explanation:
Nodes 0 and 1 are the twins of nodes 3 and 2, respectively. All have twin sum = 6.
There are no other nodes with twins in the linked list.
Thus, the maximum twin sum of the linked list is 6.

Example 2:
Input: head = [4,2,2,3]
Output: 7
Explanation:
The nodes with twins present in this linked list are:
- Node 0 is the twin of node 3 having a twin sum of 4 + 3 = 7.
- Node 1 is the twin of node 2 having a twin sum of 2 + 2 = 4.
Thus, the maximum twin sum of the linked list is max(7, 4) = 7.

Example 3:
Input: head = [1,100000]
Output: 100001

Constraints:
- The number of nodes in the list is an even integer in the range [2, 10^5]
- 1 <= Node.val <= 10^5

Time Complexity: O(n)
Space Complexity: O(1)
"""

from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def pairSum(self, head: Optional[ListNode]) -> int:
        """
        Approach: Find middle, reverse second half, compare

        Strategy:
        1. Find middle of list
        2. Reverse second half
        3. Iterate both halves together calculating twin sums
        4. Return maximum twin sum
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

        # Find middle
        slow = fast = head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

        # Reverse second half
        prev = None
        while slow:
            next_node = slow.next
            slow.next = prev
            prev = slow
            slow = next_node

        # Calculate max twin sum
        max_sum = 0
        first, second = head, prev
        while second:
            max_sum = max(max_sum, first.val + second.val)
            first = first.next
            second = second.next

        return max_sum


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1: [5,4,2,1]
    head1 = ListNode(5)
    head1.next = ListNode(4)
    head1.next.next = ListNode(2)
    head1.next.next.next = ListNode(1)
    assert solution.pairSum(head1) == 6
    print("✓ Test case 1 passed")

    # Test case 2: [4,2,2,3]
    head2 = ListNode(4)
    head2.next = ListNode(2)
    head2.next.next = ListNode(2)
    head2.next.next.next = ListNode(3)
    assert solution.pairSum(head2) == 7
    print("✓ Test case 2 passed")

    # Test case 3: [1,100000]
    head3 = ListNode(1)
    head3.next = ListNode(100000)
    assert solution.pairSum(head3) == 100001
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
