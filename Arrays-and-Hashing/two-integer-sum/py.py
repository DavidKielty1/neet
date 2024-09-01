from typing import List, Dict

class Solution:
    def two_sum(self, nums: List[int], target: int) -> List[int]:
        map: Dict[int, int] = {} # Dictionary 

        for i, num in enumerate(nums):
            complement = target - num

            if complement in map:
                return [map[complement], i]

            # Store the current number and its index in the dictionary
            map[num] = i

        return []  # Return an empty list if no solution is found

# Usage example
sol = Solution()
print(sol.two_sum([3, 4, 5, 6], 7))  # Output: [0, 1]
print(sol.two_sum([4, 5, 6], 10))    # Output: [0, 2]
print(sol.two_sum([5, 5], 10))       # Output: [0, 1]