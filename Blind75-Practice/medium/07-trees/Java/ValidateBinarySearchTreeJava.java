/*
 * LeetCode 98. Validate Binary Search Tree
 *
 * Given the root of a binary tree, determine if it is a valid binary search
 * tree (BST).
 *
 * A valid BST is defined as follows:
 * - The left subtree of a node contains only nodes with keys less than the
 *   node's key.
 * - The right subtree of a node contains only nodes with keys greater than the
 *   node's key.
 * - Both left and right subtrees must also be binary search trees.
 *
 * Example 1:
 * Input: root = [2,1,3]
 * Output: true
 *
 * Example 2:
 * Input: root = [5,1,4,null,null,3,6]
 * Output: false
 * Explanation: The root's value is 5 but the right subtree contains a 3.
 *
 * Constraints:
 * - The number of nodes in the tree is in the range [1, 10000].
 * - -2147483648 <= Node.val <= 2147483647
 */
public class ValidateBinarySearchTreeJava {
    public boolean isValidBST(TreeNode root) {
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
        // Carry lower and upper bounds through the recursion.
        //
        // return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    // private boolean validate(TreeNode node, long lower, long upper) {
    //     if (node == null) {
    //         return true;
    //     }
    //     if (node.val <= lower || node.val >= upper) {
    //         return false;
    //     }
    //     return validate(node.left, lower, node.val)
    //             && validate(node.right, node.val, upper);
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
