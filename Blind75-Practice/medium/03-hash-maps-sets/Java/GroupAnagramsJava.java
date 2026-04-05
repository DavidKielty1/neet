/*
49. Group Anagrams
Difficulty: Medium
Pattern: Hash Maps & Arrays

Problem:
Given an array of strings strs, group the anagrams together. You may return the answer in
any order.

An anagram is formed by rearranging the letters of a word using all original letters
exactly once.

Example 1:
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Example 2:
Input: strs = [""]
Output: [[""]]

Example 3:
Input: strs = ["a"]
Output: [["a"]]

Time: O(n * m) where n = number of strings, m = average length; Space: O(n * m)
*/
import java.util.ArrayList;
import java.util.List;

public class GroupAnagramsJava {
    public List<List<String>> groupAnagrams(String[] strs) {
        //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

    

        // Map<String, List<String>> map = new HashMap<>();
        // for (String s : strs) {
        //     char[] ca = s.toCharArray();
        //     Arrays.sort(ca);
        //     String key = String.valueOf(ca);
        //     map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        // }
        // return new ArrayList<>(map.values());

        throw new UnsupportedOperationException("Implement groupAnagrams");
    }

    public static void main(String[] args) {
        GroupAnagramsJava sol = new GroupAnagramsJava();
        List<List<String>> r =
                sol.groupAnagrams(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"});
        assert r.size() == 3;
        System.out.println("All test cases passed!");
    }
}
