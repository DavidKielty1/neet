import java.util.HashMap;
import java.util.Map;

/*
205. Isomorphic Strings
Difficulty: Easy
Pattern: Arrays & Hashing

Bijection between characters of s and t (same length, ASCII).

Time: O(n), Space: O(1) — bounded by charset
*/
public class IsomorphicStringsJava {

    public boolean isIsomorphic(String s, String t) {
        //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

    

        // Map<Character, Character> sToT = new HashMap<>();
        // Map<Character, Character> tToS = new HashMap<>();
        // for (int i = 0; i < s.length(); i++) {
        //     char cs = s.charAt(i);
        //     char ct = t.charAt(i);
        //     if (sToT.containsKey(cs)) {
        //         if (sToT.get(cs) != ct) {
        //             return false;
        //         }
        //     } else {
        //         sToT.put(cs, ct);
        //     }
        //     if (tToS.containsKey(ct)) {
        //         if (tToS.get(ct) != cs) {
        //             return false;
        //         }
        //     } else {
        //         tToS.put(ct, cs);
        //     }
        // }
        // return true;

        throw new UnsupportedOperationException("Implement isIsomorphic");
    }

    public static void main(String[] args) {
        IsomorphicStringsJava s = new IsomorphicStringsJava();
        assert s.isIsomorphic("egg", "add");
        assert !s.isIsomorphic("foo", "bar");
        assert s.isIsomorphic("paper", "title");
        assert !s.isIsomorphic("badc", "baba");
        System.out.println("All test cases passed!");
    }
}
