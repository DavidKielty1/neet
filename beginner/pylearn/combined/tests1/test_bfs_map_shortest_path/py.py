from collections import deque
from typing import List, Dict, Set, Tuple


def find_shortest_path_test(graph: dict[str, list[str]], start: str, end: str) -> list[str]:
    """
    TODO: Find shortest path in an unweighted graph using BFS with maps.
    
    Given an unweighted graph represented as a dictionary, find the shortest path
    from start node to end node using BFS. Return the path as a list of nodes.
    
    Requirements:
    - Use BFS with a queue
    - Track visited nodes using a set for O(1) lookup
    - Reconstruct the path using parent pointers (map)
    - Return path as list of nodes from start to end
    
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
    # TODO: Implement your solution here
    queue = deque([start])
    visited = {start}
    parent = {start: None}

    while queue:
        current = queue.popleft()

        if current == end:
            path = []
            node = current
            while node is not None:
                path.append(node)
                node = parent[node]
            return path[::-1]
        
        for neighbour in graph[current]:
            if neighbour not in visited:
                visited.add(neighbour)
                parent[neighbour] = current
                queue.append(neighbour)

    return []




# Test cases - run these to verify your implementation
if __name__ == "__main__":
    # Test 1: Simple path
    graph1 = {
        'A': ['B', 'C'],
        'B': ['A', 'C', 'D'],
        'C': ['A', 'B', 'D'],
        'D': ['B', 'C']
    }
    path1 = find_shortest_path_test(graph1, 'A', 'D')
    print(f"Graph: {graph1}")
    print(f"Shortest path A->D: {path1}")
    print()
    
    # Test 2: Direct connection
    graph2 = {
        'A': ['B'],
        'B': ['A', 'C'],
        'C': ['B']
    }
    path2 = find_shortest_path_test(graph2, 'A', 'C')
    print(f"Graph: {graph2}")
    print(f"Shortest path A->C: {path2}")
    print()
    
    # Test 3: No path exists
    graph3 = {
        'A': ['B'],
        'B': ['A'],
        'C': ['D'],
        'D': ['C']
    }
    path3 = find_shortest_path_test(graph3, 'A', 'C')
    print(f"Graph: {graph3}")
    print(f"Shortest path A->C: {path3}")
    print()
    
    # Test 4: Same start and end
    graph4 = {
        'A': ['B', 'C'],
        'B': ['A'],
        'C': ['A']
    }
    path4 = find_shortest_path_test(graph4, 'A', 'A')
    print(f"Graph: {graph4}")
    print(f"Shortest path A->A: {path4}")
    print()
    
    # Test 5: Larger graph
    graph5 = {
        'A': ['B', 'C'],
        'B': ['A', 'D', 'E'],
        'C': ['A', 'F'],
        'D': ['B'],
        'E': ['B', 'F'],
        'F': ['C', 'E']
    }
    path5 = find_shortest_path_test(graph5, 'A', 'F')
    print(f"Graph: {graph5}")
    print(f"Shortest path A->F: {path5}")
    print()
    
    # Test 6: Start node not in graph
    graph6 = {'B': ['C'], 'C': ['B']}
    path6 = find_shortest_path_test(graph6, 'A', 'C')
    print(f"Graph: {graph6}")
    print(f"Shortest path A->C: {path6}")
    print()
    
    # Test 7: End node not in graph
    graph7 = {'A': ['B'], 'B': ['A']}
    path7 = find_shortest_path_test(graph7, 'A', 'C')
    print(f"Graph: {graph7}")
    print(f"Shortest path A->C: {path7}")
    print()
    
    # Test 8: Single node graph
    graph8 = {'A': []}
    path8 = find_shortest_path_test(graph8, 'A', 'A')
    print(f"Graph: {graph8}")
    print(f"Shortest path A->A: {path8}")
