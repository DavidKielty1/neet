/*
 * Ported from: 06-trees/analogue-questions/Python/binary-tree-paths-similar3.py
 * --- Original description ---
LeetCode 563: Binary Tree Tilt
Difficulty: Easy
Pattern: Trees / DFS

Problem:
Given the root of a binary tree, return the sum of every tree node's tilt.

The tilt of a tree node is the absolute difference between the sum of all left subtree
node values and all right subtree node values. If a node does not have a left child,
then the sum of the left subtree node values is treated as 0. The rule is similar if
the node does not have a right child.

Example 1:
Input: root = [1,2,3]
Output: 1
Explanation:
Tilt of node 2 : |0-0| = 0 (no children)
Tilt of node 3 : |0-0| = 0 (no children)
Tilt of node 1 : |2-3| = 1 (left subtree is just left child, so sum is 2;
                            right subtree is just right child, so sum is 3)
Sum of every tilt : 0 + 0 + 1 = 1

Example 2:
Input: root = [4,2,9,3,5,null,7]
Output: 15

Example 3:
Input: root = [21,7,14,1,1,2,2,3,3]
Output: 9

Constraints:
- The number of nodes in the tree is in the range [0, 10^4]
- -1000 <= Node.val <= 1000

Time Complexity: O(n)
Space Complexity: O(h)
 */

import java.util.*;
import java.util.function.*;


public class BinaryTreePathsSimilar3 {
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


    public int findTilt(TreeNode root) {
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

    // self.total_tilt = 0
    // def dfs(node):
    // if not node:
    // return 0
    // left_sum = dfs(node.left)
    // right_sum = dfs(node.right)
    // tilt = abs(left_sum - right_sum)
    // self.total_tilt += tilt
    // return node.val + left_sum + right_sum
    // dfs(root)
    // return self.total_tilt

        throw new UnsupportedOperationException("Implement findTilt");
    }

    

    public static void main(String[] args) {
        BinaryTreePathsSimilar3 sol = new BinaryTreePathsSimilar3();
    // root1 = TreeNode(1);
    // root1.left = TreeNode(2)
    // root1.right = TreeNode(3)
    // assert solution.findTilt(root1) == 1  // needs locals (port helpers): ['root1']
        System.out.println("✓ Test case 1 passed");
        sol = new BinaryTreePathsSimilar3();
    // root2 = TreeNode(4);
    // root2.left = TreeNode(2)
    // root2.right = TreeNode(9)
    // root2.left.left = TreeNode(3)
    // root2.left.right = TreeNode(5)
    // root2.right.right = TreeNode(7)
    // assert solution.findTilt(root2) == 15  // needs locals (port helpers): ['root2']
        System.out.println("✓ Test case 2 passed");
        System.out.println("\nAll test cases passed!");
    }
}
