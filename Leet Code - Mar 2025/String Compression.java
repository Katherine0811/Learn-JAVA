class Solution {
    // Time Complexity: O(n), where n is the length of the input array chars.
    // Space Complexity: O(1), since we are modifying the input array in place
    // without using extra space.
    public int compress(char[] chars) {
        // Write to update array
        // Read to move across array
        // Count to count repeating characters
        int write = 1, read = 0, count = 1;
        // Current character to compare
        char current = chars[read++];
        while (read < chars.length) {
            if (chars[read] == current) { // Same Character
                count++;
                read++;
            } else { // Different Character
                current = chars[read++];
                if (count > 1) {
                    for (char c : Integer.toString(count).toCharArray()) {
                        chars[write++] = c;
                        count = 1;
                    }
                }
                // Write the character to the array
                chars[write++] = current;
            }
        }
        if (count > 1) {
            for (char c : Integer.toString(count).toCharArray()) {
                chars[write++] = c;
                count = 1;
            }
        }
        return write;
    }
}