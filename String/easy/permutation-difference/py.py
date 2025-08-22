def find_permutation_difference(s: str, t: str) -> int:
    # Example: s = "abc", t = "bac"
    
    # Step 1: Create a dictionary to store each character's position in s
    # For "abc" this creates: {'a': 0, 'b': 1, 'c': 2}
    s_positions = {}
    for i, char in enumerate(s):
        s_positions[char] = i
    
    # Step 2: Compare positions and sum up differences
    # For "bac", we check:
    # 'b' at index 0: abs(1 - 0) = 1  (moved from pos 1 to pos 0)
    # 'a' at index 1: abs(0 - 1) = 1  (moved from pos 0 to pos 1)
    # 'c' at index 2: abs(2 - 2) = 0  (stayed at pos 2)
    total = 0
    for i, char in enumerate(t):
        total += abs(s_positions[char] - i)
    
    return total  # Returns 2 for the example above


# Test cases
print(find_permutation_difference("abc", "bac"))      # 2
print(find_permutation_difference("abcde", "edbac"))  # 12

# Alternative one-line solution (less readable):
# def find_permutation_difference(s: str, t: str) -> int:
#     return sum(abs({c: i for i, c in enumerate(s)}[c] - i) for i, c in enumerate(t))