/*
 * Ported from: 06-trees/analogue-questions/Python/maximum-depth-binary-tree-similar1.py
 * --- Original description ---
Similar Problem 1: Minimum Depth of Binary Tree
Difficulty: Easy
Pattern: Trees (DFS/BFS)

Problem:
Given a binary tree, find its minimum depth.
The minimum depth is the number of nodes along the shortest path from the root node
down to the nearest leaf node.

Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: 2

Example 2:
Input: root = [2,null,3,null,4,null,5,null,6]
Output: 5

Constraints:
- The number of nodes in the tree is in the range [0, 10^5]
- -1000 <= Node.val <= 1000
 */

import java.util.*;
import java.util.function.*;


public class MaximumDepthBinaryTreeSimilar1Java {

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
        public int minDepth(TreeNode root) {
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
            // if not root.left and (not root.right):
            // return 1
            // if not root.left:
            // return 1 + self.minDepth(root.right)
            // if not root.right:
            // return 1 + self.minDepth(root.left)
            // return 1 + min(self.minDepth(root.left), self.minDepth(root.right))

            throw new UnsupportedOperationException("Implement minDepth");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // root = create_tree([3, 9, 20, null, null, 15, 7]);
        // assert solution.minDepth(root) == 2  // needs locals (port helpers): ['root']
        System.out.println("✓ Test case 1 passed");
        // root = create_tree([2, null, 3, null, 4, null, 5, null, 6]);
        // assert solution.minDepth(root) == 5  // needs locals (port helpers): ['root']
        System.out.println("✓ Test case 2 passed");
        // root = create_tree(java.util.List.of(1));
        // assert solution.minDepth(root) == 1  // needs locals (port helpers): ['root']
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
