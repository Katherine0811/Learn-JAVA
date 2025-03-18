import java.util.Hashtable;

public class Hashtables {

    // Hashtable
    // A data structure that stores unique keys to values
    // Example: <Integer, String>
    // Each key / value pair is known as an entry
    // Fast insertion, look up, deletion of key / value pairs
    // Not ideal for small data sets, great with large data sets

    // Hashing
    // Takes a key and computes an integer (Formula varies based on key & data type)
    // In a hashtable, we use the (hash % capacity) to calculate an index number
    // key.hashCode() % capacity = index

    // Bucket
    // An indexed storage location for one or more entries
    // Can store multiple entries in case of a collision (linked similarly like a LinkedList)

    // Collision
    // Hash function generates the same index for more than one key
    // less collision = more efficiency

    // Runtime Complexity = Best Case: O(1)
    //                      Worst Case: O(n)
    
    public static void main(String[] args) {
        
        Hashtable<Integer, String> table = new Hashtable<>(10);

        table.put(100, "Spongebob");
        table.put(123, "Patrick");
        table.put(321, "Sandy");
        table.put(555, "Squidward");
        table.put(777, "Gary");

        // table.remove(555);

        for (Integer key : table.keySet()) {
            System.out.println((key.hashCode() % 10 + "\t" + key + "\t" + table.get(key)));
        }
    }
}
