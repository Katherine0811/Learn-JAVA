import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    // Time Complexity O(1) (Amortized) (Each request is added once and removed once)
    // Space Complexity O(n) (Queue stores at most n requests)
    Queue<Integer> queue;
    public RecentCounter() {
        // Use a Queue to Store Requests
        queue = new LinkedList<Integer>();
    }

    public int ping(int t) {
        // Add Requests
        queue.add(t);
        // Remove Outdated Requests
        while (queue.peek() < t - 3000) {
            queue.poll();
        }
        // Return Queue Size in Valid Range
        return queue.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */