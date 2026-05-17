/*
 * 140. Word Break II
 * Difficulty: Hard
 * Pattern: Backtracking and memoization
 *
 * Problem:
 * Given a string s and a dictionary of strings wordDict, add spaces in s to
 * construct a sentence where each word is a valid dictionary word. Return all
 * such possible sentences in any order.
 *
 * The same word in the dictionary may be reused multiple times.
 *
 * Example 1:
 * Input: s = "catsanddog", wordDict = ["cat","cats","and","sand","dog"]
 * Output: ["cats and dog","cat sand dog"]
 *
 * Example 2:
 * Input: s = "pineapplepenapple", wordDict = ["apple","pen","applepen","pine","pineapple"]
 * Output: ["pine apple pen apple","pineapple pen apple","pine applepen apple"]
 *
 * Example 3:
 * Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
 * Output: []
 *
 * Constraints:
 * - 1 <= s.length <= 20
 * - 1 <= wordDict.length <= 1000
 * - 1 <= wordDict[i].length <= 10
 * - s and wordDict[i] consist of lowercase English letters
 * - All strings in wordDict are unique
 */
public class WordBreakII {
    static class Solution {
        public java.util.List<String> wordBreak(String s, java.util.List<String> wordDict) {
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
            //

            // Set<String> words = new HashSet<>(wordDict);
            // return dfs(s, 0, words, new HashMap<>());
            throw new UnsupportedOperationException("Implement wordBreak");
        }

        // private List<String> dfs(String s, int start, Set<String> words,
        //         Map<Integer, List<String>> memo) {
        //     if (memo.containsKey(start)) {
        //         return memo.get(start);
        //     }
        //     List<String> result = new ArrayList<>();
        //     if (start == s.length()) {
        //         result.add("");
        //         return result;
        //     }
        //     for (int end = start + 1; end <= s.length(); end++) {
        //         String prefix = s.substring(start, end);
        //         if (!words.contains(prefix)) {
        //             continue;
        //         }
        //         for (String suffix : dfs(s, end, words, memo)) {
        //             result.add(prefix + (suffix.isEmpty() ? "" : " " + suffix));
        //         }
        //     }
        //     memo.put(start, result);
        //     return result;
        // }
    }

    public static void main(String[] args) {
        System.out.println("Practice stub ready. Implement wordBreak and add checks.");
    }
}
