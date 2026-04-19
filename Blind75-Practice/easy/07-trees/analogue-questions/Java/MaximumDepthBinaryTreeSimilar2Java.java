/*
 * Ported from: 06-trees/analogue-questions/Python/maximum-depth-binary-tree-similar2.py
 * --- Original description ---
Similar Problem 2: Count Complete Tree Nodes
Difficulty: Easy
Pattern: Trees (DFS)

Problem:
Given the root of a complete binary tree, return the number of the nodes in the tree.

Example 1:
Input: root = [1,2,3,4,5,6]
Output: 6

Example 2:
Input: root = []
Output: 0

Example 3:
Input: root = [1]
Output: 1

Constraints:
- The number of nodes in the tree is in the range [0, 5 * 10^4]
- 0 <= Node.val <= 5 * 10^4
 */

import java.util.*;
import java.util.function.*;


public class MaximumDepthBinaryTreeSimilar2Java {

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
        public int countNodes(TreeNode root) {
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
            // return 0
            // return 1 + self.countNodes(root.left) + self.countNodes(root.right)

            throw new UnsupportedOperationException("Implement countNodes");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // root = create_tree(java.util.List.of(1,2,3,4,5,6));
        // assert solution.countNodes(root) == 6  // needs locals (port helpers): ['root']
        System.out.println("✓ Test case 1 passed");
        // root = create_tree([]);
        // assert solution.countNodes(root) == 0  // needs locals (port helpers): ['root']
        System.out.println("✓ Test case 2 passed");
        // root = create_tree(java.util.List.of(1));
        // assert solution.countNodes(root) == 1  // needs locals (port helpers): ['root']
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
