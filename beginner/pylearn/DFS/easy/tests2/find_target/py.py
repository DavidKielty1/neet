class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def find_target(node: TreeNode, target: int) -> bool:
    """
    Find if a target value exists in a binary tree using DFS.
    Return True if the target is found, False otherwise.
    
    Example:
    Input: 
        1
       / \
      2   3
     / \
    4   5
    Target: 4
    
    Output: True (4 exists in the tree)
    
    Learning goals:
    - DFS traversal with target search
    - Recursive search with early termination
    - Boolean return values
    """
    if not node:
        return False

    if node.val == target:
        return True
    
    return find_target(node.left) or find_target(node.right)


    



# Test cases
if __name__ == "__main__":
    # Test case 1: Target exists
    #     1
    #    / \
    #   2   3
    root1 = TreeNode(1)
    root1.left = TreeNode(2)
    root1.right = TreeNode(3)
    print(f"Find 2: {find_target(root1, 2)}")  # Should print: True
    print(f"Find 4: {find_target(root1, 4)}")  # Should print: False
    
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
    print(f"Find 4: {find_target(root2, 4)}")  # Should print: True
    print(f"Find 6: {find_target(root2, 6)}")  # Should print: False
    
    # Test case 3: Single node
    root3 = TreeNode(7)
    print(f"Find 7: {find_target(root3, 7)}")  # Should print: True
    print(f"Find 8: {find_target(root3, 8)}")  # Should print: False
    
    # Test case 4: Empty tree
    print(f"Find 5: {find_target(None, 5)}")   # Should print: False
    
    # Test case 5: Duplicate values
    root4 = TreeNode(1)
    root4.left = TreeNode(1)
    root4.right = TreeNode(2)
    print(f"Find 1: {find_target(root4, 1)}")  # Should print: True
    print(f"Find 2: {find_target(root4, 2)}")  # Should print: True
    
    # Test case 6: Negative values
    root5 = TreeNode(-1)
    root5.left = TreeNode(-2)
    root5.right = TreeNode(-3)
    print(f"Find -2: {find_target(root5, -2)}")  # Should print: True
    print(f"Find 0: {find_target(root5, 0)}")    # Should print: False
