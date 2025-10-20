# Depth-First Search (DFS) Technique

## Overview
**Depth-First Search (DFS)** is a fundamental graph and tree traversal algorithm that explores as far as possible along each branch before backtracking. It's essential for solving problems involving tree/graph traversal, path finding, and backtracking.

## When to Use DFS

### ✅ **Perfect for:**
- **Tree traversal** - Inorder, preorder, postorder
- **Graph traversal** - Explore all connected components
- **Path finding** - Find paths between nodes
- **Backtracking** - Generate all possible solutions
- **Cycle detection** - Detect cycles in graphs
- **Topological sorting** - Order nodes in DAGs

### ❌ **Not ideal for:**
- **Shortest path problems** - Use BFS instead
- **Level-order traversal** - Use BFS for level-by-level
- **Memory-constrained environments** - DFS can use O(h) stack space
- **Very deep graphs** - Risk of stack overflow

## DFS Patterns

### 1. **Tree Traversal**
Visit all nodes in a tree using different orders.

```python
# Preorder: Root -> Left -> Right
def preorder_traversal(root):
    if not root:
        return []
    
    result = [root.val]
    result.extend(preorder_traversal(root.left))
    result.extend(preorder_traversal(root.right))
    
    return result

# Inorder: Left -> Root -> Right
def inorder_traversal(root):
    if not root:
        return []
    
    result = inorder_traversal(root.left)
    result.append(root.val)
    result.extend(inorder_traversal(root.right))
    
    return result

# Postorder: Left -> Right -> Root
def postorder_traversal(root):
    if not root:
        return []
    
    result = postorder_traversal(root.left)
    result.extend(postorder_traversal(root.right))
    result.append(root.val)
    
    return result
```

**Use cases:**
- Binary Tree Traversal
- Validate Binary Search Tree
- Construct Binary Tree from Preorder and Inorder

### 2. **Graph Traversal**
Explore all connected components in a graph.

```python
def dfs_graph(graph, start, visited):
    visited.add(start)
    result = [start]
    
    for neighbor in graph[start]:
        if neighbor not in visited:
            result.extend(dfs_graph(graph, neighbor, visited))
    
    return result

# Iterative version
def dfs_iterative(graph, start):
    visited = set()
    stack = [start]
    result = []
    
    while stack:
        node = stack.pop()
        if node not in visited:
            visited.add(node)
            result.append(node)
            
            for neighbor in graph[node]:
                if neighbor not in visited:
                    stack.append(neighbor)
    
    return result
```

**Use cases:**
- Number of Islands
- Clone Graph
- Course Schedule

### 3. **Path Finding**
Find paths between nodes in a graph.

```python
def find_path(graph, start, end, visited=None):
    if visited is None:
        visited = set()
    
    if start == end:
        return [start]
    
    visited.add(start)
    
    for neighbor in graph[start]:
        if neighbor not in visited:
            path = find_path(graph, neighbor, end, visited)
            if path:
                return [start] + path
    
    visited.remove(start)  # Backtrack
    return None
```

**Use cases:**
- Path Sum
- All Paths from Source to Target
- Word Ladder

### 4. **Backtracking**
Generate all possible solutions by exploring all paths.

```python
def backtrack_solution(candidates, target, path, result):
    if target == 0:
        result.append(path[:])  # Make a copy
        return
    
    for i, candidate in enumerate(candidates):
        if candidate <= target:
            path.append(candidate)
            backtrack_solution(candidates[i:], target - candidate, path, result)
            path.pop()  # Backtrack
```

**Use cases:**
- Combination Sum
- N-Queens
- Generate Parentheses

## Problem Categories

### **Trees**
- **Maximum Depth of Binary Tree** - Basic tree traversal
- **Validate Binary Search Tree** - Inorder traversal with bounds
- **Invert Binary Tree** - Postorder traversal
- **Path Sum** - Path finding in trees
- **Lowest Common Ancestor** - Tree traversal with path tracking

### **Graphs**
- **Number of Islands** - Graph traversal on 2D grid
- **Clone Graph** - Graph traversal with copying
- **Course Schedule** - Cycle detection in DAG
- **Word Ladder** - Graph traversal with word transformation

## Time & Space Complexity

| Pattern | Time Complexity | Space Complexity |
|---------|----------------|------------------|
| Tree Traversal | O(n) | O(h) where h is height |
| Graph Traversal | O(V + E) | O(V) for visited set |
| Path Finding | O(V + E) | O(V) for recursion stack |
| Backtracking | O(b^d) | O(d) where d is depth |

## Common DFS Variations

### **Iterative DFS:**
```python
def dfs_iterative(root):
    if not root:
        return []
    
    stack = [root]
    result = []
    
    while stack:
        node = stack.pop()
        result.append(node.val)
        
        # Add children in reverse order for correct traversal
        if node.right:
            stack.append(node.right)
        if node.left:
            stack.append(node.left)
    
    return result
```

### **DFS with State:**
```python
def dfs_with_state(node, state):
    if not node:
        return state
    
    # Process current node
    new_state = process_node(node, state)
    
    # Recursively process children
    new_state = dfs_with_state(node.left, new_state)
    new_state = dfs_with_state(node.right, new_state)
    
    return new_state
```

## Common Mistakes to Avoid

1. **Stack overflow** - Be careful with very deep recursion
2. **Infinite loops** - Always mark nodes as visited
3. **Missing base cases** - Handle null nodes properly
4. **Wrong traversal order** - Understand preorder, inorder, postorder
5. **Backtracking errors** - Remember to undo changes when backtracking

## Practice Strategy

### **Beginner Level:**
1. **Maximum Depth of Binary Tree** - Basic tree traversal
2. **Invert Binary Tree** - Simple tree manipulation
3. **Path Sum** - Path finding in trees

### **Intermediate Level:**
1. **Validate Binary Search Tree** - Tree traversal with bounds
2. **Number of Islands** - Graph traversal on 2D grid
3. **Clone Graph** - Graph traversal with copying

### **Advanced Level:**
1. **Course Schedule** - Cycle detection in DAG
2. **Word Ladder** - Graph traversal with transformation
3. **N-Queens** - Backtracking with constraints

## Key Insights

1. **Recursion is natural** - DFS maps well to recursive thinking
2. **Stack space** - DFS uses O(h) space for recursion stack
3. **Backtracking** - Undo changes when exploring different paths
4. **Visited tracking** - Prevent infinite loops in graphs
5. **Base cases** - Always handle null/empty cases

## Interview Tips

1. **Start with recursion** - DFS is naturally recursive
2. **Handle edge cases** - Null nodes, empty graphs, single nodes
3. **Explain the approach** - Walk through the traversal order
4. **Discuss trade-offs** - DFS vs BFS, recursion vs iteration
5. **Code incrementally** - Start with basic traversal, then add logic

## Template for Tree DFS

```python
def dfs_tree(root):
    if not root:
        return
    
    # Process current node (preorder)
    process_node(root)
    
    # Recursively process children
    dfs_tree(root.left)
    dfs_tree(root.right)
    
    # Process current node (postorder)
    process_node(root)
```

## Template for Graph DFS

```python
def dfs_graph(graph, start, visited):
    visited.add(start)
    
    # Process current node
    process_node(start)
    
    # Recursively process neighbors
    for neighbor in graph[start]:
        if neighbor not in visited:
            dfs_graph(graph, neighbor, visited)
```

Remember: **DFS is about exploring deep before exploring wide**. It's perfect for tree traversal and path finding problems!
