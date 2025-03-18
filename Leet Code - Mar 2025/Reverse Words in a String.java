class Solution {
    // Time Complexity: O(N) → We traverse the string once to split and once to reverse.
    // Space Complexity: O(N) → We store words in an array and use StringBuilder.
    public String reverseWords(String s) {
        // String to array
        String[] array = s.trim().split("\\s+");
        // Reverse the words
        StringBuilder sb = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            sb.append(array[i]);
            // Separate words by single space
            if (i > 0) {
                sb.append(" ");
            }
        }
        // Return string builder to string
        return sb.toString();
    }
}