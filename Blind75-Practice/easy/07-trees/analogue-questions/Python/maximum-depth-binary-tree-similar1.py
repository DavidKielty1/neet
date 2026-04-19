"""
Similar Problem 1: Minimum Depth of Binary Tree
Difficulty: Easy
Pattern: Trees (DFS/BFS)

Problem:
Given a binary tree, find its minimum depth.
The minimum depth is the number of nodes along the shortest path from the root node
down to the nearest leaf node.

Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: 2

Example 2:
Input: root = [2,null,3,null,4,null,5,null,6]
Output: 5

Constraints:
- The number of nodes in the tree is in the range [0, 10^5]
- -1000 <= Node.val <= 1000
"""

from typing import Optional
from collections import deque


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def minDepth(self, root: Optional[TreeNode]) -> int:
        """
        Approach: DFS to find minimum depth

        Strategy:
        1. Base case: if node is None, return 0
        2. If only one child, return 1 + depth of that child
        3. If both children, return 1 + min of both depths
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

        if not root:
            return 0

        # If leaf node
        if not root.left and not root.right:
            return 1

        # If only right child
        if not root.left:
            return 1 + self.minDepth(root.right)

        # If only left child
        if not root.right:
            return 1 + self.minDepth(root.left)

        # Both children exist
        return 1 + min(self.minDepth(root.left), self.minDepth(root.right))


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
    root = create_tree([3, 9, 20, None, None, 15, 7])
    assert solution.minDepth(root) == 2
    print("✓ Test case 1 passed")

    # Test case 2
    root = create_tree([2, None, 3, None, 4, None, 5, None, 6])
    assert solution.minDepth(root) == 5
    print("✓ Test case 2 passed")

    # Test case 3
    root = create_tree([1])
    assert solution.minDepth(root) == 1
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
