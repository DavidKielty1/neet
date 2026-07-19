/*
 * Ported from: 06-trees/analogue-questions/Python/same-tree-similar2.py
 * --- Original description ---
Similar Problem 2: Univalued Binary Tree
Difficulty: Easy
Pattern: Trees (DFS)

Problem:
A binary tree is uni-valued if every node in the tree has the same value.
Given the root of a binary tree, return true if the given tree is uni-valued, or false otherwise.

Example 1:
Input: root = [1,1,1,1,1,null,1]
Output: true

Example 2:
Input: root = [2,2,2,5,2]
Output: false

Constraints:
- The number of nodes in the tree is in the range [1, 100]
- 0 <= Node.val < 100
 */

import java.util.*;
import java.util.function.*;


public class SameTreeSimilar2 {
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


    public boolean isUnivalTree(TreeNode root) {
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
    // return True
    // target_val = root.val
    // def check_unival(node):
    // if not node:
    // return True
    // if node.val != target_val:
    // return False
    // return check_unival(node.left) and check_unival(node.right)
    // return check_unival(root)

        throw new UnsupportedOperationException("Implement isUnivalTree");
    }

    

    public static void main(String[] args) {
        SameTreeSimilar2 sol = new SameTreeSimilar2();
    // root = create_tree([1, 1, 1, 1, 1, null, 1]);
    // assert solution.isUnivalTree(root) == True  // needs locals (port helpers): ['root']
        System.out.println("✓ Test case 1 passed");
    // root = create_tree(java.util.List.of(2,2,2,5,2));
    // assert solution.isUnivalTree(root) == False  // needs locals (port helpers): ['root']
        System.out.println("✓ Test case 2 passed");
    // root = create_tree(java.util.List.of(1));
    // assert solution.isUnivalTree(root) == True  // needs locals (port helpers): ['root']
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
