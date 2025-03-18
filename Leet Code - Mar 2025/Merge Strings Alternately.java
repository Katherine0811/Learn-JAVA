class Solution {
    // Time Complexity: O(n), where n is the total length of word1 and word2
    // Space Complexity: O(1) (excluding output storage)
    public String mergeAlternately(String word1, String word2) {
        // Initialize a StringBuilder
        StringBuilder result = new StringBuilder();
        // Approach: Two Pointers
        int i = 0, j = 0;
        int len1 = word1.length(), len2 = word2.length();
        // Merge characters alternately
        while (i < len1 && j < len2) {
            result.append(word1.charAt(i++));
            result.append(word2.charAt(j++));
        }
        // Append the remaining characters if any
        while (i < len1) {
            result.append(word1.charAt(i++));
        }
        while (j < len2) {
            result.append(word1.charAt(j++));
        }
        return result.toString();
    }
}