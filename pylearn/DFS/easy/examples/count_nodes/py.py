class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def count_nodes(root: TreeNode) -> int:
    """
    Count the total number of nodes in a binary tree using DFS.
    
    Example:
    Input: 
        1
       / \
      2   3
     / \
    4   5
    
    Output: 5 (nodes: 1, 2, 3, 4, 5)
    
    Learning goals:
    - Basic DFS traversal
    - Recursive function calls
    - Tree node structure
    """
    if not root:
        return 0
    
    # Count current node + left subtree + right subtree
    return 1 + count_nodes(root.left) + count_nodes(root.right)


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
    
    print(count_nodes(root))  # Should print: 5
    
    # Test empty tree
    print(count_nodes(None))  # Should print: 0
    
    # Test single node
    single = TreeNode(1)
    print(count_nodes(single))  # Should print: 1
