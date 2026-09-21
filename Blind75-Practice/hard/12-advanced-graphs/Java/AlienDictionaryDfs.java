/*
 * 269. Alien Dictionary
 * Difficulty: Hard
 * Pattern: Topological sort / DFS
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
 *
 * Notes:
 * - Build the same precedence graph as the BFS / Kahn version.
 * - visit: missing = unseen, true = on the current path, false = finished.
 * - If a node is already in visit, return that flag (true means cycle).
 * - Append a letter after its successors, then reverse for one valid order.
 */

public class AlienDictionaryDfs {
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
    //
    //
    //
    //

    // Map<Character, Set<Character>> graph = new HashMap<>();
    // for (String word : words) {
    //     for (char letter : word.toCharArray()) {
    //         graph.putIfAbsent(letter, new HashSet<>());
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
    //             graph.get(from).add(to);
    //             break;
    //         }
    //     }
    // }
    //
    // Map<Character, Boolean> visit = new HashMap<>();
    // StringBuilder order = new StringBuilder();
    // for (char letter : graph.keySet()) {
    //     if (hasCycle(letter, graph, visit, order)) {
    //         return "";
    //     }
    // }
    // return order.reverse().toString();
    //
    // private boolean hasCycle(char node, Map<Character, Set<Character>> graph,
    //         Map<Character, Boolean> visit, StringBuilder order) {
    
    //     if (visit.containsKey(node)) {
    //         return visit.get(node);
    //     }
    //     visit.put(node, true);
    //     for (char next : graph.get(node)) {
    //         if (hasCycle(next, graph, visit, order)) {
    //             return true;
    //         }
    //     }
    //     visit.put(node, false);
    //     order.append(node);
    //     return false;
    // }
        throw new UnsupportedOperationException("Implement alienOrder");
    }

    public static void main(String[] args) {
        System.out.println("Practice stub ready. Implement alienOrder and add checks.");
    }
}
