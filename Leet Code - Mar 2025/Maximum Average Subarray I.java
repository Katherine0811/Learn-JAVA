class Solution {
    // Time Complexity: 𝑂(𝑛) — We traverse the array only once, making the solution efficient
    // Space Complexity: 𝑂(1) — We use only a few extra variables (not dependent on input size)
    public double findMaxAverage(int[] nums, int k) {
        // Calculate the sum of the first k elements
        double maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += nums[i];
        }
        double currentSum = maxSum;
        // Slide the window across the array
        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, currentSum);
        }
        // Return the maximum average value
        return maxSum / k;
    }
}