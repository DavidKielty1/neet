def count_case(text: str) -> dict[str, int]:
    """
    Count how many uppercase and lowercase letters are in a string.
    Return a dictionary with counts.
    Ignore non-letter characters.
    
    Example:
    Input: "Hello World! 123"
    Output: {"upper": 2, "lower": 8}
    
    Learning goals:
    - Dictionary creation
    - isupper() and islower() methods
    - Multiple counters
    - Basic looping
    """

    uppercase = 0
    lowercase = 0

    for char in text:
        if char.isalpha():
            if char.isupper():
                uppercase += 1
            if char.islower():
                lowercase += 1

    return {"upper": uppercase, "lower": lowercase}
    



# Test cases
if __name__ == "__main__":
    print(count_case("Hello World! 123"))     # Should print: {"upper": 2, "lower": 8}
    print(count_case("PYTHON is AWESOME"))    # Should print: {"upper": 11, "lower": 2}
    print(count_case("no caps here"))         # Should print: {"upper": 0, "lower": 11}
    print(count_case("12345!"))              # Should print: {"upper": 0, "lower": 0}
