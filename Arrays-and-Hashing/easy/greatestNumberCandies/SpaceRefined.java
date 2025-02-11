package greatestNumberCandies;

import java.util.Arrays;

public class SpaceRefined {
    public static boolean[] kidsWithCandiesSpaceRefine(int[] candies, int extraCandies) {
        int highestBaseCandy = Arrays.stream(candies).max().orElse(0);

        for (int i = 0; i < candies.length; i++) {
            candies[i] = (candies[i] + extraCandies >= highestBaseCandy) ? 1 : 0; // 1 for true, 0 for false
        }

        // Cast the modified array into a boolean array
        boolean[] result = new boolean[candies.length];
        for (int i = 0; i < candies.length; i++) {
            result[i] = candies[i] == 1; // Convert numeric values back to boolean
        }

        return result;
    }

    public static void main(String[] args) {
        // Example Usage
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        boolean[] result = kidsWithCandiesSpaceRefine(candies, extraCandies);
        System.out.println(Arrays.toString(result)); // Output: [true, true, true, false, true]
    }
}
