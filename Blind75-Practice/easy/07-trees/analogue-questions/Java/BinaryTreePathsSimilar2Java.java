/*
 * Ported from: 06-trees/analogue-questions/Python/binary-tree-paths-similar2.py
 * --- Original description ---
LeetCode 404: Sum of Left Leaves
Difficulty: Easy
Pattern: Trees / DFS

Problem:
Given the root of a binary tree, return the sum of all left leaves.

A leaf is a node with no children. A left leaf is a leaf that is the left child of
another node.

Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: 24
Explanation: There are two left leaves in the binary tree, with values 9 and 15 respectively.

Example 2:
Input: root = [1]
Output: 0

Constraints:
- The number of nodes in the tree is in the range [1, 1000]
- -1000 <= Node.val <= 1000

Time Complexity: O(n)
Space Complexity: O(h)
 */

import java.util.*;
import java.util.function.*;


public class BinaryTreePathsSimilar2Java {

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
        public int sumOfLeftLeaves(TreeNode root) {
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

            // def dfs(node, is_left):
            // if not node:
            // return 0
            // if not node.left and (not node.right) and is_left:
            // return node.val
            // return dfs(node.left, True) + dfs(node.right, False)
            // return dfs(root, False)

            throw new UnsupportedOperationException("Implement sumOfLeftLeaves");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // root1 = TreeNode(3);
        // root1.left = TreeNode(9)
        // root1.right = TreeNode(20)
        // root1.right.left = TreeNode(15)
        // root1.right.right = TreeNode(7)
        // assert solution.sumOfLeftLeaves(root1) == 24  // needs locals (port helpers): ['root1']
        System.out.println("✓ Test case 1 passed");
        // root2 = TreeNode(1);
        // assert solution.sumOfLeftLeaves(root2) == 0  // needs locals (port helpers): ['root2']
        System.out.println("✓ Test case 2 passed");
        System.out.println("\nAll test cases passed!");
    }
}
