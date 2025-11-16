"""
LeetCode 1646: Get Maximum in Generated Array
Difficulty: Easy
Pattern: Dynamic Programming

Problem:
You are given an integer n. A 0-indexed integer array nums of length n + 1 is generated
in the following way:

- nums[0] = 0
- nums[1] = 1
- nums[2 * i] = nums[i] when 2 <= 2 * i <= n
- nums[2 * i + 1] = nums[i] + nums[i + 1] when 2 <= 2 * i + 1 <= n

Return the maximum integer in the array nums​​​.

Example 1:
Input: n = 7
Output: 3
Explanation: According to the given rules:
  nums[0] = 0
  nums[1] = 1
  nums[(1 * 2) = 2] = nums[1] = 1
  nums[(1 * 2) + 1 = 3] = nums[1] + nums[2] = 1 + 1 = 2
  nums[(2 * 2) = 4] = nums[2] = 1
  nums[(2 * 2) + 1 = 5] = nums[2] + nums[3] = 1 + 2 = 3
  nums[(3 * 2) = 6] = nums[3] = 2
  nums[(3 * 2) + 1 = 7] = nums[3] + nums[4] = 2 + 1 = 3
Hence, nums = [0,1,1,2,1,3,2,3], and the maximum is max(nums) = 3.

Example 2:
Input: n = 2
Output: 1

Example 3:
Input: n = 3
Output: 2

Constraints:
- 0 <= n <= 100

Time Complexity: O(n)
Space Complexity: O(n)
"""


class Solution:
    def getMaximumGenerated(self, n: int) -> int:
        """
        Approach: Build array following rules

        Strategy:
        1. Create array of size n+1
        2. Follow generation rules
        3. Return maximum value
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

        if n == 0:
            return 0
        if n == 1:
            return 1

        nums = [0] * (n + 1)
        nums[1] = 1

        for i in range(2, n + 1):
            if i % 2 == 0:
                nums[i] = nums[i // 2]
            else:
                nums[i] = nums[i // 2] + nums[i // 2 + 1]

        return max(nums)


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.getMaximumGenerated(7) == 3
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.getMaximumGenerated(2) == 1
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.getMaximumGenerated(3) == 2
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
