/*
 * 226. Invert Binary Tree
 * Difficulty: Easy
 * Pattern: Trees / DFS
 *
 * Problem:
 * Given the root of a binary tree, invert the tree and return its root.
 * Inverting means swapping the left and right child of every node.
 *
 * Example 1:
 * Input: root = [4,2,7,1,3,6,9]
 * Output: [4,7,2,9,6,3,1]
 *
 * Example 2:
 * Input: root = [2,1,3]
 * Output: [2,3,1]
 *
 * Example 3:
 * Input: root = []
 * Output: []
 *
 * Constraints:
 * - The number of nodes in the tree is in the range [0, 100]
 * - -100 <= Node.val <= 100
 */

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
    }
        //

        //

        //

        //

        //

        //;

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


        // public TreeNode invertTree(TreeNode root) {
        //     if (root == null) {
        //         return null;
        //     }
    
        //     invertTree(root.left);
        //     invertTree(root.right);
    
        //     TreeNode temp = root.left;
        //     root.left = root.right;
        //     root.right = temp;
    
        //     return root;
        // }

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
