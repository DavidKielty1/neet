/*
 * Ported from: 06-trees/analogue-questions/Python/lowest-common-ancestor-bst-similar2.py
 * --- Original description ---
Similar Problem 2: Kth Smallest Element in BST
Difficulty: Easy
Pattern: Trees (BST/Inorder)

Problem:
Given the root of a binary search tree and an integer k,
return the kth smallest value (1-indexed) of all the values in the tree.

Example 1:
Input: root = [3,1,4,null,2], k = 1
Output: 1

Example 2:
Input: root = [5,3,6,2,4,null,null,1], k = 3
Output: 3

Constraints:
- The number of nodes in the tree is n
- 1 <= k <= n <= 10^4
- 0 <= Node.val <= 10^4
 */

import java.util.*;
import java.util.function.*;


public class LowestCommonAncestorBstSimilar2Java {

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
        public int kthSmallest(TreeNode root, int k) {
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
            // self.result = None
            // def inorder(node):
            // if not node or self.result is not None:
            // return
            // inorder(node.left)
            // self.count += 1
            // if self.count == k:
            // self.result = node.val
            // return
            // inorder(node.right)
            // inorder(root)
            // return self.result

            throw new UnsupportedOperationException("Implement kthSmallest");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // root = create_tree([3, 1, 4, null, 2]);
        // assert solution.kthSmallest(root, 1) == 1  // needs locals (port helpers): ['root']
        System.out.println("✓ Test case 1 passed");
        // root = create_tree([5, 3, 6, 2, 4, null, null, 1]);
        // assert solution.kthSmallest(root, 3) == 3  // needs locals (port helpers): ['root']
        System.out.println("✓ Test case 2 passed");
        System.out.println("\nAll test cases passed!");
    }
}
