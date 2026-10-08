/*
 * 506. Relative Ranks
 * Difficulty: Easy
 * Pattern: Heap / Sorting
 *
 * Problem:
 * You are given an integer array score of size n, where score[i] is the score
 * of the ith athlete in a competition. All the scores are guaranteed to be
 * unique. Athletes are placed by score: 1st place has the highest score, 2nd
 * place the second highest, and so on. Return an array answer of size n where
 * answer[i] is the rank of the ith athlete: "Gold Medal" for 1st, "Silver Medal"
 * for 2nd, "Bronze Medal" for 3rd, and the placement number as a string for
 * every remaining athlete.
 *
 * Example 1:
 * Input: score = [5,4,3,2,1]
 * Output: ["Gold Medal","Silver Medal","Bronze Medal","4","5"]
 *
 * Example 2:
 * Input: score = [10,3,8,9,4]
 * Output: ["Gold Medal","5","Bronze Medal","Silver Medal","4"]
 *
 * Constraints:
 * - n == score.length
 * - 1 <= n <= 10^4
 * - 0 <= score[i] <= 10^6
 * - All the values of score are unique
 */

public class RelativeRanks {
    public String[] findRelativeRanks(int[] score) { 
    }
        // 

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

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
