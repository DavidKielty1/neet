class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def find_min_value(node: TreeNode) -> int:
    """
    Find the minimum value in a binary tree using DFS.
    Return the smallest value found in the tree.
    
    Example:
    Input: 
        5
       / \
      3   7
     / \
    1   4
    
    Output: 1 (smallest value in the tree)
    
    Learning goals:
    - DFS traversal with min tracking
    - Recursive min calculation
    - Base case handling for null nodes
    """
    if not node:
        return float('inf')
    
    return min(node.val, find_min_value(node.left), find_min_value(node.right))
    


# Test cases
if __name__ == "__main__":
    # Test case 1: Simple tree
    #     5
    #    / \
    #   3   7
    root1 = TreeNode(5)
    root1.left = TreeNode(3)
    root1.right = TreeNode(7)
    print(f"Min value: {find_min_value(root1)}")  # Should print: 3
    
    # Test case 2: Larger tree
    #       5
    #      / \
    #     3   7
    #    / \
    #   1   4
    root2 = TreeNode(5)
    root2.left = TreeNode(3)
    root2.right = TreeNode(7)
    root2.left.left = TreeNode(1)
    root2.left.right = TreeNode(4)
    print(f"Min value: {find_min_value(root2)}")  # Should print: 1
    
    # Test case 3: Single node
    root3 = TreeNode(7)
    print(f"Min value: {find_min_value(root3)}")  # Should print: 7
    
    # Test case 4: Empty tree
    print(f"Min value: {find_min_value(None)}")   # Should print: float('inf') or handle appropriately
    
    # Test case 5: Negative values
    root4 = TreeNode(-1)
    root4.left = TreeNode(-5)
    root4.right = TreeNode(-3)
    print(f"Min value: {find_min_value(root4)}")  # Should print: -5
    
    # Test case 6: All same values
    root5 = TreeNode(5)
    root5.left = TreeNode(5)
    root5.right = TreeNode(5)
    print(f"Min value: {find_min_value(root5)}")  # Should print: 5
