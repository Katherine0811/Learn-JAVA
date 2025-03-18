import java.util.HashMap;

class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int maxLength = 0;
        // Count frequency of each number
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        // Check for longest harmonious sequence
        for (int num : frequencyMap.keySet()) {
            // Only check if (num + 1) exists
            if (frequencyMap.containsKey(num + 1)) {
                maxLength = Math.max(maxLength, frequencyMap.get(num) + frequencyMap.get(num + 1));
            }
        }
        return maxLength;
    }
}