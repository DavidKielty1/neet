def is_palindrome(s: str) -> bool:
    """
    Check if a string is a palindrome (reads the same forwards and backwards).
    Ignore case and non-alphanumeric characters.
    
    Example:
    Input: "A man, a plan, a canal: Panama"
    Output: True (reads the same forwards and backwards)
    
    Learning goals:
    - String filtering and cleaning
    - Case conversion
    - Palindrome detection
    """
    stripped = []
    for c in s:
        if c.isalpha():
            stripped.append(c.lower())
    
    joined = ''.join(stripped)

    print("Length:", len(joined))

    i, j = 0, len(joined) - 1
    while i < j:
        if joined[i] != joined[j]:
            return False
        i += 1
        j -= 1
    return True
    

    


is_palindrome("race a car")

# Test cases
# if __name__ == "__main__":
#     print(is_palindrome("race a car"))            # Should print: False
#     print(is_palindrome("A man, a plan, a canal: Panama"))  # Should print: True
#     print(is_palindrome("racecar"))               # Should print: True
#     print(is_palindrome("hello"))                 # Should print: False
#     print(is_palindrome(""))                      # Should print: True
#     print(is_palindrome("a"))                     # Should print: True
#     print(is_palindrome("Was it a car or a cat I saw?"))  # Should print: True
#     print(is_palindrome("No 'x' in Nixon"))       # Should print: True
#     print(is_palindrome("python"))                # Should print: False
