import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    // Time Complexity O(n + m) (where n = nums1.length and m = nums2.length)
    // Space Complexity	O(n + m) (due to HashSets and result lists)
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // Convert arrays to sets to remove duplicates and allow quick lookups
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }
        // Find elements in set1 not in set2
        List<Integer> diff1 = new ArrayList<>();
        for (int num : set1) {
            if (!set2.contains(num)) {
                diff1.add(num);
            }
        }

        // Find elements in set2 not in set1
        List<Integer> diff2 = new ArrayList<>();
        for (int num : set2) {
            if (!set1.contains(num)) {
                diff2.add(num);
            }
        }

        return Arrays.asList(diff1, diff2);
    }
}