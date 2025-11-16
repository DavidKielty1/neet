"""
Similar Problem 2: Univalued Binary Tree
Difficulty: Easy
Pattern: Trees (DFS)

Problem:
A binary tree is uni-valued if every node in the tree has the same value.
Given the root of a binary tree, return true if the given tree is uni-valued, or false otherwise.

Example 1:
Input: root = [1,1,1,1,1,null,1]
Output: true

Example 2:
Input: root = [2,2,2,5,2]
Output: false

Constraints:
- The number of nodes in the tree is in the range [1, 100]
- 0 <= Node.val < 100
"""

from typing import Optional
from collections import deque


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def isUnivalTree(self, root: Optional[TreeNode]) -> bool:
        """
        Approach: DFS to check all nodes have same value

        Strategy:
        1. Get root value
        2. Check all nodes match root value
        3. Return true if all match
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

        target_val = root.val

        def check_unival(node):
            if not node:
                return True

            if node.val != target_val:
                return False

            return check_unival(node.left) and check_unival(node.right)

        return check_unival(root)


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
    root = create_tree([1, 1, 1, 1, 1, None, 1])
    assert solution.isUnivalTree(root) == True
    print("✓ Test case 1 passed")

    # Test case 2
    root = create_tree([2, 2, 2, 5, 2])
    assert solution.isUnivalTree(root) == False
    print("✓ Test case 2 passed")

    # Test case 3
    root = create_tree([1])
    assert solution.isUnivalTree(root) == True
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
