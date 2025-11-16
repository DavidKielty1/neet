"""
Similar Problem 1: Merge K Sorted Lists (Easy Version - K=2)
Difficulty: Easy
Pattern: Linked List (Two Pointers)

Problem:
You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
Merge all the linked-lists into one sorted linked-list and return it.

For this easy version, k = 2 (same as merge two sorted lists).

Example 1:
Input: lists = [[1,4,5],[1,3,4]]
Output: [1,1,3,4,4,5]

Example 2:
Input: lists = []
Output: []

Example 3:
Input: lists = [[]]
Output: []

Constraints:
- k == lists.length
- 0 <= k <= 10
- 0 <= lists[i].length <= 500
- -10^4 <= lists[i][j] <= 10^4
- lists[i] is sorted in ascending order
"""

from typing import Optional, List


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        """
        Approach: Merge two at a time (for k=2, same as merge two)

        Strategy:
        1. Handle edge cases
        2. Merge lists pairwise
        3. Return merged result
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

        if not lists or all(l is None for l in lists):
            return None

        # Filter out None lists
        lists = [l for l in lists if l is not None]

        if not lists:
            return None

        # Merge first two lists
        result = lists[0]
        for i in range(1, len(lists)):
            result = self.mergeTwoLists(result, lists[i])

        return result

    def mergeTwoLists(self, l1, l2):
        dummy = ListNode(0)
        current = dummy

        while l1 and l2:
            if l1.val < l2.val:
                current.next = l1
                l1 = l1.next
            else:
                current.next = l2
                l2 = l2.next
            current = current.next

        current.next = l1 or l2
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
    lists = [create_list([1, 4, 5]), create_list([1, 3, 4])]
    merged = solution.mergeKLists(lists)
    assert list_to_array(merged) == [1, 1, 3, 4, 4, 5]
    print("✓ Test case 1 passed")

    # Test case 2
    lists = []
    merged = solution.mergeKLists(lists)
    assert list_to_array(merged) == []
    print("✓ Test case 2 passed")

    # Test case 3
    lists = [None]
    merged = solution.mergeKLists(lists)
    assert list_to_array(merged) == []
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
