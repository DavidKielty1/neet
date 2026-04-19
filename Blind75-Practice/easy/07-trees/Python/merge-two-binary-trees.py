"""
LeetCode 617: Merge Two Binary Trees
Difficulty: Easy
Pattern: Trees / DFS

Problem:
You are given two binary trees root1 and root2.

Imagine that when you put one of them to cover the other, some nodes of the two trees are
overlapped while the others are not. You need to merge the two trees into a new binary tree.
The merge rule is that if two nodes overlap, then sum node values up as the new value of the
merged node. Otherwise, the NOT null node will be used as the node of the new tree.

Return the merged tree.

Note: The merging process must start from the root nodes of both trees.

Example 1:
Input: root1 = [1,3,2,5], root2 = [2,1,3,null,4,null,7]
Output: [3,4,5,5,4,null,7]

Example 2:
Input: root1 = [1], root2 = [1,2]
Output: [2,2]

Constraints:
- The number of nodes in both trees is in the range [0, 2000]
- -10^4 <= Node.val <= 10^4

Time Complexity: O(min(m, n)) where m and n are the number of nodes in the two trees
Space Complexity: O(min(m, n))
"""

from typing import Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def mergeTrees(
        self, root1: Optional[TreeNode], root2: Optional[TreeNode]
    ) -> Optional[TreeNode]:
        """
        Approach: Recursive DFS

        Strategy:
        1. If both nodes are None, return None
        2. If one is None, return the other
        3. Otherwise, create new node with sum of values
        4. Recursively merge left and right subtrees
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

        if not root1:
            return root2
        if not root2:
            return root1

        merged = TreeNode(root1.val + root2.val)
        merged.left = self.mergeTrees(root1.left, root2.left)
        merged.right = self.mergeTrees(root1.right, root2.right)

        return merged


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    root1 = TreeNode(1)
    root1.left = TreeNode(3)
    root1.right = TreeNode(2)
    root1.left.left = TreeNode(5)

    root2 = TreeNode(2)
    root2.left = TreeNode(1)
    root2.right = TreeNode(3)
    root2.left.right = TreeNode(4)
    root2.right.right = TreeNode(7)

    result = solution.mergeTrees(root1, root2)
    assert result.val == 3
    assert result.left.val == 4
    assert result.right.val == 5
    print("✓ Test case 1 passed")

    print("\nAll test cases passed!")
