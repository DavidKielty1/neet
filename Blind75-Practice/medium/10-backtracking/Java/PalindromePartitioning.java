/*
 * 131. Palindrome Partitioning
 * Difficulty: Medium
 * Pattern: Backtracking
 *
 * Problem:
 * Given a string `s`, partition `s` such that every substring of the partition is a
 * palindrome. Return all possible palindrome partitioning of `s`.
 *
 * Example 1:
 * Input: s = "aab"
 * Output: [["a","a","b"],["aa","b"]]
 *
 * Example 2:
 * Input: s = "a"
 * Output: [["a"]]
 *
 * Example 3:
 * Input: s = "efe"
 * Output: [["e","f","e"],["efe"]]
 *
 * Constraints:
 * - 1 <= s.length <= 16
 * - `s` contains only lowercase English letters
 *       
 * Notes:
 * - Try every possible cut starting from the current index.
 * - Only recurse on a substring if it is a palindrome.
 * - Backtracking naturally explores all valid partition boundaries.
 */

import java.util.List;

public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
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
        // List<List<String>> result = new ArrayList<>();
        // backtrack(s, 0, new ArrayList<>(), result);
        // return result;
    
        // backtrack(
        //         String s,
        //         int start,
        //         List<String> path,
        //         List<List<String>> result) {
        //     if (start == s.length()) {
        //         result.add(new ArrayList<>(path));
        //         return;
        //     }
        //
        //     for (int end = start; end < s.length(); end++) {
        //         if (!isPalindrome(s, start, end)) {
        //             continue;
        //         }
        //
        //         path.add(s.substring(start, end + 1));
        //         backtrack(s, end + 1, path, result);
        //         path.remove(path.size() - 1);
        //     }
        // }
        //
        // private boolean isPalindrome(String s, int left, int right) {
        //     while (left < right) {
        //         if (s.charAt(left++) != s.charAt(right--)) {
        //             return false;
        //         }
        //     }
        //     return true;
        // }
    }

    public static void main(String[] args) {
        System.out.println("Practice stub ready for 131. Palindrome Partitioning.");
    }
}
