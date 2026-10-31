/*
 * 100. Same Tree
 * Difficulty: Easy
 * Pattern: Trees / DFS
 *
 * Problem:
 * Given the roots of two binary trees p and q, return true if they are the
 * same tree, and false otherwise. Two binary trees are the same if they are
 * structurally identical and the nodes have the same values.
 *
 * Example 1:
 * Input: p = [1,2,3], q = [1,2,3]
 * Output: true
 *
 * Example 2:
 * Input: p = [1,2], q = [1,null,2]
 * Output: false
 *
 * Example 3:
 * Input: p = [1,2,1], q = [1,1,2]
 * Output: false
 *
 * Constraints:
 * - The number of nodes in both trees is in the range [0, 100]
 * - -10^4 <= Node.val <= 10^4
 */

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
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
