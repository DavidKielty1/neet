class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def sum_all_values(node: TreeNode) -> int:
    """
    Calculate the sum of all values in a binary tree using DFS.
    Return the total sum of all node values.
    
    Example:
    Input: 
        1
       / \
      2   3
     / \
    4   5
    
    Output: 15 (1 + 2 + 3 + 4 + 5)
    
    Learning goals:
    - DFS traversal with accumulation
    - Recursive sum calculation
    - Base case handling for null nodes
    """
    
    if not node:
        return 0
    
    return node.val + sum_all_values(node.left) + sum_all_values(node.right)


# Test cases
if __name__ == "__main__":
    # Test case 1: Simple tree
    #     1
    #    / \
    #   2   3
    root1 = TreeNode(1)
    root1.left = TreeNode(2)
    root1.right = TreeNode(3)
    print(f"Sum: {sum_all_values(root1)}")  # Should print: 6
    
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
    print(f"Sum: {sum_all_values(root2)}")  # Should print: 15
    
    # Test case 3: Single node
    root3 = TreeNode(7)
    print(f"Sum: {sum_all_values(root3)}")  # Should print: 7
    
    # Test case 4: Empty tree
    print(f"Sum: {sum_all_values(None)}")   # Should print: 0
    
    # Test case 5: Negative values
    root4 = TreeNode(-1)
    root4.left = TreeNode(-2)
    root4.right = TreeNode(-3)
    print(f"Sum: {sum_all_values(root4)}")  # Should print: -6
    
    # Test case 6: Mixed values
    root5 = TreeNode(10)
    root5.left = TreeNode(-5)
    root5.right = TreeNode(15)
    root5.left.left = TreeNode(3)
    print(f"Sum: {sum_all_values(root5)}")  # Should print: 23
