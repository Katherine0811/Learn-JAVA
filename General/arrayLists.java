import java.util.ArrayList;
import java.util.Comparator;

public class arrayLists {
    public static void main(String[] args) {
        // Array list is like a dynamic array
        // It's length is adjusted based on elements entered

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        // Primitive Type: int double float boolean
        // Wrapper Class: Integer Double Float Boolean

        numbers.add(100);
        numbers.add(2);
        numbers.add(3);
        numbers.add(14);
        numbers.add(5);

        System.out.println(numbers.toString());
        System.out.println(numbers.get(3));

        // Remove based on index
        // numbers.remove(2);
        // Remove based on value
        // numbers.remove(Integer.valueOf(4));

        // Update value
        numbers.set(2, Integer.valueOf(30));

        // Sort value
        numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers.toString());

        numbers.sort(Comparator.reverseOrder());
        System.out.println(numbers.toString());

        // Other methods for Array List
        System.out.println(numbers.size());
        System.out.println(numbers.contains(Integer.valueOf(10)));
        // numbers.clear();
        System.out.println(numbers.isEmpty());

        // Array For Each Loop
        numbers.forEach(number -> {
            numbers.set(numbers.indexOf(number), number * 2);
            // System.out.println(number * 2);
        });

        System.out.println(numbers.toString());
        
    }
}
