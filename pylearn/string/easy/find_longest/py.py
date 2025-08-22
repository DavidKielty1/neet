def find_longest(words: list[str]) -> tuple[str, int]:
    """
    Find the longest word in a list and its length.
    If there are multiple words of the same length, return the first one.
    Return tuple of (word, length).
    
    Example:
    Input: ["hello", "world", "python", "code"]
    Output: ("python", 6)
    
    Learning goals:
    - Tuple return values
    - List iteration
    - len() function
    - Variable assignment
    """
    longeststring = ""
    longestlength = 0

    for word in words:
        length = len(word)
        if length > longestlength:
            longeststring = word
            longestlength = length

    return (longeststring, longestlength)


# Test cases
if __name__ == "__main__":
    print(find_longest(["hello", "world", "python", "code"]))  # Should print: ("python", 6)
    print(find_longest(["a", "ab", "abc"]))                    # Should print: ("abc", 3)
    print(find_longest(["hi"]))                                # Should print: ("hi", 2)
