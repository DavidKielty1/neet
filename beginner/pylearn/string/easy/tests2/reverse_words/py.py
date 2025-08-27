def reverse_words(s: str) -> str:
    """
    Reverse the order of words in a string while keeping the words themselves unchanged.
    Words are separated by spaces.
    
    Example:
    Input: "hello world python"
    Output: "python world hello"
    
    Learning goals:
    - String splitting and joining
    - List reversal
    - Handling multiple spaces
    """
    splat = s.split()

    i, j = 0, len(splat) - 1
    while i < j:
        splat[i], splat[j] = splat[j], splat[i]
        i += 1
        j -= 1

    # return ' '.join(splat)


# reverse_words("hello world")
reverse_words("first second third")

# # Test cases
# if __name__ == "__main__":
#     print(reverse_words("hello world"))           # Should print: "world hello"
#     print(reverse_words("python is awesome"))     # Should print: "awesome is python"
#     print(reverse_words("a b c"))                 # Should print: "c b a"
#     print(reverse_words("single"))                # Should print: "single"
#     print(reverse_words(""))                      # Should print: ""
#     print(reverse_words("   multiple   spaces   ")) # Should print: "spaces multiple"
#     print(reverse_words("one"))                   # Should print: "one"
#     print(reverse_words("first second third"))    # Should print: "third second first"
