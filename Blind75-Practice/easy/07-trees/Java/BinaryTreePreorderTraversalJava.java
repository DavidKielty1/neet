/*
144. Binary Tree Preorder Traversal
Difficulty: Easy
Pattern: Trees / DFS

Given the root of a binary tree, return the preorder traversal of its nodes'
values. Preorder means: visit current node, then left subtree, then right
subtree.

Example:
root = [1,null,2,3] -> [1,2,3]
Record 1 first, then go into the right subtree, where 2 is visited before 3.

Example:
root = [] -> []

Idea:
Use DFS recursion. The pattern is always: record the node value, recurse left,
then recurse right.

Time: O(n), Space: O(h)
*/
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
    
        // private void dfs(TreeNode node, List<Integer> nodeVals){
        //     if (node == null) {
        //         return;
        //     }
        //     nodeVals.add(node.val);
        //     dfs(node.left, nodeVals);
        //     dfs(node.right, nodeVals);
        // }

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
