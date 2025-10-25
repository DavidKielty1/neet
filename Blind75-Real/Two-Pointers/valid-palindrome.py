"""
125. Valid Palindrome - https://leetcode.com/problems/valid-palindrome/
Difficulty: Easy
Pattern: Two Pointers

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward.

Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

Example 3:
Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.

Time: O(n), Space: O(1)
"""


def is_palindrome(s: str) -> bool:
    """
    Two pointers approach:
    - Use left and right pointers
    - Skip non-alphanumeric characters
    - Compare characters (case-insensitive)
    - Move pointers inward until they meet
    Time: O(n), Space: O(1)
    """
    # TODO: Implement two pointers solution
    pass


def is_palindrome_clean(s: str) -> bool:
    """
    Alternative approach: Clean string first, then check
    Time: O(n), Space: O(n)
    """
    # TODO: Implement string cleaning approach
    pass


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
