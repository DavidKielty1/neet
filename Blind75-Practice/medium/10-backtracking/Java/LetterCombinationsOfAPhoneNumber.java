/*
 * 17. Letter Combinations of a Phone Number
 * Difficulty: Medium
 * Pattern: Backtracking
 *
 * Problem:
 * Given a string containing digits from `2` to `9` inclusive, return all possible
 * letter combinations that the number could represent. Return the answer in any order.
 *
 * A mapping of digits to letters, like on a telephone keypad, is given below. Note that
 * `1` does not map to any letters.
 *
 * 2 -> "abc"
 * 3 -> "def"
 * 4 -> "ghi"
 * 5 -> "jkl"
 * 6 -> "mno"
 * 7 -> "pqrs"
 * 8 -> "tuv"
 * 9 -> "wxyz"
 *
 * Example 1:
 * Input: digits = "23"
 * Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
 *
 * Example 2:
 * Input: digits = ""
 * Output: []
 *
 * Example 3:
 * Input: digits = "2"
 * Output: ["a","b","c"]
 *
 * Constraints:
 * - 0 <= digits.length <= 4
 * - `digits[i]` is a digit in the range ['2', '9']
 *
 * Notes:
 * - Think of this as one decision per digit.
 * - For each position, branch over every mapped letter and recurse to the next digit.
 * - A `StringBuilder` makes the add/remove step easy during backtracking.
 */

import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
    static class Solution {
        public List<String> letterCombinations(String digits) {
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
            // if (digits.isEmpty()) {
            //     return new ArrayList<>();
            // }
            //
            // String[] map = {
            //     "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
            // };
            // List<String> result = new ArrayList<>();
            // backtrack(digits, 0, map, new StringBuilder(), result);
            // return result;
            //
            // private void backtrack(
            //         String digits,
            //         int index,
            //         String[] map,
            //         StringBuilder path,
            //         List<String> result) {
            //     if (index == digits.length()) {
            //         result.add(path.toString());
            //         return;
            //     }
            //
            //     String letters = map[digits.charAt(index) - '0'];
            //     for (int i = 0; i < letters.length(); i++) {
            //         path.append(letters.charAt(i));
            //         backtrack(digits, index + 1, map, path, result);
            //         path.deleteCharAt(path.length() - 1);
            //     }
            // }
        }
    }

    public static void main(String[] args) {
        System.out.println("Practice stub ready for 17. Letter Combinations of a Phone Number.");
    }
}
