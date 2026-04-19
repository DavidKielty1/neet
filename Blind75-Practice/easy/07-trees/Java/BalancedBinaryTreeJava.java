/*
110. Balanced Binary Tree
Difficulty: Easy
Pattern: Trees

Height-balanced: left and right subtree heights differ by at most 1.

Time: O(n), Space: O(h)
*/
import java.util.ArrayList;
import java.util.List;

public class BalancedBinaryTreeJava {
    public boolean isBalanced(TreeNode root) {
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

        // Bottom-up height or check depth per node.

        // class Solver {
        //     int height(TreeNode node) {
        //         if (node == null) {
        //             return 0;
        //         }
        //         int left = height(node.left);
        //         if (left == -1) {
        //             return -1;
        //         }
        //         int right = height(node.right);
        //         if (right == -1) {
        //             return -1;
        //         }
        //         if (Math.abs(left - right) > 1) {
        //             return -1;
        //         }
        //         return 1 + Math.max(left, right);
        //     }
        // }
        // return new Solver().height(root) != -1;
        throw new UnsupportedOperationException("Implement isBalanced");
    }
    public static void main(String[] args) {
        System.out.println("Implement tests.");
    }
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


}
