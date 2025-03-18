import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    // Time Complexity O(n) (since we iterate through arr and frequencyMap once)
    // Space Complexity O(n) (to store frequency counts and unique occurrences)
    public boolean uniqueOccurrences(int[] arr) {
        // Count occurrences of each number (HashMap)
        Map<Integer, Integer> count = new HashMap<>();
        for (int a : arr) {
            count.put(a, count.getOrDefault(a, 0) + 1);
        }
        // Check for uniqueness of occurrences (HashSet)
        Set<Integer> uniqueness = new HashSet<>();
        for (int c : count.values()) {
            // If count is already in the set, return false
            if (!uniqueness.add(c)) {
                return false;
            }
        }
        return true;
    }
}