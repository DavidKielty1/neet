"""
LeetCode 110: Balanced Binary Tree
Difficulty: Easy
Pattern: Trees (DFS)

Problem:
Given a binary tree, determine if it is height-balanced.

A height-balanced binary tree is a binary tree in which the depth of the
two subtrees of every node never differs by more than one.

Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: true

Example 2:
Input: root = [1,2,2,3,3,null,null,4,4]
Output: false

Example 3:
Input: root = []
Output: true

Constraints:
- The number of nodes in the tree is in the range [0, 5000]
- -10^4 <= Node.val <= 10^4

Time Complexity: O(n)
Space Complexity: O(h) where h is height
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
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        """
        Approach: DFS with height calculation

        Strategy:
        1. For each node, calculate height of left and right subtrees
        2. If difference > 1, tree is not balanced
        3. If any subtree is unbalanced, return False
        4. Use -1 as sentinel to propagate unbalanced state
        """

        def height(node):
            """
            Returns height if balanced, -1 if unbalanced
            """
            if not node:
                return 0

            # Get heights of subtrees
            left_height = height(node.left)
            if left_height == -1:
                return -1

            right_height = height(node.right)
            if right_height == -1:
                return -1

            # Check if current node is balanced
            if abs(left_height - right_height) > 1:
                return -1

            # Return height
            return 1 + max(left_height, right_height)

        return height(root) != -1


# Alternative approach (less efficient)
class SolutionAlternative:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
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

        Check balance at each node
        Time: O(n^2) in worst case (skewed tree)
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
            return True

        def height(node):
            if not node:
                return 0
            return 1 + max(height(node.left), height(node.right))

        left_height = height(root.left)
        right_height = height(root.right)

        if abs(left_height - right_height) > 1:
            return False

        return self.isBalanced(root.left) and self.isBalanced(root.right)


# Helper functions
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


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1: Balanced
    root = create_tree([3, 9, 20, None, None, 15, 7])
    assert solution.isBalanced(root) == True
    print("✓ Test case 1 passed")

    # Test case 2: Not balanced
    root = create_tree([1, 2, 2, 3, 3, None, None, 4, 4])
    assert solution.isBalanced(root) == False
    print("✓ Test case 2 passed")

    # Test case 3: Empty tree
    root = create_tree([])
    assert solution.isBalanced(root) == True
    print("✓ Test case 3 passed")

    # Test case 4: Single node
    root = create_tree([1])
    assert solution.isBalanced(root) == True
    print("✓ Test case 4 passed")

    print("\nAll test cases passed!")
