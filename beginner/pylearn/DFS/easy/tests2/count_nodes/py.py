class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def count_nodes(node: TreeNode) -> int:
    """
    Count the total number of nodes in a binary tree using DFS.
    Return the count of all nodes in the tree.
    
    Example:
    Input: 
        1
       / \
      2   3
     / \
    4   5
    
    Output: 5 (total nodes: 1, 2, 3, 4, 5)
    
    Learning goals:
    - DFS traversal with counting
    - Recursive counting
    - Base case handling for null nodes
    """
    if not node:
        return 0

    return 1 + count_nodes(node.left) + count_nodes(node.right)


# Test cases
if __name__ == "__main__":
    # Test case 1: Simple tree
    #     1
    #    / \
    #   2   3
    root1 = TreeNode(1)
    root1.left = TreeNode(2)
    root1.right = TreeNode(3)
    print(f"Node count: {count_nodes(root1)}")  # Should print: 3
    
    # Test case 2: Larger tree
    #       1
    #      / \
    #     2   3
    #    / \
    #   4   5
    root2 = TreeNode(1)
    root2.left = TreeNode(2)
    root2.right = TreeNode(3)
    root2.left.left = TreeNode(4)
    root2.left.right = TreeNode(5)
    print(f"Node count: {count_nodes(root2)}")  # Should print: 5
    
    # Test case 3: Single node
    root3 = TreeNode(7)
    print(f"Node count: {count_nodes(root3)}")  # Should print: 1
    
    # Test case 4: Empty tree
    print(f"Node count: {count_nodes(None)}")   # Should print: 0
    
    # Test case 5: Left-skewed tree
    # 1
    #  \
    #   2
    #    \
    #     3
    root4 = TreeNode(1)
    root4.right = TreeNode(2)
    root4.right.right = TreeNode(3)
    print(f"Node count: {count_nodes(root4)}")  # Should print: 3
    
    # Test case 6: Right-skewed tree
    # 1
    #  \
    #   2
    #    \
    #     3
    #      \
    #       4
    root5 = TreeNode(1)
    root5.right = TreeNode(2)
    root5.right.right = TreeNode(3)
    root5.right.right.right = TreeNode(4)
    print(f"Node count: {count_nodes(root5)}")  # Should print: 4
