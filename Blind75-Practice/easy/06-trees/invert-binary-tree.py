"""
LeetCode 226: Invert Binary Tree
Difficulty: Easy
Pattern: Trees (DFS)

Problem:
Given the root of a binary tree, invert the tree, and return its root.

Example 1:
Input: root = [4,2,7,1,3,6,9]
Output: [4,7,2,9,6,3,1]

Example 2:
Input: root = [2,1,3]
Output: [2,3,1]

Example 3:
Input: root = []
Output: []

Constraints:
- The number of nodes in the tree is in the range [0, 100]
- -100 <= Node.val <= 100

Time Complexity: O(n)
Space Complexity: O(h) where h is height (recursion stack)
"""

from typing import Optional
from collections import deque


# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        """
        Approach: Recursive DFS

        Strategy:
        1. Base case: if node is None, return None
        2. Recursively invert left and right subtrees
        3. Swap left and right children
        4. Return root
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
            return None

        # Swap children
        root.left, root.right = root.right, root.left

        # Recursively invert subtrees
        self.invertTree(root.left)
        self.invertTree(root.right)

        return root


# Alternative iterative BFS approach
class SolutionIterative:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
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

        Iterative approach using queue (BFS)
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
            return None

        queue = deque([root])

        while queue:
            node = queue.popleft()

            # Swap children
            node.left, node.right = node.right, node.left

            # Add children to queue
            if node.left:
                queue.append(node.left)
            if node.right:
                queue.append(node.right)

        return root


# Helper functions for testing
def create_tree(values):
    """Create binary tree from level-order list"""
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


def tree_to_list(root):
    """Convert tree to level-order list"""
    if not root:
        return []

    result = []
    queue = deque([root])

    while queue:
        node = queue.popleft()
        if node:
            result.append(node.val)
            queue.append(node.left)
            queue.append(node.right)
        else:
            result.append(None)

    # Remove trailing None values
    while result and result[-1] is None:
        result.pop()

    return result


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    root = create_tree([4, 2, 7, 1, 3, 6, 9])
    result = solution.invertTree(root)
    assert tree_to_list(result) == [4, 7, 2, 9, 6, 3, 1]
    print("✓ Test case 1 passed")

    # Test case 2
    root = create_tree([2, 1, 3])
    result = solution.invertTree(root)
    assert tree_to_list(result) == [2, 3, 1]
    print("✓ Test case 2 passed")

    # Test case 3
    root = create_tree([])
    result = solution.invertTree(root)
    assert tree_to_list(result) == []
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
