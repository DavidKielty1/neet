from collections import deque

class TreeNode:
    def __init__(self, val=0, left=None, right=None, next=None):
        self.val = val
        self.left = left
        self.right = right
        self.next = next  # Points to next node at same level

def connect_nodes_at_same_level(root: TreeNode) -> TreeNode:
    """
    Connect each node to its next right node at the same level.
    If there is no next right node, the next pointer should be set to None.
    
    Example:
    Input: 
        1
       / \
      2   3
     / \
    4   5
    
    Output: 
        1 -> None
       / \
      2 -> 3 -> None
     / \
    4 -> 5 -> None
    
    Learning goals:
    - BFS with level tracking
    - Node manipulation
    - Connecting adjacent nodes
    """
    if not root:
        return root
    
    queue = deque([root])
    
    while queue:
        level_size = len(queue)
        
        # Process all nodes at current level
        for i in range(level_size):
            node = queue.popleft()
            
            # Connect to next node at same level (if not last node)
            if i < level_size - 1:
                node.next = queue[0]  # Next node is still in queue
            else:
                node.next = None  # Last node at this level
            
            # Add children to queue for next level
            if node.left:
                queue.append(node.left)
            if node.right:
                queue.append(node.right)
    
    return root


def print_tree_with_connections(root: TreeNode):
    """Helper function to print the tree with next pointers"""
    if not root:
        return
    
    queue = deque([root])
    
    while queue:
        level_size = len(queue)
        level_nodes = []
        
        for _ in range(level_size):
            node = queue.popleft()
            level_nodes.append(str(node.val))
            
            if node.left:
                queue.append(node.left)
            if node.right:
                queue.append(node.right)
        
        # Print level with next pointers
        print(" -> ".join(level_nodes) + " -> None")


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
    
    print("Before connecting:")
    print_tree_with_connections(root)
    
    connect_nodes_at_same_level(root)
    
    print("\nAfter connecting:")
    print_tree_with_connections(root)
    
    # Test single node
    single = TreeNode(7)
    connect_nodes_at_same_level(single)
    print(f"\nSingle node: {single.val} -> {single.next}")
    
    # Test perfect binary tree
    root2 = TreeNode(1)
    root2.left = TreeNode(2)
    root2.right = TreeNode(3)
    root2.left.left = TreeNode(4)
    root2.left.right = TreeNode(5)
    root2.right.left = TreeNode(6)
    root2.right.right = TreeNode(7)
    
    print("\nPerfect binary tree:")
    connect_nodes_at_same_level(root2)
    print_tree_with_connections(root2)
