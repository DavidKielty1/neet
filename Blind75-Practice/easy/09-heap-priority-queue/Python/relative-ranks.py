"""
506. Relative Ranks
Difficulty: Easy
Pattern: Heap / Sorting

Problem:
You are given an integer array score of size n, where score[i] is the score of
the ith athlete in a competition. All the scores are guaranteed to be unique.
Athletes are placed by score: 1st place has the highest score, 2nd place the
second highest, and so on. Return an array answer of size n where answer[i] is
the rank of the ith athlete: "Gold Medal" for 1st, "Silver Medal" for 2nd,
"Bronze Medal" for 3rd, and the placement number as a string for every remaining
athlete.

Example 1:
Input: score = [5,4,3,2,1]
Output: ["Gold Medal","Silver Medal","Bronze Medal","4","5"]

Example 2:
Input: score = [10,3,8,9,4]
Output: ["Gold Medal","5","Bronze Medal","Silver Medal","4"]

Constraints:
- n == score.length
- 1 <= n <= 10^4
- 0 <= score[i] <= 10^6
- All the values of score are unique
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
