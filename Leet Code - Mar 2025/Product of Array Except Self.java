class Solution {
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length, total = 1;
        int answer[] = new int[n];
        // Prefix: Calculate product and assign to Answer[i]
        for (int i = 0; i < n; i++) {
            answer[i] = total;
            total *= nums[i];
        }
        total = 1;
        // Suffix: Multiply with remaining product after i
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= total;
            total *= nums[i];
        }
        return answer;
    }
}