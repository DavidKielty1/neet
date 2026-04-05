"""
Similar Problem 3: Search in Binary Search Tree
Difficulty: Easy
Pattern: Trees (BST)

Problem:
You are given the root of a binary search tree (BST) and an integer val.
Find the node in the BST that the node's value equals val and return the subtree rooted with that node.
If such a node does not exist, return null.

Example 1:
Input: root = [4,2,7,1,3], val = 2
Output: [2,1,3]

Example 2:
Input: root = [4,2,7,1,3], val = 5
Output: []

Constraints:
- The number of nodes in the tree is in the range [1, 5000]
- 1 <= Node.val <= 10^7
- root is a binary search tree
- 1 <= val <= 10^7
"""

from typing import Optional
from collections import deque


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def searchBST(self, root: Optional[TreeNode], val: int) -> Optional[TreeNode]:
        """
        Approach: Use BST property to navigate

        Strategy:
        1. If current node value equals val, return it
        2. If val < current, search left subtree
        3. If val > current, search right subtree
        4. Return None if not found
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
            if current.val == val:
                return current
            elif val < current.val:
                current = current.left
            else:
                current = current.right

        return None


# Alternative recursive approach
class SolutionRecursive:
    def searchBST(self, root: Optional[TreeNode], val: int) -> Optional[TreeNode]:
        if not root:
            return None

        if root.val == val:
            return root
        elif val < root.val:
            return self.searchBST(root.left, val)
        else:
            return self.searchBST(root.right, val)


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
    root = create_tree([4, 2, 7, 1, 3])
    result = solution.searchBST(root, 2)
    assert result and result.val == 2
    print("✓ Test case 1 passed")

    # Test case 2
    root = create_tree([4, 2, 7, 1, 3])
    result = solution.searchBST(root, 5)
    assert result is None
    print("✓ Test case 2 passed")

    print("\nAll test cases passed!")
