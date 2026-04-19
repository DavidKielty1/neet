/*
572. Subtree of Another Tree
Difficulty: Easy
Pattern: Trees

Return true if root has a subtree equal to subRoot.

Time: O(m * n) naive, better with hashing
*/
import java.util.ArrayList;
import java.util.List;

public class SubtreeOfAnotherTreeJava {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
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

        // Compare structures / same-tree helper.

        // class Solver {
        //     boolean same(TreeNode a, TreeNode b) {
        //         if (a == null && b == null) {
        //             return true;
        //         }
        //         if (a == null || b == null) {
        //             return false;
        //         }
        //         return a.val == b.val
        //                 && same(a.left, b.left)
        //                 && same(a.right, b.right);
        //     }
        //     boolean dfs(TreeNode node) {
        //         if (node == null) {
        //             return false;
        //         }
        //         return same(node, subRoot) || dfs(node.left) || dfs(node.right);
        //     }
        // }
        // if (subRoot == null) {
        //     return true;
        // }
        // return new Solver().dfs(root);
        throw new UnsupportedOperationException("Implement isSubtree");
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
