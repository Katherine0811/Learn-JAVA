class Solution {
    // Time Complexity: O(n) (each character is processed at most twice)
    // Space Complexity: O(1) (constant extra space)
    public int maxVowels(String s, int k) {
        String vowels = "aeiou";
        int current = 0, max = 0;
        // Check number of vowel in first k characters
        // Slide the window, update number if greater
        for (int i = 0; i < s.length(); i++) {
            if (i >= k && vowels.indexOf(s.charAt(i - k)) != -1) {
                current--;
            }
            if (vowels.indexOf(s.charAt(i)) != -1) {
                current++;
            }
            max = Math.max(max, current);
        }
        return max;
    }
}