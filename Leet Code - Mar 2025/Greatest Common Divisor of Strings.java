class Solution {
    // O(n) time complexity, where n is the length of the smaller string
    // O(1) space complexity, as we only use a few extra variables
    public String gcdOfStrings(String str1, String str2) {
        // Check Common Structure
        if (!(str1 + str2).equals(str2 + str1)) return("");
        // Find the GCD of the lengths of the two strings
        int gcd = euclidean(str1.length(), str2.length()); 
        // Return the substring of str1 from 0 to gcdLength
        return str1.substring(0, gcd);
    }

    // Helper function - Euclidean algorithm
    public int euclidean(int a, int b) {
        return (b == 0? a: euclidean(b, a % b));
    }
}