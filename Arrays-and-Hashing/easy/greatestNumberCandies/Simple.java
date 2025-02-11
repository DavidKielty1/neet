package greatestNumberCandies;

import java.util.ArrayList;
import java.util.List;

public class Simple {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int highestBaseCandy = 0;

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > highestBaseCandy) {
                highestBaseCandy = candies[i];
            }
        }
        System.out.println("highestBaseCandy: " + highestBaseCandy);

        List<Boolean> booleanList = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= highestBaseCandy) {
                booleanList.add(true);
            } else {
                booleanList.add(false);
            }
        }

        return booleanList;
    }

    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        List<Boolean> result = kidsWithCandies(candies, extraCandies);
        System.out.println(result); // Output: [true, true, true, false, true]
    }
}
