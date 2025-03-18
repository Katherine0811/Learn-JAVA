class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i > -1; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        int expandDigits[] = new int[digits.length + 1];
        expandDigits[0] = 1;
        return expandDigits;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(n)