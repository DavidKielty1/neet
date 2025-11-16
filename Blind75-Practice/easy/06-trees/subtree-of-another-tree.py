"""
LeetCode 572: Subtree of Another Tree
Difficulty: Easy
Pattern: Trees (DFS)

Problem:
Given the roots of two binary trees root and subRoot, return true if there is a
subtree of root with the same structure and node values of subRoot and false otherwise.

A subtree of a binary tree tree is a tree that consists of a node in tree and all
of this node's descendants. The tree tree could also be considered as a subtree of itself.

Example 1:
Input: root = [3,4,5,1,2], subRoot = [4,1,2]
Output: true

Example 2:
Input: root = [3,4,5,1,2,null,null,null,null,0], subRoot = [4,1,2]
Output: false

Constraints:
- The number of nodes in the root tree is in the range [1, 2000]
- The number of nodes in the subRoot tree is in the range [1, 1000]
- -10^4 <= root.val <= 10^4
- -10^4 <= subRoot.val <= 10^4

Time Complexity: O(n * m) where n is nodes in root, m is nodes in subRoot
Space Complexity: O(h) where h is height of root
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
    def isSubtree(self, root: Optional[TreeNode], subRoot: Optional[TreeNode]) -> bool:
        """
        Approach: DFS to find matching node, then verify subtrees are same

        Strategy:
        1. For each node in root tree
        2. Check if subtree starting at that node matches subRoot
        3. Use helper function to check if two trees are identical
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
            return False

        # Check if trees are same starting from current node
        if self.isSameTree(root, subRoot):
            return True

        # Check left and right subtrees
        return self.isSubtree(root.left, subRoot) or self.isSubtree(root.right, subRoot)

    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        """Helper: Check if two trees are identical"""
        if not p and not q:
            return True
        if not p or not q:
            return False
        if p.val != q.val:
            return False

        return self.isSameTree(p.left, q.left) and self.isSameTree(p.right, q.right)


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

    # Test case 1: Is subtree
    root = create_tree([3, 4, 5, 1, 2])
    subRoot = create_tree([4, 1, 2])
    assert solution.isSubtree(root, subRoot) == True
    print("✓ Test case 1 passed")

    # Test case 2: Not subtree (extra node)
    root = create_tree([3, 4, 5, 1, 2, None, None, None, None, 0])
    subRoot = create_tree([4, 1, 2])
    assert solution.isSubtree(root, subRoot) == False
    print("✓ Test case 2 passed")

    # Test case 3: Same tree
    root = create_tree([1, 2, 3])
    subRoot = create_tree([1, 2, 3])
    assert solution.isSubtree(root, subRoot) == True
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
