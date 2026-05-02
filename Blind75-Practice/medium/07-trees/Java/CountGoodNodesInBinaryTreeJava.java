/*
 * LeetCode 1448. Count Good Nodes in Binary Tree
 *
 * Given a binary tree root, a node X in the tree is named good if on the path
 * from root to X there are no nodes with a value greater than X.
 *
 * Return the number of good nodes in the binary tree.
 *
 * Example 1:
 * Input: root = [3,1,4,3,null,1,5]
 * Output: 4
 * Explanation: The good nodes are 3, 4, 5, and the leftmost 3.
 *
 * Example 2:
 * Input: root = [3,3,null,4,2]
 * Output: 3
 *
 * Example 3:
 * Input: root = [1]
 * Output: 1
 *
 * Constraints:
 * - The number of nodes in the binary tree is in the range [1, 100000].
 * - -10000 <= Node.val <= 10000
 */
public class CountGoodNodesInBinaryTreeJava {
    public int goodNodes(TreeNode root) {
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
        // DFS while carrying the maximum value seen so far on the path.
        //
        // return dfs(root, Integer.MIN_VALUE);
    }

    // private int dfs(TreeNode node, int maxSoFar) {
    //     if (node == null) {
    //         return 0;
    //     }
    //     int nextMax = Math.max(maxSoFar, node.val);
    //     int count = node.val >= maxSoFar ? 1 : 0;
    //     count += dfs(node.left, nextMax);
    //     count += dfs(node.right, nextMax);
    //     return count;
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
