"""
LeetCode 530: Minimum Absolute Difference in BST
Difficulty: Easy
Pattern: Trees / BST / DFS

Problem:
Given the root of a Binary Search Tree (BST), return the minimum absolute difference
between the values of any two different nodes in the tree.

Example 1:
Input: root = [4,2,6,1,3]
Output: 1

Example 2:
Input: root = [1,0,48,null,null,12,49]
Output: 1

Constraints:
- The number of nodes in the tree is in the range [2, 10^4]
- 0 <= Node.val <= 10^5

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
    def getMinimumDifference(self, root: Optional[TreeNode]) -> int:
        """
        Approach: In-order traversal of BST

        Strategy:
        1. In-order traversal gives sorted sequence
        2. Track previous value
        3. Calculate difference with current value
        4. Track minimum difference
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

        self.min_diff = float("inf")
        self.prev = None

        def inorder(node):
            if not node:
                return

            inorder(node.left)

            if self.prev is not None:
                self.min_diff = min(self.min_diff, node.val - self.prev)
            self.prev = node.val

            inorder(node.right)

        inorder(root)
        return self.min_diff


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1: [4,2,6,1,3]
    root1 = TreeNode(4)
    root1.left = TreeNode(2)
    root1.right = TreeNode(6)
    root1.left.left = TreeNode(1)
    root1.left.right = TreeNode(3)
    assert solution.getMinimumDifference(root1) == 1
    print("✓ Test case 1 passed")

    # Test case 2: [1,0,48,null,null,12,49]
    solution = Solution()
    root2 = TreeNode(1)
    root2.left = TreeNode(0)
    root2.right = TreeNode(48)
    root2.right.left = TreeNode(12)
    root2.right.right = TreeNode(49)
    assert solution.getMinimumDifference(root2) == 1
    print("✓ Test case 2 passed")

    print("\nAll test cases passed!")
