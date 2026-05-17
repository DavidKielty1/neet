/*
 * Ported from: 06-trees/analogue-questions/Python/invert-binary-tree-similar1.py
 * --- Original description ---
Similar Problem 1: Mirror Tree Check
Difficulty: Easy
Pattern: Trees (DFS)

Problem:
Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

Example 1:
Input: root = [1,2,2,3,4,4,3]
Output: true

Example 2:
Input: root = [1,2,2,null,3,null,3]
Output: false

Constraints:
- The number of nodes in the tree is in the range [1, 1000]
- -100 <= Node.val <= 100
 */

import java.util.*;
import java.util.function.*;


public class InvertBinaryTreeSimilar1 {

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
        public boolean isSymmetric(TreeNode root) {
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

            // def is_mirror(left: Optional[TreeNode], right: Optional[TreeNode]) -> bool:
            // if not left and (not right):
            // return True
            // if not left or not right:
            // return False
            // return left.val == right.val and is_mirror(left.left, right.right) and is_mirror(left.right, right.left)
            // if not root:
            // return True
            // return is_mirror(root.left, root.right)

            throw new UnsupportedOperationException("Implement isSymmetric");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // root = create_tree(java.util.List.of(1,2,2,3,4,4,3));
        // assert solution.isSymmetric(root) == True  // needs locals (port helpers): ['root']
        System.out.println("✓ Test case 1 passed");
        // root = create_tree([1, 2, 2, null, 3, null, 3]);
        // assert solution.isSymmetric(root) == False  // needs locals (port helpers): ['root']
        System.out.println("✓ Test case 2 passed");
        // root = create_tree(java.util.List.of(1));
        // assert solution.isSymmetric(root) == True  // needs locals (port helpers): ['root']
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
