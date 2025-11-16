"""
Similar Problem 1: Mirror Tree Check
Difficulty: Easy
Pattern: Trees (DFS)

Problem:
Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

Example 1:
Input: root = [1,2,2,3,4,4,3]
Output: true

Example 2:
Input: root = [1,2,2,null,3,null,3]
Output: false

Constraints:
- The number of nodes in the tree is in the range [1, 1000]
- -100 <= Node.val <= 100
"""

from typing import Optional
from collections import deque


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        """
        Approach: Compare left and right subtrees

        Strategy:
        1. Check if left subtree is mirror of right subtree
        2. For mirror: left.left mirrors right.right, left.right mirrors right.left
        3. Values must match at mirrored positions
        """

        def is_mirror(left: Optional[TreeNode], right: Optional[TreeNode]) -> bool:
            if not left and not right:
                return True
            if not left or not right:
                return False

            return (
                left.val == right.val
                and is_mirror(left.left, right.right)
                and is_mirror(left.right, right.left)
            )

        if not root:
            return True

        return is_mirror(root.left, root.right)


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
    root = create_tree([1, 2, 2, 3, 4, 4, 3])
    assert solution.isSymmetric(root) == True
    print("✓ Test case 1 passed")

    # Test case 2
    root = create_tree([1, 2, 2, None, 3, None, 3])
    assert solution.isSymmetric(root) == False
    print("✓ Test case 2 passed")

    # Test case 3
    root = create_tree([1])
    assert solution.isSymmetric(root) == True
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
