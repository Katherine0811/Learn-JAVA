class Solution {
    // Time Complexity: 𝑂(𝑛) — We traverse the array once to get the total sum and once more to find the pivot index
    // Space Complexity: 𝑂(1) — We use only a few extra variables
    public int pivotIndex(int[] nums) {
        // Get total
        int leftSum = 0, total = 0;
        for (int num: nums) {
            total += num;
        }
        // Loop
        for (int i = 0; i < nums.length; i++) {
            // If sum of nums[i - 1] = Total - sum of nums[i], return i
            if (leftSum == total - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}