class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def count_nodes_with_children(root: TreeNode) -> int:
    """
    Count the number of nodes that have at least one child (not leaf nodes).
    
    Example:
    Input: 
        1
       / \
      2   3
     / \
    4   5
    
    Output: 2 (nodes with children: 1, 2)
    
    Learning goals:
    - Identifying internal nodes vs leaf nodes
    - DFS traversal with condition checking
    - Understanding tree node relationships
    """
    # TODO: Implement your solution here
    if not root:
        return 0
    
    has_children_count = 1 if root.left or root.right else 0

    return has_children_count + count_nodes_with_children(root.left) + count_nodes_with_children(root.right)


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
    
    print(count_nodes_with_children(root))  # Should print: 2
    
    # Test single node (no children)
    single = TreeNode(1)
    print(count_nodes_with_children(single))  # Should print: 0
    
    # Test node with only left child
    root2 = TreeNode(1)
    root2.left = TreeNode(2)
    print(count_nodes_with_children(root2))  # Should print: 1
    
    # Test node with only right child
    root3 = TreeNode(1)
    root3.right = TreeNode(2)
    print(count_nodes_with_children(root3))  # Should print: 1
    
    # Test empty tree
    print(count_nodes_with_children(None))  # Should print: 0
