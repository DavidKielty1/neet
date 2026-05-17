/*
 * 297. Serialize and Deserialize Binary Tree
 * Difficulty: Hard
 * Pattern: Trees / DFS or BFS encoding
 *
 * Problem:
 * Serialization is the process of converting a data structure or object into a
 * sequence of bits so that it can be stored in a file or memory buffer, or
 * transmitted across a network connection link to be reconstructed later.
 *
 * Design an algorithm to serialize and deserialize a binary tree. There is no
 * restriction on how your serialization/deserialization algorithm should work.
 * You just need to ensure that a binary tree can be serialized to a string and
 * this string can be deserialized to the original tree structure.
 *
 * Example 1:
 * Input: root = [1,2,3,null,null,4,5]
 * Output: [1,2,3,null,null,4,5]
 *
 * Example 2:
 * Input: root = []
 * Output: []
 *
 * Constraints:
 * - The number of nodes in the tree is in the range [0, 10^4]
 * - -1000 <= Node.val <= 1000
 */
public class SerializeAndDeserializeBinaryTree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static class Codec {
        public String serialize(TreeNode root) {
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
            //

            // StringBuilder out = new StringBuilder();
            // serializeDfs(root, out);
            // return out.toString();
            throw new UnsupportedOperationException("Implement serialize");
        }

        public TreeNode deserialize(String data) {
            // Deque<String> values = new ArrayDeque<>(Arrays.asList(data.split(",")));
            // return deserializeDfs(values);
            throw new UnsupportedOperationException("Implement deserialize");
        }

        // private void serializeDfs(TreeNode node, StringBuilder out) {
        //     if (node == null) {
        //         out.append("#,");
        //         return;
        //     }
        //     out.append(node.val).append(",");
        //     serializeDfs(node.left, out);
        //     serializeDfs(node.right, out);
        // }
        //
        // private TreeNode deserializeDfs(Deque<String> values) {
        //     String value = values.removeFirst();
        //     if (value.equals("#")) {
        //         return null;
        //     }
        //     TreeNode node = new TreeNode(Integer.parseInt(value));
        //     node.left = deserializeDfs(values);
        //     node.right = deserializeDfs(values);
        //     return node;
        // }
    }

    public static void main(String[] args) {
        System.out.println("Practice stub ready. Implement Codec and add checks.");
    }
}
