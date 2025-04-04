class Solution {
    public String convert(String s, int numRows) {
        StringBuilder code = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            int y = i;
            while (y < s.length()) {
                code.append(s.charAt(y));
                y += numRows;
            }
        }
        return code.toString();
    }
}