/*
LeetCode 1768: Merge Strings Alternately
Difficulty: Easy
Pattern: Two Pointers

Problem:
You are given two strings, `word1` and `word2`. Merge the strings by adding
letters in alternating order, starting with `word1`.

If one string is longer than the other, append the additional letters onto the
end of the merged string.

Example 1:
Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: Take one character from each string in turn.

Example 2:
Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: After alternating "a/p" and "b/q", append the remaining "rs".

Example 3:
Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"
Explanation: After alternating "a/p" and "b/q", append the remaining "cd".

Time Complexity: O(n + m)
Space Complexity: O(n + m)
*/

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {


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

        // StringBuilder result = new StringBuilder();
        // int i = 0;
        // int j = 0;
        // while (i < word1.length() && j < word2.length()) {
        //     result.append(word1.charAt(i++));
        //     result.append(word2.charAt(j++));
        // }
        // if (i < word1.length()) {
        //     result.append(word1.substring(i));
        // }
        // if (j < word2.length()) {
        //     result.append(word2.substring(j));
        // }
        // return result.toString();
    }

    public static void main(String[] args) {
        MergeStringsAlternately s = new MergeStringsAlternately();
        assert s.mergeAlternately("abc", "pqr").equals("apbqcr");
        assert s.mergeAlternately("ab", "pqrs").equals("apbqrs");
        assert s.mergeAlternately("abcd", "pq").equals("apbqcd");
        System.out.println("All test cases passed!");
    }
}
