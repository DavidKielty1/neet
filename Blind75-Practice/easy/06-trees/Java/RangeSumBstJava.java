/*
938. Range Sum of BST
Difficulty: Easy
Pattern: Trees / BST

Sum values in BST between low and high inclusive.

Time: O(n), Space: O(h)
*/
import java.util.ArrayList;
import java.util.List;

public class RangeSumBstJava {
    public int rangeSumBST(TreeNode root, int low, int high) {
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

        // Prune search using BST property.

        // if (root == null) {
        //     return 0;
        // }
        // if (root.val < low) {
        //     return rangeSumBST(root.right, low, high);
        // }
        // if (root.val > high) {
        //     return rangeSumBST(root.left, low, high);
        // }
        // return root.val + rangeSumBST(root.left, low, high)
        //         + rangeSumBST(root.right, low, high);
        throw new UnsupportedOperationException("Implement rangeSumBST");
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
