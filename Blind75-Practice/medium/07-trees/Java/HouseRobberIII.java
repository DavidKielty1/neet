/*
 * LeetCode 337. House Robber III
 *
 * The thief has found himself a new place for his thievery again. There is
 * only one entrance to this area, called root.
 *
 * Besides the root, each house has one and only one parent house. After a
 * tour, the smart thief realized that all houses in this place form a binary
 * tree. It will automatically contact the police if two directly-linked houses
 * are broken into on the same night.
 *
 * Given the root of the binary tree, return the maximum amount of money the
 * thief can rob without alerting the police.
 *
 * Example 1:
 * Input: root = [3,2,3,null,3,null,1]
 * Output: 7
 *
 * Example 2:
 * Input: root = [3,4,5,1,3,null,1]
 * Output: 9
 *
 * Constraints:
 * - The number of nodes in the tree is in the range [1, 10000].
 * - 0 <= Node.val <= 10000
 */
public class HouseRobberIII {
    public int rob(TreeNode root) {
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
        //                3
        //        2                  3
        //     3     n           n      1
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
        // For each node compute:
        // - max money if this node is robbed
        // - max money if this node is skipped
        //
        // int[] state = dfs(root);
        // return Math.max(state[0], state[1]);

    // private int[] dfs(TreeNode node) {
    //     if (node == null) {
    //         return new int[] {0, 0};
    //     }
    //     int[] left = dfs(node.left);
    //     int[] right = dfs(node.right);
    //     int rob = node.val + left[1] + right[1];
    //     int skip = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
    //     return new int[] {rob, skip};
    // }

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
