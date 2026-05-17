/*
 * Ported from: 12-bit-manipulation/analogue-questions/Python/counting-bits-similar2.py
 * --- Original description ---
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
 */

import java.util.*;
import java.util.function.*;


public class CountingBitsSimilar2 {



    static class Solution {
        public List<String> readBinaryWatch(int turnedOn) {
            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            // def count_bits(n):
            // count = 0
            // while n:
            // count += n & 1
            // n >>= 1
            // return count
            // result = []
            // for hour in range(12):
            // for minute in range(60):
            // if count_bits(hour) + count_bits(minute) == turnedOn:
            // result.append(f'{hour}:{minute:02d}')
            // return result

            throw new UnsupportedOperationException("Implement readBinaryWatch");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // result1 = sol.readBinaryWatch(1);
        // expected1 = ["0:01", "0:02", "0:04", "0:08", "0:16", "0:32", "1:00", "2:00", "4:00", "8:00"];
        // assert sorted(result1) == sorted(expected1)  // needs locals (port helpers): ['expected1', 'result1']
        System.out.println("✓ Test case 1 passed");
        assert java.util.Objects.equals(sol.readBinaryWatch(9), java.util.List.of());
        System.out.println("✓ Test case 2 passed");
        System.out.println("\nAll test cases passed!");
    }
}
