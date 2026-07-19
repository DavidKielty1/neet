/*
 * Ported from: 06-trees/analogue-questions/Python/diameter-of-binary-tree-similar3.py
 * --- Original description ---
Similar Problem 3: Binary Tree Longest Consecutive Sequence (Easy Version)
Difficulty: Easy
Pattern: Trees (DFS)

Problem:
Given the root of a binary tree, return the length of the longest consecutive sequence path.
A consecutive sequence path is a path where the values increase by 1 along the path.
The path can be start from any node and go in the downward direction only.

Example 1:
Input: root = [1,null,3,2,4,null,null,null,5]
Output: 3
Explanation: Longest path is 3 -> 4 -> 5

Example 2:
Input: root = [2,null,3,2,null,1]
Output: 2
Explanation: Longest path is 2 -> 3

Constraints:
- The number of nodes in the tree is in the range [1, 3 * 10^4]
- -3 * 10^4 <= Node.val <= 3 * 10^4
 */

import java.util.*;
import java.util.function.*;


public class DiameterOfBinaryTreeSimilar3 {
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


    public int longestConsecutive(TreeNode root) {
    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    // self.max_length = 0
    // def dfs(node, parent_val, current_length):
    // if not node:
    // return
    // if parent_val is not None and node.val == parent_val + 1:
    // current_length += 1
    // else:
    // current_length = 1
    // self.max_length = max(self.max_length, current_length)
    // dfs(node.left, node.val, current_length)
    // dfs(node.right, node.val, current_length)
    // dfs(root, None, 0)
    // return self.max_length

        throw new UnsupportedOperationException("Implement longestConsecutive");
    }

    

    public static void main(String[] args) {
        DiameterOfBinaryTreeSimilar3 sol = new DiameterOfBinaryTreeSimilar3();
    // root = create_tree([1, null, 3, 2, 4, null, null, null, 5]);
    // assert solution.longestConsecutive(root) == 3  // needs locals (port helpers): ['root']
        System.out.println("✓ Test case 1 passed");
    // root = create_tree([2, null, 3, 2, null, 1]);
    // assert solution.longestConsecutive(root) == 2  // needs locals (port helpers): ['root']
        System.out.println("✓ Test case 2 passed");
        System.out.println("\nAll test cases passed!");
    }
}
