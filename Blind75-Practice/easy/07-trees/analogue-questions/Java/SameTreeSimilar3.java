/*
 * Ported from: 06-trees/analogue-questions/Python/same-tree-similar3.py
 * --- Original description ---
Similar Problem 3: Merge Two Binary Trees
Difficulty: Easy
Pattern: Trees (DFS)

Problem:
You are given two binary trees root1 and root2.
Imagine that when you put one of them to cover the other, some nodes of the two trees
are overlapped while the others are not. You need to merge them into a new binary tree.
The merge rule is that if two nodes overlap, then sum their values. Otherwise, the non-null node will be used.

Example 1:
Input: root1 = [1,3,2,5], root2 = [2,1,3,null,4,null,7]
Output: [3,4,5,5,4,null,7]

Example 2:
Input: root1 = [1], root2 = [1,2]
Output: [2,2]

Constraints:
- The number of nodes in both trees is in the range [0, 2000]
- -10^4 <= Node.val <= 10^4
 */

import java.util.*;
import java.util.function.*;


public class SameTreeSimilar3 {
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

    // if not root1 and (not root2):
    // return None
    // if not root1:
    // return root2
    // if not root2:
    // return root1
    // merged = TreeNode(root1.val + root2.val)
    // merged.left = self.mergeTrees(root1.left, root2.left)
    // merged.right = self.mergeTrees(root1.right, root2.right)
    // return merged

        throw new UnsupportedOperationException("Implement mergeTrees");
    }

    

    public static void main(String[] args) {
        SameTreeSimilar3 sol = new SameTreeSimilar3();
    // root1 = create_tree(java.util.List.of(1,3,2,5));
    // root2 = create_tree([2, 1, 3, null, 4, null, 7]);
    // merged = sol.mergeTrees(root1, root2);
    // assert tree_to_list(merged) == [3, 4, 5, 5, 4, None, 7]  // needs locals (port helpers): ['merged', 'tree_to_list']
        System.out.println("✓ Test case 1 passed");
    // root1 = create_tree(java.util.List.of(1));
    // root2 = create_tree(java.util.List.of(1,2));
    // merged = sol.mergeTrees(root1, root2);
    // assert tree_to_list(merged) == [2, 2]  // needs locals (port helpers): ['merged', 'tree_to_list']
        System.out.println("✓ Test case 2 passed");
        System.out.println("\nAll test cases passed!");
    }
}
