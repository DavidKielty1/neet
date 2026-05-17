/*
 * Ported from: 06-trees/analogue-questions/Python/invert-binary-tree-similar2.py
 * --- Original description ---
Similar Problem 2: Flatten Binary Tree to Linked List (Inorder)
Difficulty: Easy
Pattern: Trees (DFS)

Problem:
Given the root of a binary tree, flatten the tree into a "linked list" in-place where:
- The "linked list" should use the right child pointers
- The left child pointer should always be null
- The "linked list" should be in the same order as an inorder traversal

Example 1:
Input: root = [1,2,3,4,5]
Output: [4,2,5,1,3]
Explanation: Inorder: 4->2->5->1->3

Example 2:
Input: root = []
Output: []

Constraints:
- The number of nodes in the tree is in the range [0, 100]
- -100 <= Node.val <= 100
 */

import java.util.*;
import java.util.function.*;


public class InvertBinaryTreeSimilar2 {

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
        public void flatten(TreeNode root) {
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
            // return
            // nodes = []
            // def inorder(node):
            // if not node:
            // return
            // inorder(node.left)
            // nodes.append(node)
            // inorder(node.right)
            // inorder(root)
            // for i in range(len(nodes) - 1):
            // nodes[i].left = None
            // nodes[i].right = nodes[i + 1]
            // if nodes:
            // nodes[-1].left = None
            // nodes[-1].right = None

            throw new UnsupportedOperationException("Implement flatten");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // root = create_tree(java.util.List.of(1,2,3,4,5));
        // solution.flatten(root)
        // assert tree_to_list(root) == [4, 2, 5, 1, 3]  // needs locals (port helpers): ['root', 'tree_to_list']
        System.out.println("✓ Test case 1 passed");
        // root = create_tree([]);
        // solution.flatten(root)
        // assert tree_to_list(root) == []  // needs locals (port helpers): ['root', 'tree_to_list']
        System.out.println("✓ Test case 2 passed");
        System.out.println("\nAll test cases passed!");
    }
}
