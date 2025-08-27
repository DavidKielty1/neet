from collections import Counter


def first_unique(text: str) -> str | None:
    """
    Find the first character that doesn't repeat anywhere else in the string.
    If all characters repeat, return None.
    
    Example:
    Input: "leetcode"
    Output: "l"  # 'l' is the first character that doesn't repeat
    
    Input: "aabb"
    Output: None  # all characters repeat
    """
    char_count = Counter(text)
    
    for char in text:
        if char_count[char] == 1:
            return char
    return None

# Test cases
if __name__ == "__main__":
    print(first_unique("leetcode"))     # Should print: "l"
    print(first_unique("aabb"))         # Should print: None
    print(first_unique(""))             # Should print: None
    print(first_unique("abcabc"))       # Should print: None
