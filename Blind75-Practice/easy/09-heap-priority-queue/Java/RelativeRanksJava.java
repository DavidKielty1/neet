/*
506. Relative Ranks
Difficulty: Easy
Pattern: Heap / Sorting

Problem:
You are given an integer array `score` where `score[i]` is the score earned
by the ith athlete. Rank the athletes from highest score to lowest score and
return an array of strings where:
- The highest score gets "Gold Medal"
- The second highest gets "Silver Medal"
- The third highest gets "Bronze Medal"
- Every remaining athlete gets their numeric rank as a string

The returned array must stay in the same order as the original input.

Example 1:
Input:  score = [5, 4, 3, 2, 1]
Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
Explanation:
The scores are already in descending order, so each athlete keeps the same index.

Example 2:
Input:  score = [10, 3, 8, 9, 4]
Output: ["Gold Medal", "5", "Bronze Medal", "Silver Medal", "4"]
Explanation:
- 10 is the highest score -> "Gold Medal"
- 9 is the second highest -> "Silver Medal"
- 8 is the third highest -> "Bronze Medal"
- 4 is the fourth highest -> "4"
- 3 is the fifth highest -> "5"

Constraints:
- 1 <= score.length <= 10^4
- 0 <= score[i] <= 10^6
- All the values in `score` are unique

Why sorting works:
If we sort athlete indices by score descending, we can assign medals/ranks in
sorted order while still writing answers back to each athlete's original index.

Time: O(n log n)
Space: O(n)
*/

public class RelativeRanksJava {
    public String[] findRelativeRanks(int[] score) { // score [4 2 1 5 3]
        int n = score.length; // 5

        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        } // Indices = [0, 1, 2, 3, 4]
        
        java.util.Arrays.sort(indices, (a, b) -> Integer.compare(score[a], score[b]));

        String[] rankings = new String[n];

        for (int rank = 0; rank < n; rank++) {
            int index = indices[rank];
            if (rank == 0) rankings[index] = "Gold Medal";
            else if (rank == 1) rankings[index] = "Silver Medal";
            else if (rank == 2) rankings[index] = "Bronze Medal";
            else rankings[index] = String.valueOf(rank + 1);
        }
        return rankings;
        // 

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        // Sort indices by score descending.

        // int n = score.length;
        // Integer[] indices = new Integer[n];
        // for (int i = 0; i < n; i++) {
        //     indices[i] = i;
        // }
        // java.util.Arrays.sort(indices, (a, b) -> Integer.compare(score[b], score[a]));
        // String[] result = new String[n];
        // for (int rank = 0; rank < n; rank++) {
        //     int index = indices[rank];
        //     if (rank == 0) {
        //         result[index] = "Gold Medal";
        //     } else if (rank == 1) {
        //         result[index] = "Silver Medal";
        //     } else if (rank == 2) {
        //         result[index] = "Bronze Medal";
        //     } else {
        //         result[index] = String.valueOf(rank + 1);
        //     }
        // }
        // return result;
    }
    public static void main(String[] args) {
        System.out.println("Implement tests.");
    }

}
