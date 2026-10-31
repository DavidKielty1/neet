/*
 * LeetCode 199. Binary Tree Right Side View
 *
 * Given the root of a binary tree, imagine yourself standing on the right side
 * of it. Return the values of the nodes you can see ordered from top to bottom.
 *
 * Example 1:
 * Input: root = [1,2,3,null,5,null,4]
 * Output: [1,3,4]
 *
 * Example 2:
 * Input: root = [1,null,3]
 * Output: [1,3]
 *
 * Example 3:
 * Input: root = []
 * Output: []
 *
 * Constraints:
 * - The number of nodes in the tree is in the range [0, 100].
 * - -100 <= Node.val <= 100
 */
import java.util.List;

public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        
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
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        // List<Integer> ans = new ArrayList<>();
        // if (root == null) {
        //     return ans;
        // }

        // Queue<TreeNode> queue = new ArrayDeque<>();
        // queue.offer(root);

        // while (!queue.isEmpty()) {
        //     int size = queue.size();
        //     for (int i = 0; i < size; i++) {
        //         TreeNode curr = queue.poll();
        //         if (curr.left != null) {
        //             queue.offer(curr.left);
        //         }
        //         if (curr.right != null) {
        //             queue.offer(curr.right);
        //         }
        //         if (i == size - 1) {
        //             ans.add(curr.val);
        //         }
        //     }
        // }
        // return ans;

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
