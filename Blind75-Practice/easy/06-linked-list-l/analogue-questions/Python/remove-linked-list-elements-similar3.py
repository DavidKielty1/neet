"""
LeetCode 1474: Delete N Nodes After M Nodes of a Linked List
Difficulty: Easy
Pattern: Linked List

Problem:
You are given the head of a linked list and two integers m and n.

Traverse the linked list and remove some nodes in the following way:

- Start with the head as the current node.
- Keep the first m nodes starting with the current node.
- Remove the next n nodes
- Keep repeating steps 2 and 3 until you reach the end of the list.

Return the head of the modified list after removing the mentioned nodes.

Example 1:
Input: head = [1,2,3,4,5,6,7,8,9,10,11,12,13], m = 2, n = 3
Output: [1,2,6,7,11,12]
Explanation: Keep the first (m = 2) nodes 1, 2, remove the next (n = 3) nodes 3, 4, 5,
keep the next (m = 2) nodes 6, 7, remove the next (n = 3) nodes 8, 9, 10, and so on.

Example 2:
Input: head = [1,2,3,4,5,6,7,8,9,10,11], m = 1, n = 3
Output: [1,5,9]

Example 3:
Input: head = [1,2,3,4,5,6,7,8,9,10,11], m = 3, n = 1
Output: [1,2,3,5,6,7,9,10,11]

Constraints:
- The number of nodes in the list is in the range [1, 10^4]
- 1 <= Node.val <= 10^6
- 1 <= m, n <= 1000

Time Complexity: O(n)
Space Complexity: O(1)
"""

from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def deleteNodes(
        self, head: Optional[ListNode], m: int, n: int
    ) -> Optional[ListNode]:
        """
        Approach: Iterate and skip n nodes after keeping m

        Strategy:
        1. Keep m nodes
        2. Skip n nodes
        3. Repeat until end of list
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

        current = head

        while current:
            # Keep m nodes
            for _ in range(m - 1):
                if not current:
                    return head
                current = current.next

            if not current:
                return head

            # Skip n nodes
            temp = current.next
            for _ in range(n):
                if not temp:
                    break
                temp = temp.next

            current.next = temp
            current = current.next

        return head


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

    # Test case 1: [1,2,3,4,5,6,7,8,9,10,11,12,13], m = 2, n = 3
    head1 = ListNode(1)
    curr = head1
    for i in range(2, 14):
        curr.next = ListNode(i)
        curr = curr.next
    result1 = solution.deleteNodes(head1, 2, 3)
    assert list_to_array(result1) == [1, 2, 6, 7, 11, 12]
    print("✓ Test case 1 passed")

    # Test case 2: [1,2,3,4,5,6,7,8,9,10,11], m = 1, n = 3
    head2 = ListNode(1)
    curr = head2
    for i in range(2, 12):
        curr.next = ListNode(i)
        curr = curr.next
    result2 = solution.deleteNodes(head2, 1, 3)
    assert list_to_array(result2) == [1, 5, 9]
    print("✓ Test case 2 passed")

    print("\nAll test cases passed!")
