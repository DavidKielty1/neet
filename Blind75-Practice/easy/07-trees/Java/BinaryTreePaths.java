/*
 * 257. Binary Tree Paths
 * Difficulty: Easy
 * Pattern: Trees / DFS / Backtracking
 *
 * Problem:
 * Given the root of a binary tree, return all root-to-leaf paths in any order.
 * A leaf is a node with no children. Represent each path as a string of node
 * values joined by "->".
 *
 * Example 1:
 * Input: root = [1,2,3,null,5]
 * Output: ["1->2->5","1->3"]
 *
 * Example 2:
 * Input: root = [1]
 * Output: ["1"]
 *
 * Constraints:
 * - The number of nodes in the tree is in the range [1, 100]
 * - -100 <= Node.val <= 100
 */
import java.util.List;

public class BinaryTreePaths {
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
