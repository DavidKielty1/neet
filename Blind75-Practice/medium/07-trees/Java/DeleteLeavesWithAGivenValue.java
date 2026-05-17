/*
 * LeetCode 1325. Delete Leaves With a Given Value
 *
 * Given a binary tree root and an integer target, delete all the leaf nodes
 * with value target.
 *
 * After deleting a leaf node with value target, if its parent becomes a leaf
 * node and also has value target, it should also be deleted. Continue until no
 * more nodes can be removed.
 *
 * Example 1:
 * Input: root = [1,2,3,2,null,2,4], target = 2
 * Output: [1,null,3,null,4]
 *
 * Example 2:
 * Input: root = [1,3,3,3,2], target = 3
 * Output: [1,3,null,null,2]
 *
 * Example 3:
 * Input: root = [1,2,null,2,null,2], target = 2
 * Output: [1]
 *
 * Constraints:
 * - The number of nodes in the tree is in the range [1, 3000].
 * - 1 <= Node.val, target <= 1000
 */
public class DeleteLeavesWithAGivenValue {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        // Postorder recursion: prune children first, then decide whether the
        // current node has become a target leaf that should also be removed.
        //
        // if (root == null) {
        //     return null;
        // }
        // root.left = removeLeafNodes(root.left, target);
        // root.right = removeLeafNodes(root.right, target);
        // if (root.left == null && root.right == null && root.val == target) {
        //     return null;
        // }
        // return root;
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
