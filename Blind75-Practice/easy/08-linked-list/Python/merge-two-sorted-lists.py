"""
LeetCode 21: Merge Two Sorted Lists
Difficulty: Easy
Pattern: Linked List

Problem:
You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists into one sorted list. The list should be made by splicing
together the nodes of the first two lists.

Return the head of the merged linked list.

Example 1:
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

Example 2:
Input: list1 = [], list2 = []
Output: []

Example 3:
Input: list1 = [], list2 = [0]
Output: [0]

Constraints:
- The number of nodes in both lists is in the range [0, 50]
- -100 <= Node.val <= 100
- Both list1 and list2 are sorted in non-decreasing order

Time Complexity: O(n + m) where n and m are lengths of lists
Space Complexity: O(1)
"""

from typing import Optional


# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def mergeTwoLists(
        self, list1: Optional[ListNode], list2: Optional[ListNode]
    ) -> Optional[ListNode]:
        """
        Approach: Use dummy node and two pointers

        Strategy:
        1. Create a dummy node to simplify edge cases
        2. Use current pointer to build result list
        3. Compare values from both lists
        4. Add smaller value to result
        5. Move pointer in list that contributed node
        6. Attach remaining nodes from non-empty list
        """
        # Dummy node simplifies code
        dummy = ListNode(0)
        current = dummy

        # Merge while both lists have nodes
        while list1 and list2:
            if list1.val <= list2.val:
                current.next = list1
                list1 = list1.next
            else:
                current.next = list2
                list2 = list2.next
            current = current.next

        # Attach remaining nodes
        current.next = list1 if list1 else list2

        return dummy.next


# Alternative recursive approach
class SolutionRecursive:
    def mergeTwoLists(
        self, list1: Optional[ListNode], list2: Optional[ListNode]
    ) -> Optional[ListNode]:
        # Base cases
        if not list1:
            return list2
        if not list2:
            return list1

        # Recursive merge
        if list1.val <= list2.val:
            list1.next = self.mergeTwoLists(list1.next, list2)
            return list1
        else:
            list2.next = self.mergeTwoLists(list1, list2.next)
            return list2


# Helper functions for testing
def create_linked_list(values):
    """Create linked list from list of values"""
    if not values:
        return None

    head = ListNode(values[0])
    current = head
    for val in values[1:]:
        current.next = ListNode(val)
        current = current.next

    return head


def linked_list_to_list(head):
    """Convert linked list to Python list"""
    result = []
    current = head
    while current:
        result.append(current.val)
        current = current.next
    return result


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    list1 = create_linked_list([1, 2, 4])
    list2 = create_linked_list([1, 3, 4])
    result = solution.mergeTwoLists(list1, list2)
    assert linked_list_to_list(result) == [1, 1, 2, 3, 4, 4]
    print("✓ Test case 1 passed")

    # Test case 2
    list1 = create_linked_list([])
    list2 = create_linked_list([])
    result = solution.mergeTwoLists(list1, list2)
    assert linked_list_to_list(result) == []
    print("✓ Test case 2 passed")

    # Test case 3
    list1 = create_linked_list([])
    list2 = create_linked_list([0])
    result = solution.mergeTwoLists(list1, list2)
    assert linked_list_to_list(result) == [0]
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
