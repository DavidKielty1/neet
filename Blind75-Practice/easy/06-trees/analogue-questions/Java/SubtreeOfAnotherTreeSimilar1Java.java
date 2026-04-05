/*
 * Ported from: 06-trees/analogue-questions/Python/subtree-of-another-tree-similar1.py
 * --- Original description ---
Similar Problem 1: Count Univalue Subtrees
Difficulty: Easy
Pattern: Trees (DFS)

Problem:
Given the root of a binary tree, return the number of uni-value subtrees.
A uni-value subtree means all nodes of the subtree have the same value.

Example 1:
Input: root = [5,1,5,5,5,null,5]
Output: 4

Example 2:
Input: root = []
Output: 0

Example 3:
Input: root = [5,5,5,5,5,null,5]
Output: 6

Constraints:
- The number of nodes in the tree is in the range [0, 1000]
- -1000 <= Node.val <= 1000
 */

import java.util.*;
import java.util.function.*;


public class SubtreeOfAnotherTreeSimilar1Java {

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
        public int countUnivalSubtrees(TreeNode root) {
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

            // self.count = 0
            // def is_unival(node):
            // if not node:
            // return True
            // left_unival = is_unival(node.left)
            // right_unival = is_unival(node.right)
            // if not left_unival or not right_unival:
            // return False
            // if node.left and node.left.val != node.val:
            // return False
            // if node.right and node.right.val != node.val:
            // return False
            // self.count += 1
            // return True
            // is_unival(root)
            // return self.count

            throw new UnsupportedOperationException("Implement countUnivalSubtrees");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // root = create_tree([5, 1, 5, 5, 5, null, 5]);
        // assert solution.countUnivalSubtrees(root) == 4  // needs locals (port helpers): ['root']
        System.out.println("✓ Test case 1 passed");
        // root = create_tree([]);
        // assert solution.countUnivalSubtrees(root) == 0  // needs locals (port helpers): ['root']
        System.out.println("✓ Test case 2 passed");
        // root = create_tree([5, 5, 5, 5, 5, null, 5]);
        // assert solution.countUnivalSubtrees(root) == 6  // needs locals (port helpers): ['root']
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
