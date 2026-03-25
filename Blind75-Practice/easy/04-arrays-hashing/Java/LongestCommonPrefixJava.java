/*
14. Longest Common Prefix
Difficulty: Easy
Pattern: String

Problem:
Given an array of strings strs, return the longest common prefix shared by all strings.
If there is no common prefix among them, return the empty string "".

Notes:
- Compare character by character across all strings (vertical scan), or use the shortest
  string as a bound.
- strs can be empty on some platforms; handle per constraints.

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"
Explanation: All strings share "fl"; the next character differs (o vs i).

Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: The first characters already differ: 'd' vs 'r' vs 'c'.

Example 3:
Input: strs = ["interspecies","interstellar","interstate"]
Output: "inters"
Explanation: Common prefix is "inters" before strings diverge.

Time: O(S) where S is the sum of all characters, Space: O(1) excluding the output string
*/
public class LongestCommonPrefixJava {

    public String longestCommonPrefix(String[] strs) {
        //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

    

        // if (strs == null || strs.length == 0) {
        //     return "";
        // }
        // String first = strs[0];
        // for (int i = 0; i < first.length(); i++) {
        //     char c = first.charAt(i);
        //     for (int j = 1; j < strs.length; j++) {
        //         if (i >= strs[j].length() || strs[j].charAt(i) != c) {
        //             return first.substring(0, i);
        //         }
        //     }
        // }
        // return first;

        throw new UnsupportedOperationException("Implement longestCommonPrefix");
    }

    public static void main(String[] args) {
        LongestCommonPrefixJava s = new LongestCommonPrefixJava();
        assert s.longestCommonPrefix(new String[] {"flower", "flow", "flight"}).equals("fl");
        assert s.longestCommonPrefix(new String[] {"dog", "racecar", "car"}).equals("");
        assert s.longestCommonPrefix(new String[] {"ab", "a"}).equals("a");
        assert s.longestCommonPrefix(new String[] {"", ""}).equals("");
        System.out.println("All test cases passed!");
    }
}
