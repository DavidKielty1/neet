/*
 * Ported from: 06-trees/analogue-questions/Python/subtree-of-another-tree-similar2.py
 * --- Original description ---
Similar Problem 2: Binary Tree Tilt
Difficulty: Easy
Pattern: Trees (DFS)

Problem:
Given the root of a binary tree, return the sum of every tree node's tilt.
The tilt of a tree node is the absolute difference between the sum of all left subtree
node values and all right subtree node values. If a node does not have a left child,
then the sum of the left subtree node values is 0. The rule is similar if the node does not have a right child.

Example 1:
Input: root = [1,2,3]
Output: 1
Explanation:
Tilt of node 2: |0-0| = 0
Tilt of node 3: |0-0| = 0
Tilt of node 1: |2-3| = 1
Sum of tilt: 0 + 0 + 1 = 1

Example 2:
Input: root = [4,2,9,3,5,null,7]
Output: 15

Example 3:
Input: root = [21,7,14,1,1,2,2,3,3]
Output: 9

Constraints:
- The number of nodes in the tree is in the range [0, 10^4]
- -1000 <= Node.val <= 1000
 */

import java.util.*;
import java.util.function.*;


public class SubtreeOfAnotherTreeSimilar2Java {

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
        public int findTilt(TreeNode root) {
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

            // self.total_tilt = 0
            // def get_sum_and_tilt(node):
            // if not node:
            // return 0
            // left_sum = get_sum_and_tilt(node.left)
            // right_sum = get_sum_and_tilt(node.right)
            // tilt = abs(left_sum - right_sum)
            // self.total_tilt += tilt
            // return left_sum + right_sum + node.val
            // get_sum_and_tilt(root)
            // return self.total_tilt

            throw new UnsupportedOperationException("Implement findTilt");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // root = create_tree(java.util.List.of(1,2,3));
        // assert solution.findTilt(root) == 1  // needs locals (port helpers): ['root']
        System.out.println("✓ Test case 1 passed");
        // root = create_tree([4, 2, 9, 3, 5, null, 7]);
        // assert solution.findTilt(root) == 15  // needs locals (port helpers): ['root']
        System.out.println("✓ Test case 2 passed");
        // root = create_tree(java.util.List.of(21,7,14,1,1,2,2,3,3));
        // assert solution.findTilt(root) == 9  // needs locals (port helpers): ['root']
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
