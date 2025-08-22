def count_digits(text: str) -> dict[str, int]:
    """
    Count how many times each digit appears in a string.
    Return a dictionary with digits as keys and counts as values.
    Only count actual digits (0-9), ignore other characters.
    
    Example:
    Input: "Hello 123, 456!"
    Output: {'1': 1, '2': 1, '3': 1, '4': 1, '5': 1, '6': 1}
    
    Learning goals:
    - Dictionary creation and manipulation
    - Using isdigit() method
    - Basic looping
    """

    count_dict = {}

    for char in text:
        if char.isdigit():
            if char in count_dict:
                count_dict[char] += 1
            else:
                count_dict[char] = 1

    return count_dict


# Test cases
if __name__ == "__main__":
    print(count_digits("Hello 123, 456!"))     # Should print: {'1': 1, '2': 1, '3': 1, '4': 1, '5': 1, '6': 1}
    print(count_digits("Phone: 555-123-4567")) # Should print: {'5': 3, '1': 1, '2': 1, '3': 1, '4': 1, '6': 1, '7': 1}
    print(count_digits("No digits here!"))     # Should print: {}
