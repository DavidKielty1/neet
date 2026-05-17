/*
 * LeetCode 105. Construct Binary Tree from Preorder and Inorder Traversal
 *
 * Given two integer arrays preorder and inorder where preorder is the preorder
 * traversal of a binary tree and inorder is the inorder traversal of the same
 * tree, construct and return the binary tree.
 *
 * Example 1:
 * Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
 * Output: [3,9,20,null,null,15,7]
 *
 * Example 2:
 * Input: preorder = [-1], inorder = [-1]
 * Output: [-1]
 *
 * Constraints:
 * - 1 <= preorder.length <= 3000
 * - inorder.length == preorder.length
 * - -3000 <= preorder[i], inorder[i] <= 3000
 * - preorder and inorder consist of unique values.
 * - Each value of inorder also appears in preorder.
 * - preorder is guaranteed to be the preorder traversal of the tree.
 * - inorder is guaranteed to be the inorder traversal of the tree.
 */
import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        // Preorder gives the root first. Inorder splits left and right parts.
        // Build an index map for inorder positions, then recurse on ranges.
        //
        // Map<Integer, Integer> index = new HashMap<>();
        // for (int i = 0; i < inorder.length; i++) {
        //     index.put(inorder[i], i);
        // }
        // return build(preorder, 0, preorder.length - 1, 0, inorder.length - 1,
        //         index);
    }

    // private TreeNode build(
    //         int[] preorder,
    //         int preLeft,
    //         int preRight,
    //         int inLeft,
    //         int inRight,
    //         Map<Integer, Integer> index) {
    //     if (preLeft > preRight || inLeft > inRight) {
    //         return null;
    //     }
    //     int rootVal = preorder[preLeft];
    //     TreeNode root = new TreeNode(rootVal);
    //     int pivot = index.get(rootVal);
    //     int leftSize = pivot - inLeft;
    //     root.left = build(preorder, preLeft + 1, preLeft + leftSize, inLeft,
    //             pivot - 1, index);
    //     root.right = build(preorder, preLeft + leftSize + 1, preRight,
    //             pivot + 1, inRight, index);
    //     return root;
    // }

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
