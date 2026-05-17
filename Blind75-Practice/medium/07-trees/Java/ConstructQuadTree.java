/*
 * LeetCode 427. Construct Quad Tree
 *
 * Given an n x n binary matrix grid, return the root of the quad tree
 * representing grid.
 *
 * Return null if the tree is empty. A quad tree node has:
 * - val: true if the node represents a region of 1s, otherwise false
 * - isLeaf: true if the node is a leaf
 * - topLeft, topRight, bottomLeft, bottomRight child pointers
 *
 * If the current region has the same value everywhere, build a leaf node.
 * Otherwise split it into four equal quadrants and recurse.
 *
 * Example 1:
 * Input: grid = [[0,1],[1,0]]
 * Output: [[0,1],[1,0],[1,1],[1,1],[1,0]]
 *
 * Example 2:
 * Input: grid = [[1,1],[1,1]]
 * Output: [[1,1]]
 *
 * Constraints:
 * - n == grid.length == grid[i].length
 * - n == 2^x where 0 <= x <= 6
 * - grid[i][j] is either 0 or 1
 */
public class ConstructQuadTree {
    public Node construct(int[][] grid) {
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
        // Recursively inspect a square region.
        // If every value matches, create a leaf; otherwise split into quarters.
        //
        // return build(grid, 0, 0, grid.length);
    }

    // private Node build(int[][] grid, int row, int col, int size) {
    //     if (sameValue(grid, row, col, size)) {
    //         return new Node(grid[row][col] == 1, true);
    //     }
    //     int half = size / 2;
    //     Node topLeft = build(grid, row, col, half);
    //     Node topRight = build(grid, row, col + half, half);
    //     Node bottomLeft = build(grid, row + half, col, half);
    //     Node bottomRight = build(grid, row + half, col + half, half);
    //     return new Node(true, false, topLeft, topRight, bottomLeft,
    //             bottomRight);
    // }

    // private boolean sameValue(int[][] grid, int row, int col, int size) {
    //     int value = grid[row][col];
    //     for (int r = row; r < row + size; r++) {
    //         for (int c = col; c < col + size; c++) {
    //             if (grid[r][c] != value) {
    //                 return false;
    //             }
    //         }
    //     }
    //     return true;
    // }

    public static void main(String[] args) {
        System.out.println("Implement tests.");
    }

    public static class Node {
        public boolean val;
        public boolean isLeaf;
        public Node topLeft;
        public Node topRight;
        public Node bottomLeft;
        public Node bottomRight;

        public Node() {}

        public Node(boolean val, boolean isLeaf) {
            this.val = val;
            this.isLeaf = isLeaf;
        }

        public Node(
                boolean val,
                boolean isLeaf,
                Node topLeft,
                Node topRight,
                Node bottomLeft,
                Node bottomRight) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = topLeft;
            this.topRight = topRight;
            this.bottomLeft = bottomLeft;
            this.bottomRight = bottomRight;
        }
    }
}
