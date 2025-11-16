"""
Similar Problem 2: Binary Watch
Difficulty: Easy
Pattern: Bit Manipulation

Problem:
A binary watch has 4 LEDs on the top to represent hours (0-11), and 6 LEDs on the bottom
to represent minutes (0-59). Each LED represents a zero or one, with the least significant bit on the right.

Given an integer turnedOn which represents the number of LEDs that are currently on,
return all possible times the watch could represent.

Example 1:
Input: turnedOn = 1
Output: ["0:01","0:02","0:04","0:08","0:16","0:32","1:00","2:00","4:00","8:00"]

Example 2:
Input: turnedOn = 9
Output: []
Explanation: No valid time has 9 LEDs on

Constraints:
- 0 <= turnedOn <= 10
"""

from typing import List


class Solution:
    def readBinaryWatch(self, turnedOn: int) -> List[str]:
        """
        Approach: Count bits for all valid times

        Strategy:
        1. Iterate through all valid hours (0-11) and minutes (0-59)
        2. Count total 1 bits in hour and minute
        3. If count equals turnedOn, add to result
        """

        def count_bits(n):
            count = 0
            while n:
                count += n & 1
                n >>= 1
            return count

        result = []

        for hour in range(12):
            for minute in range(60):
                if count_bits(hour) + count_bits(minute) == turnedOn:
                    result.append(f"{hour}:{minute:02d}")

        return result


# Alternative: Using built-in
class SolutionBuiltin:
    def readBinaryWatch(self, turnedOn: int) -> List[str]:
        result = []

        for hour in range(12):
            for minute in range(60):
                if bin(hour).count("1") + bin(minute).count("1") == turnedOn:
                    result.append(f"{hour}:{minute:02d}")

        return result


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    result1 = solution.readBinaryWatch(1)
    expected1 = [
        "0:01",
        "0:02",
        "0:04",
        "0:08",
        "0:16",
        "0:32",
        "1:00",
        "2:00",
        "4:00",
        "8:00",
    ]
    assert sorted(result1) == sorted(expected1)
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.readBinaryWatch(9) == []
    print("✓ Test case 2 passed")

    print("\nAll test cases passed!")
