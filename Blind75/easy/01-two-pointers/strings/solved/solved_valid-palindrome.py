"""
125. Valid Palindrome
Difficulty: Easy
Pattern: Two Pointers

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward.

Example:
Input: s = "A man, a plan, a canal: Panama"
Output: true

Time: O(n), Space: O(1)
"""


def is_palindrome(s):
    """
    Two pointers from both ends, skip non-alphanumeric characters
    """
    left, right = 0, len(s) - 1

    while left < right:
        # Skip non-alphanumeric characters
        while left < right and not s[left].isalnum():
            left += 1
        while left < right and not s[right].isalnum():
            right -= 1

        # Compare characters (case insensitive)
        if s[left].lower() != s[right].lower():
            return False

        left += 1
        right -= 1

    return True


# Alternative: Clean string first, then check
def is_palindrome_clean(s):
    """
    Clean the string first, then use two pointers
    """
    # Clean string: keep only alphanumeric and convert to lowercase
    cleaned = "".join(char.lower() for char in s if char.isalnum())

    left, right = 0, len(cleaned) - 1

    while left < right:
        if cleaned[left] != cleaned[right]:
            return False
        left += 1
        right -= 1

    return True


# Test cases
if __name__ == "__main__":
    # Test 1
    s1 = "A man, a plan, a canal: Panama"
    print(f"Valid Palindrome: {is_palindrome(s1)}")  # True

    # Test 2
    s2 = "race a car"
    print(f"Valid Palindrome: {is_palindrome(s2)}")  # False

    # Test 3
    s3 = " "
    print(f"Valid Palindrome: {is_palindrome(s3)}")  # True

    # Test 4
    s4 = "No 'x' in Nixon"
    print(f"Valid Palindrome: {is_palindrome(s4)}")  # True
