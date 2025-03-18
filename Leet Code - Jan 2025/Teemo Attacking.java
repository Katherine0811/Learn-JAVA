class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int total = 0;
        int interval = 0;
        for (int i = 1; i < timeSeries.length; i++) {
            interval = timeSeries[i] - timeSeries[i - 1];
            if (interval < duration) {
                total += interval;
            } else {
                total += duration;
            }
        }
        total += duration;
        return total;
    }
}