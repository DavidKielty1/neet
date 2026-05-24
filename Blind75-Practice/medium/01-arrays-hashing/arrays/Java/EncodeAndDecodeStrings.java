/*
 * LeetCode 271. Encode and Decode Strings
 *
 * Design an algorithm to encode a list of strings to a single string. The
 * encoded string is then sent over the network and is decoded back to the
 * original list of strings.
 *
 * Implement the encode and decode methods.
 *
 * Example 1:
 * Input: ["lint","code","love","you"]
 * Output after decode: ["lint","code","love","you"]
 *
 * Example 2:
 * Input: ["we","say",":","yes"]
 * Output after decode: ["we","say",":","yes"]
 *
 * Example 3:
 * Input: ["","abc",""]
 * Output after decode: ["","abc",""]
 *
 * Constraints:
 * - 0 <= strs.length <= 200
 * - 0 <= strs[i].length <= 200
 * - strs[i] may contain any valid ASCII character
 * - The codec must be lossless for arbitrary string contents
 */
import java.util.List;

public class EncodeAndDecodeStrings {
    static class Codec {
        public String encode(List<String> strs) {
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
            //
            //
            //
            //
            // Prefix each string with its length and a separator.
            //
            // StringBuilder encoded = new StringBuilder();
            // for (String s : strs) {
            //     encoded.append(s.length()).append('#').append(s);
            // }
            // return encoded.toString();
        }

        public List<String> decode(String s) {
        
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
            //
            //
            // Parse "<length>#<content>" repeatedly.
            //
            // List<String> decoded = new ArrayList<>();
            // int i = 0;
            // while (i < s.length()) {
            //     int j = i;
            //     while (s.charAt(j) != '#') {
            //         j++;
            //     }
            //     int length = Integer.parseInt(s.substring(i, j));
            //     j++;
            //     decoded.add(s.substring(j, j + length));
            //     i = j + length;
            // }
            // return decoded;
        }
    }

    public static void main(String[] args) {
        System.out.println("Implement tests.");
    }
}
