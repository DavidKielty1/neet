"""
Similar Problem 1: First Bad Version
Difficulty: Easy
Pattern: Binary Search

Problem:
You are a product manager and currently leading a team to develop a new product.
Unfortunately, the latest version of your product fails the quality check.
Since each version is developed based on the previous version, all the versions
after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one,
which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which returns whether version is bad.

Example 1:
Input: n = 5, bad = 4
Output: 4
Explanation: call isBadVersion(3) -> false; ca ll isBadVersion(5) -> true;
call isBadVersion(4) -> true; Then 4 is the first bad version.

Example 2:
Input: n = 1, bad = 1
Output: 1

Constraints:
- 1 <= bad <= n <= 2^31 - 1
"""

# Mock API
BAD_VERSION = 0


def isBadVersion(version):
    return version >= BAD_VERSION


class Solution:
    def firstBadVersion(self, n: int) -> int:
        """
        Approach: Binary search to find first bad version

        Strategy:
        1. Use binary search on versions [1, n]
        2. If version is bad, search left half (including current)
        3. If version is good, search right half
        4. Return leftmost bad version
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
                # Bad version, search left (mid could be first)
                right = mid
            else:
                # Good version, search right
                left = mid + 1

        return left


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    BAD_VERSION = 4
    assert solution.firstBadVersion(5) == 4
    print("✓ Test case 1 passed")

    # Test case 2
    BAD_VERSION = 1
    assert solution.firstBadVersion(1) == 1
    print("✓ Test case 2 passed")

    # Test case 3
    BAD_VERSION = 1
    assert solution.firstBadVersion(10) == 1
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
