def score_of_string(s: str) -> int:
    """
    Calculate score by summing absolute differences between ASCII values of adjacent characters.
    Example: "hello" -> 13
    
    How it works:
    1. For each pair of adjacent characters:
       - Convert both chars to ASCII using ord()
       - Find absolute difference using abs()
       - Add to running total
    
    Example breakdown for "hello":
    - 'h'(104) vs 'e'(101): |104-101| = 3
    - 'e'(101) vs 'l'(108): |101-108| = 7
    - 'l'(108) vs 'l'(108): |108-108| = 0
    - 'l'(108) vs 'o'(111): |108-111| = 3
    Total: 3 + 7 + 0 + 3 = 13
    
    Note: ord() converts a character to its ASCII value
          abs() gets the positive difference regardless of order
    """
    score = 0
    
    # Look at each adjacent pair of characters
    for i in range(len(s) - 1):
        # Get absolute difference of ASCII values
        score += abs(ord(s[i]) - ord(s[i + 1]))
        
    return score


# Test cases
print(score_of_string("hello"))  # 13
print(score_of_string("zaz"))    # 50 (|122-97| + |97-122| = 25 + 25)