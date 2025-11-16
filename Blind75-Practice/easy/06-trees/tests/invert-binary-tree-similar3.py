"""
Similar Problem 3: Sum of Left Leaves
Difficulty: Easy
Pattern: Trees (DFS)

Problem:
Given the root of a binary tree, return the sum of all left leaves.
A leaf is a node with no children. A left leaf is a leaf that is the left child of another node.

Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: 24
Explanation: There are two left leaves: 9 and 15.

Example 2:
Input: root = [1]
Output: 0

Constraints:
- The number of nodes in the tree is in the range [1, 1000]
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
    def sumOfLeftLeaves(self, root: Optional[TreeNode]) -> int:
        """
        Approach: DFS to find and sum left leaves

        Strategy:
        1. Traverse tree using DFS
        2. Check if a node is a left leaf (no children, is left child)
        3. Sum all left leaf values
        """

        def dfs(node, is_left):
            if not node:
                return 0

            # Check if this is a left leaf
            if is_left and not node.left and not node.right:
                return node.val

            # Recursively sum left and right subtrees
            return dfs(node.left, True) + dfs(node.right, False)

        if not root:
            return 0

        return dfs(root.left, True) + dfs(root.right, False)


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
    root = create_tree([3, 9, 20, None, None, 15, 7])
    assert solution.sumOfLeftLeaves(root) == 24
    print("✓ Test case 1 passed")

    # Test case 2
    root = create_tree([1])
    assert solution.sumOfLeftLeaves(root) == 0
    print("✓ Test case 2 passed")

    # Test case 3
    root = create_tree([1, 2, 3, 4, 5])
    assert solution.sumOfLeftLeaves(root) == 4
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
