"""
94. Binary Tree Inorder Traversal
Difficulty: Easy
Pattern: Trees (DFS)

Problem:
Given the root of a binary tree, return the inorder traversal of its nodes'
values. Inorder means visit the left subtree, then the current node, then
the right subtree.

Example 1:
Input: root = [1,null,2,3]
Output: [1,3,2]

Example 2:
Input: root = []
Output: []

Example 3:
Input: root = [1]
Output: [1]

Constraints:
- The number of nodes in the tree is in the range [0, 100]
- -100 <= Node.val <= 100
"""

from __future__ import annotations

from collections import deque
from typing import List, Optional


class TreeNode:
    def __init__(self, val: int = 0, left: Optional[TreeNode] = None, right: Optional[TreeNode] = None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        """Recursive DFS: left, node, right."""

        def dfs(node: Optional[TreeNode]) -> None:
            if not node:
                return
            dfs(node.left)
            out.append(node.val)
            dfs(node.right)

        out: List[int] = []
        dfs(root)
        return out


def create_tree(values: List[Optional[int]]) -> Optional[TreeNode]:
    """Level-order construction; None marks missing children."""
    if not values:
        return None
    root = TreeNode(values[0])  # type: ignore[arg-type]
    q: deque[TreeNode] = deque([root])
    i = 1
    while q and i < len(values):
        node = q.popleft()
        if i < len(values) and values[i] is not None:
            node.left = TreeNode(values[i])  # type: ignore[arg-type]
            q.append(node.left)
        i += 1
        if i < len(values) and values[i] is not None:
            node.right = TreeNode(values[i])  # type: ignore[arg-type]
            q.append(node.right)
        i += 1
    return root


if __name__ == "__main__":
    sol = Solution()
    root1 = create_tree([1, None, 2, 3])
    assert sol.inorderTraversal(root1) == [1, 3, 2]
    assert sol.inorderTraversal(None) == []
    root2 = create_tree([1])
    assert sol.inorderTraversal(root2) == [1]
    print("All tests passed.")
