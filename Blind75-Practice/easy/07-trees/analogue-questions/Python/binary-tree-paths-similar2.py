"""
LeetCode 404: Sum of Left Leaves
Difficulty: Easy
Pattern: Trees / DFS

Problem:
Given the root of a binary tree, return the sum of all left leaves.

A leaf is a node with no children. A left leaf is a leaf that is the left child of
another node.

Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: 24
Explanation: There are two left leaves in the binary tree, with values 9 and 15 respectively.

Example 2:
Input: root = [1]
Output: 0

Constraints:
- The number of nodes in the tree is in the range [1, 1000]
- -1000 <= Node.val <= 1000

Time Complexity: O(n)
Space Complexity: O(h)
"""

from typing import Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def sumOfLeftLeaves(self, root: Optional[TreeNode]) -> int:
        """
        Approach: DFS tracking if node is left child

        Strategy:
        1. DFS through tree
        2. Track if current node is a left child
        3. If leaf and left child, add to sum
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

        def dfs(node, is_left):
            if not node:
                return 0

            # If leaf and is left child
            if not node.left and not node.right and is_left:
                return node.val

            # Sum left and right subtrees
            return dfs(node.left, True) + dfs(node.right, False)

        return dfs(root, False)


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1: [3,9,20,null,null,15,7]
    root1 = TreeNode(3)
    root1.left = TreeNode(9)
    root1.right = TreeNode(20)
    root1.right.left = TreeNode(15)
    root1.right.right = TreeNode(7)
    assert solution.sumOfLeftLeaves(root1) == 24
    print("✓ Test case 1 passed")

    # Test case 2: [1]
    root2 = TreeNode(1)
    assert solution.sumOfLeftLeaves(root2) == 0
    print("✓ Test case 2 passed")

    print("\nAll test cases passed!")
