"""
LeetCode 501: Find Mode in Binary Search Tree
Difficulty: Easy
Pattern: Trees / BST / DFS

Problem:
Given the root of a binary search tree (BST) with duplicates, return all the mode(s)
(i.e., the most frequently occurred element) in it.

If the tree has more than one mode, return them in any order.

Assume a BST is defined as follows:
- The left subtree of a node contains only nodes with keys less than or equal to the node's key.
- The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
- Both the left and right subtrees must also be binary search trees.

Example 1:
Input: root = [1,null,2,2]
Output: [2]

Example 2:
Input: root = [0]
Output: [0]

Constraints:
- The number of nodes in the tree is in the range [1, 10^4]
- -10^5 <= Node.val <= 10^5

Follow up: Could you do that without using any extra space? (Assume that the implicit
stack space incurred due to recursion does not count).

Time Complexity: O(n)
Space Complexity: O(n)
"""

from typing import Optional, List
from collections import Counter


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def findMode(self, root: Optional[TreeNode]) -> List[int]:
        """
        Approach: Count frequencies during traversal

        Strategy:
        1. Traverse tree and count frequencies
        2. Find maximum frequency
        3. Return all values with max frequency
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

        count = Counter()

        def dfs(node):
            if not node:
                return
            count[node.val] += 1
            dfs(node.left)
            dfs(node.right)

        dfs(root)

        max_count = max(count.values())
        return [val for val, cnt in count.items() if cnt == max_count]


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1: [1,null,2,2]
    root1 = TreeNode(1)
    root1.right = TreeNode(2)
    root1.right.left = TreeNode(2)
    assert solution.findMode(root1) == [2]
    print("✓ Test case 1 passed")

    # Test case 2: [0]
    root2 = TreeNode(0)
    assert solution.findMode(root2) == [0]
    print("✓ Test case 2 passed")

    print("\nAll test cases passed!")
