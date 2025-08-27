def dfs_find_string_in_grid_test(grid: list[list[str]], target: str) -> bool:
    """
    TODO: Find if a string exists in a grid using DFS.
    
    Given a 2D grid of characters and a target string, check if the string
    can be formed by connecting adjacent characters (horizontally or vertically).
    
    Requirements:
    - Use DFS with backtracking
    - Start from each cell that matches the first character
    - Only move horizontally or vertically (no diagonals)
    - Don't reuse the same cell in a single path
    - Return True if string can be formed, False otherwise
    
    Example:
    Input: grid = [['A', 'B', 'C'],
                   ['D', 'E', 'F'],
                   ['G', 'H', 'I']], target = "BEH"
    Output: True (can form "BEH" by going B->E->H)
    
    Learning goals:
    - DFS with backtracking
    - String character matching
    - Grid traversal with constraints
    """
    # TODO: Implement your solution here
    pass


# Test cases - run these to verify your implementation
if __name__ == "__main__":
    # Test 1: String exists
    grid1 = [['A', 'B', 'C'],
             ['D', 'E', 'F'],
             ['G', 'H', 'I']]
    target1 = "BEH"
    result1 = dfs_find_string_in_grid_test(grid1, target1)
    print(f"Grid: {grid1}")
    print(f"Target: '{target1}'")
    print(f"Exists: {result1}")
    print()
    
    # Test 2: String doesn't exist
    grid2 = [['A', 'B', 'C'],
             ['D', 'E', 'F'],
             ['G', 'H', 'I']]
    target2 = "XYZ"
    result2 = dfs_find_string_in_grid_test(grid2, target2)
    print(f"Grid: {grid2}")
    print(f"Target: '{target2}'")
    print(f"Exists: {result2}")
    print()
    
    # Test 3: Single character
    grid3 = [['A', 'B', 'C'],
             ['D', 'E', 'F']]
    target3 = "E"
    result3 = dfs_find_string_in_grid_test(grid3, target3)
    print(f"Grid: {grid3}")
    print(f"Target: '{target3}'")
    print(f"Exists: {result3}")
    print()
    
    # Test 4: Diagonal not allowed (should fail)
    grid4 = [['A', 'B'],
             ['C', 'D']]
    target4 = "AD"  # Can't go diagonal
    result4 = dfs_find_string_in_grid_test(grid4, target4)
    print(f"Grid: {grid4}")
    print(f"Target: '{target4}'")
    print(f"Exists: {result4}")
    print()
    
    # Test 5: Reuse characters not allowed
    grid5 = [['A', 'B'],
             ['C', 'D']]
    target5 = "ABA"  # Can't reuse A
    result5 = dfs_find_string_in_grid_test(grid5, target5)
    print(f"Grid: {grid5}")
    print(f"Target: '{target5}'")
    print(f"Exists: {result5}")
    print()
    
    # Test 6: Empty string
    grid6 = [['A', 'B'], ['C', 'D']]
    target6 = ""
    result6 = dfs_find_string_in_grid_test(grid6, target6)
    print(f"Grid: {grid6}")
    print(f"Target: '{target6}'")
    print(f"Exists: {result6}")
    print()
    
    # Test 7: Larger grid
    grid7 = [['A', 'B', 'C', 'D'],
             ['E', 'F', 'G', 'H'],
             ['I', 'J', 'K', 'L']]
    target7 = "FGH"
    result7 = dfs_find_string_in_grid_test(grid7, target7)
    print(f"Grid: {grid7}")
    print(f"Target: '{target7}'")
    print(f"Exists: {result7}")
    print()
    
    # Test 8: Empty grid
    grid8 = []
    target8 = "ABC"
    result8 = dfs_find_string_in_grid_test(grid8, target8)
    print(f"Grid: {grid8}")
    print(f"Target: '{target8}'")
    print(f"Exists: {result8}")
    print()
    
    # Test 9: Multiple paths possible
    grid9 = [['A', 'B', 'A'],
             ['B', 'A', 'B'],
             ['A', 'B', 'A']]
    target9 = "ABA"
    result9 = dfs_find_string_in_grid_test(grid9, target9)
    print(f"Grid: {grid9}")
    print(f"Target: '{target9}'")
    print(f"Exists: {result9}")
    print()
    
    # Test 10: Long string
    grid10 = [['A', 'B', 'C'],
              ['D', 'E', 'F'],
              ['G', 'H', 'I']]
    target10 = "ABCDEFGHI"
    result10 = dfs_find_string_in_grid_test(grid10, target10)
    print(f"Grid: {grid10}")
    print(f"Target: '{target10}'")
    print(f"Exists: {result10}")
