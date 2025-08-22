def split_words(text: str) -> list[str]:
    """
    Split a string into a list of words.
    Remove any extra spaces and punctuation.
    Convert all words to lowercase.
    
    Example:
    Input: "  Hello, World!  How are   you?  "
    Output: ["hello", "world", "how", "are", "you"]
    
    Learning goals:
    - String methods (split, strip, lower)
    - List operations
    - Basic string cleaning
    """

    # Replace punctuation with spaces, then split
    for punct in ',.!?;:':
        text = text.replace(punct, ' ')
    
    # Split by whitespace and clean
    words = text.split()
    
    output = []
    for word in words:
        # Keep only alphabetic characters
        cleaned = ''
        for char in word:
            if char.isalpha():
                cleaned += char.lower()
        
        if cleaned:
            output.append(cleaned)
    
    return output


# Test cases
if __name__ == "__main__":
    print(split_words("  Hello, World!  How are   you?  "))  # Should print: ["hello", "world", "how", "are", "you"]
    print(split_words("Python,is...awesome!"))               # Should print: ["python", "is", "awesome"]
    print(split_words("   "))                               # Should print: []
