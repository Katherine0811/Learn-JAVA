class Solution {
    // Time Complexity: O(n), since we iterate through the array once.
    // Space Complexity: O(1), since we modify the array in-place without extra storage.
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // If no flowers need to be planted, return true
        if (n == 0) return true;
        int length = flowerbed.length;
        // Loop through the flowerbed and check for available spots
        for (int i = 0; i < length; i++) {
            // Check if left (i == 0 or previous spot is empty) and right (i == length - 1 or next spot is empty) are also empty
            if ((flowerbed[i] == 0) && 
            (i == 0 || flowerbed[i - 1] == 0) && 
            (i == length - 1 || flowerbed[i + 1] == 0)) {
                // Plant a flower here
                flowerbed[i] = 1;
                i++;
                n--;
            }
            // If all flowers have been planted, return true
            if (n == 0) return true;
        }
        // Not enough space to plant all required flowers
        return false;
    }
}