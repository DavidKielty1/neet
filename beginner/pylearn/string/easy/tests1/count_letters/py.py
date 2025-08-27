def count_letters(text: str) -> tuple[int, int]:
    """
    Count the number of vowels and consonants in a string.
    Ignores spaces and punctuation.
    Returns a tuple of (vowel_count, consonant_count)
    
    Example:
    Input: "Hello World"
    Output: (3, 7)  # 3 vowels (e,o,o) and 7 consonants (H,l,l,W,r,l,d)
    """
    vowels = "aeiouAEIOU"
    vowel_count = 0
    consonant_count = 0

    for char in text:
        if char.isalpha():
            if char in vowels:
                vowel_count += 1
            else:
                consontant_count += 1

    return (vowel_count, consonant_count)



# Test cases
if __name__ == "__main__":
    print(count_letters("Hello World"))  # Should print: (3, 7)
    print(count_letters("Python"))       # Should print: (1, 5)
    print(count_letters("AeIoU"))       # Should print: (5, 0)
    print(count_letters("123!@#"))      # Should print: (0, 0)
