"""
Similar Problem 1: Leaf-Similar Trees
Difficulty: Easy
Pattern: Trees (DFS)

Problem:
Consider all the leaves of a binary tree. From left to right order, the values of those leaves form a leaf value sequence.
Two binary trees are considered leaf-similar if their leaf value sequence is the same.
Return true if and only if the two given trees are leaf-similar.

Example 1:
Input: root1 = [3,5,1,6,2,9,8,null,null,7,4], root2 = [3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]
Output: true

Example 2:
Input: root1 = [1,2,3], root2 = [1,3,2]
Output: false

Constraints:
- The number of nodes in each tree will be in the range [1, 200]
- Both trees will have values in the range [0, 200]
"""

from typing import Optional
from collections import deque


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def leafSimilar(self, root1: Optional[TreeNode], root2: Optional[TreeNode]) -> bool:
        """
        Approach: Collect leaves from both trees and compare

        Strategy:
        1. DFS to collect all leaf values in order
        2. Compare leaf sequences from both trees
        """

        def get_leaves(node):
            if not node:
                return []
            if not node.left and not node.right:
                return [node.val]
            return get_leaves(node.left) + get_leaves(node.right)

        return get_leaves(root1) == get_leaves(root2)


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
    root1 = create_tree([3, 5, 1, 6, 2, 9, 8, None, None, 7, 4])
    root2 = create_tree([3, 5, 1, 6, 7, 4, 2, None, None, None, None, None, None, 9, 8])
    assert solution.leafSimilar(root1, root2) == True
    print("✓ Test case 1 passed")

    # Test case 2
    root1 = create_tree([1, 2, 3])
    root2 = create_tree([1, 3, 2])
    assert solution.leafSimilar(root1, root2) == False
    print("✓ Test case 2 passed")

    print("\nAll test cases passed!")
