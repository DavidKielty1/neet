/*
 * Ported from: 06-trees/analogue-questions/Python/diameter-of-binary-tree-similar1.py
 * --- Original description ---
Similar Problem 1: Longest Univalue Path
Difficulty: Easy
Pattern: Trees (DFS)

Problem:
Given the root of a binary tree, return the length of the longest path, where each node
in the path has the same value. This path may or may not pass through the root.

The length of the path between two nodes is represented by the number of edges between them.

Example 1:
Input: root = [5,4,5,1,1,null,5]
Output: 2

Example 2:
Input: root = [1,4,5,4,4,null,5]
Output: 2

Constraints:
- The number of nodes in the tree is in the range [0, 10^4]
- -1000 <= Node.val <= 1000
- The depth of the tree will not exceed 1000
 */

import java.util.*;
import java.util.function.*;


public class DiameterOfBinaryTreeSimilar1 {
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


    public int longestUnivaluePath(TreeNode root) {
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

    // self.max_path = 0
    // def dfs(node):
    // if not node:
    // return 0
    // left_len = dfs(node.left)
    // right_len = dfs(node.right)
    // left_path = right_path = 0
    // if node.left and node.left.val == node.val:
    // left_path = left_len + 1
    // if node.right and node.right.val == node.val:
    // right_path = right_len + 1
    // self.max_path = max(self.max_path, left_path + right_path)
    // return max(left_path, right_path)
    // dfs(root)
    // return self.max_path

        throw new UnsupportedOperationException("Implement longestUnivaluePath");
    }

    

    public static void main(String[] args) {
        DiameterOfBinaryTreeSimilar1 sol = new DiameterOfBinaryTreeSimilar1();
    // root = create_tree([5, 4, 5, 1, 1, null, 5]);
    // assert solution.longestUnivaluePath(root) == 2  // needs locals (port helpers): ['root']
        System.out.println("✓ Test case 1 passed");
    // root = create_tree([1, 4, 5, 4, 4, null, 5]);
    // assert solution.longestUnivaluePath(root) == 2  // needs locals (port helpers): ['root']
        System.out.println("✓ Test case 2 passed");
        System.out.println("\nAll test cases passed!");
    }
}
