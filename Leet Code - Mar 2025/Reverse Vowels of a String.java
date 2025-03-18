import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    // time complexity is O(n): Two-pointer Approach
    // Space complexity is O(n) due to the character array
    public String reverseVowels(String s) {
        // Set of vowels for quick lookup (both lowercase and uppercase)
        Set<Character> vowelSet = new HashSet<>(Arrays.asList('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'));
        // Convert the string to a char array to modify it easily
        char[] chars = s.toCharArray();
        // Initialize two pointers at beginning and end of the string
        int left = 0, right = chars.length - 1;
        char temp = 'a';
        // Use pointers to find vowel
        while (left < right) {
            if (!vowelSet.contains(chars[left])) {
                left++;
            } else if (!vowelSet.contains(chars[right])){
                right--;
            } else {
                // Swap vowels
                temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        // Convert the modified char array back to a string and return it
        return new String(chars);
    }
}