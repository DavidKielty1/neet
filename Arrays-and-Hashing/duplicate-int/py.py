class Solution:
    def has_duplicate(self, nums):
        unique_nums = set(nums)
        return len(unique_nums) != len(nums)

solution = Solution()
print(solution.has_duplicate([1, 2, 3, 4]))  # Output: False
print(solution.has_duplicate([1, 2, 3, 1]))  # Output: True