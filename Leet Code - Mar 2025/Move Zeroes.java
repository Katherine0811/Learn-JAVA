class Solution {
    // Time Complexity O(n): The algorithm traverses the array twice
    // Space Complexity O(1): The algorithm modifies the array in-place and only uses a few extra integer variables
    public void moveZeroes(int[] nums) {
        int left = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[left] = num;
                left++;
            }
        }
        while (left < nums.length) {
            nums[left] = 0;
            left++;
        }
    }
}