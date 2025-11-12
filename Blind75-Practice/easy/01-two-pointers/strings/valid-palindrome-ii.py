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


def valid_palindrome(s: str) -> bool:
    """
    Simplest approach: Two pointers with helper function
    When characters don't match, try deleting either left or right character

    if comparison fails, do helper function either left or right without a fail-safe i.e. return False if error

    Remember return
    """

    def retry(left, right):
        while left < right:
            if s[left] != s[right]:
                return False

            left += 1
            right -= 1

        return True

    left, right = 0, len(s) - 1

    while left < right:
        if s[left] != s[right]:
            return retry(left + 1, right) or retry(left, right - 1)

        left += 1
        right -= 1

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
