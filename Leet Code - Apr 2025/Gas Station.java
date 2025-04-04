class Solution {
    // Time Complexity: O(n) (Single pass through the array)
    // Space Complexity: O(1) (No extra storage)
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int tank = 0, total_tank = 0, station = 0;
        for (int i = 0; i < n; i++) {
            // Check if it is possible to complete the circuit
            total_tank += gas[i] - cost[i];
            tank += gas[i] - cost[i];
            // Reset starting station
            if (tank < 0) {
                tank = 0;
                station = i + 1;
            }
        }
        return total_tank < 0 ? -1 : station;
    }
}