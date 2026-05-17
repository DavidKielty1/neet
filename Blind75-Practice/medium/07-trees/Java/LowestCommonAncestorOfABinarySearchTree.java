/*
 * LeetCode 235. Lowest Common Ancestor of a Binary Search Tree
 *
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) node
 * of two given nodes in the BST.
 *
 * According to the definition of LCA on Wikipedia: "The lowest common ancestor
 * is defined between two nodes p and q as the lowest node in T that has both p
 * and q as descendants, where a node can be a descendant of itself."
 *
 * Example 1:
 * Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
 * Output: 6
 *
 * Example 2:
 * Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
 * Output: 2
 *
 * Example 3:
 * Input: root = [2,1], p = 2, q = 1
 * Output: 2
 *
 * Constraints:
 * - The number of nodes in the tree is in the range [2, 100000].
 * - -1000000000 <= Node.val <= 1000000000
 * - All Node.val are unique.
 * - p != q
 * - p and q will exist in the BST.
 */
public class LowestCommonAncestorOfABinarySearchTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        // Use the BST ordering:
        // - if both targets are smaller, go left
        // - if both targets are larger, go right
        // - otherwise the current node is the split point and answer
        //
        // while (root != null) {
        //     if (p.val < root.val && q.val < root.val) {
        //         root = root.left;
        //     } else if (p.val > root.val && q.val > root.val) {
        //         root = root.right;
        //     } else {
        //         return root;
        //     }
        // }
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
