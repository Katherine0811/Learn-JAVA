import java.util.Arrays;

class Solution {
    // Time Complexity: O(n log n) because array sorting
    // Space Complexity: O(1)
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0, left = 0, right = nums.length - 1;
        while (left < right) {
            if (k == nums[left] + nums[right]) {
                count++;
                left++;
                right--;
            } else if (k > nums[left] + nums[right]) {
                left++;
            } else {
                right--;
            }
        }
        return count;
    }
}