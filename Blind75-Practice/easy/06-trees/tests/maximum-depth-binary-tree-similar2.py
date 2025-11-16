"""
Similar Problem 2: Count Complete Tree Nodes
Difficulty: Easy
Pattern: Trees (DFS)

Problem:
Given the root of a complete binary tree, return the number of the nodes in the tree.

Example 1:
Input: root = [1,2,3,4,5,6]
Output: 6

Example 2:
Input: root = []
Output: 0

Example 3:
Input: root = [1]
Output: 1

Constraints:
- The number of nodes in the tree is in the range [0, 5 * 10^4]
- 0 <= Node.val <= 5 * 10^4
"""

from typing import Optional
from collections import deque


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def countNodes(self, root: Optional[TreeNode]) -> int:
        """
        Approach: Simple DFS count

        Strategy:
        1. If node is None, return 0
        2. Otherwise, return 1 + count of left + count of right
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
            return 0

        return 1 + self.countNodes(root.left) + self.countNodes(root.right)


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
    root = create_tree([1, 2, 3, 4, 5, 6])
    assert solution.countNodes(root) == 6
    print("✓ Test case 1 passed")

    # Test case 2
    root = create_tree([])
    assert solution.countNodes(root) == 0
    print("✓ Test case 2 passed")

    # Test case 3
    root = create_tree([1])
    assert solution.countNodes(root) == 1
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
