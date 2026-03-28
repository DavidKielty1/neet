/*
392. Is Subsequence
Difficulty: Easy
Pattern: Two Pointers

Problem:
Given strings s and t, return true if s is a subsequence of t: you can delete zero or more
characters from t (without reordering what remains) so that the result equals s. Equivalently,
all characters of s appear in t in the same left-to-right order (not necessarily contiguous).

Notes:
- An empty s is typically a subsequence of any t (check problem statement on your platform).
- Greedy: advance through s as you scan t, matching the next needed character.

Example 1:
Input: s = "abc", t = "ahbgdc"
Output: true
Explanation: Match 'a', then 'b', then 'c' in order within t.

Example 2:
Input: s = "axc", t = "ahbgdc"
Output: false
Explanation: After matching 'a', the next character 'x' never appears in the rest of t.

Example 3:
Input: s = "", t = "ahbgdc"
Output: true
Explanation: Empty string is a subsequence of any string.

Time: O(|t|), Space: O(1)
*/
public class IsSubsequenceJava {

    public boolean isSubsequence(String s, String t) {
        int si = 0;
        for (int ti = 0; ti < t.length(); ti++)  {
            if (si <= s.length() && s.charAt(si) == t.charAt(ti)) {
                si++;
            }
        }
        return si == s.length();
        //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

    

        // if (s.isEmpty()) {
        //     return true;
        // }
        // int si = 0;
        // for (int ti = 0; ti < t.length(); ti++) {
        //     if (si < s.length() && t.charAt(ti) == s.charAt(si)) {
        //         si++;
        //     }
        // }
        // return si == s.length();
    }

    public static void main(String[] args) {
        IsSubsequenceJava sol = new IsSubsequenceJava();
        assert sol.isSubsequence("abc", "ahbgdc");
        assert !sol.isSubsequence("axc", "ahbgdc");
        assert sol.isSubsequence("", "ahbgdc");
        assert !sol.isSubsequence("abc", "");
        System.out.println("All test cases passed!");
    }
}
