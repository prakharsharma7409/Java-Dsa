/*Question 4: Given n non-negative integers representing an elevation map where the width of
each bar is 1, compute how much water it can trap after raining.
Example 1:
Input:
height = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
Output: 6
Explanation:
Example 2:
Input:
The above elevation map (black section) is represented by array
are being trapped.
height = [4, 2, 0, 3, 2, 5]
Output: 9
 */
public class ArraysAssignmentQ4 {
    public static int trap(int[] height) {
        int n = height.length;

        int res = 0, l = 0, r = n - 1;
        int rMax = height[r], lMax = height[l];


        while (l < r) {
            if (lMax < rMax) {
                l++;
                lMax = Math.max(lMax, height[l]);
                res += lMax - height[l];
            } else {
                r--;
                rMax = Math.max(rMax, height[r]);
                res += rMax - height[r];
            }
        }


        return res;
    }
    public static void main (String[]args){
        int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(height));

    }

}
