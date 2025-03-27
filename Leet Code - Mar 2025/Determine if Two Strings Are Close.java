import java.util.Arrays;

class Solution {
    // Time Complexity: O(n + 26log26), near to O(n)
    // Space Complexity:O(1), (fixed array size)
    public boolean closeStrings(String word1, String word2) {
        // Check string length
        if (word1.length() != word2.length()) return false;
        // Check character set (Have the same characters)
        int[] freq1 = new int[26], freq2 = new int[26];
        for (char c : word1.toCharArray()) {
            freq1[c - 'a']++;
        }
        for (char c : word2.toCharArray()) {
            freq2[c - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            // If the character does not both exist
            if ((freq1[i] > 0) != (freq2[i] > 0)) return false;
        }
        // Check distribution of set (Have the same frequency)
        Arrays.sort(freq1);
        Arrays.sort(freq2);
        return Arrays.equals(freq1, freq2);

    }
}