"""
Similar Problem 2: Flatten Binary Tree to Linked List (Inorder)
Difficulty: Easy
Pattern: Trees (DFS)

Problem:
Given the root of a binary tree, flatten the tree into a "linked list" in-place where:
- The "linked list" should use the right child pointers
- The left child pointer should always be null
- The "linked list" should be in the same order as an inorder traversal

Example 1:
Input: root = [1,2,3,4,5]
Output: [4,2,5,1,3]
Explanation: Inorder: 4->2->5->1->3

Example 2:
Input: root = []
Output: []

Constraints:
- The number of nodes in the tree is in the range [0, 100]
- -100 <= Node.val <= 100
"""

from typing import Optional
from collections import deque


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def flatten(self, root: Optional[TreeNode]) -> None:
        """
        Approach: Inorder traversal then rebuild

        Strategy:
        1. Perform inorder traversal to get node order
        2. Rebuild tree using right pointers only
        3. Set all left pointers to None
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
            return

        # Collect nodes in inorder
        nodes = []

        def inorder(node):
            if not node:
                return
            inorder(node.left)
            nodes.append(node)
            inorder(node.right)

        inorder(root)

        # Rebuild as linked list
        for i in range(len(nodes) - 1):
            nodes[i].left = None
            nodes[i].right = nodes[i + 1]

        if nodes:
            nodes[-1].left = None
            nodes[-1].right = None


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
    result = []
    current = root
    while current:
        result.append(current.val)
        current = current.right
    return result


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    root = create_tree([1, 2, 3, 4, 5])
    solution.flatten(root)
    assert tree_to_list(root) == [4, 2, 5, 1, 3]
    print("✓ Test case 1 passed")

    # Test case 2
    root = create_tree([])
    solution.flatten(root)
    assert tree_to_list(root) == []
    print("✓ Test case 2 passed")

    print("\nAll test cases passed!")
