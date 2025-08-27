def sort_string_by_character_frequency_test(s: str) -> str:
    """
    TODO: Sort characters in a string by their frequency (most frequent first).
    
    Given a string, sort its characters by frequency in descending order.
    If characters have the same frequency, sort them alphabetically.
    
    Requirements:
    - Count frequency of each character
    - Sort by frequency (descending), then by character (ascending)
    - Build result string by repeating each character its frequency times
    - Handle empty strings and single characters
    
    Example:
    Input: "tree"
    Output: "eert" or "eetr" (both valid)
    
    Learning goals:
    - String frequency counting
    - Sorting with custom keys
    - Character manipulation
    """
    # TODO: Implement your solution here
    pass


# Test cases - run these to verify your implementation
if __name__ == "__main__":
    # Test 1: Basic frequency sorting
    test1 = "tree"
    result1 = sort_string_by_character_frequency_test(test1)
    print(f"Input: '{test1}'")
    print(f"Output: '{result1}'")
    print()
    
    # Test 2: All same frequency
    test2 = "abc"
    result2 = sort_string_by_character_frequency_test(test2)
    print(f"Input: '{test2}'")
    print(f"Output: '{result2}'")
    print()
    
    # Test 3: Complex frequency pattern
    test3 = "cccaaa"
    result3 = sort_string_by_character_frequency_test(test3)
    print(f"Input: '{test3}'")
    print(f"Output: '{result3}'")
    print()
    
    # Test 4: Single character
    test4 = "a"
    result4 = sort_string_by_character_frequency_test(test4)
    print(f"Input: '{test4}'")
    print(f"Output: '{result4}'")
    print()
    
    # Test 5: Empty string
    test5 = ""
    result5 = sort_string_by_character_frequency_test(test5)
    print(f"Input: '{test5}'")
    print(f"Output: '{result5}'")
    print()
    
    # Test 6: Mixed case
    test6 = "Aabb"
    result6 = sort_string_by_character_frequency_test(test6)
    print(f"Input: '{test6}'")
    print(f"Output: '{result6}'")
    print()
    
    # Test 7: Numbers and letters
    test7 = "loveleetcode"
    result7 = sort_string_by_character_frequency_test(test7)
    print(f"Input: '{test7}'")
    print(f"Output: '{result7}'")
    print()
    
    # Test 8: Special characters
    test8 = "hello world!"
    result8 = sort_string_by_character_frequency_test(test8)
    print(f"Input: '{test8}'")
    print(f"Output: '{result8}'")
    print()
    
    # Test 9: All same character
    test9 = "aaaa"
    result9 = sort_string_by_character_frequency_test(test9)
    print(f"Input: '{test9}'")
    print(f"Output: '{result9}'")
    print()
    
    # Test 10: Two characters with same frequency
    test10 = "abab"
    result10 = sort_string_by_character_frequency_test(test10)
    print(f"Input: '{test10}'")
    print(f"Output: '{result10}'")
    print()
    
    # Test 11: Mixed frequencies
    test11 = "aaabbbccc"
    result11 = sort_string_by_character_frequency_test(test11)
    print(f"Input: '{test11}'")
    print(f"Output: '{result11}'")
    print()
    
    # Test 12: Single repeated character
    test12 = "zzzzz"
    result12 = sort_string_by_character_frequency_test(test12)
    print(f"Input: '{test12}'")
    print(f"Output: '{result12}'")
    print()
    
    # Test 13: Palindrome with frequency
    test13 = "racecar"
    result13 = sort_string_by_character_frequency_test(test13)
    print(f"Input: '{test13}'")
    print(f"Output: '{result13}'")
    print()
    
    # Test 14: Long string
    test14 = "programming"
    result14 = sort_string_by_character_frequency_test(test14)
    print(f"Input: '{test14}'")
    print(f"Output: '{result14}'")
    print()
    
    # Test 15: Numbers only
    test15 = "123321"
    result15 = sort_string_by_character_frequency_test(test15)
    print(f"Input: '{test15}'")
    print(f"Output: '{result15}'")
