/*
226. Invert Binary Tree
Difficulty: Easy
Pattern: Trees / DFS

Given the root of a binary tree, invert the tree and return its root. Inverting
means swapping the left and right child of every node.

Example:
root = [4,2,7,1,3,6,9] -> [4,7,2,9,6,3,1]
After swapping children at every node, the whole tree becomes a mirror image.

Example:
root = [] -> []

Idea:
Use DFS recursion or BFS. For each node, swap its left and right child, then
continue processing both subtrees.

Time: O(n), Space: O(h)
*/

public class InvertBinaryTreeJava {
    public TreeNode invertTree(TreeNode root) {
        if (root == null ){
            return null;
        }

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;




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
