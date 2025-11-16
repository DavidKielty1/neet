"""
Similar Problem 3: Cousins in Binary Tree
Difficulty: Easy
Pattern: Trees (BFS/DFS)

Problem:
Given the root of a binary tree with unique values and the values of two different nodes x and y,
return true if the nodes corresponding to the values x and y are cousins, or false otherwise.

Two nodes are cousins if they have the same depth but different parents.

Example 1:
Input: root = [1,2,3,4], x = 4, y = 3
Output: false

Example 2:
Input: root = [1,2,3,null,4,null,5], x = 5, y = 4
Output: true

Example 3:
Input: root = [1,2,3,null,4], x = 2, y = 3
Output: false

Constraints:
- The number of nodes in the tree is in the range [2, 100]
- 1 <= Node.val <= 100
- Each node has a unique value
- x != y
- x and y exist in the tree
"""

from typing import Optional
from collections import deque


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def isCousins(self, root: Optional[TreeNode], x: int, y: int) -> bool:
        """
        Approach: BFS to find depth and parent of both nodes

        Strategy:
        1. Use BFS to track depth and parent
        2. Find both nodes and record their info
        3. Check if same depth but different parents
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

        queue = deque([(root, None, 0)])  # (node, parent, depth)
        x_info = None
        y_info = None

        while queue:
            node, parent, depth = queue.popleft()

            if node.val == x:
                x_info = (parent, depth)
            elif node.val == y:
                y_info = (parent, depth)

            # If found both, can return early
            if x_info and y_info:
                x_parent, x_depth = x_info
                y_parent, y_depth = y_info
                return x_depth == y_depth and x_parent != y_parent

            # Add children to queue
            if node.left:
                queue.append((node.left, node, depth + 1))
            if node.right:
                queue.append((node.right, node, depth + 1))

        return False


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
    root = create_tree([1, 2, 3, 4])
    assert solution.isCousins(root, 4, 3) == False
    print("✓ Test case 1 passed")

    # Test case 2
    root = create_tree([1, 2, 3, None, 4, None, 5])
    assert solution.isCousins(root, 5, 4) == True
    print("✓ Test case 2 passed")

    # Test case 3
    root = create_tree([1, 2, 3, None, 4])
    assert solution.isCousins(root, 2, 3) == False
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
