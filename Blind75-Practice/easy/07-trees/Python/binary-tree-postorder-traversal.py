"""
145. Binary Tree Postorder Traversal
Difficulty: Easy
Pattern: Trees (DFS)

Problem:
Given the root of a binary tree, return the postorder traversal of its
nodes' values. Postorder means visit the left subtree, then the right
subtree, then the current node.

Example 1:
Input: root = [1,null,2,3]
Output: [3,2,1]

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
    def postorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        """Recursive DFS: left, right, node."""

        def dfs(node: Optional[TreeNode]) -> None:
            if not node:
                return
            dfs(node.left)
            dfs(node.right)
            out.append(node.val)

        out: List[int] = []
        dfs(root)
        return out


def create_tree(values: List[Optional[int]]) -> Optional[TreeNode]:
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
    assert sol.postorderTraversal(root1) == [3, 2, 1]
    assert sol.postorderTraversal(None) == []
    root2 = create_tree([1])
    assert sol.postorderTraversal(root2) == [1]
    print("All tests passed.")
