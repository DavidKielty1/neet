/*
860. Lemonade Change
Difficulty: Easy
Pattern: Greedy

Problem:
Each lemonade costs $5. Customers pay one at a time using bills from `bills`,
where each bill is either 5, 10, or 20.

At the start, you have no change. For each customer, provide the correct change
so that every transaction still totals $5. Return `true` if you can serve every
customer in order, otherwise return `false`.

Example 1:
Input: bills = [5, 5, 5, 10, 20]
Output: true
Explanation:
- Collect three $5 bills
- Give $5 change for the $10 bill
- Give $15 change for the $20 bill using one $10 and one $5

Example 2:
Input: bills = [5, 5, 10, 10, 20]
Output: false
Explanation:
When the final customer pays with $20, you need $15 in change but only have two
$10 bills and no $5 bill, so making change is impossible.

Constraints:
- 1 <= bills.length <= 10^5
- bills[i] is 5, 10, or 20

Why greedy works:
Always prefer giving one $10 and one $5 as change for a $20 when possible. A $10
bill cannot help make change for a future $10 payment, but extra $5 bills are useful
for both $10 and $20 payments.

Time: O(n)
Space: O(1)
*/
public class LemonadeChangeJava {
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
        throw new UnsupportedOperationException("Implement lemonadeChange");
    }
    public static void main(String[] args) {
        LemonadeChangeJava x = new LemonadeChangeJava();
        assert x.lemonadeChange(new int[] {5, 5, 5, 10, 20});
        System.out.println("All test cases passed!");
    }

}
