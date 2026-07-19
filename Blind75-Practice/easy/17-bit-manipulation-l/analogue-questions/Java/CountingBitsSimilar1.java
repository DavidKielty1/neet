/*
 * Ported from: 12-bit-manipulation/analogue-questions/Python/counting-bits-similar1.py
 * --- Original description ---
Similar Problem 1: Sort Integers by Number of 1 Bits
Difficulty: Easy
Pattern: Bit Manipulation

Problem:
You are given an integer array arr. Sort the integers in the array in ascending order
by the number of 1's in their binary representation and in case of two or more integers
have the same number of 1's you have to sort them in ascending order.

Return the array after sorting it.

Example 1:
Input: arr = [0,1,2,3,4,5,6,7,8]
Output: [0,1,2,4,8,3,5,6,7]
Explanation: [0] has 0 ones, [1,2,4,8] have 1 one, [3,5,6] have 2 ones, [7] has 3 ones

Example 2:
Input: arr = [1024,512,256,128,64,32,16,8,4,2,1]
Output: [1,2,4,8,16,32,64,128,256,512,1024]

Constraints:
- 1 <= arr.length <= 500
- 0 <= arr[i] <= 10^4
 */

import java.util.*;
import java.util.function.*;


public class CountingBitsSimilar1 {
    public List<Integer> sortByBits(List<Integer> arr) {
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

    // def count_ones(n):
    // count = 0
    // while n:
    // n &= n - 1
    // count += 1
    // return count
    // return sorted(arr, key=lambda x: (count_ones(x), x))

        throw new UnsupportedOperationException("Implement sortByBits");
    }

    

    public static void main(String[] args) {
        CountingBitsSimilar1 sol = new CountingBitsSimilar1();
        assert java.util.Objects.equals(sol.sortByBits(java.util.List.of(0, 1, 2, 3, 4, 5, 6, 7, 8)), java.util.List.of(0, 1, 2, 4, 8, 3, 5, 6, 7));
        System.out.println("✓ Test case 1 passed");
        assert java.util.Objects.equals(sol.sortByBits(java.util.List.of(1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1)), java.util.List.of(1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024));
        System.out.println("✓ Test case 2 passed");
        System.out.println("\nAll test cases passed!");
    }
}
