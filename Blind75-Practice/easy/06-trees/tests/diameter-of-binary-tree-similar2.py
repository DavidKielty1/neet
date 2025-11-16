"""
Similar Problem 2: Binary Tree Maximum Path Sum (Easy Version - Leaf to Leaf)
Difficulty: Easy
Pattern: Trees (DFS)

Problem:
Given a binary tree, find the maximum path sum between any two leaves.
A path is a sequence of nodes where each pair of adjacent nodes has an edge connecting them.

Example 1:
Input: root = [-10,9,20,null,null,15,7]
Output: 42
Explanation: Path is 15 -> 20 -> 7 = 42

Example 2:
Input: root = [1,2,3]
Output: 6
Explanation: Path is 2 -> 1 -> 3 = 6

Constraints:
- The number of nodes in the tree is in the range [2, 3 * 10^4]
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
    def maxPathSum(self, root: Optional[TreeNode]) -> int:
        """
        Approach: DFS to find max path through each node

        Strategy:
        1. For each node, calculate max path from left and right
        2. Path through node = left_max + node.val + right_max
        3. Track global maximum
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

        self.max_sum = float("-inf")

        def dfs(node):
            if not node:
                return float("-inf")  # No path

            # Leaf node
            if not node.left and not node.right:
                return node.val

            left_max = dfs(node.left)
            right_max = dfs(node.right)

            # If both children exist, can form leaf-to-leaf path
            if node.left and node.right:
                path_sum = left_max + node.val + right_max
                self.max_sum = max(self.max_sum, path_sum)
                # Return max path to leaf going through this node
                return max(left_max, right_max) + node.val

            # Only one child
            if node.left:
                return left_max + node.val
            return right_max + node.val

        dfs(root)
        return self.max_sum


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
    root = create_tree([-10, 9, 20, None, None, 15, 7])
    assert solution.maxPathSum(root) == 42
    print("✓ Test case 1 passed")

    # Test case 2
    root = create_tree([1, 2, 3])
    assert solution.maxPathSum(root) == 6
    print("✓ Test case 2 passed")

    print("\nAll test cases passed!")
