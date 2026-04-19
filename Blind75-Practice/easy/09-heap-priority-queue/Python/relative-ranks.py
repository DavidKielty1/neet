"""
LeetCode 506: Relative Ranks
Difficulty: Easy
Pattern: Heap / Sorting

Problem:
You are given an integer array score of size n, where score[i] is the score of the ith
athlete in a competition. All the scores are guaranteed to be unique.

The athletes are placed based on their scores, where the 1st place athlete has the highest
score, the 2nd place athlete has the 2nd highest score, and so on. The placement of each
athlete determines their rank:

- The 1st place athlete's rank is "Gold Medal".
- The 2nd place athlete's rank is "Silver Medal".
- The 3rd place athlete's rank is "Bronze Medal".
- For the 4th place to the nth place athlete, their rank is their placement number (i.e.,
  the xth place athlete's rank is "x").

Return an array answer of size n where answer[i] is the rank of the ith athlete.

Example 1:
Input: score = [5,4,3,2,1]
Output: ["Gold Medal","Silver Medal","Bronze Medal","4","5"]
Explanation: The placements are [1st, 2nd, 3rd, 4th, 5th].

Example 2:
Input: score = [10,3,8,9,4]
Output: ["Gold Medal","5","Bronze Medal","Silver Medal","4"]
Explanation: The placements are [1st, 5th, 3rd, 2nd, 4th].

Constraints:
- n == score.length
- 1 <= n <= 10^4
- 0 <= score[i] <= 10^6
- All the values in score are unique.

Time Complexity: O(n log n)
Space Complexity: O(n)
"""

from typing import List


class Solution:
    def findRelativeRanks(self, score: List[int]) -> List[str]:
        """
        Approach: Sort with indices

        Strategy:
        1. Create list of (score, index) pairs
        2. Sort by score in descending order
        3. Assign ranks based on sorted order
        4. Use medals for top 3
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

        n = len(score)
        result = [""] * n

        # Create list of (score, original_index) and sort
        sorted_scores = sorted(enumerate(score), key=lambda x: x[1], reverse=True)

        medals = ["Gold Medal", "Silver Medal", "Bronze Medal"]

        for rank, (original_idx, _) in enumerate(sorted_scores):
            if rank < 3:
                result[original_idx] = medals[rank]
            else:
                result[original_idx] = str(rank + 1)

        return result


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.findRelativeRanks([5, 4, 3, 2, 1]) == [
        "Gold Medal",
        "Silver Medal",
        "Bronze Medal",
        "4",
        "5",
    ]
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.findRelativeRanks([10, 3, 8, 9, 4]) == [
        "Gold Medal",
        "5",
        "Bronze Medal",
        "Silver Medal",
        "4",
    ]
    print("✓ Test case 2 passed")

    print("\nAll test cases passed!")
