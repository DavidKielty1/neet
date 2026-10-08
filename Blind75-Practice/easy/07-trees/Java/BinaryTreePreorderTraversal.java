/*
 * 144. Binary Tree Preorder Traversal
 * Difficulty: Easy
 * Pattern: Trees / DFS
 *
 * Problem:
 * Given the root of a binary tree, return the preorder traversal of its nodes'
 * values. Preorder means visit the current node, then the left subtree, then
 * the right subtree.
 *
 * Example 1:
 * Input: root = [1,null,2,3]
 * Output: [1,2,3]
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

public class BinaryTreePreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

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
    
        // private void dfs(TreeNode node, List<Integer> nodeVals){
        //     if (node == null) {
        //         return;
        //     }
        //     nodeVals.add(node.val);
        //     dfs(node.left, nodeVals);
        //     dfs(node.right, nodeVals);
        // }

    public static void main(String[] args) {
        BinaryTreePreorderTraversal sol = new BinaryTreePreorderTraversal();
        TreeNode n3 = new TreeNode(3);
        TreeNode n2 = new TreeNode(2, n3, null);
        TreeNode root = new TreeNode(1, null, n2);
        assert sol.preorderTraversal(root).equals(List.of(1, 2, 3));
        assert sol.preorderTraversal(null).equals(List.of());
        assert sol.preorderTraversal(new TreeNode(1)).equals(List.of(1));
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
