/*
 * 875. Koko Eating Bananas
 * Difficulty: Medium
 * Pattern: Binary Search on Answer
 *
 * Problem:
 * Koko loves to eat bananas. There are `n` piles of bananas, and the `i`th pile has
 * `piles[i]` bananas. The guards will return in `h` hours.
 *
 * Koko can decide her eating speed `k`. Each hour, she chooses one pile and eats up to
 * `k` bananas from it. If the pile has fewer than `k`, she eats the whole pile instead.
 *
 * Return the minimum integer `k` such that she can eat all the bananas within `h` hours.
 *
 * Example 1:
 * Input: piles = [3,6,7,11], h = 8
 * Output: 4
 *
 * Example 2:
 * Input: piles = [30,11,23,4,20], h = 5
 * Output: 30
 *
 * Example 3:
 * Input: piles = [30,11,23,4,20], h = 6
 * Output: 23
 *
 * Constraints:
 * - 1 <= piles.length <= 10^4
 * - piles.length <= h <= 10^9
 * - 1 <= piles[i] <= 10^9
 *
 * Notes:
 * - Search speed from 1 up to the largest pile.
 * - For a candidate speed, compute total hours using ceiling division.
 */

public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //


    //     int left = 1;
    //     int right = 0;
    //     for (int pile : piles) {
    //         right = Math.max(right, pile); 
    //     }
    //
    //     while (left < right) {
    //         int mid = left + (right - left) / 2;
    //         if (leftOverHours(mid, piles, h)) {
    //             right = mid;
    //         } else {
    //             left = mid + 1;
    //         }
    //     }
    //     return left;
    // }
    //
    // private boolean leftOverHours(int eatingRate, int[] piles, int maxHours) {
    //     int totalTimeToEat = 0;
    //     for (int pile : piles) {
    //         int timeToEatPileRoundedUp = (pile + eatingRate - 1) / eatingRate;
    //         totalTimeToEat += timeToEatPileRoundedUp;
    //     }
    //     return totalTimeToEat <= maxHours;

    
    

    public static void main(String[] args) {
        KokoEatingBananas sol = new KokoEatingBananas();
        assert sol.minEatingSpeed(new int[] {3, 6, 7, 11}, 8) == 4;
        assert sol.minEatingSpeed(new int[] {30, 11, 23, 4, 20}, 5) == 30;
        assert sol.minEatingSpeed(new int[] {30, 11, 23, 4, 20}, 6) == 23;
        System.out.println("All test cases passed!");
    }
}
