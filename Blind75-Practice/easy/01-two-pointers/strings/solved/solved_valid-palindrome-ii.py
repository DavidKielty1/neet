"""
680. Valid Palindrome II
Difficulty: Easy
Pattern: Two Pointers

Given a string s, return true if the s can be palindrome after deleting at most one character from it.

Example:
Input: s = "aba"
Output: true

Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.

Time: O(n), Space: O(1)
"""


def valid_palindrome(s):
    """
    Two pointers with one deletion allowed
    """

    def is_palindrome_range(left, right):
        """Check if substring is palindrome"""
        while left < right:
            if s[left] != s[right]:
                return False
            left += 1
            right -= 1
        return True

    left, right = 0, len(s) - 1

    while left < right:
        if s[left] != s[right]:
            # Try deleting left character or right character
            return is_palindrome_range(left + 1, right) or is_palindrome_range(
                left, right - 1
            )
        left += 1
        right -= 1

    return True


# Alternative: More explicit approach
def valid_palindrome_explicit(s):
    """
    More explicit version with helper function
    """

    def check_palindrome(s, left, right):
        while left < right:
            if s[left] != s[right]:
                return False
            left += 1
            right -= 1
        return True

    left, right = 0, len(s) - 1

    while left < right:
        if s[left] == s[right]:
            left += 1
            right -= 1
        else:
            # Try skipping left character
            skip_left = check_palindrome(s, left + 1, right)
            # Try skipping right character
            skip_right = check_palindrome(s, left, right - 1)
            return skip_left or skip_right

    return True


# Test cases
if __name__ == "__main__":
    # Test 1
    s1 = "aba"
    print(f"Valid Palindrome II: {valid_palindrome(s1)}")  # True

    # Test 2
    s2 = "abca"
    print(f"Valid Palindrome II: {valid_palindrome(s2)}")  # True

    # Test 3
    s3 = "abc"
    print(f"Valid Palindrome II: {valid_palindrome(s3)}")  # False

    # Test 4
    s4 = "deeee"
    print(f"Valid Palindrome II: {valid_palindrome(s4)}")  # True
