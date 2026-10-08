/*
 * 860. Lemonade Change
 * Difficulty: Easy
 * Pattern: Greedy
 *
 * Problem:
 * At a lemonade stand, each lemonade costs $5. Customers are standing in a
 * queue to buy from you and order one at a time (in the order specified by
 * bills). Each customer will only buy one lemonade and pay with either a $5,
 * $10, or $20 bill. You must provide the correct change so that the net
 * transaction is that the customer pays $5. You do not have any change in
 * hand at first. Given an integer array bills where bills[i] is the bill the
 * ith customer pays, return true if you can provide every customer with the
 * correct change, or false otherwise.
 *
 * Example 1:
 * Input: bills = [5,5,5,10,20]
 * Output: true
 *
 * Example 2:
 * Input: bills = [5,5,10,10,20]
 * Output: false
 *
 * Constraints:
 * - 1 <= bills.length <= 10^5
 * - bills[i] is either 5, 10, or 20
 */
public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        // Track counts of 5s and 10s.

        // int fives = 0;
        // int tens = 0;
        // for (int bill : bills) {
        //     if (bill == 5) {
        //         fives++;
        //     } else if (bill == 10) {
        //         if (fives == 0) {
        //             return false;
        //         }
        //         fives--;
        //         tens++;
        //     } else {
        //         if (tens > 0 && fives > 0) {
        //             tens--;
        //             fives--;
        //         } else if (fives >= 3) {
        //             fives -= 3;
        //         } else {
        //             return false;
        //         }
        //     }
        // }
        // return true;
    }
    public static void main(String[] args) {
        LemonadeChange x = new LemonadeChange();
        assert x.lemonadeChange(new int[] {5, 5, 5, 10, 20});
        System.out.println("All test cases passed!");
    }

}
