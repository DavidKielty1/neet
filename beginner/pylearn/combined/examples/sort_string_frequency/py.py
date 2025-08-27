from collections import Counter
from typing import List

def sort_string_by_character_frequency(s: str) -> str:
    """
    Sort characters in a string by their frequency (most frequent first).
    
    This combines string manipulation with sorting to organize
    characters based on their occurrence count.
    
    Time Complexity: O(n log n) for sorting
    Space Complexity: O(n) for character count
    
    Example:
    Input: "tree"
    Output: "eert" or "eetr" (both valid)
    
    Learning goals:
    - String frequency counting
    - Sorting with custom keys
    - Character manipulation
    """
    if not s:
        return ""
    
    # Count character frequencies using Counter
    char_count = Counter(s)
    
    # Sort characters by frequency (descending), then by character (ascending)
    sorted_chars = sorted(char_count.items(), 
                         key=lambda x: (-x[1], x[0]))  # -x[1] for descending frequency
    
    # Build result string
    result = ""
    for char, count in sorted_chars:
        result += char * count
    
    return result


# Test cases
if __name__ == "__main__":
    print("=== Testing sort_string_by_character_frequency ===")
    
    # Test case 1: Basic frequency sorting
    test1 = "tree"
    result1 = sort_string_by_character_frequency(test1)
    print(f"Input: '{test1}'")
    print(f"Output: '{result1}'")
    print()
    
    # Test case 2: All same frequency
    test2 = "abc"
    result2 = sort_string_by_character_frequency(test2)
    print(f"Input: '{test2}'")
    print(f"Output: '{result2}'")
    print()
    
    # Test case 3: Complex frequency pattern
    test3 = "cccaaa"
    result3 = sort_string_by_character_frequency(test3)
    print(f"Input: '{test3}'")
    print(f"Output: '{result3}'")
    print()
    
    # Test case 4: Single character
    test4 = "a"
    result4 = sort_string_by_character_frequency(test4)
    print(f"Input: '{test4}'")
    print(f"Output: '{result4}'")
    print()
    
    # Test case 5: Empty string
    test5 = ""
    result5 = sort_string_by_character_frequency(test5)
    print(f"Input: '{test5}'")
    print(f"Output: '{result5}'")
    print()
    
    # Test case 6: Mixed case
    test6 = "Aabb"
    result6 = sort_string_by_character_frequency(test6)
    print(f"Input: '{test6}'")
    print(f"Output: '{result6}'")
    print()
    
    # Test case 7: Numbers and letters
    test7 = "loveleetcode"
    result7 = sort_string_by_character_frequency(test7)
    print(f"Input: '{test7}'")
    print(f"Output: '{result7}'")
    print()
    
    # Test case 8: Special characters
    test8 = "hello world!"
    result8 = sort_string_by_character_frequency(test8)
    print(f"Input: '{test8}'")
    print(f"Output: '{result8}'")
    print()
    
    # Test case 9: All same character
    test9 = "aaaa"
    result9 = sort_string_by_character_frequency(test9)
    print(f"Input: '{test9}'")
    print(f"Output: '{result9}'")
    print()
    
    # Test case 10: Two characters with same frequency
    test10 = "abab"
    result10 = sort_string_by_character_frequency(test10)
    print(f"Input: '{test10}'")
    print(f"Output: '{result10}'")

# ----------------------------------------------
# Explanation (commented)
# ----------------------------------------------
# Goal:
# - Rearrange the characters in a string so that more frequent characters appear first.
#
# Steps:
# 1) Count frequency of each character using Counter -> dict like {'e':2,'t':1,'r':1}.
# 2) Sort items by (-frequency, character) so higher counts come first; ties broken alphabetically.
# 3) Build the result by repeating each character 'count' times and concatenating.
#
# Why this works:
# - Sorting by a custom key gives the exact order we want.
# - Reconstructing from counts ensures correctness and linear work after sorting.
#
# Complexity:
# - Counting is O(n). Sorting up to unique characters U is O(U log U).
# - Building output is O(n). Overall O(n log U), typically O(n log n) in worst case.
