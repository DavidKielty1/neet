def reverse_words(text: str) -> str:
    """
    Reverse the order of words in a string while keeping the words themselves unchanged.
    Handle multiple spaces between words correctly by removing extra spaces.
    
    Example:
    Input: "  hello   world  python  "
    Output: "python world hello"
    """
    
    words = text.split()
    words.reverse()
    return ' '.join(words)



# Test cases
if __name__ == "__main__":
    print(reverse_words("  hello   world  python  "))  # Should print: "python world hello"
    print(reverse_words("the sky is blue"))            # Should print: "blue is sky the"
    print(reverse_words("hello"))                      # Should print: "hello"
    print(reverse_words("   "))                        # Should print: ""
