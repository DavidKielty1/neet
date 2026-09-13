/*
 * 269. Alien Dictionary
 * Difficulty: Hard
 * Pattern: Topological sort
 *
 * Problem:
 * There is a new alien language that uses the English alphabet, but the order
 * among the letters is unknown.
 *
 * You are given a list of strings words from the alien language's dictionary,
 * sorted lexicographically by the rules of this new language.
 *
 * Return a string of the unique letters in the new alien language sorted in
 * lexicographically increasing order by the new language's rules. If there is no
 * valid ordering, return "". If there are multiple valid orderings, return any.
 *
 * Example 1:
 * Input: words = ["wrt","wrf","er","ett","rftt"]
 * Output: "wertf"
 *
 * Example 2:
 * Input: words = ["z","x"]
 * Output: "zx"
 *
 * Example 3:
 * Input: words = ["z","x","z"]
 * Output: ""
 *
 * Constraints:
 * - 1 <= words.length <= 100
 * - 1 <= words[i].length <= 100
 * - words[i] consists of lowercase English letters
 */
public class AlienDictionary {
    public String alienOrder(String[] words) {
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //

    // Map<Character, Set<Character>> graph = new HashMap<>();
    // Map<Character, Integer> indegree = new HashMap<>();
    // for (String word : words) {
    //     for (char c : word.toCharArray()) {
    //         graph.putIfAbsent(c, new HashSet<>());
    //         indegree.putIfAbsent(c, 0);
    //     }
    // }
    //
    // for (int i = 0; i + 1 < words.length; i++) {
    //     String first = words[i];
    //     String second = words[i + 1];
    //     if (first.length() > second.length() && first.startsWith(second)) {
    //         return "";
    //     }
    //     for (int j = 0; j < Math.min(first.length(), second.length()); j++) {
    //         char from = first.charAt(j);
    //         char to = second.charAt(j);
    //         if (from != to) {
    //             if (graph.get(from).add(to)) {
    //                 indegree.put(to, indegree.get(to) + 1);
    //             }
    //             break;
    //         }
    //     }
    // }
    //
    // Queue<Character> queue = new ArrayDeque<>();
    // for (Map.Entry<Character, Integer> entry : indegree.entrySet()) {
    //     if (entry.getValue() == 0) {
    //         queue.offer(entry.getKey());
    //     }
    // }
    //
    // StringBuilder order = new StringBuilder();
    // while (!queue.isEmpty()) {
    //     char current = queue.poll();
    //     order.append(current);
    //     for (char next : graph.get(current)) {
    //         indegree.put(next, indegree.get(next) - 1);
    //         if (indegree.get(next) == 0) {
    //             queue.offer(next);
    //         }
    //     }
    // }
    //
    // return order.length() == indegree.size() ? order.toString() : "";
        throw new UnsupportedOperationException("Implement alienOrder");
    }
    

    public static void main(String[] args) {
        System.out.println("Practice stub ready. Implement alienOrder and add checks.");
    }
}
