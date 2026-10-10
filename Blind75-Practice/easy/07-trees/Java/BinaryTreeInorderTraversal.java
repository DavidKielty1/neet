/*
 * 94. Binary Tree Inorder Traversal
 * Difficulty: Easy
 * Pattern: Trees / DFS
 *
 * Problem:
 * Given the root of a binary tree, return the inorder traversal of its nodes'
 * values. Inorder means visit the left subtree, then the current node, then
 * the right subtree.
 *
 * Example 1:
 * Input: root = [1,null,2,3]
 * Output: [1,3,2]
 *
 * Example 2:
 * Input: root = []
 * Output: []
 *
 * Example 3:
 * Input: root = [1]
 * Output: [1]
 *
 * Constraints:
 * - The number of nodes in the tree is in the range [0, 100]
 * - -100 <= Node.val <= 100
 */
import java.util.List;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
    }
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

        // List<Integer> result = new ArrayList<>();
        // dfs(root, result);
        // return result;

        // private void dps(TreeNode node, List<Integer> result) {
        // if (node == null) {
        //     return;
        // }
        // dfs(node.left, result);
        // result.add(node.val);
        // dfs(node.right, result);
        // }

    

    public static void main(String[] args) {
        BinaryTreeInorderTraversal sol = new BinaryTreeInorderTraversal();
        // [1,null,2,3] -> [1,3,2]
        TreeNode n3 = new TreeNode(3);
        TreeNode n2 = new TreeNode(2, n3, null);
        TreeNode root = new TreeNode(1, null, n2);
        assert sol.inorderTraversal(root).equals(List.of(1, 3, 2));
        assert sol.inorderTraversal(null).equals(List.of());
        assert sol.inorderTraversal(new TreeNode(1)).equals(List.of(1));
        System.out.println("All tests passed.");
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
