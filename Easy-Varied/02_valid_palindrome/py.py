def is_palindrome(s):
    """
    Valid Palindrome
    
    A phrase is a palindrome if, after converting all uppercase letters into lowercase letters 
    and removing all non-alphanumeric characters, it reads the same forward and backward. 
    Alphanumeric characters include letters and numbers.
    
    Given a string s, return true if it is a palindrome, or false otherwise.
    
    Example 1:
    Input: s = "A man, a plan, a canal: Panama"
    Output: true
    Explanation: "amanaplanacanalpanama" is a palindrome.
    
    Example 2:
    Input: s = "race a car"
    Output: false
    Explanation: "raceacar" is not a palindrome.
    
    Example 3:
    Input: s = " "
    Output: true
    Explanation: s is an empty string "" after removing non-alphanumeric characters.
    Since an empty string reads the same forward and backward, it is a palindrome.
    
    Constraints:
    - 1 <= s.length <= 2 * 105
    - s consists only of printable ASCII characters.
    """

    string = ''.join(c.lower() for c in s if c.isalnum())

    left = 0
    right = len(string) - 1

    while left <= right:
        if string[left] != string[right]:
            return False
        left += 1
        right -= 1
    
    return True


# is_palindrome("race a car")

# # Test cases
if __name__ == "__main__":
    # Test case 1
    s1 = "A man, a plan, a canal: Panama"
    print(f"Test 1: s = '{s1}'")
    result1 = is_palindrome(s1)
    print(f"Expected: True, Got: {result1}")
    
    # Test case 2
    s2 = "race a car"
    print(f"Test 2: s = '{s2}'")
    result2 = is_palindrome(s2)
    print(f"Expected: False, Got: {result2}")
    
    # Test case 3
    s3 = " "
    print(f"Test 3: s = '{s3}'")
    result3 = is_palindrome(s3)
    print(f"Expected: True, Got: {result3}")
    
    # Test case 4
    s4 = "racecar"
    print(f"Test 4: s = '{s4}'")
    result4 = is_palindrome(s4)
    print(f"Expected: True, Got: {result4}")
    
    # Test case 5 - Empty string
    s5 = ""
    print(f"Test 5: s = '{s5}'")
    result5 = is_palindrome(s5)
    print(f"Expected: True, Got: {result5}")
    
    # Test case 6 - All non-alphanumeric
    s6 = "!@#$%"
    print(f"Test 6: s = '{s6}'")
    result6 = is_palindrome(s6)
    print(f"Expected: True, Got: {result6}")
    
    # Test case 7 - Numbers only
    s7 = "12321"
    print(f"Test 7: s = '{s7}'")
    result7 = is_palindrome(s7)
    print(f"Expected: True, Got: {result7}")
