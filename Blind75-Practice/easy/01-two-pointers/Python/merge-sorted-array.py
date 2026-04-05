"""
LeetCode 88: Merge Sorted Array
Difficulty: Easy
Pattern: Two Pointers

Merge nums1 and nums2 into nums1 in non-decreasing order. nums1 has length m + n with trailing
zeros; nums2 has length n.

Approach: Fill from the end to avoid overwriting unmerged elements in nums1.

Time Complexity: O(m + n)
Space Complexity: O(1) extra
"""

from typing import List


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        i, j, k = m - 1, n - 1, m + n - 1
        while j >= 0:
            if i >= 0 and nums1[i] > nums2[j]:
                nums1[k] = nums1[i]
                i -= 1
            else:
                nums1[k] = nums2[j]
                j -= 1
            k -= 1


if __name__ == "__main__":
    s = Solution()
    a = [1, 2, 3, 0, 0, 0]
    s.merge(a, 3, [2, 5, 6], 3)
    assert a == [1, 2, 2, 3, 5, 6]
    b = [1]
    s.merge(b, 1, [], 0)
    assert b == [1]
    c = [0]
    s.merge(c, 0, [1], 1)
    assert c == [1]
    print("All test cases passed!")
