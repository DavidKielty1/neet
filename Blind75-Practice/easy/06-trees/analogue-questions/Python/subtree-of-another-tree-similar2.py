"""
Similar Problem 2: Binary Tree Tilt
Difficulty: Easy
Pattern: Trees (DFS)

Problem:
Given the root of a binary tree, return the sum of every tree node's tilt.
The tilt of a tree node is the absolute difference between the sum of all left subtree
node values and all right subtree node values. If a node does not have a left child,
then the sum of the left subtree node values is 0. The rule is similar if the node does not have a right child.

Example 1:
Input: root = [1,2,3]
Output: 1
Explanation:
Tilt of node 2: |0-0| = 0
Tilt of node 3: |0-0| = 0
Tilt of node 1: |2-3| = 1
Sum of tilt: 0 + 0 + 1 = 1

Example 2:
Input: root = [4,2,9,3,5,null,7]
Output: 15

Example 3:
Input: root = [21,7,14,1,1,2,2,3,3]
Output: 9

Constraints:
- The number of nodes in the tree is in the range [0, 10^4]
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
    def findTilt(self, root: Optional[TreeNode]) -> int:
        """
        Approach: DFS to calculate tilt

        Strategy:
        1. For each node, calculate sum of left and right subtrees
        2. Tilt = |left_sum - right_sum|
        3. Sum all tilts
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

        self.total_tilt = 0

        def get_sum_and_tilt(node):
            if not node:
                return 0

            left_sum = get_sum_and_tilt(node.left)
            right_sum = get_sum_and_tilt(node.right)

            # Calculate tilt for current node
            tilt = abs(left_sum - right_sum)
            self.total_tilt += tilt

            # Return sum including current node
            return left_sum + right_sum + node.val

        get_sum_and_tilt(root)
        return self.total_tilt


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
    root = create_tree([1, 2, 3])
    assert solution.findTilt(root) == 1
    print("✓ Test case 1 passed")

    # Test case 2
    root = create_tree([4, 2, 9, 3, 5, None, 7])
    assert solution.findTilt(root) == 15
    print("✓ Test case 2 passed")

    # Test case 3
    root = create_tree([21, 7, 14, 1, 1, 2, 2, 3, 3])
    assert solution.findTilt(root) == 9
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
