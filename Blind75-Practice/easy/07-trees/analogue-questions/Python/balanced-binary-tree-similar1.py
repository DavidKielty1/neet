"""
Similar Problem 1: Minimum Distance Between BST Nodes
Difficulty: Easy
Pattern: Trees (DFS/Inorder)

Problem:
Given the root of a Binary Search Tree (BST), return the minimum difference between
the values of any two different nodes in the tree.

Example 1:
Input: root = [4,2,6,1,3]
Output: 1

Example 2:
Input: root = [1,0,48,null,null,12,49]
Output: 1

Constraints:
- The number of nodes in the tree is in the range [2, 100]
- 0 <= Node.val <= 10^5
"""

from typing import Optional
from collections import deque


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def minDiffInBST(self, root: Optional[TreeNode]) -> int:
        """
        Approach: Inorder traversal of BST gives sorted order

        Strategy:
        1. Perform inorder traversal to get sorted values
        2. Find minimum difference between consecutive values
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

        self.prev = None
        self.min_diff = float("inf")

        def inorder(node):
            if not node:
                return

            inorder(node.left)

            # Process current node
            if self.prev is not None:
                self.min_diff = min(self.min_diff, node.val - self.prev)
            self.prev = node.val

            inorder(node.right)

        inorder(root)
        return self.min_diff


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
    root = create_tree([4, 2, 6, 1, 3])
    assert solution.minDiffInBST(root) == 1
    print("✓ Test case 1 passed")

    # Test case 2
    root = create_tree([1, 0, 48, None, None, 12, 49])
    assert solution.minDiffInBST(root) == 1
    print("✓ Test case 2 passed")

    print("\nAll test cases passed!")
