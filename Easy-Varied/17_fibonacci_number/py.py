def fib(n):
    """
    Fibonacci Number
    
    The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, 
    such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
    
    F(0) = 0, F(1) = 1
    F(n) = F(n - 1) + F(n - 2), for n > 1.
    
    Given n, calculate F(n).
    
    Example 1:
    Input: n = 2
    Output: 1
    Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
    
    Example 2:
    Input: n = 3
    Output: 2
    Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
    
    Example 3:
    Input: n = 4
    Output: 3
    Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
    
    Constraints:
    - 0 <= n <= 30
    """
    pass


# Test cases
if __name__ == "__main__":
    # Test case 1
    n1 = 2
    print(f"Test 1: n = {n1}")
    result1 = fib(n1)
    print(f"Expected: 1, Got: {result1}")
    
    # Test case 2
    n2 = 3
    print(f"Test 2: n = {n2}")
    result2 = fib(n2)
    print(f"Expected: 2, Got: {result2}")
    
    # Test case 3
    n3 = 4
    print(f"Test 3: n = {n3}")
    result3 = fib(n3)
    print(f"Expected: 3, Got: {result3}")
    
    # Test case 4
    n4 = 0
    print(f"Test 4: n = {n4}")
    result4 = fib(n4)
    print(f"Expected: 0, Got: {result4}")
    
    # Test case 5
    n5 = 1
    print(f"Test 5: n = {n5}")
    result5 = fib(n5)
    print(f"Expected: 1, Got: {result5}")
    
    # Test case 6
    n6 = 6
    print(f"Test 6: n = {n6}")
    result6 = fib(n6)
    print(f"Expected: 8, Got: {result6}")
