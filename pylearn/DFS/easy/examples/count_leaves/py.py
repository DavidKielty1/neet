class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def count_leaves(root: TreeNode) -> int:
    """
    Count the number of leaf nodes in a binary tree using DFS.
    A leaf node is a node with no children.
    
    Example:
    Input: 
        1
       / \
      2   3
     / \
    4   5
    
    Output: 3 (leaf nodes: 3, 4, 5)
    
    Learning goals:
    - Identifying leaf nodes
    - DFS traversal with condition checking
    - Base case handling
    """
    if not root:
        return 0
    
    # If this is a leaf node (no children)
    if not root.left and not root.right:
        return 1
    
    # Count leaves in left and right subtrees
    return count_leaves(root.left) + count_leaves(root.right)


# Test cases
if __name__ == "__main__":
    # Create test tree:    1
    #                    / \
    #                   2   3
    #                  / \
    #                 4   5
    root = TreeNode(1)
    root.left = TreeNode(2)
    root.right = TreeNode(3)
    root.left.left = TreeNode(4)
    root.left.right = TreeNode(5)
    
    print(count_leaves(root))  # Should print: 3
    
    # Test single node (is a leaf)
    single = TreeNode(1)
    print(count_leaves(single))  # Should print: 1
    
    # Test empty tree
    print(count_leaves(None))  # Should print: 0
    
    # Test tree with only left child
    root2 = TreeNode(1)
    root2.left = TreeNode(2)
    print(count_leaves(root2))  # Should print: 1 (only node 2 is a leaf)
