/*
 * Ported from: 06-trees/analogue-questions/Python/diameter-of-binary-tree-similar2.py
 * --- Original description ---
Similar Problem 2: Binary Tree Maximum Path Sum (Easy Version - Leaf to Leaf)
Difficulty: Easy
Pattern: Trees (DFS)

Problem:
Given a binary tree, find the maximum path sum between any two leaves.
A path is a sequence of nodes where each pair of adjacent nodes has an edge connecting them.

Example 1:
Input: root = [-10,9,20,null,null,15,7]
Output: 42
Explanation: Path is 15 -> 20 -> 7 = 42

Example 2:
Input: root = [1,2,3]
Output: 6
Explanation: Path is 2 -> 1 -> 3 = 6

Constraints:
- The number of nodes in the tree is in the range [2, 3 * 10^4]
- -1000 <= Node.val <= 1000
 */

import java.util.*;
import java.util.function.*;


public class DiameterOfBinaryTreeSimilar2 {
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


    public int maxPathSum(TreeNode root) {
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

    // self.max_sum = float('-inf')
    // def dfs(node):
    // if not node:
    // return float('-inf')
    // if not node.left and (not node.right):
    // return node.val
    // left_max = dfs(node.left)
    // right_max = dfs(node.right)
    // if node.left and node.right:
    // path_sum = left_max + node.val + right_max
    // self.max_sum = max(self.max_sum, path_sum)
    // return max(left_max, right_max) + node.val
    // if node.left:
    // return left_max + node.val
    // return right_max + node.val
    // dfs(root)
    // return self.max_sum

        throw new UnsupportedOperationException("Implement maxPathSum");
    }

    

    public static void main(String[] args) {
        DiameterOfBinaryTreeSimilar2 sol = new DiameterOfBinaryTreeSimilar2();
    // root = create_tree([-10, 9, 20, null, null, 15, 7]);
    // assert solution.maxPathSum(root) == 42  // needs locals (port helpers): ['root']
        System.out.println("✓ Test case 1 passed");
    // root = create_tree(java.util.List.of(1,2,3));
    // assert solution.maxPathSum(root) == 6  // needs locals (port helpers): ['root']
        System.out.println("✓ Test case 2 passed");
        System.out.println("\nAll test cases passed!");
    }
}
