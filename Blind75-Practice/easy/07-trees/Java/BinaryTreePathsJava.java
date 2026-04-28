/*
257. Binary Tree Paths
Difficulty: Easy
Pattern: Trees / DFS / Backtracking

Given the root of a binary tree, return all root-to-leaf paths as strings.
A leaf is a node with no left or right child.

Example:
root = [1,2,3,null,5] -> ["1->2->5", "1->3"]
There are two root-to-leaf paths: from 1 to 2 to 5, and from 1 to 3.

Example:
root = [1] -> ["1"]

Idea:
Traverse the tree with DFS while carrying the current path. When you reach a
leaf, add that completed path to the answer list.

Time: O(n * L), Space: O(h)
L is the average path-string length.
*/
import java.util.List;

public class BinaryTreePathsJava {
    public List<String> binaryTreePaths(TreeNode root) {
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

        // public List<String> binaryTreePaths(TreeNode root) {
        //     List<String> result = new ArrayList<>();
        //     if (root == null) {
        //         return result;
        //     }
        //     dfs(root, String.valueOf(root.val), result);
        //     return result;
        // }
        // private void dfs(TreeNode node, String path, List<String> result) {
        //     if (node.left == null && node.right == null) {
        //         result.add(path);
        //         return;
        //     }
        //     if (node.left != null) {
        //         dfs(node.left, path + "->" + node.left.val, result);
        //     }
        //     if (node.right != null) {
        //         dfs(node.right, path + "->" + node.right.val, result);
        //     }
        // }
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
