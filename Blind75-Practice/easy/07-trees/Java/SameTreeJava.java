/*
100. Same Tree
Difficulty: Easy
Pattern: Trees

Return whether two binary trees are identical.

Time: O(n), Space: O(h)
*/
import java.util.ArrayList;
import java.util.List;

public class SameTreeJava {
    public boolean isSameTree(TreeNode p, TreeNode q) {
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

        // Recursion: same val and same left/right.

        // if (p == null && q == null) {
        //     return true;
        // }
        // if (p == null || q == null) {
        //     return false;
        // }
        // if (p.val != q.val) {
        //     return false;
        // }
        // return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        throw new UnsupportedOperationException("Implement isSameTree");
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
