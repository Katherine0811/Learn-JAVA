class Solution {
    // Time Complexity O(n + m): where m is the length of t, and n is the length of s
    // Space Complexity O(1): the algorithm uses only a few integer variables, it requires constant extra space
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++; // Move to next character in s
            }
            j++; // Always move in t
        }
        return (i == s.length()); // If we matched all characters in s
    }
}