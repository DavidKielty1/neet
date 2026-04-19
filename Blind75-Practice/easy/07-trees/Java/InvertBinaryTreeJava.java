/*
226. Invert Binary Tree
Difficulty: Easy
Pattern: Trees / DFS

Invert the tree by swapping each node's left and right children.

Time: O(n), Space: O(h) recursion stack
*/
import java.util.ArrayList;
import java.util.List;

public class InvertBinaryTreeJava {
    public TreeNode invertTree(TreeNode root) {
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

        // DFS or BFS swap children.

        // if (root == null) {
        //     return null;
        // }
        // TreeNode left = invertTree(root.left);
        // TreeNode right = invertTree(root.right);
        // root.left = right;
        // root.right = left;
        // return root;
        throw new UnsupportedOperationException("Implement invertTree");
    }
    public static void main(String[] args) {
        System.out.println("Implement tests with TreeNode builders.");
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
