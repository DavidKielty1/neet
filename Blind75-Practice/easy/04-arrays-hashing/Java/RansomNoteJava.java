/*
383. Ransom Note
Difficulty: Easy
Pattern: Arrays & Hashing

Return true if ransomNote can be built from magazine (each magazine letter once).

Example 1:
Input: ransomNote = "a", magazine = "b"
Output: false
Hint: Magazine has no 'a'; think “consume” counts from a letter pool.

Example 2:
Input: ransomNote = "aa", magazine = "aab"
Output: true
Hint: Two 'a's available after counting magazine; decrement as you spell the note.

Time: O(m + n), Space: O(1) — 26 letters
*/
public class RansomNoteJava {

    public boolean canConstruct(String ransomNote, String magazine) {
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

    

        // int[] mag = new int[26];
        // for (int i = 0; i < magazine.length(); i++) {
        //     mag[magazine.charAt(i) - 'a']++;
        // }
        // for (int i = 0; i < ransomNote.length(); i++) {
        //     int idx = ransomNote.charAt(i) - 'a';
        //     mag[idx]--;
        //     if (mag[idx] < 0) {
        //         return false;
        //     }
        // }
        // return true;

        throw new UnsupportedOperationException("Implement canConstruct");
    }

    public static void main(String[] args) {
        RansomNoteJava s = new RansomNoteJava();
        assert !s.canConstruct("a", "b");
        assert !s.canConstruct("aa", "ab");
        assert s.canConstruct("aa", "aab");
        assert s.canConstruct("abc", "aabbcc");
        System.out.println("All test cases passed!");
    }
}
