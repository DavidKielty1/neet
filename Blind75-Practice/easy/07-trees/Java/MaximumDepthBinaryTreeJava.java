/*
104. Maximum Depth of Binary Tree
Difficulty: Easy
Pattern: Trees / DFS

Given the root of a binary tree, return its maximum depth. The maximum depth is
the number of nodes along the longest path from the root down to a leaf.

Example:
root = [3,9,20,null,null,15,7] -> 3
The longest root-to-leaf path has 3 nodes.

Example:
root = [] -> 0

Idea:
Use recursion. The depth at a node is 1 + max(depth of left subtree, depth of
right subtree).

Time: O(n), Space: O(h)
*/

public class MaximumDepthBinaryTreeJava {
    public int maxDepth(TreeNode root) {


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

        // if (root == null) {
        //     return 0;
        // }
        // return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        throw new UnsupportedOperationException("Implement maxDepth");
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
