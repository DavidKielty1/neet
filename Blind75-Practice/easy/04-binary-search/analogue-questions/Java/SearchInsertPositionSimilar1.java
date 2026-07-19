/*
 * Ported from: 05-binary-search/analogue-questions/Python/search-insert-position-similar1.py
 * --- Original description ---
LeetCode 744: Find Smallest Letter Greater Than Target
Difficulty: Easy
Pattern: Binary Search

Problem:
You are given an array of characters letters that is sorted in non-decreasing order,
and a character target. There are at least two different characters in letters.

Return the smallest character in letters that is lexicographically greater than target.
If such a character does not exist, return the first character in letters.

Example 1:
Input: letters = ["c","f","j"], target = "a"
Output: "c"
Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.

Example 2:
Input: letters = ["c","f","j"], target = "c"
Output: "f"
Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.

Example 3:
Input: letters = ["x","x","y","y"], target = "z"
Output: "x"
Explanation: There are no characters in letters that is lexicographically greater than 'z'
so we return letters[0].

Constraints:
- 2 <= letters.length <= 10^4
- letters[i] is a lowercase English letter
- letters is sorted in non-decreasing order
- letters contains at least two different characters
- target is a lowercase English letter

Time Complexity: O(log n)
Space Complexity: O(1)
 */

import java.util.*;
import java.util.function.*;


public class SearchInsertPositionSimilar1 {
    public String nextGreatestLetter(List<String> letters, String target) {
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

    // left, right = (0, len(letters) - 1)
    // while left <= right:
    // mid = left + (right - left) // 2
    // if letters[mid] <= target:
    // left = mid + 1
    // else:
    // right = mid - 1
    // return letters[left % len(letters)]

        throw new UnsupportedOperationException("Implement nextGreatestLetter");
    }

    

    public static void main(String[] args) {
        SearchInsertPositionSimilar1 sol = new SearchInsertPositionSimilar1();
        assert (sol.nextGreatestLetter(java.util.List.of("c", "f", "j"), "a") == "c");
        System.out.println("✓ Test case 1 passed");
        assert (sol.nextGreatestLetter(java.util.List.of("c", "f", "j"), "c") == "f");
        System.out.println("✓ Test case 2 passed");
        assert (sol.nextGreatestLetter(java.util.List.of("x", "x", "y", "y"), "z") == "x");
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
