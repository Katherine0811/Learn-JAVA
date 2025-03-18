import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        // Sort arrays to pair the greed with most suitable cookie size
        Arrays.sort(g);
        Arrays.sort(s);
        // Initialize count of pair, and two pointer
        int count = 0;
        int i = 0;
        int j = 0;
        // Loop for both pointers to hit end of the array
        while (i < g.length && j < s.length) {
            // Pair greed with suitable cookie size
            if (g[i] <= s[j]) {
                count++;
                i++;
            }
            // Increase cookie size
            j++;
        }
        return count;
    }
}