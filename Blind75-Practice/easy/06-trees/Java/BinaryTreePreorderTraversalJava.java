/*
144. Binary Tree Preorder Traversal
Difficulty: Easy
Pattern: Trees (DFS)

Return node values in order: root, left subtree, right subtree.

Time: O(n), Space: O(h) stack
*/
import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversalJava {

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

        throw new UnsupportedOperationException("Implement preorderTraversal");
    }

    // Outline: record val, recurse left, recurse right
    private void dfs(TreeNode node, List<Integer> result) {
        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        // if (node == null) {
        // return;
        // }
        // result.add(node.val);
        // dfs(node.left, result);
        // dfs(node.right, result);

        throw new UnsupportedOperationException("Implement dfs");
    }

    public static void main(String[] args) {
        BinaryTreePreorderTraversalJava sol = new BinaryTreePreorderTraversalJava();
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
