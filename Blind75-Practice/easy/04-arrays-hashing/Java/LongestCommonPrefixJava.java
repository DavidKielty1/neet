/*
14. Longest Common Prefix
Difficulty: Easy
Pattern: String

If no common prefix, return "".

Time: O(n * m), Space: O(1) excluding output
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
