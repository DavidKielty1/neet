/*
 * LeetCode 701. Insert into a Binary Search Tree
 *
 * You are given the root node of a binary search tree and a value to insert
 * into the tree. Return the root node of the BST after the insertion.
 *
 * It is guaranteed that the new value does not exist in the original BST.
 * There may be multiple valid ways to insert, as long as the resulting tree is
 * still a valid BST.
 *
 * Example 1:
 * Input: root = [4,2,7,1,3], val = 5
 * Output: [4,2,7,1,3,5]
 *
 * Example 2:
 * Input: root = [40,20,60,10,30,50,70], val = 25
 * Output: [40,20,60,10,30,50,70,null,null,25]
 *
 * Example 3:
 * Input: root = [4,2,7,1,3,null,null,null,null,null,null], val = 5
 * Output: [4,2,7,1,3,5]
 *
 * Constraints:
 * - The number of nodes in the tree is in the range [0, 10000].
 * - -100000000 <= Node.val <= 100000000
 * - All the values Node.val are unique.
 * - -100000000 <= val <= 100000000
 * - It is guaranteed that val does not exist in the original BST.
 */
public class InsertIntoABinarySearchTreeJava {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        // Recursively walk left or right until a null position is reached.
        //
        // if (root == null) {
        //     return new TreeNode(val);
        // }
        // if (val < root.val) {
        //     root.left = insertIntoBST(root.left, val);
        // } else {
        //     root.right = insertIntoBST(root.right, val);
        // }
        // return root;
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
