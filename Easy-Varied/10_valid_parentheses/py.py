def is_valid(s):
    """
    Valid Parentheses
    
    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', 
    determine if the input string is valid.
    
    An input string is valid if:
    - Open brackets must be closed by the same type of brackets.
    - Open brackets must be closed in the correct order.
    - Every close bracket has a corresponding open bracket of the same type.
    
    Example 1:
    Input: s = "()"
    Output: true
    
    Example 2:
    Input: s = "()[]{}"
    Output: true
    
    Example 3:
    Input: s = "(]"
    Output: false
    
    Example 4:
    Input: s = "([)]"
    Output: false
    
    Constraints:
    - 1 <= s.length <= 104
    - s consists of parentheses only '()[]{}'.
    """
    pass


# Test cases
if __name__ == "__main__":
    # Test case 1
    s1 = "()"
    print(f"Test 1: s = '{s1}'")
    result1 = is_valid(s1)
    print(f"Expected: True, Got: {result1}")
    
    # Test case 2
    s2 = "()[]{}"
    print(f"Test 2: s = '{s2}'")
    result2 = is_valid(s2)
    print(f"Expected: True, Got: {result2}")
    
    # Test case 3
    s3 = "(]"
    print(f"Test 3: s = '{s3}'")
    result3 = is_valid(s3)
    print(f"Expected: False, Got: {result3}")
    
    # Test case 4
    s4 = "([)]"
    print(f"Test 4: s = '{s4}'")
    result4 = is_valid(s4)
    print(f"Expected: False, Got: {result4}")
    
    # Test case 5
    s5 = "{[]}"
    print(f"Test 5: s = '{s5}'")
    result5 = is_valid(s5)
    print(f"Expected: True, Got: {result5}")
    
    # Test case 6
    s6 = ""
    print(f"Test 6: s = '{s6}'")
    result6 = is_valid(s6)
    print(f"Expected: True, Got: {result6}")
