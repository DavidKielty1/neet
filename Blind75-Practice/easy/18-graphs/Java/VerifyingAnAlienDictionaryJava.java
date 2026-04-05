/*
953. Verifying an Alien Dictionary
Difficulty: Easy
Pattern: Graphs / custom ordering

Given words and permutation order of a-z, check if words are sorted in that order.

Time: O(total chars), Space: O(1) for rank array
*/
public class VerifyingAnAlienDictionaryJava {

    public boolean isAlienSorted(String[] words, String order) {
        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        // int[] rank = new int[26];
        // for (int i = 0; i < order.length(); i++) {
            // rank[order.charAt(i) - 'a'] = i;
        // }
        // for (int w = 0; w < words.length - 1; w++) {
            // String a = words[w];
            // String b = words[w + 1];
            // if (!lessOrEqual(a, b, rank)) {
                // return false;
            // }
        // }
        // return true;

        throw new UnsupportedOperationException("Implement isAlienSorted");
    }

    // Outline: first differing char must have lower rank in a; if a is longer prefix of b, invalid
    private boolean lessOrEqual(String a, String b, int[] rank) {
        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        // int n = Math.min(a.length(), b.length());
        // for (int i = 0; i < n; i++) {
            // char ca = a.charAt(i);
            // char cb = b.charAt(i);
            // if (ca != cb) {
                // return rank[ca - 'a'] <= rank[cb - 'a'];
            // }
        // }
        // return a.length() <= b.length();

        throw new UnsupportedOperationException("Implement lessOrEqual");
    }

    public static void main(String[] args) {
        VerifyingAnAlienDictionaryJava sol = new VerifyingAnAlienDictionaryJava();
        assert sol.isAlienSorted(
                new String[] {"hello", "leetcode"}, "hlabcdefgijkmnopqrstuvwxyz");
        assert !sol.isAlienSorted(
                new String[] {"word", "world", "row"}, "worldabcefghijkmnpqstuvxyz");
        assert !sol.isAlienSorted(
                new String[] {"apple", "app"}, "abcdefghijklmnopqrstuvwxyz");
        System.out.println("All tests passed.");
    }
}
