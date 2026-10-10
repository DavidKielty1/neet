/*
 * 938. Range Sum of BST
 * Difficulty: Easy
 * Pattern: Trees / BST
 *
 * Problem:
 * Given the root node of a binary search tree and two integers low and high,
 * return the sum of values of all nodes with a value in the inclusive range
 * [low, high].
 *
 * Example 1:
 * Input: root = [10,5,15,3,7,null,18], low = 7, high = 15
 * Output: 32
 *
 * Example 2:
 * Input: root = [10,5,15,3,7,13,18,1,null,6], low = 6, high = 10
 * Output: 23
 *
 * Constraints:
 * - The number of nodes in the tree is in the range [1, 2 * 10^4]
 * - 1 <= Node.val <= 10^5
 * - 1 <= low <= high <= 10^5
 * - All Node.val are unique
 */

public class RangeSumBst {
    public int rangeSumBST(TreeNode root, int low, int high) {
        
    }


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
