def hamming_distance(x, y):
    """
    Hamming Distance
    
    The Hamming distance between two integers is the number of positions at which the 
    corresponding bits are different.
    
    Given two integers x and y, return the Hamming distance between them.
    
    Example 1:
    Input: x = 1, y = 4
    Output: 2
    Explanation:
    1   (0 0 0 1)
    4   (0 1 0 0)
           ↑   ↑
    The above arrows point to positions where the corresponding bits are different.
    
    Example 2:
    Input: x = 3, y = 1
    Output: 1
    Explanation:
    3   (0 0 1 1)
    1   (0 0 0 1)
           ↑
    The above arrow points to the position where the corresponding bits are different.
    
    Constraints:
    - 0 <= x, y <= 231 - 1
    """
    pass


# Test cases
if __name__ == "__main__":
    # Test case 1
    x1, y1 = 1, 4
    print(f"Test 1: x = {x1}, y = {y1}")
    result1 = hamming_distance(x1, y1)
    print(f"Expected: 2, Got: {result1}")
    
    # Test case 2
    x2, y2 = 3, 1
    print(f"Test 2: x = {x2}, y = {y2}")
    result2 = hamming_distance(x2, y2)
    print(f"Expected: 1, Got: {result2}")
    
    # Test case 3
    x3, y3 = 0, 0
    print(f"Test 3: x = {x3}, y = {y3}")
    result3 = hamming_distance(x3, y3)
    print(f"Expected: 0, Got: {result3}")
    
    # Test case 4
    x4, y4 = 15, 0
    print(f"Test 4: x = {x4}, y = {y4}")
    result4 = hamming_distance(x4, y4)
    print(f"Expected: 4, Got: {result4}")
    
    # Test case 5
    x5, y5 = 7, 3
    print(f"Test 5: x = {x5}, y = {y5}")
    result5 = hamming_distance(x5, y5)
    print(f"Expected: 1, Got: {result5}")
    
    # Test case 6
    x6, y6 = 8, 15
    print(f"Test 6: x = {x6}, y = {y6}")
    result6 = hamming_distance(x6, y6)
    print(f"Expected: 3, Got: {result6}")
