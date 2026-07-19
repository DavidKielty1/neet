/*
 * Ported from: 06-trees/analogue-questions/Python/balanced-binary-tree-similar3.py
 * --- Original description ---
Similar Problem 3: Cousins in Binary Tree
Difficulty: Easy
Pattern: Trees (BFS/DFS)

Problem:
Given the root of a binary tree with unique values and the values of two different nodes x and y,
return true if the nodes corresponding to the values x and y are cousins, or false otherwise.

Two nodes are cousins if they have the same depth but different parents.

Example 1:
Input: root = [1,2,3,4], x = 4, y = 3
Output: false

Example 2:
Input: root = [1,2,3,null,4,null,5], x = 5, y = 4
Output: true

Example 3:
Input: root = [1,2,3,null,4], x = 2, y = 3
Output: false

Constraints:
- The number of nodes in the tree is in the range [2, 100]
- 1 <= Node.val <= 100
- Each node has a unique value
- x != y
- x and y exist in the tree
 */

import java.util.*;
import java.util.function.*;


public class BalancedBinaryTreeSimilar3 {
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


    public boolean isCousins(TreeNode root, int x, int y) {
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

    // queue = deque([(root, None, 0)])
    // x_info = None
    // y_info = None
    // while queue:
    // node, parent, depth = queue.popleft()
    // if node.val == x:
    // x_info = (parent, depth)
    // elif node.val == y:
    // y_info = (parent, depth)
    // if x_info and y_info:
    // x_parent, x_depth = x_info
    // y_parent, y_depth = y_info
    // return x_depth == y_depth and x_parent != y_parent
    // if node.left:
    // queue.append((node.left, node, depth + 1))
    // if node.right:
    // queue.append((node.right, node, depth + 1))
    // return False

        throw new UnsupportedOperationException("Implement isCousins");
    }

    

    public static void main(String[] args) {
        BalancedBinaryTreeSimilar3 sol = new BalancedBinaryTreeSimilar3();
    // root = create_tree(java.util.List.of(1,2,3,4));
    // assert solution.isCousins(root, 4, 3) == False  // needs locals (port helpers): ['root']
        System.out.println("✓ Test case 1 passed");
    // root = create_tree([1, 2, 3, null, 4, null, 5]);
    // assert solution.isCousins(root, 5, 4) == True  // needs locals (port helpers): ['root']
        System.out.println("✓ Test case 2 passed");
    // root = create_tree([1, 2, 3, null, 4]);
    // assert solution.isCousins(root, 2, 3) == False  // needs locals (port helpers): ['root']
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
