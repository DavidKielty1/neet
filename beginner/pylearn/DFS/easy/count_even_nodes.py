class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def count_even_nodes(root: TreeNode) -> int:
    """
    Count the number of nodes with even values in a binary tree using DFS.
    
    Example:
    Input: 
        1
       / \
      2   3
     / \
    4   5
    
    Output: 2 (even values: 2, 4)
    
    Learning goals:
    - DFS traversal with condition checking
    - Modulo operation for even/odd
    - Recursive counting with conditions
    """
    # TODO: Implement your solution here
    if not root:
        return 0
    
    current_count = 1 if root.val % 2 == 0 else 0

    
    return current_count + count_even_nodes(root.left) + count_even_nodes(root.right)


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
    
    print(count_even_nodes(root))  # Should print: 2
    
    # Test with more even numbers
    root2 = TreeNode(2)
    root2.left = TreeNode(4)
    root2.right = TreeNode(6)
    print(count_even_nodes(root2))  # Should print: 3
    
    # Test with no even numbers
    root3 = TreeNode(1)
    root3.left = TreeNode(3)
    root3.right = TreeNode(5)
    print(count_even_nodes(root3))  # Should print: 0
    
    # Test empty tree
    print(count_even_nodes(None))  # Should print: 0
