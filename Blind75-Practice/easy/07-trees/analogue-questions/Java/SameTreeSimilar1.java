/*
 * Ported from: 06-trees/analogue-questions/Python/same-tree-similar1.py
 * --- Original description ---
Similar Problem 1: Leaf-Similar Trees
Difficulty: Easy
Pattern: Trees (DFS)

Problem:
Consider all the leaves of a binary tree. From left to right order, the values of those leaves form a leaf value sequence.
Two binary trees are considered leaf-similar if their leaf value sequence is the same.
Return true if and only if the two given trees are leaf-similar.

Example 1:
Input: root1 = [3,5,1,6,2,9,8,null,null,7,4], root2 = [3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]
Output: true

Example 2:
Input: root1 = [1,2,3], root2 = [1,3,2]
Output: false

Constraints:
- The number of nodes in each tree will be in the range [1, 200]
- Both trees will have values in the range [0, 200]
 */

import java.util.*;
import java.util.function.*;


public class SameTreeSimilar1 {
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


    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
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

    // def get_leaves(node):
    // if not node:
    // return []
    // if not node.left and (not node.right):
    // return [node.val]
    // return get_leaves(node.left) + get_leaves(node.right)
    // return get_leaves(root1) == get_leaves(root2)

        throw new UnsupportedOperationException("Implement leafSimilar");
    }

    

    public static void main(String[] args) {
        SameTreeSimilar1 sol = new SameTreeSimilar1();
    // root1 = create_tree([3, 5, 1, 6, 2, 9, 8, null, null, 7, 4]);
    // root2 = create_tree([3, 5, 1, 6, 7, 4, 2, null, null, null, null, null, null, 9, 8]);
    // assert solution.leafSimilar(root1, root2) == True  // needs locals (port helpers): ['root1', 'root2']
        System.out.println("✓ Test case 1 passed");
    // root1 = create_tree(java.util.List.of(1,2,3));
    // root2 = create_tree(java.util.List.of(1,3,2));
    // assert solution.leafSimilar(root1, root2) == False  // needs locals (port helpers): ['root1', 'root2']
        System.out.println("✓ Test case 2 passed");
        System.out.println("\nAll test cases passed!");
    }
}
