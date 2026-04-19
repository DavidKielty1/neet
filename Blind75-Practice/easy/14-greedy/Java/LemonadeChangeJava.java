/*
860. Lemonade Change
Difficulty: Easy
Pattern: Greedy

Bills 5, 10, 20 — make change if possible.

Time: O(n), Space: O(1)
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
