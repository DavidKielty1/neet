def alternate_case(text: str) -> str:
    """
    Convert string to alternating case, starting with uppercase.
    Non-alphabetic characters remain unchanged.
    
    Example:
    Input: "hello there"
    Output: "HeLlO tHeRe"
    """
    result = ""
    for i, char in enumerate(text):
        if char.isalpha():
            if i % 2 == 0:
                result += char.upper()
            else: 
                result += char.lower()
        else:
            result += char
    
    return result


# Test cases
if __name__ == "__main__":
    print(alternate_case("hello there"))     # Should print: "HeLlO tHeRe"
    print(alternate_case("python3.9"))       # Should print: "PyThOn3.9"
    print(alternate_case("HELLO"))           # Should print: "HeLlO"
    print(alternate_case("a b c d"))         # Should print: "A b C d"
