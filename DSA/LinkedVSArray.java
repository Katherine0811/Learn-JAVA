import java.util.LinkedList;
import java.util.ArrayList;

public class LinkedVSArray {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;

        for (int x = 0; x < 10000000; x++) {
            linkedList.add(1);
            arrayList.add(1);
        }

        // Linked List
        startTime = System.nanoTime();

        // linkedList.get(0);
        // linkedList.get(5000000);
        // linkedList.get(9999999);

        // linkedList.remove(0);
        // linkedList.remove(5000000);
        linkedList.remove(9999999);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;
        System.out.println("LinkedList:\t" + elapsedTime + " ns");

        // Array List
        startTime = System.nanoTime();

        // arrayList.get(0);
        // arrayList.get(5000000);
        // arrayList.get(9999999);

        // arrayList.remove(0);
        // arrayList.remove(5000000);
        arrayList.remove(9999999);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;
        System.out.println("ArrayList:\t" + elapsedTime + " ns");
    }
}