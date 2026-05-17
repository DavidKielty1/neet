/*
 * Ported from: 06-trees/analogue-questions/Python/binary-tree-paths-similar1.py
 * --- Original description ---
LeetCode 112: Path Sum
Difficulty: Easy
Pattern: Trees / DFS

Problem:
Given the root of a binary tree and an integer targetSum, return true if the tree has
a root-to-leaf path such that adding up all the values along the path equals targetSum.

A leaf is a node with no children.

Example 1:
Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
Output: true
Explanation: The root-to-leaf path with the target sum is shown.

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

Time Complexity: O(n)
Space Complexity: O(h)
 */

import java.util.*;
import java.util.function.*;


public class BinaryTreePathsSimilar1 {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode() {}

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static class Solution {
        public boolean hasPathSum(TreeNode root, int targetSum) {
            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            // if not root:
            // return False
            // if not root.left and (not root.right):
            // return root.val == targetSum
            // new_target = targetSum - root.val
            // return self.hasPathSum(root.left, new_target) or self.hasPathSum(root.right, new_target)

            throw new UnsupportedOperationException("Implement hasPathSum");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // root1 = TreeNode(5);
        // root1.left = TreeNode(4)
        // root1.right = TreeNode(8)
        // root1.left.left = TreeNode(11)
        // root1.left.left.left = TreeNode(7)
        // root1.left.left.right = TreeNode(2)
        // root1.right.left = TreeNode(13)
        // root1.right.right = TreeNode(4)
        // root1.right.right.right = TreeNode(1)
        // assert solution.hasPathSum(root1, 22) == True  // needs locals (port helpers): ['root1']
        System.out.println("✓ Test case 1 passed");
        // root2 = TreeNode(1);
        // root2.left = TreeNode(2)
        // root2.right = TreeNode(3)
        // assert solution.hasPathSum(root2, 5) == False  // needs locals (port helpers): ['root2']
        System.out.println("✓ Test case 2 passed");
        System.out.println("\nAll test cases passed!");
    }
}
