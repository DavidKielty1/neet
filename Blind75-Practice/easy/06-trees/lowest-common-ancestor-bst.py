"""
LeetCode 235: Lowest Common Ancestor of a Binary Search Tree
Difficulty: Easy
Pattern: Trees (BST)

Problem:
Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST.

According to the definition of LCA on Wikipedia: "The lowest common ancestor is defined
between two nodes p and q as the lowest node in T that has both p and q as descendants
(where we allow a node to be a descendant of itself)."

Example 1:
Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
Output: 6
Explanation: The LCA of nodes 2 and 8 is 6.

Example 2:
Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
Output: 2
Explanation: The LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself.

Constraints:
- The number of nodes in the tree is in the range [2, 10^5]
- -10^9 <= Node.val <= 10^9
- All Node.val are unique
- p != q
- p and q will exist in the BST

Time Complexity: O(h) where h is height
Space Complexity: O(1) for iterative, O(h) for recursive
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
    def lowestCommonAncestor(
        self, root: TreeNode, p: TreeNode, q: TreeNode
    ) -> TreeNode:
        """
        Approach: Leverage BST property

        Strategy:
        1. If both p and q are less than root, LCA is in left subtree
        2. If both p and q are greater than root, LCA is in right subtree
        3. Otherwise, root is the LCA (split point)

        BST Property: left < root < right
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

        current = root

        while current:
            # Both nodes in left subtree
            if p.val < current.val and q.val < current.val:
                current = current.left
            # Both nodes in right subtree
            elif p.val > current.val and q.val > current.val:
                current = current.right
            # Split point found (or one node is current)
            else:
                return current

        return None


# Alternative recursive approach
class SolutionRecursive:
    def lowestCommonAncestor(
        self, root: TreeNode, p: TreeNode, q: TreeNode
    ) -> TreeNode:
        # Both in left subtree
        if p.val < root.val and q.val < root.val:
            return self.lowestCommonAncestor(root.left, p, q)
        # Both in right subtree
        elif p.val > root.val and q.val > root.val:
            return self.lowestCommonAncestor(root.right, p, q)
        # Split point
        else:
            return root


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


def find_node(root, val):
    """Find node with given value"""
    if not root:
        return None
    if root.val == val:
        return root

    left = find_node(root.left, val)
    if left:
        return left

    return find_node(root.right, val)


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    root = create_tree([6, 2, 8, 0, 4, 7, 9, None, None, 3, 5])
    p = find_node(root, 2)
    q = find_node(root, 8)
    result = solution.lowestCommonAncestor(root, p, q)
    assert result.val == 6
    print("✓ Test case 1 passed")

    # Test case 2
    root = create_tree([6, 2, 8, 0, 4, 7, 9, None, None, 3, 5])
    p = find_node(root, 2)
    q = find_node(root, 4)
    result = solution.lowestCommonAncestor(root, p, q)
    assert result.val == 2
    print("✓ Test case 2 passed")

    # Test case 3
    root = create_tree([2, 1])
    p = find_node(root, 2)
    q = find_node(root, 1)
    result = solution.lowestCommonAncestor(root, p, q)
    assert result.val == 2
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
