def compress_string(text: str) -> str:
    """
    Compress string by replacing consecutive repeated characters with the character and its count.
    If compressed string is not shorter than original, return original string.
    
    Example:
    Input: "aaabbbcc"
    Output: "a3b3c2"
    
    Input: "abc"
    Output: "abc"  # since "a1b1c1" would be longer
    """
    char_count = {}

    for char in text:
        if char in char_count:
            char_count[char] += 1
        else:
            char_count[char] = 1
    
    compressed = ""
    for char, count in char_count.items():
        compressed =+ char + str(count)

    return compressed if len(compressed) < len(text) else text

# Test cases
if __name__ == "__main__":
    print(compress_string("aaabbbcc"))    # Should print: "a3b3c2"
    print(compress_string("abc"))         # Should print: "abc"
    print(compress_string("aabbaa"))      # Should print: "a2b2a2"
    print(compress_string(""))            # Should print: ""

"""
Pythonic:
def compress_string(text: str) -> str:
    char_count = {}
    
    for char in text:
        char_count[char] = char_count.get(char, 0) + 1
    
    compressed = "".join(f"{char}{count}" for char, count in char_count.items())
    return compressed if len(compressed) < len(text) else text
"""