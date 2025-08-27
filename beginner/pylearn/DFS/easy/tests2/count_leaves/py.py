class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def count_leaves(root: TreeNode) -> int:
    """
    Count the number of leaf nodes in a binary tree using DFS.
    A leaf node is a node with no children (left and right are None).
    
    Example:
    Input: 
        1
       / \
      2   3
     / \
    4   5
    
    Output: 3 (nodes 4, 5, and 3 are leaves)
    
    Learning goals:
    - DFS traversal with leaf detection
    - Recursive counting
    - Identifying leaf nodes (no children)
    """
    if not root:
        return 0

    if not root.left and not root.right:
        return 1

    return count_leaves(root.left) + count_leaves(root.right)



# Test cases
if __name__ == "__main__":
    # Test case 1: Simple tree
    #     1
    #    / \
    #   2   3
    root1 = TreeNode(1)
    root1.left = TreeNode(2)
    root1.right = TreeNode(3)
    print(f"Leaf count: {count_leaves(root1)}")  # Should print: 2
    
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
    print(f"Leaf count: {count_leaves(root2)}")  # Should print: 3
    
    # Test case 3: Single node (is a leaf)
    root3 = TreeNode(7)
    print(f"Leaf count: {count_leaves(root3)}")  # Should print: 1
    
    # Test case 4: Empty tree
    print(f"Leaf count: {count_leaves(None)}")   # Should print: 0
    
    # Test case 5: All internal nodes
    root4 = TreeNode(1)
    root4.left = TreeNode(2)
    root4.right = TreeNode(3)
    root4.left.left = TreeNode(4)
    root4.left.right = TreeNode(5)
    root4.right.left = TreeNode(6)
    root4.right.right = TreeNode(7)
    print(f"Leaf count: {count_leaves(root4)}")  # Should print: 4
    
    # Test case 6: Skewed tree
    root5 = TreeNode(1)
    root5.right = TreeNode(2)
    root5.right.right = TreeNode(3)
    print(f"Leaf count: {count_leaves(root5)}")  # Should print: 1
