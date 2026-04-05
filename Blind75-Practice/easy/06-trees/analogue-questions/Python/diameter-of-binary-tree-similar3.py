"""
Similar Problem 3: Binary Tree Longest Consecutive Sequence (Easy Version)
Difficulty: Easy
Pattern: Trees (DFS)

Problem:
Given the root of a binary tree, return the length of the longest consecutive sequence path.
A consecutive sequence path is a path where the values increase by 1 along the path.
The path can be start from any node and go in the downward direction only.

Example 1:
Input: root = [1,null,3,2,4,null,null,null,5]
Output: 3
Explanation: Longest path is 3 -> 4 -> 5

Example 2:
Input: root = [2,null,3,2,null,1]
Output: 2
Explanation: Longest path is 2 -> 3

Constraints:
- The number of nodes in the tree is in the range [1, 3 * 10^4]
- -3 * 10^4 <= Node.val <= 3 * 10^4
"""

from typing import Optional
from collections import deque


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def longestConsecutive(self, root: Optional[TreeNode]) -> int:
        """
        Approach: DFS to track consecutive sequences

        Strategy:
        1. For each node, check if it extends parent's sequence
        2. Track current length and maximum length
        3. Return maximum found
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

        self.max_length = 0

        def dfs(node, parent_val, current_length):
            if not node:
                return

            # Check if extends sequence
            if parent_val is not None and node.val == parent_val + 1:
                current_length += 1
            else:
                current_length = 1

            self.max_length = max(self.max_length, current_length)

            # Continue with children
            dfs(node.left, node.val, current_length)
            dfs(node.right, node.val, current_length)

        dfs(root, None, 0)
        return self.max_length


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
    root = create_tree([1, None, 3, 2, 4, None, None, None, 5])
    assert solution.longestConsecutive(root) == 3
    print("✓ Test case 1 passed")

    # Test case 2
    root = create_tree([2, None, 3, 2, None, 1])
    assert solution.longestConsecutive(root) == 2
    print("✓ Test case 2 passed")

    print("\nAll test cases passed!")
