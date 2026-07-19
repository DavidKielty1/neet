/*
 * 124. Binary Tree Maximum Path Sum
 * Difficulty: Hard
 * Pattern: Trees / DFS
 *
 * Problem:
 * A path in a binary tree is a sequence of nodes where each pair of adjacent
 * nodes has an edge connecting them. A node can appear in the sequence at most
 * once. The path does not need to pass through the root.
 *
 * The path sum is the sum of the node values in the path.
 *
 * Given the root of a binary tree, return the maximum path sum of any non-empty
 * path.
 *
 * Example 1:
 * Input: root = [1,2,3]
 * Output: 6
 * Explanation: The best path is 2 -> 1 -> 3.
 *
 * Example 2:
 * Input: root = [-10,9,20,null,null,15,7]
 * Output: 42
 * Explanation: The best path is 15 -> 20 -> 7.
 *
 * Constraints:
 * - The number of nodes in the tree is in the range [1, 3 * 10^4]
 * - -1000 <= Node.val <= 1000
 */
public class BinaryTreeMaximumPathSum {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }


    public int maxPathSum(TreeNode root) {
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

    // int[] best = {Integer.MIN_VALUE};
    // maxGain(root, best);
    // return best[0];
        throw new UnsupportedOperationException("Implement maxPathSum");
    }

    // private int maxGain(TreeNode node, int[] best) {
    //     if (node == null) {
    //         return 0;
    //     }
    //
    //     int leftGain = Math.max(0, maxGain(node.left, best));
    //     int rightGain = Math.max(0, maxGain(node.right, best));
    //     best[0] = Math.max(best[0], node.val + leftGain + rightGain);
    //
    //     return node.val + Math.max(leftGain, rightGain);
    // }
    

    public static void main(String[] args) {
        System.out.println("Practice stub ready. Implement maxPathSum and add checks.");
    }
}
