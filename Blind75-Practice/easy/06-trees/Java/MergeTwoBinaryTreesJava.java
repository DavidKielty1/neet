/*
617. Merge Two Binary Trees
Difficulty: Easy
Pattern: Trees

Merge roots by summing vals; if one child missing, use the other.

Time: O(n), Space: O(h)
*/
import java.util.ArrayList;
import java.util.List;

public class MergeTwoBinaryTreesJava {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        // Recursion: new val = v1 + v2

        // if (root1 == null) {
        //     return root2;
        // }
        // if (root2 == null) {
        //     return root1;
        // }
        // TreeNode merged = new TreeNode(root1.val + root2.val);
        // merged.left = mergeTrees(root1.left, root2.left);
        // merged.right = mergeTrees(root1.right, root2.right);
        // return merged;
        throw new UnsupportedOperationException("Implement mergeTrees");
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
