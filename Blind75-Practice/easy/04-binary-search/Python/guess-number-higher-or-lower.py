"""
374. Guess Number Higher or Lower
Difficulty: Easy
Pattern: Binary Search

Problem:
We are playing the Guess Game. The game is as follows: I pick a number from
1 to n. You have to guess which number I picked. Every time you guess wrong,
I tell you whether the number is higher or lower. You call a pre-defined API
int guess(int num) which returns:
- -1: your guess is higher than the picked number (num > pick)
- 1: your guess is lower than the picked number (num < pick)
- 0: your guess is equal to the picked number (num == pick)
Return the picked number.

Example 1:
Input: n = 10, pick = 6
Output: 6

Example 2:
Input: n = 1, pick = 1
Output: 1

Example 3:
Input: n = 2, pick = 1
Output: 1

Constraints:
- 1 <= n <= 2^31 - 1
- 1 <= pick <= n
"""

# LeetCode provides GuessGame with guess(); this module simulates it for local tests.


class GuessGame:
    def __init__(self, pick: int) -> None:
        self._pick = pick

    def guess(self, num: int) -> int:
        if self._pick < num:
            return -1
        if self._pick > num:
            return 1
        return 0


class Solution(GuessGame):
    def __init__(self, pick: int = 0) -> None:
        super().__init__(pick)

    def guessNumber(self, n: int) -> int:
        lo, hi = 1, n
        while lo <= hi:
            mid = (lo + hi) // 2
            g = self.guess(mid)
            if g == 0:
                return mid
            if g < 0:
                hi = mid - 1
            else:
                lo = mid + 1
        return lo


if __name__ == "__main__":
    for n in (10, 100):
        for pick in (1, n, n // 2):
            sol = Solution(pick)
            assert sol.guessNumber(n) == pick
    print("All test cases passed!")
