"""
Similar Problem 1: Closest Binary Search Tree Value
Difficulty: Easy
Pattern: Trees (BST)

Problem:
Given the root of a binary search tree and a target value,
return the value in the BST that is closest to the target.

Example 1:
Input: root = [4,2,5,1,3], target = 3.714286
Output: 4

Example 2:
Input: root = [1], target = 4.428571
Output: 1

Constraints:
- The number of nodes in the tree is in the range [1, 10^4]
- 0 <= Node.val <= 10^9
- -10^9 <= target <= 10^9
"""

from typing import Optional
from collections import deque


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def closestValue(self, root: Optional[TreeNode], target: float) -> int:
        """
        Approach: Use BST property to navigate

        Strategy:
        1. Use BST property to navigate toward target
        2. Track closest value seen so far
        3. Go left if target < current, right otherwise
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

        closest = root.val
        current = root

        while current:
            # Update closest if current is closer
            if abs(current.val - target) < abs(closest - target):
                closest = current.val

            # Navigate BST
            if target < current.val:
                current = current.left
            else:
                current = current.right

        return closest


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
    root = create_tree([4, 2, 5, 1, 3])
    assert solution.closestValue(root, 3.714286) == 4
    print("✓ Test case 1 passed")

    # Test case 2
    root = create_tree([1])
    assert solution.closestValue(root, 4.428571) == 1
    print("✓ Test case 2 passed")

    print("\nAll test cases passed!")
