/*
1768. Merge Strings Alternately
Difficulty: Easy
Pattern: Two Pointers

Alternate characters from word1 and word2, then append the rest of the longer string.

Time: O(n), Space: O(n) for StringBuilder output
*/

public class MergeStringsAlternatelyJava {

    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i < word1.length() && j < word2.length()) {
            result.append(word1.charAt(i++));
            result.append(word2.charAt(j++));
        }
        if (i < word1.length()) {
            result.append(word1.substring(i));
        }
        if (j < word2.length()) {
            result.append(word2.substring(j));
        }
        return result.toString();

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
        MergeStringsAlternatelyJava s = new MergeStringsAlternatelyJava();
        assert s.mergeAlternately("abc", "pqr").equals("apbqcr");
        assert s.mergeAlternately("ab", "pqrs").equals("apbqrs");
        assert s.mergeAlternately("abcd", "pq").equals("apbqcd");
        System.out.println("All test cases passed!");
    }
}
