/*
67. Add Binary
Difficulty: Easy
Pattern: Bit Manipulation / Strings

Binary sum of two binary strings.

Time: O(max(a,b)), Space: O(max(a,b))
*/
public class AddBinary {
    public String addBinary(String a, String b) {
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

        // Carry from right to left.

        // StringBuilder result = new StringBuilder();
        // int i = a.length() - 1;
        // int j = b.length() - 1;
        // int carry = 0;
        // while (i >= 0 || j >= 0 || carry > 0) {
        //     int total = carry;
        //     if (i >= 0) {
        //         total += a.charAt(i--) - "0".charAt(0);
        //     }
        //     if (j >= 0) {
        //         total += b.charAt(j--) - "0".charAt(0);
        //     }
        //     result.append(total % 2);
        //     carry = total / 2;
        // }
        // return result.reverse().toString();
        throw new UnsupportedOperationException("Implement addBinary");
    }
    public static void main(String[] args) {
        AddBinary s = new AddBinary();
        assert s.addBinary("11", "1").equals("100");
        System.out.println("All test cases passed!");
    }

}
