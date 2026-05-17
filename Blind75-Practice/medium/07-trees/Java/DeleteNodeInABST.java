/*
 * LeetCode 450. Delete Node in a BST
 *
 * Given a root node reference of a BST and a key, delete the node with the
 * given key in the BST. Return the root reference of the BST after deletion.
 *
 * There can be zero, one, or two children on the deleted node. When there are
 * two children, replace the node with its inorder successor or predecessor and
 * keep the BST property valid.
 *
 * Example 1:
 * Input: root = [5,3,6,2,4,null,7], key = 3
 * Output: [5,4,6,2,null,null,7]
 *
 * Example 2:
 * Input: root = [5,3,6,2,4,null,7], key = 0
 * Output: [5,3,6,2,4,null,7]
 *
 * Example 3:
 * Input: root = [], key = 0
 * Output: []
 *
 * Constraints:
 * - The number of nodes in the tree is in the range [0, 10000].
 * - -100000 <= Node.val <= 100000
 * - Each node has a unique value.
 * - root is a valid binary search tree.
 * - -100000 <= key <= 100000
 */
public class DeleteNodeInABST {
    public TreeNode deleteNode(TreeNode root, int key) {
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        // Search by BST ordering.
        // When the key is found:
        // - return the non-null child if there is at most one child
        // - otherwise copy in the inorder successor value and delete that node
        //
        // if (root == null) {
        //     return null;
        // }
        // if (key < root.val) {
        //     root.left = deleteNode(root.left, key);
        // } else if (key > root.val) {
        //     root.right = deleteNode(root.right, key);
        // } else {
        //     if (root.left == null) {
        //         return root.right;
        //     }
        //     if (root.right == null) {
        //         return root.left;
        //     }
        //     TreeNode successor = min(root.right);
        //     root.val = successor.val;
        //     root.right = deleteNode(root.right, successor.val);
        // }
        // return root;
    }

    // private TreeNode min(TreeNode node) {
    //     while (node.left != null) {
    //         node = node.left;
    //     }
    //     return node;
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
