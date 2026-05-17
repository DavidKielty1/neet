/*
 * Ported from: 06-trees/analogue-questions/Python/invert-binary-tree-similar3.py
 * --- Original description ---
Similar Problem 3: Sum of Left Leaves
Difficulty: Easy
Pattern: Trees (DFS)

Problem:
Given the root of a binary tree, return the sum of all left leaves.
A leaf is a node with no children. A left leaf is a leaf that is the left child of another node.

Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: 24
Explanation: There are two left leaves: 9 and 15.

Example 2:
Input: root = [1]
Output: 0

Constraints:
- The number of nodes in the tree is in the range [1, 1000]
- -1000 <= Node.val <= 1000
 */

import java.util.*;
import java.util.function.*;


public class InvertBinaryTreeSimilar3 {

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
            // if is_left and (not node.left) and (not node.right):
            // return node.val
            // return dfs(node.left, True) + dfs(node.right, False)
            // if not root:
            // return 0
            // return dfs(root.left, True) + dfs(root.right, False)

            throw new UnsupportedOperationException("Implement sumOfLeftLeaves");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // root = create_tree([3, 9, 20, null, null, 15, 7]);
        // assert solution.sumOfLeftLeaves(root) == 24  // needs locals (port helpers): ['root']
        System.out.println("✓ Test case 1 passed");
        // root = create_tree(java.util.List.of(1));
        // assert solution.sumOfLeftLeaves(root) == 0  // needs locals (port helpers): ['root']
        System.out.println("✓ Test case 2 passed");
        // root = create_tree(java.util.List.of(1,2,3,4,5));
        // assert solution.sumOfLeftLeaves(root) == 4  // needs locals (port helpers): ['root']
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
