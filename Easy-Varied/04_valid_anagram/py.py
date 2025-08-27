def is_anagram(s, t):
    """
    Valid Anagram
    
    Given two strings s and t, return true if t is an anagram of s, and false otherwise.
    
    An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
    typically using all the original letters exactly once.
    
    Example 1:
    Input: s = "anagram", t = "nagaram"
    Output: true
    
    Example 2:
    Input: s = "rat", t = "car"
    Output: false
    
    Constraints:
    - 1 <= s.length, t.length <= 5 * 104
    - s and t consist of lowercase English letters.
    """
    pass


# Test cases
if __name__ == "__main__":
    # Test case 1
    s1 = "anagram"
    t1 = "nagaram"
    print(f"Test 1: s = '{s1}', t = '{t1}'")
    result1 = is_anagram(s1, t1)
    print(f"Expected: True, Got: {result1}")
    
    # Test case 2
    s2 = "rat"
    t2 = "car"
    print(f"Test 2: s = '{s2}', t = '{t2}'")
    result2 = is_anagram(s2, t2)
    print(f"Expected: False, Got: {result2}")
    
    # Test case 3
    s3 = "listen"
    t3 = "silent"
    print(f"Test 3: s = '{s3}', t = '{t3}'")
    result3 = is_anagram(s3, t3)
    print(f"Expected: True, Got: {result3}")
    
    # Test case 4
    s4 = "hello"
    t4 = "world"
    print(f"Test 4: s = '{s4}', t = '{t4}'")
    result4 = is_anagram(s4, t4)
    print(f"Expected: False, Got: {result4}")
