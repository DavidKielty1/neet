"""
LeetCode 278: First Bad Version
Difficulty: Easy
Pattern: Binary Search

Problem:
You are a product manager and currently leading a team to develop a new product.
Unfortunately, the latest version of your product fails the quality check. Since each
version is developed based on the previous version, all the versions after a bad version
are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one,
which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which returns whether version is bad.
Implement a function to find the first bad version. You should minimize the number of
calls to the API.

Example 1:
Input: n = 5, bad = 4
Output: 4
Explanation:
call isBadVersion(3) -> false
call isBadVersion(5) -> true
call isBadVersion(4) -> true
Then 4 is the first bad version.

Example 2:
Input: n = 1, bad = 1
Output: 1

Constraints:
- 1 <= bad <= n <= 2^31 - 1

Time Complexity: O(log n)
Space Complexity: O(1)
"""


# The isBadVersion API is already defined for you.
def isBadVersion(version: int) -> bool:
    """Mock implementation - will be provided by the system"""
    pass


class Solution:
    def firstBadVersion(self, n: int) -> int:
        """
        Approach: Binary search

        Strategy:
        1. Use binary search on versions 1 to n
        2. If mid version is bad, search left half (including mid)
        3. If mid version is good, search right half
        4. Return the leftmost bad version
        """

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        left, right = 1, n

        while left < right:
            mid = left + (right - left) // 2

            if isBadVersion(mid):
                right = mid  # mid might be the first bad version
            else:
                left = mid + 1  # mid is good, so first bad is after

        return left


# Test implementation
class TestAPI:
    def __init__(self, bad_version):
        self.bad_version = bad_version

    def isBadVersion(self, version):
        return version >= self.bad_version


# Test cases
if __name__ == "__main__":
    # Test case 1
    test_api = TestAPI(4)

    # Mock the global isBadVersion
    def isBadVersion(v):
        return test_api.isBadVersion(v)

    solution = Solution()
    assert solution.firstBadVersion(5) == 4
    print("✓ Test case 1 passed")

    # Test case 2
    test_api = TestAPI(1)
    assert solution.firstBadVersion(1) == 1
    print("✓ Test case 2 passed")

    # Test case 3
    test_api = TestAPI(1)
    assert solution.firstBadVersion(10) == 1
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
