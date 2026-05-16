import java.util.*;
public class BTPTest {
    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
        TreeNode(int v, TreeNode l, TreeNode r) { val = v; left = l; right = r; }
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root == null) return paths;
        dfs(root, String.valueOf(root.val), paths);
        return paths;
    }
    private void dfs(TreeNode node, String path, List<String> paths) {
        if (node.left == null && node.right == null) {
            paths.add(path);
            return;
        }
        if (node.right != null) dfs(node.right, path + "->" + node.right.val, paths);
        if (node.left != null) dfs(node.left, path + "->" + node.left.val, paths);
    }
    public static void main(String[] args) {
        BinaryTreePathsJava.TreeNode small = new BinaryTreePathsJava.TreeNode(1,
            new BinaryTreePathsJava.TreeNode(2, null, new BinaryTreePathsJava.TreeNode(5)),
            new BinaryTreePathsJava.TreeNode(3));
        BTPTest t = new BTPTest();
        System.out.println("LeetCode example (" + t.binaryTreePaths(small).size() + " paths):");
        t.binaryTreePaths(small).forEach(System.out::println);

        TreeNode larger = new TreeNode(1,
            new TreeNode(2, new TreeNode(4), new TreeNode(5)),
            new TreeNode(3, new TreeNode(6), new TreeNode(7)));
        List<String> p = t.binaryTreePaths(larger);
        System.out.println("\nLarger tree (" + p.size() + " paths):");
        p.forEach(System.out::println);
    }
}
