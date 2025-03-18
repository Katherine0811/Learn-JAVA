import java.util.HashSet;
import java.util.Set;

class Solution {
    public int distributeCandies(int[] candyType) {
        // remove duplicate, get the num of candy type
        Set<Integer> numType = new HashSet<>();
        for (int candy : candyType) {
            numType.add(candy);
        }
        // return the min between two num
        return Math.min(candyType.length / 2, numType.size());
    }
}