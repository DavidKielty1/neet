import java.util.HashSet;
import java.util.Set;

/*
217. Contains Duplicate
Difficulty: Easy
Pattern: Arrays & Hashing

Given an integer array nums, return true if any value appears at least twice.

Time: O(n), Space: O(n)
*/
public class ContainsDuplicateJava {

    public boolean containsDuplicate(int[] nums) {
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

    

        // Set<Integer> seen = new HashSet<>();
        // for (int num : nums) {
        //     if (!seen.add(num)) {
        //         return true;
        //     }
        // }
        // return false;

        throw new UnsupportedOperationException("Implement containsDuplicate");
    }

    public static void main(String[] args) {
        ContainsDuplicateJava s = new ContainsDuplicateJava();
        assert s.containsDuplicate(new int[] {1, 2, 3, 1});
        assert !s.containsDuplicate(new int[] {1, 2, 3, 4});
        assert s.containsDuplicate(new int[] {1, 1, 1, 3, 3, 4, 3, 2, 4, 2});
        System.out.println("All test cases passed!");
    }
}
