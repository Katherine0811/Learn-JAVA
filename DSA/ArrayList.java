// import java.util.ArrayList;

public class ArrayList {

    // Array Lists = Dynamic Array (built-in)
    public static void main(String[] args) {
        
        // ArrayList<String> arrayList = new ArrayList<String>();

        DynamicArray dynamicArray = new DynamicArray();
        System.out.println("Size: " + dynamicArray.size);

        System.out.println(dynamicArray.capacity);

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");

        System.out.println(dynamicArray);
        System.out.println("Capacity: " + dynamicArray.capacity);
        System.out.println("Size: " + dynamicArray.size);
        System.out.println("Empty: " + dynamicArray.isEmpty());

        dynamicArray.insert(0, "X");
        System.out.println(dynamicArray);
        dynamicArray.delete("A");
        System.out.println(dynamicArray);
        System.out.println(dynamicArray.search("C"));

        dynamicArray.add("C");
        dynamicArray.add("C");
        dynamicArray.add("C");
        System.out.println(dynamicArray);

        dynamicArray.delete("C");
        dynamicArray.delete("C");
        dynamicArray.delete("C");
        System.out.println(dynamicArray);
    }

    // Advantages of Static Array:
    // 1. Random access of element is easy (index is available) -- O(1)
    // 2. Search of data requires iteration of the array -- O(n)
    // 3. Insert and delete operations that are not carried out at the end of the
    // array -- O(n)

    // Disadvantages of Static Array:
    // 1. The capacity is fixed

    // Advantages of Dynamic Array:
    // 1. Random access of element is easy (index is available) -- O(1)
    // 2. When size of array reaches capacity, it instantiate a new array with
    // increased capacity
    // 3. Good locality of references and data cache utilization (memory addresses
    // are saved together)
    // 4. Easy to insert / delete at the end

    // Disadvantages of Dynamic Array:
    // 1. Waste more memory
    // 2. Shifting elements is time consuming O(n)
    // 3. Expanding / Shrinking the array is time consuming O(n)
}
