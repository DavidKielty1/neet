class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def get_height(node: TreeNode) -> int:
    """Helper function that returns height or -1 if unbalanced"""
    if not node:
        return 0  # Empty tree has height 0
    
    left_height = get_height(node.left)
    if left_height == -1:  # Left subtree is unbalanced
        return -1
    
    right_height = get_height(node.right)
    if right_height == -1:  # Right subtree is unbalanced
        return -1
    
    # Check if current node is balanced
    if abs(left_height - right_height) > 1:
        return -1
    
    return max(left_height, right_height) + 1

def is_balanced(node: TreeNode) -> bool:
    """
    Check if a binary tree is balanced using DFS.
    A tree is balanced if the heights of the left and right subtrees
    of every node differ by at most 1.
    
    Example:
    Input: 
        1
       / \
      2   3
     / \
    4   5
    
    Output: True (heights differ by at most 1 at every node)
    
    Learning goals:
    - DFS traversal with height calculation
    - Recursive balance checking
    - Early termination for unbalanced trees
    """
    return get_height(node) != -1
    

# Test cases
if __name__ == "__main__":
    # Test case 1: Balanced tree
    #     1
    #    / \
    #   2   3
    root1 = TreeNode(1)
    root1.left = TreeNode(2)
    root1.right = TreeNode(3)
    print(f"Is balanced: {is_balanced(root1)}")  # Should print: True
    
    # Test case 2: Balanced tree with more nodes
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
    print(f"Is balanced: {is_balanced(root2)}")  # Should print: True
    
    # Test case 3: Unbalanced tree
    # 1
    #  \
    #   2
    #    \
    #     3
    #      \
    #       4
    root3 = TreeNode(1)
    root3.right = TreeNode(2)
    root3.right.right = TreeNode(3)
    root3.right.right.right = TreeNode(4)
    print(f"Is balanced: {is_balanced(root3)}")  # Should print: False
    
    # Test case 4: Single node
    root4 = TreeNode(7)
    print(f"Is balanced: {is_balanced(root4)}")  # Should print: True
    
    # Test case 5: Empty tree
    print(f"Is balanced: {is_balanced(None)}")   # Should print: True
    
    # Test case 6: Slightly unbalanced
    #     1
    #    / \
    #   2   3
    #  /
    # 4
    root5 = TreeNode(1)
    root5.left = TreeNode(2)
    root5.right = TreeNode(3)
    root5.left.left = TreeNode(4)
    print(f"Is balanced: {is_balanced(root5)}")  # Should print: True
