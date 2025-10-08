# Breadth-First Search (BFS) Technique

## Overview
**Breadth-First Search (BFS)** is a fundamental graph and tree traversal algorithm that explores all nodes at the current level before moving to the next level. It's essential for solving problems involving level-order traversal, shortest path, and exploring nodes in layers.

## When to Use BFS

### ✅ **Perfect for:**
- **Level-order traversal** - Process nodes level by level
- **Shortest path problems** - Find minimum distance in unweighted graphs
- **Tree level operations** - Process all nodes at same depth
- **Graph exploration** - Explore all connected components
- **Minimum steps problems** - Find minimum operations to reach target
- **Social network analysis** - Find connections within certain degrees

### ❌ **Not ideal for:**
- **Deep tree traversal** - DFS might be more memory efficient
- **Path finding with constraints** - Backtracking might be better
- **Memory-constrained environments** - BFS can use O(w) space where w is max width
- **Very wide graphs** - Risk of memory issues

## BFS Patterns

### 1. **Level-Order Traversal**
Process nodes level by level in a tree.

```python
def level_order_traversal(root):
    if not root:
        return []
    
    result = []
    queue = [root]
    
    while queue:
        level_size = len(queue)
        level_nodes = []
        
        for _ in range(level_size):
            node = queue.pop(0)
            level_nodes.append(node.val)
            
            if node.left:
                queue.append(node.left)
            if node.right:
                queue.append(node.right)
        
        result.append(level_nodes)
    
    return result
```

**Use cases:**
- Binary Tree Level Order Traversal
- Binary Tree Zigzag Level Order Traversal
- Average of Levels in Binary Tree

### 2. **Shortest Path in Unweighted Graph**
Find minimum distance between nodes.

```python
def shortest_path(graph, start, end):
    if start == end:
        return [start]
    
    queue = [(start, [start])]
    visited = {start}
    
    while queue:
        node, path = queue.pop(0)
        
        for neighbor in graph[node]:
            if neighbor == end:
                return path + [neighbor]
            
            if neighbor not in visited:
                visited.add(neighbor)
                queue.append((neighbor, path + [neighbor]))
    
    return []  # No path found
```

**Use cases:**
- Word Ladder
- Minimum Genetic Mutation
- Open the Lock

### 3. **Graph Traversal**
Explore all connected components in a graph.

```python
def bfs_graph(graph, start):
    visited = set()
    queue = [start]
    result = []
    
    while queue:
        node = queue.pop(0)
        if node not in visited:
            visited.add(node)
            result.append(node)
            
            for neighbor in graph[node]:
                if neighbor not in visited:
                    queue.append(neighbor)
    
    return result
```

**Use cases:**
- Number of Islands
- Course Schedule
- Clone Graph

### 4. **2D Grid BFS**
Traverse 2D grids with BFS.

```python
def bfs_2d_grid(grid, start_row, start_col):
    rows, cols = len(grid), len(grid[0])
    queue = [(start_row, start_col)]
    visited = {(start_row, start_col)}
    directions = [(0, 1), (1, 0), (0, -1), (-1, 0)]
    
    while queue:
        row, col = queue.pop(0)
        
        # Process current cell
        process_cell(row, col)
        
        # Explore neighbors
        for dr, dc in directions:
            new_row, new_col = row + dr, col + dc
            
            if (0 <= new_row < rows and 0 <= new_col < cols and
                (new_row, new_col) not in visited and
                grid[new_row][new_col] != obstacle):
                
                visited.add((new_row, new_col))
                queue.append((new_row, new_col))
```

**Use cases:**
- Number of Islands
- Rotting Oranges
- Walls and Gates

## Problem Categories

### **Trees**
- **Binary Tree Level Order Traversal** - Basic level-order traversal
- **Binary Tree Zigzag Level Order Traversal** - Level-order with direction change
- **Average of Levels in Binary Tree** - Level-order with calculation
- **Minimum Depth of Binary Tree** - Shortest path in tree
- **Maximum Width of Binary Tree** - Level-order with width calculation

### **Graphs**
- **Word Ladder** - Shortest path in word graph
- **Course Schedule** - Cycle detection in DAG
- **Clone Graph** - Graph traversal with copying
- **Number of Islands** - 2D grid traversal

## Time & Space Complexity

| Pattern | Time Complexity | Space Complexity |
|---------|----------------|------------------|
| Tree Level Order | O(n) | O(w) where w is max width |
| Graph Traversal | O(V + E) | O(V) for visited set |
| Shortest Path | O(V + E) | O(V) for queue |
| 2D Grid BFS | O(m × n) | O(m × n) for visited set |

## Common BFS Variations

### **BFS with Distance Tracking:**
```python
def bfs_with_distance(graph, start):
    queue = [(start, 0)]  # (node, distance)
    visited = {start}
    distances = {start: 0}
    
    while queue:
        node, dist = queue.pop(0)
        
        for neighbor in graph[node]:
            if neighbor not in visited:
                visited.add(neighbor)
                distances[neighbor] = dist + 1
                queue.append((neighbor, dist + 1))
    
    return distances
```

### **BFS with Path Tracking:**
```python
def bfs_with_path(graph, start, end):
    queue = [(start, [start])]
    visited = {start}
    
    while queue:
        node, path = queue.pop(0)
        
        if node == end:
            return path
        
        for neighbor in graph[node]:
            if neighbor not in visited:
                visited.add(neighbor)
                queue.append((neighbor, path + [neighbor]))
    
    return []
```

## Common Mistakes to Avoid

1. **Queue implementation** - Use proper queue (deque for efficiency)
2. **Visited tracking** - Always mark nodes as visited when adding to queue
3. **Level tracking** - Be careful with level boundaries
4. **Memory usage** - BFS can use significant memory for wide graphs
5. **Infinite loops** - Ensure queue eventually becomes empty

## Practice Strategy

### **Beginner Level:**
1. **Binary Tree Level Order Traversal** - Basic level-order traversal
2. **Minimum Depth of Binary Tree** - Shortest path in tree
3. **Average of Levels in Binary Tree** - Level-order with calculation

### **Intermediate Level:**
1. **Binary Tree Zigzag Level Order Traversal** - Level-order with direction
2. **Number of Islands** - 2D grid BFS
3. **Clone Graph** - Graph traversal with copying

### **Advanced Level:**
1. **Word Ladder** - Shortest path in word graph
2. **Course Schedule** - Cycle detection in DAG
3. **Rotting Oranges** - Multi-source BFS

## Key Insights

1. **Level by level** - BFS processes nodes in layers
2. **Shortest path** - BFS finds shortest path in unweighted graphs
3. **Queue usage** - Always use a queue for BFS
4. **Visited tracking** - Prevent revisiting nodes
5. **Memory consideration** - BFS can use significant memory

## Interview Tips

1. **Start with queue** - BFS always uses a queue
2. **Handle edge cases** - Empty graphs, single nodes, disconnected components
3. **Explain the approach** - Walk through the level-by-level process
4. **Discuss trade-offs** - BFS vs DFS, memory vs time
5. **Code incrementally** - Start with basic traversal, then add logic

## Template for Tree BFS

```python
def bfs_tree(root):
    if not root:
        return []
    
    queue = [root]
    result = []
    
    while queue:
        level_size = len(queue)
        level_nodes = []
        
        for _ in range(level_size):
            node = queue.pop(0)
            level_nodes.append(node.val)
            
            if node.left:
                queue.append(node.left)
            if node.right:
                queue.append(node.right)
        
        result.append(level_nodes)
    
    return result
```

## Template for Graph BFS

```python
def bfs_graph(graph, start):
    queue = [start]
    visited = {start}
    result = []
    
    while queue:
        node = queue.pop(0)
        result.append(node)
        
        for neighbor in graph[node]:
            if neighbor not in visited:
                visited.add(neighbor)
                queue.append(neighbor)
    
    return result
```

Remember: **BFS is about exploring wide before exploring deep**. It's perfect for level-order traversal and shortest path problems!
