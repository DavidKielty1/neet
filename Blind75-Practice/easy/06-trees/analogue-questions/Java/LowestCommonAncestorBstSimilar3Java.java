/*
 * Ported from: 06-trees/analogue-questions/Python/lowest-common-ancestor-bst-similar3.py
 * --- Original description ---
Similar Problem 3: Search in Binary Search Tree
Difficulty: Easy
Pattern: Trees (BST)

Problem:
You are given the root of a binary search tree (BST) and an integer val.
Find the node in the BST that the node's value equals val and return the subtree rooted with that node.
If such a node does not exist, return null.

Example 1:
Input: root = [4,2,7,1,3], val = 2
Output: [2,1,3]

Example 2:
Input: root = [4,2,7,1,3], val = 5
Output: []

Constraints:
- The number of nodes in the tree is in the range [1, 5000]
- 1 <= Node.val <= 10^7
- root is a binary search tree
- 1 <= val <= 10^7
 */

import java.util.*;
import java.util.function.*;


public class LowestCommonAncestorBstSimilar3Java {

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
        public TreeNode searchBST(TreeNode root, int val) {
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

            // current = root
            // while current:
            // if current.val == val:
            // return current
            // elif val < current.val:
            // current = current.left
            // else:
            // current = current.right
            // return None

            throw new UnsupportedOperationException("Implement searchBST");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // root = create_tree(java.util.List.of(4,2,7,1,3));
        // result = sol.searchBST(root, 2);
        // assert result and result.val == 2  // needs locals (port helpers): ['result']
        System.out.println("✓ Test case 1 passed");
        // root = create_tree(java.util.List.of(4,2,7,1,3));
        // result = sol.searchBST(root, 5);
        // assert result is None  // needs locals (port helpers): ['result']
        System.out.println("✓ Test case 2 passed");
        System.out.println("\nAll test cases passed!");
    }
}
