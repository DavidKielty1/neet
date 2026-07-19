/*
 * Ported from: 06-trees/analogue-questions/Python/balanced-binary-tree-similar1.py
 * --- Original description ---
Similar Problem 1: Minimum Distance Between BST Nodes
Difficulty: Easy
Pattern: Trees (DFS/Inorder)

Problem:
Given the root of a Binary Search Tree (BST), return the minimum difference between
the values of any two different nodes in the tree.

Example 1:
Input: root = [4,2,6,1,3]
Output: 1

Example 2:
Input: root = [1,0,48,null,null,12,49]
Output: 1

Constraints:
- The number of nodes in the tree is in the range [2, 100]
- 0 <= Node.val <= 10^5
 */

import java.util.*;
import java.util.function.*;


public class BalancedBinaryTreeSimilar1 {
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


    public int minDiffInBST(TreeNode root) {
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

    // self.prev = None
    // self.min_diff = float('inf')
    // def inorder(node):
    // if not node:
    // return
    // inorder(node.left)
    // if self.prev is not None:
    // self.min_diff = min(self.min_diff, node.val - self.prev)
    // self.prev = node.val
    // inorder(node.right)
    // inorder(root)
    // return self.min_diff

        throw new UnsupportedOperationException("Implement minDiffInBST");
    }

    

    public static void main(String[] args) {
        BalancedBinaryTreeSimilar1 sol = new BalancedBinaryTreeSimilar1();
    // root = create_tree(java.util.List.of(4,2,6,1,3));
    // assert solution.minDiffInBST(root) == 1  // needs locals (port helpers): ['root']
        System.out.println("✓ Test case 1 passed");
    // root = create_tree([1, 0, 48, null, null, 12, 49]);
    // assert solution.minDiffInBST(root) == 1  // needs locals (port helpers): ['root']
        System.out.println("✓ Test case 2 passed");
        System.out.println("\nAll test cases passed!");
    }
}
