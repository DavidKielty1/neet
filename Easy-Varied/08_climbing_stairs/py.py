def climb_stairs(n):
    """
    Climbing Stairs
    
    You are climbing a staircase. It takes n steps to reach the top.
    
    Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
    
    Example 1:
    Input: n = 2
    Output: 2
    Explanation: There are two ways to climb to the top.
    1. 1 step + 1 step
    2. 2 steps
    
    Example 2:
    Input: n = 3
    Output: 3
    Explanation: There are three ways to climb to the top.
    1. 1 step + 1 step + 1 step
    2. 1 step + 2 steps
    3. 2 steps + 1 step
    
    Constraints:
    - 1 <= n <= 45
    """
    pass


# Test cases
if __name__ == "__main__":
    # Test case 1
    n1 = 2
    print(f"Test 1: n = {n1}")
    result1 = climb_stairs(n1)
    print(f"Expected: 2, Got: {result1}")
    
    # Test case 2
    n2 = 3
    print(f"Test 2: n = {n2}")
    result2 = climb_stairs(n2)
    print(f"Expected: 3, Got: {result2}")
    
    # Test case 3
    n3 = 1
    print(f"Test 3: n = {n3}")
    result3 = climb_stairs(n3)
    print(f"Expected: 1, Got: {result3}")
    
    # Test case 4
    n4 = 4
    print(f"Test 4: n = {n4}")
    result4 = climb_stairs(n4)
    print(f"Expected: 5, Got: {result4}")
    
    # Test case 5
    n5 = 5
    print(f"Test 5: n = {n5}")
    result5 = climb_stairs(n5)
    print(f"Expected: 8, Got: {result5}")
