import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    
    // Queue:
    // FIFO data structure (First-In-First-Out)
    // A collection designed for holding elements prior to processing
    // Example: A line of people
    // add = enqueue, offer()
    // remove = dequeue, poll()

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        
        System.out.println(queue.isEmpty());

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue);
        System.out.println(queue.peek());

        queue.poll();
        queue.poll();
        System.out.println(queue);

        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Harold"));
    }

    // Uses of Queue:
    // 1. Keyboard buffer (letters should appear on the screen in the order they're pressed)
    // 2. Printer queue (Print jobs should be completed in order)
    // 3. Used in LinkedLists, PriorityQueues, Breadth-first search
}