/*
145. Binary Tree Postorder Traversal
Difficulty: Easy
Pattern: Trees (DFS)

Return node values in order: left subtree, right subtree, root.

Time: O(n), Space: O(h) stack
*/
import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversalJava {

    public List<Integer> postorderTraversal(TreeNode root) {
        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

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

        throw new UnsupportedOperationException("Implement postorderTraversal");
    }

    // Outline: recurse left, recurse right, record val
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
        // dfs(node.right, result);
        // result.add(node.val);

        throw new UnsupportedOperationException("Implement dfs");
    }

    public static void main(String[] args) {
        BinaryTreePostorderTraversalJava sol = new BinaryTreePostorderTraversalJava();
        TreeNode n3 = new TreeNode(3);
        TreeNode n2 = new TreeNode(2, n3, null);
        TreeNode root = new TreeNode(1, null, n2);
        assert sol.postorderTraversal(root).equals(List.of(3, 2, 1));
        assert sol.postorderTraversal(null).equals(List.of());
        assert sol.postorderTraversal(new TreeNode(1)).equals(List.of(1));
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
