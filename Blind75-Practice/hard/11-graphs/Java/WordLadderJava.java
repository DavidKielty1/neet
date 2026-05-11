/*
 * 127. Word Ladder
 * Difficulty: Hard
 * Pattern: Graph BFS
 *
 * Problem:
 * A transformation sequence from beginWord to endWord using a dictionary wordList
 * is a sequence of words beginWord -> s1 -> s2 -> ... -> endWord such that:
 * - Every adjacent pair of words differs by a single letter.
 * - Every si for 1 <= i <= k is in wordList.
 * - endWord is in wordList.
 *
 * Given beginWord, endWord, and wordList, return the number of words in the
 * shortest transformation sequence. If no such sequence exists, return 0.
 *
 * Example 1:
 * Input: beginWord = "hit", endWord = "cog",
 * wordList = ["hot","dot","dog","lot","log","cog"]
 * Output: 5
 *
 * Example 2:
 * Input: beginWord = "hit", endWord = "cog",
 * wordList = ["hot","dot","dog","lot","log"]
 * Output: 0
 *
 * Constraints:
 * - 1 <= beginWord.length <= 10
 * - endWord.length == beginWord.length
 * - 1 <= wordList.length <= 5000
 * - wordList[i].length == beginWord.length
 * - beginWord, endWord, and wordList[i] consist of lowercase English letters
 * - beginWord != endWord
 * - All words in wordList are unique
 */
public class WordLadderJava {
    static class Solution {
        public int ladderLength(String beginWord, String endWord, java.util.List<String> wordList) {
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

            // Set<String> words = new HashSet<>(wordList);
            // if (!words.contains(endWord)) {
            //     return 0;
            // }
            //
            // Queue<String> queue = new ArrayDeque<>();
            // queue.offer(beginWord);
            // int steps = 1;
            //
            // while (!queue.isEmpty()) {
            //     for (int size = queue.size(); size > 0; size--) {
            //         String word = queue.poll();
            //         if (word.equals(endWord)) {
            //             return steps;
            //         }
            //         char[] chars = word.toCharArray();
            //         for (int i = 0; i < chars.length; i++) {
            //             char original = chars[i];
            //             for (char c = 'a'; c <= 'z'; c++) {
            //                 chars[i] = c;
            //                 String next = new String(chars);
            //                 if (words.remove(next)) {
            //                     queue.offer(next);
            //                 }
            //             }
            //             chars[i] = original;
            //         }
            //     }
            //     steps++;
            // }
            //
            // return 0;
            throw new UnsupportedOperationException("Implement ladderLength");
        }
    }

    public static void main(String[] args) {
        System.out.println("Practice stub ready. Implement ladderLength and add checks.");
    }
}
