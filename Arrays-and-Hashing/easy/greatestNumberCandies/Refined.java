package greatestNumberCandies;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Refined {
    public static List<Boolean> kidsWithCandiesRefined(int[] candies, int extraCandies) {
        int highestBaseCandy = Arrays.stream(candies).max().orElse(0);

        return Arrays.stream(candies)
                .mapToObj(candy -> candy + extraCandies >= highestBaseCandy)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        // Example Usage
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        List<Boolean> result = kidsWithCandiesRefined(candies, extraCandies);
        System.out.println(result); // Output: [true, true, true, false, true]
    }
}
