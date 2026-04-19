"""
LeetCode 374: Guess Number Higher or Lower
Difficulty: Easy
Pattern: Binary Search

Pick a number from 1..n; API guess(num) returns -1 if pick < num, 1 if pick > num, 0 if equal.

Approach: Standard binary search on [1, n].

Time Complexity: O(log n) guesses
Space Complexity: O(1)
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
