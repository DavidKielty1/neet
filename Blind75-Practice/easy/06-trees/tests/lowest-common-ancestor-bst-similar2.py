"""
Similar Problem 2: Kth Smallest Element in BST
Difficulty: Easy
Pattern: Trees (BST/Inorder)

Problem:
Given the root of a binary search tree and an integer k,
return the kth smallest value (1-indexed) of all the values in the tree.

Example 1:
Input: root = [3,1,4,null,2], k = 1
Output: 1

Example 2:
Input: root = [5,3,6,2,4,null,null,1], k = 3
Output: 3

Constraints:
- The number of nodes in the tree is n
- 1 <= k <= n <= 10^4
- 0 <= Node.val <= 10^4
"""

from typing import Optional
from collections import deque


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        """
        Approach: Inorder traversal of BST gives sorted order

        Strategy:
        1. Perform inorder traversal
        2. Return kth element (1-indexed)
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

        self.count = 0
        self.result = None

        def inorder(node):
            if not node or self.result is not None:
                return

            inorder(node.left)

            self.count += 1
            if self.count == k:
                self.result = node.val
                return

            inorder(node.right)

        inorder(root)
        return self.result


# Helper functions
def create_tree(values):
    if not values:
        return None

    root = TreeNode(values[0])
    queue = deque([root])
    i = 1

    while queue and i < len(values):
        node = queue.popleft()

        if i < len(values) and values[i] is not None:
            node.left = TreeNode(values[i])
            queue.append(node.left)
        i += 1

        if i < len(values) and values[i] is not None:
            node.right = TreeNode(values[i])
            queue.append(node.right)
        i += 1

    return root


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    root = create_tree([3, 1, 4, None, 2])
    assert solution.kthSmallest(root, 1) == 1
    print("✓ Test case 1 passed")

    # Test case 2
    root = create_tree([5, 3, 6, 2, 4, None, None, 1])
    assert solution.kthSmallest(root, 3) == 3
    print("✓ Test case 2 passed")

    print("\nAll test cases passed!")
