/*
69. Sqrt(x)
Difficulty: Easy
Pattern: Math / Binary Search

Integer square root truncated.

Time: O(log x), Space: O(1)
*/
public class SqrtXJava {
    public int mySqrt(int x) {
        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        // Binary search on [0, x]

        // int lo = 0;
        // int hi = x;
        // int answer = 0;
        // while (lo <= hi) {
        //     int mid = lo + (hi - lo) / 2;
        //     long square = (long) mid * mid;
        //     if (square == x) {
        //         return mid;
        //     }
        //     if (square < x) {
        //         answer = mid;
        //         lo = mid + 1;
        //     } else {
        //         hi = mid - 1;
        //     }
        // }
        // return answer;
        throw new UnsupportedOperationException("Implement mySqrt");
    }
    public static void main(String[] args) {
        SqrtXJava s = new SqrtXJava();
        assert s.mySqrt(8) == 2;
        System.out.println("All test cases passed!");
    }

}
