"""
LeetCode 257: Binary Tree Paths
Difficulty: Easy
Pattern: Trees / DFS

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

Time Complexity: O(n)
Space Complexity: O(h) where h is height
"""

from typing import List, Optional


# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def binaryTreePaths(self, root: Optional[TreeNode]) -> List[str]:
        """
        Approach: DFS traversal

        Strategy:
        1. DFS through tree building path string
        2. When leaf node reached, add path to result
        3. Backtrack and explore other paths
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

        result = []

        def dfs(node, path):
            if not node:
                return

            # Add current node to path
            path += str(node.val)

            # If leaf node, add path to result
            if not node.left and not node.right:
                result.append(path)
            else:
                # Continue exploring
                path += "->"
                dfs(node.left, path)
                dfs(node.right, path)

        dfs(root, "")
        return result


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1: [1,2,3,null,5]
    root1 = TreeNode(1)
    root1.left = TreeNode(2)
    root1.right = TreeNode(3)
    root1.left.right = TreeNode(5)
    result1 = solution.binaryTreePaths(root1)
    assert set(result1) == set(["1->2->5", "1->3"])
    print("✓ Test case 1 passed")

    # Test case 2: [1]
    root2 = TreeNode(1)
    assert solution.binaryTreePaths(root2) == ["1"]
    print("✓ Test case 2 passed")

    print("\nAll test cases passed!")
