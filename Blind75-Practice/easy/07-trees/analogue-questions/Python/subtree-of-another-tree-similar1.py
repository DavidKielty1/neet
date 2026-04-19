"""
Similar Problem 1: Count Univalue Subtrees
Difficulty: Easy
Pattern: Trees (DFS)

Problem:
Given the root of a binary tree, return the number of uni-value subtrees.
A uni-value subtree means all nodes of the subtree have the same value.

Example 1:
Input: root = [5,1,5,5,5,null,5]
Output: 4

Example 2:
Input: root = []
Output: 0

Example 3:
Input: root = [5,5,5,5,5,null,5]
Output: 6

Constraints:
- The number of nodes in the tree is in the range [0, 1000]
- -1000 <= Node.val <= 1000
"""

from typing import Optional
from collections import deque


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def countUnivalSubtrees(self, root: Optional[TreeNode]) -> int:
        """
        Approach: DFS to count unival subtrees

        Strategy:
        1. Check if each subtree is unival
        2. A subtree is unival if all nodes have same value
        3. Count all unival subtrees
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

        self.count = 0

        def is_unival(node):
            if not node:
                return True

            left_unival = is_unival(node.left)
            right_unival = is_unival(node.right)

            # Check if current subtree is unival
            if not left_unival or not right_unival:
                return False

            # Check left child value
            if node.left and node.left.val != node.val:
                return False

            # Check right child value
            if node.right and node.right.val != node.val:
                return False

            # This subtree is unival
            self.count += 1
            return True

        is_unival(root)
        return self.count


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
    root = create_tree([5, 1, 5, 5, 5, None, 5])
    assert solution.countUnivalSubtrees(root) == 4
    print("✓ Test case 1 passed")

    # Test case 2
    root = create_tree([])
    assert solution.countUnivalSubtrees(root) == 0
    print("✓ Test case 2 passed")

    # Test case 3
    root = create_tree([5, 5, 5, 5, 5, None, 5])
    assert solution.countUnivalSubtrees(root) == 6
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
