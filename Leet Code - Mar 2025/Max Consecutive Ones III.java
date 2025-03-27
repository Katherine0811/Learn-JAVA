class Solution {
    // Time Complexity: O(n) (Each element is processed at most twice)
    // Space Complexity: O(1) (Only a few extra variables)
    public int longestOnes(int[] nums, int k) {
        int max = 0, current = 0, count = 0;
        // Slide window
        for (int i = 0; i < nums.length; i++) {
            // Flip the 0's
            if (nums[i] == 0) count++;
            // Slide the window, ensure 0's valid
            while (count > k) {
                if (nums[current] == 0) count--;
                current++;
            }
            // Check if current subarray is greather than max;
            max = Math.max(max, i - current + 1);
        }
        return max;
    }
}