class Solution {
    // Time complexity : O(n) Traverse the array only once. 
    // Space complexity : O(1) Constant amount of space, regardless of the input size.
    public int maxArea(int[] height) {
        // Formula: LENGTH (x - y) x HEIGHT (height[x] or height[y])
        int max = 0, x = 0, y = height.length - 1;
        while (x < y) {
            max = Math.max(max, (y - x) * Math.min(height[x], height[y]));
            if (height[x] > height[y]) {
                y--;
            } else {
                x++;
            }
        }
        return max;
    }
}