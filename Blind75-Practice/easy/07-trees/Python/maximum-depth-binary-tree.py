"""
LeetCode 104: Maximum Depth of Binary Tree
Difficulty: Easy
Pattern: Trees (DFS)

Problem:
Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path
from the root node down to the farthest leaf node.

Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: 3

Example 2:
Input: root = [1,null,2]
Output: 2

Constraints:
- The number of nodes in the tree is in the range [0, 10^4]
- -100 <= Node.val <= 100

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
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        """
        Approach: Recursive DFS

        Strategy:
        1. Base case: empty tree has depth 0
        2. Recursively find depth of left and right subtrees
        3. Return 1 + max of left and right depths
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

        left_depth = self.maxDepth(root.left)
        right_depth = self.maxDepth(root.right)

        return 1 + max(left_depth, right_depth)


# Alternative iterative BFS approach
class SolutionBFS:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
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

        BFS level-order traversal
        Count number of levels
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

        queue = deque([root])
        depth = 0

        while queue:
            depth += 1
            level_size = len(queue)

            for _ in range(level_size):
                node = queue.popleft()

                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)

        return depth


# Alternative iterative DFS with stack
class SolutionDFSIterative:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
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

        DFS with explicit stack
        Track depth with each node
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

        stack = [(root, 1)]
        max_depth = 0

        while stack:
            node, depth = stack.pop()
            max_depth = max(max_depth, depth)

            if node.left:
                stack.append((node.left, depth + 1))
            if node.right:
                stack.append((node.right, depth + 1))

        return max_depth


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

    # Test case 1
    root = create_tree([3, 9, 20, None, None, 15, 7])
    assert solution.maxDepth(root) == 3
    print("✓ Test case 1 passed")

    # Test case 2
    root = create_tree([1, None, 2])
    assert solution.maxDepth(root) == 2
    print("✓ Test case 2 passed")

    # Test case 3
    root = create_tree([])
    assert solution.maxDepth(root) == 0
    print("✓ Test case 3 passed")

    # Test case 4
    root = create_tree([1])
    assert solution.maxDepth(root) == 1
    print("✓ Test case 4 passed")

    print("\nAll test cases passed!")
