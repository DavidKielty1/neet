def find_vowels(s: str) -> list[str]:
    """
    Find all vowels (a, e, i, o, u) in a string and return them in order of appearance.
    Consider both uppercase and lowercase vowels.
    
    Example:
    Input: "Hello World"
    Output: ['e', 'o', 'o']
    
    Learning goals:
    - String iteration
    - Character classification
    - List building
    - Case handling
    """
    vowels = { 'e', 'o', 'a', 'i', 'u', 'E', 'O', 'A', 'I', 'U'}
    output = []
    for c in s:
        if not c in vowels:
            pass
        else:
            output.append(c)

    return output


# Alternative implementations
def find_vowels_alt1(s: str) -> list[str]:
    """Using string method and list comprehension"""
    vowels = "aeiouAEIOU"
    return [c for c in s if c in vowels]


def find_vowels_alt2(s: str) -> list[str]:
    """Using string.lower() for case-insensitive comparison"""
    vowels = "aeiou"
    return [c for c in s if c.lower() in vowels]


def find_vowels_alt3(s: str) -> list[str]:
    """Using filter() function"""
    vowels = "aeiouAEIOU"
    return list(filter(lambda c: c in vowels, s))


def find_vowels_alt4(s: str) -> list[str]:
    """Using regex for more complex pattern matching"""
    import re
    return re.findall(r'[aeiouAEIOU]', s)


# Test cases
if __name__ == "__main__":
    test_strings = [
        "Hello World",
        "python", 
        "AEIOU",
        "aeiou",
        "bcdfg",
        "",
        "a",
        "The quick brown fox",
        "12345"
    ]
    
    print("Original implementation:")
    for test in test_strings:
        print(f"'{test}' -> {find_vowels(test)}")
    
    print("\nAlternative 1 (string + list comprehension):")
    for test in test_strings:
        print(f"'{test}' -> {find_vowels_alt1(test)}")
    
    print("\nAlternative 2 (case-insensitive):")
    for test in test_strings:
        print(f"'{test}' -> {find_vowels_alt2(test)}")
    
    print("\nAlternative 3 (filter function):")
    for test in test_strings:
        print(f"'{test}' -> {find_vowels_alt3(test)}")
    
    print("\nAlternative 4 (regex):")
    for test in test_strings:
        print(f"'{test}' -> {find_vowels_alt4(test)}")


# Performance testing
def performance_test():
    import time
    import random
    import string
    
    # Generate test data
    def generate_test_string(length):
        return ''.join(random.choices(string.ascii_letters + string.digits + ' ', k=length))
    
    test_sizes = [100, 1000, 10000, 100000]
    methods = [
        ("Original (set)", find_vowels),
        ("Alt1 (string + list comp)", find_vowels_alt1),
        ("Alt2 (case-insensitive)", find_vowels_alt2),
        ("Alt3 (filter)", find_vowels_alt3),
        ("Alt4 (regex)", find_vowels_alt4)
    ]
    
    print("\n" + "="*60)
    print("PERFORMANCE COMPARISON")
    print("="*60)
    
    for size in test_sizes:
        test_string = generate_test_string(size)
        print(f"\nString length: {size:,}")
        print("-" * 40)
        
        results = {}
        for name, method in methods:
            # Warm up
            for _ in range(10):
                method(test_string)
            
            # Time the method
            start_time = time.perf_counter()
            for _ in range(100):
                result = method(test_string)
            end_time = time.perf_counter()
            
            avg_time = (end_time - start_time) / 100
            results[name] = avg_time
            print(f"{name:<25}: {avg_time*1000:.3f} ms")
        
        # Find fastest
        fastest = min(results.items(), key=lambda x: x[1])
        print(f"\nFastest: {fastest[0]} ({fastest[1]*1000:.3f} ms)")


if __name__ == "__main__":
    # Run correctness tests
    test_strings = [
        "Hello World",
        "python", 
        "AEIOU",
        "aeiou",
        "bcdfg",
        "",
        "a",
        "The quick brown fox",
        "12345"
    ]
    
    print("Correctness Tests:")
    print("-" * 20)
    for test in test_strings:
        result = find_vowels_alt1(test)  # Use the best method
        print(f"'{test}' -> {result}")
    
    # Run performance tests
    performance_test()
