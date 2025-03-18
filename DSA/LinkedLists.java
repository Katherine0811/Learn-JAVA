import java.util.LinkedList;

public class LinkedLists {

    // LinkedList:
    // Stores nodes in 2 parts (data + address)
    // Nodes are in non-consecutive memory locations
    // Elements are linked using pointers

    //                     Singly Linked List
    //       Node                Node                Node
    //  [data | address] -> [data | address] -> [data | address]

    //                     Doubly Linked List
    //             Node                           Node
    //  [address | data | address] <-> [address | data | address]

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        // LinkedList as a Stack
        // linkedList.push("A");
        // linkedList.push("B");
        // linkedList.push("C");
        // linkedList.push("D");
        // linkedList.push("F");
        // linkedList.pop();

        // LinkedList as a Queue
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        // linkedList.poll();

        linkedList.add(4, "E");
        linkedList.remove("E");

        System.out.println(linkedList.indexOf("F"));

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        linkedList.addFirst("0");
        linkedList.addLast("G");
        
        System.out.println(linkedList);

        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();
        
        System.out.println(first + " " + last);
        System.out.println(linkedList);
    }

    // Advantages:
    // 1. Dynamic data structures (allocate needed memory while running)
    // Insertion and deletion of nodes is easy -- O(1)
    // No / Low memory waste
    
    // Disadvantages:
    // 1. Greater memory usage (additional pointer)
    // 2. No random access of elements (no index[i])
    // 3. Accessing / searching elements is more time consuming -- O(n)

    // Uses of LinkedLists:
    // 1. Implements Stacks / Queues
    // 2. GPS Navigation
    // 3. Music Playlists
}
