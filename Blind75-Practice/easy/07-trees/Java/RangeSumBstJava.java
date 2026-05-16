/*
938. Range Sum of BST
Difficulty: Easy
Pattern: Trees / BST

Given the root of a binary search tree and two integers low and high, return
the sum of all node values in the inclusive range [low, high].

Example:
root = [10,5,15,3,7,null,18], low = 7, high = 15 -> 32
The values inside the range are 7, 10, and 15, so the sum is 32.

Example:
root = [10,5,15,3,7,13,18,1,null,6], low = 6, high = 10 -> 23
The values inside the range are 6, 7, and 10.

Time: O(n) worst case, Space: O(h)
*/

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
