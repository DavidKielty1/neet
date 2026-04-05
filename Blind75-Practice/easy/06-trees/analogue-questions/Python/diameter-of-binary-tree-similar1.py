"""
Similar Problem 1: Longest Univalue Path
Difficulty: Easy
Pattern: Trees (DFS)

Problem:
Given the root of a binary tree, return the length of the longest path, where each node
in the path has the same value. This path may or may not pass through the root.

The length of the path between two nodes is represented by the number of edges between them.

Example 1:
Input: root = [5,4,5,1,1,null,5]
Output: 2

Example 2:
Input: root = [1,4,5,4,4,null,5]
Output: 2

Constraints:
- The number of nodes in the tree is in the range [0, 10^4]
- -1000 <= Node.val <= 1000
- The depth of the tree will not exceed 1000
"""

from typing import Optional
from collections import deque


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def longestUnivaluePath(self, root: Optional[TreeNode]) -> int:
        """
        Approach: DFS to find longest univalue path

        Strategy:
        1. For each node, calculate longest univalue path through it
        2. Path can go through left, right, or both if values match
        3. Track maximum path length
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

        self.max_path = 0

        def dfs(node):
            if not node:
                return 0

            left_len = dfs(node.left)
            right_len = dfs(node.right)

            left_path = right_path = 0

            # Extend left path if value matches
            if node.left and node.left.val == node.val:
                left_path = left_len + 1

            # Extend right path if value matches
            if node.right and node.right.val == node.val:
                right_path = right_len + 1

            # Update max path (can use both sides)
            self.max_path = max(self.max_path, left_path + right_path)

            # Return longest single path
            return max(left_path, right_path)

        dfs(root)
        return self.max_path


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
    root = create_tree([5, 4, 5, 1, 1, None, 5])
    assert solution.longestUnivaluePath(root) == 2
    print("✓ Test case 1 passed")

    # Test case 2
    root = create_tree([1, 4, 5, 4, 4, None, 5])
    assert solution.longestUnivaluePath(root) == 2
    print("✓ Test case 2 passed")

    print("\nAll test cases passed!")
