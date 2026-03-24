/*
169. Majority Element
Difficulty: Easy
Pattern: Arrays & Hashing

Majority element appears more than floor(n/2) times. (Boyer–Moore voting.)

Example 1:
Input: nums = [3,2,3]
Output: 3
Hint: 3 appears twice (> n/2); pairing / canceling other values reveals the mode.

Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2
Hint: 2 wins 4 of 7; think “candidate + balance” as you stream the array.

Time: O(n), Space: O(1)
*/
public class MajorityElementJava {

    public int majorityElement(int[] nums) {
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

    

        // Integer candidate = null;
        // int count = 0;
        // for (int num : nums) {
        //     if (count == 0) {
        //         candidate = num;
        //     }
        //     count += (num == candidate) ? 1 : -1;
        // }
        // return candidate;

        throw new UnsupportedOperationException("Implement majorityElement");
    }

    public static void main(String[] args) {
        MajorityElementJava s = new MajorityElementJava();
        assert s.majorityElement(new int[] {3, 2, 3}) == 3;
        assert s.majorityElement(new int[] {2, 2, 1, 1, 1, 2, 2}) == 2;
        System.out.println("All test cases passed!");
    }
}
