"""
LeetCode 100: Same Tree
Difficulty: Easy
Pattern: Trees (DFS)

Problem:
Given the roots of two binary trees p and q, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical,
and the nodes have the same value.

Example 1:
Input: p = [1,2,3], q = [1,2,3]
Output: true

Example 2:
Input: p = [1,2], q = [1,null,2]
Output: false

Example 3:
Input: p = [1,2,1], q = [1,1,2]
Output: false

Constraints:
- The number of nodes in both trees is in the range [0, 100]
- -10^4 <= Node.val <= 10^4

Time Complexity: O(min(n, m)) where n and m are number of nodes
Space Complexity: O(min(h1, h2)) for recursion stack
"""

from typing import Optional
from collections import deque


# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        """
        Approach: Recursive DFS

        Strategy:
        1. Base cases:
           - Both None: trees are same
           - One None: trees are different
           - Values differ: trees are different
        2. Recursively check left and right subtrees
        3. Return true only if both subtrees match
        """
        # Both null
        if not p and not q:
            return True

        # One null
        if not p or not q:
            return False

        # Values different
        if p.val != q.val:
            return False

        # Check both subtrees
        return self.isSameTree(p.left, q.left) and self.isSameTree(p.right, q.right)


# Alternative iterative BFS approach
class SolutionIterative:
    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
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

        Iterative BFS using queue
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

        queue = deque([(p, q)])

        while queue:
            node1, node2 = queue.popleft()

            # Both None
            if not node1 and not node2:
                continue

            # One None or values differ
            if not node1 or not node2 or node1.val != node2.val:
                return False

            # Add children pairs to queue
            queue.append((node1.left, node2.left))
            queue.append((node1.right, node2.right))

        return True


# Helper functions
def create_tree(values):
    """Create binary tree from level-order list"""
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

    # Test case 1: Same trees
    p = create_tree([1, 2, 3])
    q = create_tree([1, 2, 3])
    assert solution.isSameTree(p, q) == True
    print("✓ Test case 1 passed")

    # Test case 2: Different structure
    p = create_tree([1, 2])
    q = create_tree([1, None, 2])
    assert solution.isSameTree(p, q) == False
    print("✓ Test case 2 passed")

    # Test case 3: Different values
    p = create_tree([1, 2, 1])
    q = create_tree([1, 1, 2])
    assert solution.isSameTree(p, q) == False
    print("✓ Test case 3 passed")

    # Test case 4: Both empty
    p = create_tree([])
    q = create_tree([])
    assert solution.isSameTree(p, q) == True
    print("✓ Test case 4 passed")

    print("\nAll test cases passed!")
