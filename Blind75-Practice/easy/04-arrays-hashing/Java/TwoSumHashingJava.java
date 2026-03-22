import java.util.HashMap;
import java.util.Map;

/*
1. Two Sum
Difficulty: Easy
Pattern: Arrays & Hashing

Return indices of two numbers that add up to target. Exactly one solution exists.

Time: O(n), Space: O(n)
*/
public class TwoSumHashingJava {

    public int[] twoSum(int[] nums, int target) {
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

    

        // Map<Integer, Integer> seen = new HashMap<>();
        // for (int i = 0; i < nums.length; i++) {
        //     int complement = target - nums[i];
        //     if (seen.containsKey(complement)) {
        //         return new int[] {seen.get(complement), i};
        //     }
        //     seen.put(nums[i], i);
        // }
        // return new int[0];

        throw new UnsupportedOperationException("Implement twoSum");
    }

    private static void assertOrderAgnostic(int[] got, int a, int b) {
        boolean ok =
                (got[0] == a && got[1] == b) || (got[0] == b && got[1] == a);
        if (!ok) {
            throw new AssertionError(
                    "expected indices {" + a + "," + b + "}, got {" + got[0] + "," + got[1] + "}");
        }
    }

    public static void main(String[] args) {
        TwoSumHashingJava s = new TwoSumHashingJava();
        assertOrderAgnostic(s.twoSum(new int[] {2, 7, 11, 15}, 9), 0, 1);
        assertOrderAgnostic(s.twoSum(new int[] {3, 2, 4}, 6), 1, 2);
        assertOrderAgnostic(s.twoSum(new int[] {3, 3}, 6), 0, 1);
        System.out.println("All test cases passed!");
    }
}
