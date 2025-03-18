import java.util.Arrays;

class Solution {
    public int arrayPairSum(int[] nums) {
        // create a variable to store the max sum
        int sum = 0;
        // Sort the nums array
        Arrays.sort(nums);
        // loop, jump two nums
        for (int i = 0; i < nums.length; i += 2) {
            // add the first num is sufficient
            sum += nums[i];
        }
        return sum;
    }
}