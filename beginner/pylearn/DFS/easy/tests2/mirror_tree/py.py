class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def mirror_tree(node: TreeNode) -> TreeNode:
    """
    Create a mirror (inverted) version of a binary tree using DFS.
    Swap the left and right children of every node.
    
    Example:
    Input: 
        1
       / \
      2   3
     / \
    4   5
    
    Output: 
        1
       / \
      3   2
         / \
        5   4
    
    Learning goals:
    - DFS traversal with tree modification
    - Recursive tree construction
    - Swapping left and right children
    """
    
    if not node:
        return None
    
    mirrored_node = TreeNode(node.val)
    
    mirrored_node.left = mirror_tree(node.right)
    mirrored_node.right = mirror_tree(node.left)

    return mirrored_node


def print_tree(node: TreeNode, level=0):
    """Helper function to print tree structure"""
    if not node:
        return
    print_tree(node.right, level + 1)
    print("  " * level + str(node.val))
    print_tree(node.left, level + 1)


# Test cases
if __name__ == "__main__":
    # Test case 1: Simple tree
    #     1
    #    / \
    #   2   3
    root1 = TreeNode(1)
    root1.left = TreeNode(2)
    root1.right = TreeNode(3)
    print("Original tree:")
    print_tree(root1)
    mirrored1 = mirror_tree(root1)
    print("Mirrored tree:")
    print_tree(mirrored1)
    print()
    
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
    print("Original tree:")
    print_tree(root2)
    mirrored2 = mirror_tree(root2)
    print("Mirrored tree:")
    print_tree(mirrored2)
    print()
    
    # Test case 3: Single node
    root3 = TreeNode(7)
    print("Original tree:")
    print_tree(root3)
    mirrored3 = mirror_tree(root3)
    print("Mirrored tree:")
    print_tree(mirrored3)
    print()
    
    # Test case 4: Empty tree
    mirrored4 = mirror_tree(None)
    print("Mirrored empty tree:", mirrored4)  # Should print: None
    print()
    
    # Test case 5: Left-skewed tree
    # 1
    #  \
    #   2
    #    \
    #     3
    root5 = TreeNode(1)
    root5.right = TreeNode(2)
    root5.right.right = TreeNode(3)
    print("Original tree:")
    print_tree(root5)
    mirrored5 = mirror_tree(root5)
    print("Mirrored tree:")
    print_tree(mirrored5)
    print()
    
    # Test case 6: Right-skewed tree
    # 1
    #  \
    #   2
    #    \
    #     3
    root6 = TreeNode(1)
    root6.left = TreeNode(2)
    root6.left.left = TreeNode(3)
    print("Original tree:")
    print_tree(root6)
    mirrored6 = mirror_tree(root6)
    print("Mirrored tree:")
    print_tree(mirrored6) 