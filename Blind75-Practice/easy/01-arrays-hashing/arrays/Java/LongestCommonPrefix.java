/*
 * 14. Longest Common Prefix
 * Difficulty: Easy
 * Pattern: String
 *
 * Problem:
 * Write a function to find the longest common prefix string amongst an array
 * of strings. If there is no common prefix, return an empty string "".
 *
 * Example 1:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 *
 * Example 2:
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 *
 * Constraints:
 * - 1 <= strs.length <= 200
 * - 0 <= strs[i].length <= 200
 * - strs[i] consists of only lowercase English letters if it is non-empty
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
    }


        //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

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

    public static void main(String[] args) {
        LongestCommonPrefix s = new LongestCommonPrefix();
        assert s.longestCommonPrefix(new String[] {"flower", "flow", "flight"}).equals("fl");
        assert s.longestCommonPrefix(new String[] {"dog", "racecar", "car"}).equals("");
        assert s.longestCommonPrefix(new String[] {"ab", "a"}).equals("a");
        assert s.longestCommonPrefix(new String[] {"", ""}).equals("");
        System.out.println("All test cases passed!");
    }
}
