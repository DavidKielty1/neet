/*
94. Binary Tree Inorder Traversal
Difficulty: Easy
Pattern: Trees / DFS

Given the root of a binary tree, return the inorder traversal of its nodes'
values. Inorder means: visit left subtree, then current node, then right
subtree.

Example:
root = [1,null,2,3] -> [1,3,2]
Start at 1, then traverse the right subtree of 1. Inside that subtree, visit 3
before 2 because 3 is the left child of 2.

Example:
root = [] -> []

Idea:
Use DFS recursion. The pattern is always: recurse left, record the node value,
then recurse right.

Time: O(n), Space: O(h)
*/
import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversalJava {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> nodeVals = new ArrayList<>();

        dfs(root, nodeVals);

        return nodeVals;
    }

    private void dfs(TreeNode node, List<Integer> nodeVals) {
        if (node == null) {
            return;
        }

        dfs(node.left, nodeVals);

        nodeVals.add(node.val);
        
        dfs(node.right, nodeVals);
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
