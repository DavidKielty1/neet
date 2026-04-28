/*
617. Merge Two Binary Trees
Difficulty: Easy
Pattern: Trees / DFS

You are given two binary trees. Merge them into a new tree by overlapping nodes:
if two nodes overlap, sum their values; otherwise, use the non-null node.

Example:
root1 = [1,3,2,5]
root2 = [2,1,3,null,4,null,7]
result = [3,4,5,5,4,null,7]

Example:
root1 = [1]
root2 = [1,2]
result = [2,2]

Idea:
Use recursion. If one node is null, return the other. If both exist, create a
merged node whose value is the sum, then merge the left and right children.

Time: O(n), Space: O(h)
*/

public class MergeTwoBinaryTreesJava {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        
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
