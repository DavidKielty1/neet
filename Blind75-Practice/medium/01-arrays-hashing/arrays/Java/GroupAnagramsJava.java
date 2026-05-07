/*
 * LeetCode 49. Group Anagrams
 *
 * Given an array of strings strs, group the anagrams together. You can return
 * the answer in any order.
 *
 * Example 1:
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 *
 * Example 2:
 * Input: strs = [""]
 * Output: [[""]]
 *
 * Example 3:
 * Input: strs = ["a"]
 * Output: [["a"]]
 *
 * Constraints:
 * - 1 <= strs.length <= 10000
 * - 0 <= strs[i].length <= 100
 * - strs[i] consists of lowercase English letters
 */
import java.util.List;

public class GroupAnagramsJava {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Create map
        // go through each string in strings
            // for each str create int[26] boxes
            // increment index corresponding to letter
            // user this array as map key
            // ++counter

        // Create array of arrays
        // go through string, create map with key of word,


        // return map -> array, for each key in map,
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        // Count letters for each word and use that count signature as the key.
        //
        // Map<String, List<String>> groups = new HashMap<>();
        // for (String word : strs) {
        //     int[] counts = new int[26];
        //     for (char ch : word.toCharArray()) {
        //         counts[ch - 'a']++;
        //     }
        //     StringBuilder key = new StringBuilder();
        //     for (int count : counts) {
        //         key.append('#').append(count);
        //     }
        //     groups.computeIfAbsent(key.toString(), k -> new ArrayList<>())
        //             .add(word);
        // }
        // return new ArrayList<>(groups.values());
    }

    public static void main(String[] args) {
        System.out.println("Implement tests.");
    }
}
