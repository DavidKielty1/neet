/*
392. Is Subsequence
Difficulty: Easy
Pattern: Two Pointers

Return true if s can be obtained from t by deleting characters without reordering.

Time: O(t.length()), Space: O(1)
*/
public class IsSubsequenceJava {

    public boolean isSubsequence(String s, String t) {
        //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

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

        throw new UnsupportedOperationException("Implement isSubsequence");
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
