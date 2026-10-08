/*
 * 617. Merge Two Binary Trees
 * Difficulty: Easy
 * Pattern: Trees / DFS
 *
 * Problem:
 * You are given two binary trees root1 and root2. Merge them into a new binary
 * tree by overlapping nodes starting from the roots. If two nodes overlap, the
 * merged node's value is the sum of the two values. If only one node exists at
 * a position, use that non-null node. Return the merged tree.
 *
 * Example 1:
 * Input: root1 = [1,3,2,5], root2 = [2,1,3,null,4,null,7]
 * Output: [3,4,5,5,4,null,7]
 *
 * Example 2:
 * Input: root1 = [1], root2 = [1,2]
 * Output: [2,2]
 *
 * Constraints:
 * - The number of nodes in both trees is in the range [0, 2000]
 * - -10^4 <= Node.val <= 10^4
 */

public class MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
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

        // if (root1 == null) {
        //     return root2;
        // }
        // if (root2 == null) {
        //     return root1;
        // }
        // TreeNode merged = new TreeNode(root1.val + root2.val);
        // merged.left = mergeTrees(root1.left, root2.left);
        // merged.right = mergeTrees(root1.right, root2.right);
        // return merged;
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
