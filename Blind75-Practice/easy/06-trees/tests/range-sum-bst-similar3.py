"""
LeetCode 653: Two Sum IV - Input is a BST
Difficulty: Easy
Pattern: Trees / BST / Hash Set

Problem:
Given the root of a binary search tree and an integer k, return true if there exist
two elements in the BST such that their sum is equal to k, or false otherwise.

Example 1:
Input: root = [5,3,6,2,4,null,7], k = 9
Output: true

Example 2:
Input: root = [5,3,6,2,4,null,7], k = 28
Output: false

Constraints:
- The number of nodes in the tree is in the range [1, 10^4]
- -10^4 <= Node.val <= 10^4
- root is guaranteed to be a valid binary search tree
- -10^5 <= k <= 10^5

Time Complexity: O(n)
Space Complexity: O(n)
"""

from typing import Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def findTarget(self, root: Optional[TreeNode], k: int) -> bool:
        """
        Approach: DFS with hash set

        Strategy:
        1. Traverse tree using DFS
        2. For each node, check if complement exists in set
        3. Add current value to set
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

        seen = set()

        def dfs(node):
            if not node:
                return False

            complement = k - node.val
            if complement in seen:
                return True

            seen.add(node.val)

            return dfs(node.left) or dfs(node.right)

        return dfs(root)


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1: [5,3,6,2,4,null,7], k = 9
    root1 = TreeNode(5)
    root1.left = TreeNode(3)
    root1.right = TreeNode(6)
    root1.left.left = TreeNode(2)
    root1.left.right = TreeNode(4)
    root1.right.right = TreeNode(7)
    assert solution.findTarget(root1, 9) == True
    print("✓ Test case 1 passed")

    # Test case 2: [5,3,6,2,4,null,7], k = 28
    assert solution.findTarget(root1, 28) == False
    print("✓ Test case 2 passed")

    print("\nAll test cases passed!")
