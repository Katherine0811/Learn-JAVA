import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] findWords(String[] words) {
        List<String> result = new ArrayList<>();
        String first = "qwertyuiop";
        String second = "asdfghjkl";
        String third = "zxcvbnm";
        for (String word : words) {
            if (helper(word, first) || helper(word, second) || helper(word, third)) {
                result.add(word);
            }
        }
        return result.toArray(new String[result.size()]);
    }

    // To check if a word can be typed from a specific row
    public boolean helper(String word, String row) {
        for (char c : word.toLowerCase().toCharArray()) {
            if (row.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}