"""
424. - Longest Repeating Character Replacement

You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.

Return the length of the longest substring containing the same letter you can get after performing the above operations.



Example 1:

Input: s = "ABAB", k = 2
Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa.

Example 2:

Input: s = "AABABBA", k = 1
Output: 4
Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
The substring "BBBB" has the longest repeating letters, which is 4.
There may exists other ways to achieve this answer too.
"""


def characterReplacement(s: str, k: int) -> int:
    """
    Window
    window-size = right - left +1
    if window_size - max_freq > k:
        shrink
    """
    max_freq: int = 0
    max_length: int = 0
    left = 0
    hashmap: dict[str, int] = {}

    # AABABBA k=1
    for right in range(len(s)):
        # Initialize or increment character count
        hashmap[s[right]] = hashmap.get(s[right], 0) + 1
        max_freq = max(max_freq, hashmap[s[right]])

        # while window_size - max_freq > k resize
        window_size = right - left + 1
        while window_size - max_freq > k:
            hashmap[s[left]] -= 1
            left += 1
            window_size = right - left + 1

        # Update max_length with current valid window size
        max_length = max(max_length, window_size)

    return max_length


# Test cases
if __name__ == "__main__":
    # Test 1: Basic example from problem
    assert characterReplacement("ABAB", 2) == 4, "Test 1 Failed"
    print("✓ Test 1 passed: ABAB with k=2")

    # Test 2: Basic example from problem
    assert characterReplacement("AABABBA", 1) == 4, "Test 2 Failed"
    print("✓ Test 2 passed: AABABBA with k=1")

    # Test 3: All same characters (no replacements needed)
    assert characterReplacement("AAAA", 0) == 4, "Test 3 Failed"
    print("✓ Test 3 passed: All same characters")

    # Test 4: Single character
    assert characterReplacement("A", 0) == 1, "Test 4 Failed"
    print("✓ Test 4 passed: Single character")

    # Test 5: k = 0 (no replacements allowed)
    assert characterReplacement("ABCDE", 0) == 1, "Test 5 Failed"
    print("✓ Test 5 passed: k=0 returns longest single character sequence")

    # Test 6: k larger than string length
    assert characterReplacement("ABCD", 10) == 4, "Test 6 Failed"
    print("✓ Test 6 passed: k larger than needed")

    # Test 7: Need all k replacements
    assert characterReplacement("ABCDEF", 2) == 3, "Test 7 Failed"
    print("✓ Test 7 passed: Using all k replacements")

    # Test 8: Alternating pattern
    assert characterReplacement("ABABAB", 2) == 5, "Test 8 Failed"
    print("✓ Test 8 passed: Alternating pattern")

    # Test 9: Long sequence with one different character
    assert characterReplacement("AAABAAAA", 1) == 8, "Test 9 Failed"
    print("✓ Test 9 passed: Long sequence with one replacement")

    # Test 10: Multiple clusters
    assert characterReplacement("AABBCC", 1) == 3, "Test 10 Failed"
    print("✓ Test 10 passed: Multiple character clusters")

    # Test 11: Complex pattern
    assert characterReplacement("ABAA", 0) == 2, "Test 11 Failed"
    print("✓ Test 11 passed: Complex pattern with k=0")

    # Test 12: Larger k than differences
    assert characterReplacement("AABA", 1) == 4, "Test 12 Failed"
    print("✓ Test 12 passed: AABA with k=1")

    # Test 13: All different characters
    assert characterReplacement("ABCDEFGH", 3) == 4, "Test 13 Failed"
    print("✓ Test 13 passed: All different characters")

    print("\n✅ All tests passed!")
