/*
66. Plus One
Difficulty: Easy
Pattern: Math

Increment big integer represented as digit array.

Time: O(n), Space: O(1) output aside
*/
public class PlusOneJava {
    public int[] plusOne(int[] digits) {
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

        // Propagate carry from end.

        // for (int i = digits.length - 1; i >= 0; i--) {
        //     if (digits[i] < 9) {
        //         digits[i]++;
        //         return digits;
        //     }
        //     digits[i] = 0;
        // }
        // int[] result = new int[digits.length + 1];
        // result[0] = 1;
        // return result;
        throw new UnsupportedOperationException("Implement plusOne");
    }
    public static void main(String[] args) {
        PlusOneJava s = new PlusOneJava();
        assert java.util.Arrays.equals(s.plusOne(new int[] {1, 2, 3}), new int[] {1, 2, 4});
        System.out.println("All test cases passed!");
    }

}
