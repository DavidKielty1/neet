/*
94. Binary Tree Inorder Traversal
Difficulty: Easy
Pattern: Trees (DFS)

Return node values in order: left subtree, root, right subtree.

Time: O(n), Space: O(h) stack
*/
import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversalJava {

    public List<Integer> inorderTraversal(TreeNode root) {
        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

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

        throw new UnsupportedOperationException("Implement inorderTraversal");
    }

    // Outline: recurse left, record val, recurse right
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
        // dfs(node.left, result);
        // result.add(node.val);
        // dfs(node.right, result);

        throw new UnsupportedOperationException("Implement dfs");
    }

    public static void main(String[] args) {
        BinaryTreeInorderTraversalJava sol = new BinaryTreeInorderTraversalJava();
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
