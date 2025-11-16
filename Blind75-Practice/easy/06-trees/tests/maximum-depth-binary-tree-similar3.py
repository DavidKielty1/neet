"""
Similar Problem 3: Path Sum
Difficulty: Easy
Pattern: Trees (DFS)

Problem:
Given the root of a binary tree and an integer targetSum, return true if the tree
has a root-to-leaf path such that adding up all the values along the path equals targetSum.

A leaf is a node with no children.

Example 1:
Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
Output: true

Example 2:
Input: root = [1,2,3], targetSum = 5
Output: false

Example 3:
Input: root = [], targetSum = 0
Output: false

Constraints:
- The number of nodes in the tree is in the range [0, 5000]
- -1000 <= Node.val <= 1000
- -1000 <= targetSum <= 1000
"""

from typing import Optional
from collections import deque


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def hasPathSum(self, root: Optional[TreeNode], targetSum: int) -> bool:
        """
        Approach: DFS to check path sum

        Strategy:
        1. Traverse tree, subtracting node values from target
        2. At leaf, check if remaining sum equals leaf value
        3. Return true if any path sums to target
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
            return False

        # If leaf node, check if path sum equals target
        if not root.left and not root.right:
            return root.val == targetSum

        # Check left and right subtrees
        new_target = targetSum - root.val
        return self.hasPathSum(root.left, new_target) or self.hasPathSum(
            root.right, new_target
        )


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
    root = create_tree([5, 4, 8, 11, None, 13, 4, 7, 2, None, None, None, 1])
    assert solution.hasPathSum(root, 22) == True
    print("✓ Test case 1 passed")

    # Test case 2
    root = create_tree([1, 2, 3])
    assert solution.hasPathSum(root, 5) == False
    print("✓ Test case 2 passed")

    # Test case 3
    root = create_tree([])
    assert solution.hasPathSum(root, 0) == False
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
