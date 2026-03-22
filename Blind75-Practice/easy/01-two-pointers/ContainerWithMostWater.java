/*
11. Container With Most Water
Difficulty: Medium
Pattern: Two Pointers

You are given an integer array height of length n. There are n vertical lines drawn such that
the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container
contains the most water.

Return the maximum amount of water a container can store.

Example:
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49

Time: O(n), Space: O(1)
*/
public class ContainerWithMostWater {

    public static int maxArea(int[] heights) {
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

    

        // int left = 0;
        // int right = heights.length - 1;
        // int maxArea = 0;
        // while (left < right) {
        //     int minHeight = Math.min(heights[left], heights[right]);
        //     int currArea = (right - left) * minHeight;
        //     maxArea = Math.max(maxArea, currArea);
        //     if (heights[left] < heights[right]) {
        //         left++;
        //     } else {
        //         right--;
        //     }
        // }
        // return maxArea;

        throw new UnsupportedOperationException("Implement maxArea");
    }

    public static void main(String[] args) {
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Max Area: " + maxArea(height1));

        int[] height2 = {1, 1};
        System.out.println("Max Area: " + maxArea(height2));

        int[] height3 = {4, 3, 2, 1, 4};
        System.out.println("Max Area: " + maxArea(height3));
    }
}
