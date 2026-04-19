"""
LeetCode 1025: Divisor Game
Difficulty: Easy
Pattern: Dynamic Programming / Math

Problem:
Alice and Bob take turns playing a game, with Alice starting first.

Initially, there is a number n on the chalkboard. On each player's turn, that player makes
a move consisting of:

- Choosing any x with 0 < x < n and n % x == 0.
- Replacing the number n on the chalkboard with n - x.

Also, if a player cannot make a move, they lose the game.

Return true if and only if Alice wins the game, assuming both players play optimally.

Example 1:
Input: n = 2
Output: true
Explanation: Alice chooses 1, Bob is left with 1 and loses.

Example 2:
Input: n = 3
Output: false
Explanation: Alice chooses 1, Bob is left with 2 and wins.

Constraints:
- 1 <= n <= 1000

Time Complexity: O(1) with math trick, O(n^2) with DP
Space Complexity: O(1) with math trick, O(n) with DP
"""


class Solution:
    def divisorGame(self, n: int) -> bool:
        """
        Approach: Math observation

        Strategy:
        1. Alice wins if and only if n is even
        2. This is because:
           - If n is even, Alice can always choose x=1, leaving odd for Bob
           - If n is odd, any divisor is odd, so Alice leaves even for Bob
        3. Player with even number always wins
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

        return n % 2 == 0


# Alternative DP approach
class SolutionDP:
    def divisorGame(self, n: int) -> bool:
        dp = [False] * (n + 1)

        for i in range(2, n + 1):
            for x in range(1, i):
                if i % x == 0 and not dp[i - x]:
                    dp[i] = True
                    break

        return dp[n]


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.divisorGame(2) == True
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.divisorGame(3) == False
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.divisorGame(4) == True
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
