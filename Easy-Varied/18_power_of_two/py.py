def is_power_of_two(n):
    """
    Power of Two
    
    Given an integer n, return true if it is a power of two. Otherwise, return false.
    
    An integer n is a power of two, if there exists an integer x such that n == 2x.
    
    Example 1:
    Input: n = 1
    Output: true
    Explanation: 20 = 1
    
    Example 2:
    Input: n = 16
    Output: true
    Explanation: 24 = 16
    
    Example 3:
    Input: n = 3
    Output: false
    
    Example 4:
    Input: n = 0
    Output: false
    
    Constraints:
    - -231 <= n <= 231 - 1
    """
    pass


# Test cases
if __name__ == "__main__":
    # Test case 1
    n1 = 1
    print(f"Test 1: n = {n1}")
    result1 = is_power_of_two(n1)
    print(f"Expected: True, Got: {result1}")
    
    # Test case 2
    n2 = 16
    print(f"Test 2: n = {n2}")
    result2 = is_power_of_two(n2)
    print(f"Expected: True, Got: {result2}")
    
    # Test case 3
    n3 = 3
    print(f"Test 3: n = {n3}")
    result3 = is_power_of_two(n3)
    print(f"Expected: False, Got: {result3}")
    
    # Test case 4
    n4 = 0
    print(f"Test 4: n = {n4}")
    result4 = is_power_of_two(n4)
    print(f"Expected: False, Got: {result4}")
    
    # Test case 5
    n5 = 8
    print(f"Test 5: n = {n5}")
    result5 = is_power_of_two(n5)
    print(f"Expected: True, Got: {result5}")
    
    # Test case 6
    n6 = 6
    print(f"Test 6: n = {n6}")
    result6 = is_power_of_two(n6)
    print(f"Expected: False, Got: {result6}")
    
    # Test case 7
    n7 = 1024
    print(f"Test 7: n = {n7}")
    result7 = is_power_of_two(n7)
    print(f"Expected: True, Got: {result7}")
