class Solution {
    // Time Complexity O(n): The algorithm iterates through the gain array once
    // Space Complexity O(1): The algorithm only uses two integer variables
    public int largestAltitude(int[] gain) {
        int highest = 0, current = 0;
        for (int altitude : gain) {
            current += altitude;
            highest = Math.max(highest, current);
        }

        return highest;
    }
}