/*
 * 543. Diameter of Binary Tree
 * Difficulty: Easy
 * Pattern: Trees / DFS
 *
 * Problem:
 * Given the root of a binary tree, return the length of the diameter of the
 * tree. The diameter is the length of the longest path between any two nodes,
 * measured in the number of edges. That path may or may not pass through the
 * root.
 *
 * Example 1:
 * Input: root = [1,2,3,4,5]
 * Output: 3
 *
 * Example 2:
 * Input: root = [1,2]
 * Output: 1
 *
 * Constraints:
 * - The number of nodes in the tree is in the range [1, 10^4]
 * - -100 <= Node.val <= 100
 */

//      1
//     /\ 
//    2  3
//   /\
//  4  5

public class DiameterOfBinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {   
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

        // int[] best = new int[] {0};
        // depth(root, best);
        // return best[0];
        //
        // private int depth(TreeNode node, int[] best) {
        //     if (node == null) {
        //         return 0;
        //     }
        //     int left = depth(node.left, best);
        //     int right = depth(node.right, best);
        //     best[0] = Math.max(best[0], left + right);
        //     return 1 + Math.max(left, right);
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
