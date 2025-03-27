class Solution {
    // Time Complexity: O(n) (Each element is processed at most twice)
    // Space Complexity: O(1) (Only a few extra variables)
    public int longestSubarray(int[] nums) {
        int count = 0, current = 0, max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
            } 
            while (count > 1) {
                if (nums[current] == 0) {
                    count--;
                }
                current ++;
            }
            max = Math.max(max, i - current);
        }
        return max;
    }
}