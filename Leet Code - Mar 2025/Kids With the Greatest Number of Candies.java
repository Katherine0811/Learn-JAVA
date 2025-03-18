import java.util.ArrayList;
import java.util.List;

class Solution {
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // Initialize Boolean List
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        // Get the maximum candies
        for (int candy : candies) {
            max = Math.max(candy, max);
        }
        // Loop to check if candies + extra > max, return true
        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }
        return result;
    }
}