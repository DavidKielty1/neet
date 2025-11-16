"""
Similar Problem 2: Binary Tree Paths
Difficulty: Easy
Pattern: Trees (DFS)

Problem:
Given the root of a binary tree, return all root-to-leaf paths in any order.
A leaf is a node with no children.

Example 1:
Input: root = [1,2,3,null,5]
Output: ["1->2->5","1->3"]

Example 2:
Input: root = [1]
Output: ["1"]

Constraints:
- The number of nodes in the tree is in the range [1, 100]
- -100 <= Node.val <= 100
"""

from typing import Optional, List
from collections import deque


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def binaryTreePaths(self, root: Optional[TreeNode]) -> List[str]:
        """
        Approach: DFS to collect all paths

        Strategy:
        1. Traverse tree building paths
        2. When leaf is reached, add path to result
        3. Backtrack to explore other paths
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
            return []

        paths = []

        def dfs(node, path):
            if not node:
                return

            # Add current node to path
            path.append(str(node.val))

            # If leaf node, add path to result
            if not node.left and not node.right:
                paths.append("->".join(path))
            else:
                # Continue exploring
                dfs(node.left, path)
                dfs(node.right, path)

            # Backtrack
            path.pop()

        dfs(root, [])
        return paths


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
    root = create_tree([1, 2, 3, None, 5])
    result = sorted(solution.binaryTreePaths(root))
    assert result == ["1->2->5", "1->3"]
    print("✓ Test case 1 passed")

    # Test case 2
    root = create_tree([1])
    assert solution.binaryTreePaths(root) == ["1"]
    print("✓ Test case 2 passed")

    print("\nAll test cases passed!")
