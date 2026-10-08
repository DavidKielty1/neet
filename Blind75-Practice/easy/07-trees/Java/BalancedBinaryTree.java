/*
 * 110. Balanced Binary Tree
 * Difficulty: Easy
 * Pattern: Trees / DFS
 *
 * Problem:
 * Given the root of a binary tree, return true if it is height-balanced. A
 * height-balanced binary tree is a binary tree in which the depth of the two
 * subtrees of every node never differs by more than one.
 *
 * Example 1:
 * Input: root = [3,9,20,null,null,15,7]
 * Output: true
 *
 * Example 2:
 * Input: root = [1,2,2,3,3,null,null,4,4]
 * Output: false
 *
 * Example 3:
 * Input: root = []
 * Output: true
 *
 * Constraints:
 * - The number of nodes in the tree is in the range [0, 5000]
 * - -10^4 <= Node.val <= 10^4
 */

//   1
//  /\      
// 2  3
//    \
//     4
//      \
//       5

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        return dfs(root) == -1 ? false : true;
    }

    private int dfs (TreeNode node) {
        if (node == null) return 0;

        int left = dfs(node.left);
        if (left == -1) {
            return -1;
        }

        int right = dfs(node.right);
        if (right == -1) {
            return -1;
        }

        int difference = Math.abs(left - right);
        if (difference > 1) {
            return -1;
        }

        return 1 + Math.max(left, right);
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
        // Bottom-up height or check depth per node.

        // public boolean isBalanced(TreeNode root) {
        //     return height(root) != -1;
        // }

        // int height(TreeNode node) {
        //     if (node == null) {
        //         return 0;
        //     }
        //     int left = height(node.left);
        //     if (left == -1) {
        //         return -1;
        //     }
        //     int right = height(node.right);
        //     if (right == -1) {
        //         return -1;
        //     }
        //     if (Math.abs(left - right) > 1) {
        //         return -1;
        //     }
        //     return 1 + Math.max(left, right);
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
