/*
 * LeetCode 230. Kth Smallest Element in a BST
 *
 * Given the root of a binary search tree and an integer k, return the kth
 * smallest value, counting from 1.
 *
 * Example 1:
 * Input: root = [3,1,4,null,2], k = 1
 * Output: 1
 *
 * Example 2:
 * Input: root = [5,3,6,2,4,null,null,1], k = 3
 * Output: 3
 *
 * Constraints:
 * - The number of nodes in the tree is n.
 * - 1 <= k <= n <= 10000
 * - 0 <= Node.val <= 10000
 *
 * Follow-up:
 * - If the BST is modified often and you need kth-smallest queries often, what
 *   extra information would you store?
 */

public class KthSmallestElementInABst {
    public int kthSmallest(TreeNode root, int k) {
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        // Inorder traversal of a BST visits values in sorted order.
        // Stop at the kth visited node.

        //
        // Deque<TreeNode> stack = new ArrayDeque<>();
        // TreeNode current = root;
        
        // while (current != null || !stack.isEmpty()) {
        //     while (current != null) {
        //         stack.push(current);
        //         current = current.left;
        //     }
        //     current = stack.pop();
        //     k--;
        //     if (k == 0) {
        //         return current.val;
        //     }
        //     current = current.right;
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
