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


# e.g. raceacar
def is_palindrome(s: str) -> bool:
    """
    Clean the string: remove non-alphanumeric, convert to lowercase
    """
    # Method 1: Using char.lower() isalnum() and join()


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
    s4 = "racecar"
    print(f"Valid Palindrome: {is_palindrome(s4)}")  # True
