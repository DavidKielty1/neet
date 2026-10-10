/*
 * 572. Subtree of Another Tree
 * Difficulty: Easy
 * Pattern: Trees / DFS
 *
 * Problem:
 * Given the roots of two binary trees root and subRoot, return true if there
 * is a subtree of root with the same structure and node values as subRoot, and
 * false otherwise. A subtree of a binary tree consists of a node in the tree
 * and all of that node's descendants. The tree itself may also be considered a
 * subtree of itself.
 *
 * Example 1:
 * Input: root = [3,4,5,1,2], subRoot = [4,1,2]
 * Output: true
 *
 * Example 2:
 * Input: root = [3,4,5,1,2,null,null,null,null,0], subRoot = [4,1,2]
 * Output: false
 *
 * Constraints:
 * - The number of nodes in the root tree is in the range [1, 2000]
 * - The number of nodes in the subRoot tree is in the range [1, 1000]
 * - -10^4 <= root.val <= 10^4
 * - -10^4 <= subRoot.val <= 10^4
 */

public class SubtreeOfAnotherTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
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

        // public class SubtreeOfAnotherTree {
            // public boolean isSubtree(TreeNode root, TreeNode subRoot) {
            //     if (subRoot == null) {
            //         return true;
            //     }
        
            //     return dfs(root, subRoot);
            // }
        
            // private boolean dfs(TreeNode root, TreeNode subRoot) {
            //     if (root == null) {
            //         return false;
            //     }
        
            //     return isSame(root, subRoot)
            //         || dfs(root.left, subRoot)
            //         || dfs(root.right, subRoot);
            // }
        
            // private boolean isSame(TreeNode root, TreeNode subRoot) {
            //     if (root == null && subRoot == null) {
            //         return true;
            //     }
        
            //     if (root == null || subRoot == null) {
            //         return false;
            //     }
        
            //     return root.val == subRoot.val
            //         && isSame(root.left, subRoot.left)
            //         && isSame(root.right, subRoot.right);
            // }
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


