def count_bits(n):
    """
    Counting Bits
    
    Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), 
    ans[i] is the number of 1's in the binary representation of i.
    
    Example 1:
    Input: n = 2
    Output: [0,1,1]
    Explanation:
    0 --> 0 (0 ones)
    1 --> 1 (1 one)
    2 --> 10 (1 one)
    
    Example 2:
    Input: n = 5
    Output: [0,1,1,2,1,2]
    Explanation:
    0 --> 0 (0 ones)
    1 --> 1 (1 one)
    2 --> 10 (1 one)
    3 --> 11 (2 ones)
    4 --> 100 (1 one)
    5 --> 101 (2 ones)
    
    Constraints:
    - 0 <= n <= 105
    """
    pass


# Test cases
if __name__ == "__main__":
    # Test case 1
    n1 = 2
    print(f"Test 1: n = {n1}")
    result1 = count_bits(n1)
    print(f"Expected: [0, 1, 1], Got: {result1}")
    
    # Test case 2
    n2 = 5
    print(f"Test 2: n = {n2}")
    result2 = count_bits(n2)
    print(f"Expected: [0, 1, 1, 2, 1, 2], Got: {result2}")
    
    # Test case 3
    n3 = 0
    print(f"Test 3: n = {n3}")
    result3 = count_bits(n3)
    print(f"Expected: [0], Got: {result3}")
    
    # Test case 4
    n4 = 1
    print(f"Test 4: n = {n4}")
    result4 = count_bits(n4)
    print(f"Expected: [0, 1], Got: {result4}")
    
    # Test case 5
    n5 = 3
    print(f"Test 5: n = {n5}")
    result5 = count_bits(n5)
    print(f"Expected: [0, 1, 1, 2], Got: {result5}")
