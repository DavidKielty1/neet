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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for (String str : strs) {
            int[] counts = new int[26];
            for (char ch : str.toCharArray()) {
                counts[ch - 'a']++;
            }
            StringBuilder key = new Stringbuilder();
            for (int i = 0; i < 26; i++) {
                key.append('#').append(counts[i]);
            }

            groups.computeIfAbsent(key, key -> new ArrayList<>()).add(str);
        }

        List<List<String>> ans = new ArrayList<>();
        for (Map.Entry<String, List<String>> e : groups.entrySet()) {
            ans.add(e.getValue());
        }

        return new ArrayList<>(groups.values());

        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
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

        // Alternatively:
        // List<List<String>> ans = new ArrayList<>();
        // for (Map.Entry<String, List<String>> e : groups.entrySet()) {
        //     ans.add(e.getValue());
        // }

        // for (List<String> group : groups.values()) {
        //     ans.add(group);
        // }

    }

    public static void main(String[] args) {
        System.out.println("Implement tests.");
    }
}
