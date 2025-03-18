import java.util.Arrays;

class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length - 1;
        int result = nums[length];
        int count = 0;
        for (int i = length - 1; i >= 0; i--) {
            if (nums[i] != result) {
                count++;
                result = nums[i];
            }
            if (count == 2) {
                return result;
            }
        }
        return nums[length];
    }
}