/*
100. Same Tree
Difficulty: Easy
Pattern: Trees / DFS

Given the roots of two binary trees p and q, return true if they are the same
tree. Two trees are the same if they have the same structure and the same node
values in every position.

Example:
p = [1,2,3], q = [1,2,3] -> true

Example:
p = [1,2], q = [1,null,2] -> false
The values are similar, but the tree shapes are different.

Idea:
Use recursion. Two nodes match only when both are null, or both are non-null
with equal values and matching left and right subtrees.

Time: O(n), Space: O(h)
*/

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        // Recursion: same val and same left/right.

        // if (p == null && q == null) {
        //     return true;
        // }
        // if (p == null || q == null) {
        //     return false;
        // }
        // if (p.val != q.val) {
        //     return false;
        // }
        // return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
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
