/*
543. Diameter of Binary Tree
Difficulty: Easy
Pattern: Trees

Length of longest path between any two nodes (edges count).

Time: O(n), Space: O(h)
*/
import java.util.ArrayList;
import java.util.List;

public class DiameterOfBinaryTreeJava {
    public int diameterOfBinaryTree(TreeNode root) {
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

        // Track max path through each node: leftHeight + rightHeight.

        // class Solver {
        //     int diameter = 0;
        //     int depth(TreeNode node) {
        //         if (node == null) {
        //             return 0;
        //         }
        //         int left = depth(node.left);
        //         int right = depth(node.right);
        //         diameter = Math.max(diameter, left + right);
        //         return 1 + Math.max(left, right);
        //     }
        // }
        // Solver solver = new Solver();
        // solver.depth(root);
        // return solver.diameter;
        throw new UnsupportedOperationException("Implement diameterOfBinaryTree");
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
