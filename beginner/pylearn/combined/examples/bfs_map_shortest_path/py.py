from collections import deque
from typing import List, Dict, Set, Tuple

def find_shortest_path_unweighted(graph: Dict[str, List[str]], start: str, end: str) -> List[str]:
    """
    Find shortest path in an unweighted graph using BFS with maps.
    
    This combines BFS traversal with map/dictionary operations to
    find the shortest path between two nodes in an unweighted graph.
    
    Time Complexity: O(V + E) where V is vertices, E is edges
    Space Complexity: O(V) for visited set and queue
    
    Example:
    Input: graph = {'A': ['B', 'C'],
                    'B': ['A', 'C', 'D'],
                    'C': ['A', 'B', 'D'],
                    'D': ['B', 'C']}, start='A', end='D'
    Output: ['A', 'B', 'D'] or ['A', 'C', 'D']
    
    Learning goals:
    - BFS with map operations
    - Graph representation with dictionaries
    - Path reconstruction using parent pointers
    """
    if start not in graph or end not in graph:
        return []
    
    # BFS with path tracking
    queue = deque([start])
    visited = {start}  # Use set for O(1) lookup
    parent = {start: None}  # Map for path reconstruction
    
    while queue:
        current = queue.popleft()
        
        if current == end:
            # Reconstruct path using parent map
            path = []
            node = current
            while node is not None:
                path.append(node)
                node = parent[node]
            return path[::-1]  # Reverse to get start->end order
        
        # Explore neighbors using graph map
        for neighbor in graph[current]:
            if neighbor not in visited:
                visited.add(neighbor)
                parent[neighbor] = current
                queue.append(neighbor)
    
    return []  # No path found

# ----------------------------------------------
# Explanation (commented)
# ----------------------------------------------
# Goal:
# - Find the shortest path (fewest edges) from 'start' to 'end' in an
#   unweighted graph represented as a dictionary: node -> list of neighbors.
#
# Data structures used:
# - queue (deque): holds nodes to visit next in FIFO order (BFS).
# - visited (set): prevents revisiting nodes and infinite loops.
# - parent (dict): remembers how we reached each node to rebuild the path.
#
# Why BFS works here:
# - In an unweighted graph, BFS explores nodes in layers by distance.
# - The first time we reach 'end', we have the shortest path.
#
# Algorithm steps:
# 1) Initialize queue with start, visited = {start}, parent[start] = None.
# 2) While queue not empty:
#    - Pop left to get current node.
#    - If current == end: backtrack using parent[] to build path and return it.
#    - Otherwise, for each neighbor of current not yet visited:
#         mark visited, set parent[neighbor] = current, enqueue neighbor.
# 3) If we exhaust the queue without finding 'end', return [].
#
# Path reconstruction:
# - Start from 'end' and repeatedly look up parent[node] until None.
# - Reverse the collected nodes to get start -> ... -> end.
#
# Example trace (A -> D):
# graph = {
#   'A': ['B','C'], 'B': ['A','C','D'], 'C': ['A','B','D'], 'D': ['B','C']
# }
# queue=[A], visited={A}
# pop A -> visit B, C (parent[B]=A, parent[C]=A)
# queue=[B,C]
# pop B -> visit D (parent[D]=B)
# current == D -> reconstruct: D -> B -> A -> reverse -> [A,B,D]


# Test cases
if __name__ == "__main__":
    print("=== Testing find_shortest_path_unweighted ===")
    
    # Test case 1: Simple path
    graph1 = {
        'A': ['B', 'C'],
        'B': ['A', 'C', 'D'],
        'C': ['A', 'B', 'D'],
        'D': ['B', 'C']
    }
    path1 = find_shortest_path_unweighted(graph1, 'A', 'D')
    print(f"Graph: {graph1}")
    print(f"Shortest path A->D: {path1}")
    print()
    
    # Test case 2: Direct connection
    graph2 = {
        'A': ['B'],
        'B': ['A', 'C'],
        'C': ['B']
    }
    path2 = find_shortest_path_unweighted(graph2, 'A', 'C')
    print(f"Graph: {graph2}")
    print(f"Shortest path A->C: {path2}")
    print()
    
    # Test case 3: No path exists
    graph3 = {
        'A': ['B'],
        'B': ['A'],
        'C': ['D'],
        'D': ['C']
    }
    path3 = find_shortest_path_unweighted(graph3, 'A', 'C')
    print(f"Graph: {graph3}")
    print(f"Shortest path A->C: {path3}")
    print()
    
    # Test case 4: Same start and end
    graph4 = {
        'A': ['B', 'C'],
        'B': ['A'],
        'C': ['A']
    }
    path4 = find_shortest_path_unweighted(graph4, 'A', 'A')
    print(f"Graph: {graph4}")
    print(f"Shortest path A->A: {path4}")
    print()
    
    # Test case 5: Larger graph
    graph5 = {
        'A': ['B', 'C'],
        'B': ['A', 'D', 'E'],
        'C': ['A', 'F'],
        'D': ['B'],
        'E': ['B', 'F'],
        'F': ['C', 'E']
    }
    path5 = find_shortest_path_unweighted(graph5, 'A', 'F')
    print(f"Graph: {graph5}")
    print(f"Shortest path A->F: {path5}")
    print()
    
    # Test case 6: Start node not in graph
    graph6 = {'B': ['C'], 'C': ['B']}
    path6 = find_shortest_path_unweighted(graph6, 'A', 'C')
    print(f"Graph: {graph6}")
    print(f"Shortest path A->C: {path6}")
