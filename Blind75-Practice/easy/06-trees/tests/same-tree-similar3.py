"""
Similar Problem 3: Merge Two Binary Trees
Difficulty: Easy
Pattern: Trees (DFS)

Problem:
You are given two binary trees root1 and root2.
Imagine that when you put one of them to cover the other, some nodes of the two trees
are overlapped while the others are not. You need to merge them into a new binary tree.
The merge rule is that if two nodes overlap, then sum their values. Otherwise, the non-null node will be used.

Example 1:
Input: root1 = [1,3,2,5], root2 = [2,1,3,null,4,null,7]
Output: [3,4,5,5,4,null,7]

Example 2:
Input: root1 = [1], root2 = [1,2]
Output: [2,2]

Constraints:
- The number of nodes in both trees is in the range [0, 2000]
- -10^4 <= Node.val <= 10^4
"""

from typing import Optional
from collections import deque


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
        Approach: DFS to merge trees

        Strategy:
        1. If both nodes are None, return None
        2. If one is None, return the other
        3. Otherwise, sum values and recursively merge children
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

        if not root1 and not root2:
            return None
        if not root1:
            return root2
        if not root2:
            return root1

        # Merge current nodes
        merged = TreeNode(root1.val + root2.val)

        # Recursively merge left and right subtrees
        merged.left = self.mergeTrees(root1.left, root2.left)
        merged.right = self.mergeTrees(root1.right, root2.right)

        return merged


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


def tree_to_list(root):
    if not root:
        return []

    result = []
    queue = deque([root])

    while queue:
        node = queue.popleft()
        if node:
            result.append(node.val)
            queue.append(node.left)
            queue.append(node.right)
        else:
            result.append(None)

    # Remove trailing None values
    while result and result[-1] is None:
        result.pop()

    return result


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    root1 = create_tree([1, 3, 2, 5])
    root2 = create_tree([2, 1, 3, None, 4, None, 7])
    merged = solution.mergeTrees(root1, root2)
    assert tree_to_list(merged) == [3, 4, 5, 5, 4, None, 7]
    print("✓ Test case 1 passed")

    # Test case 2
    root1 = create_tree([1])
    root2 = create_tree([1, 2])
    merged = solution.mergeTrees(root1, root2)
    assert tree_to_list(merged) == [2, 2]
    print("✓ Test case 2 passed")

    print("\nAll test cases passed!")
