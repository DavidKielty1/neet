"""
LeetCode 938: Range Sum of BST
Difficulty: Easy
Pattern: Trees / DFS

Problem:
Given the root node of a binary search tree and two integers low and high, return the
sum of values of all nodes with a value in the inclusive range [low, high].

Example 1:
Input: root = [10,5,15,3,7,null,18], low = 7, high = 15
Output: 32
Explanation: Nodes 7, 10, and 15 are in the range [7, 15]. 7 + 10 + 15 = 32.

Example 2:
Input: root = [10,5,15,3,7,13,18,1,null,6], low = 6, high = 10
Output: 23
Explanation: Nodes 6, 7, and 10 are in the range [6, 10]. 6 + 7 + 10 = 23.

Constraints:
- The number of nodes in the tree is in the range [1, 2 * 10^4]
- 1 <= Node.val <= 10^5
- 1 <= low <= high <= 10^5
- All Node.val are unique

Time Complexity: O(n)
Space Complexity: O(h) where h is height
"""

from typing import Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def rangeSumBST(self, root: Optional[TreeNode], low: int, high: int) -> int:
        """
        Approach: DFS with BST properties

        Strategy:
        1. DFS through tree
        2. If current value in range, add to sum
        3. Use BST property to prune search:
           - If current < low, only search right
           - If current > high, only search left
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
            return 0

        # If current value is in range, include it
        current_sum = root.val if low <= root.val <= high else 0

        # Search left subtree if current value > low
        if root.val > low:
            current_sum += self.rangeSumBST(root.left, low, high)

        # Search right subtree if current value < high
        if root.val < high:
            current_sum += self.rangeSumBST(root.right, low, high)

        return current_sum


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1: [10,5,15,3,7,null,18]
    root1 = TreeNode(10)
    root1.left = TreeNode(5)
    root1.right = TreeNode(15)
    root1.left.left = TreeNode(3)
    root1.left.right = TreeNode(7)
    root1.right.right = TreeNode(18)
    assert solution.rangeSumBST(root1, 7, 15) == 32
    print("✓ Test case 1 passed")

    # Test case 2: [10,5,15,3,7,13,18,1,null,6]
    root2 = TreeNode(10)
    root2.left = TreeNode(5)
    root2.right = TreeNode(15)
    root2.left.left = TreeNode(3)
    root2.left.right = TreeNode(7)
    root2.right.left = TreeNode(13)
    root2.right.right = TreeNode(18)
    root2.left.left.left = TreeNode(1)
    root2.left.right.left = TreeNode(6)
    assert solution.rangeSumBST(root2, 6, 10) == 23
    print("✓ Test case 2 passed")

    print("\nAll test cases passed!")
